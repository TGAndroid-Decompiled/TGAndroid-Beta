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
import org.telegram.messenger.am;
import org.telegram.ui.Components.xw0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.ci0;
public final class b9 extends org.telegram.ui.ActionBar.m2 {
    public final String[] f34518a;
    public final int[] f34519b;
    public final n f34520c;
    public final ArrayList d;
    public ScrollView f34521e;
    public ImageView f34522f;
    public ci.d h;
    public int f34523n;
    public int f34524r;
    public int f34525s;
    public int v;
    public int f34526w;
    public boolean f34527x;

    public b9(ArrayList arrayList, n nVar) {
        super(null);
        this.f34519b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f34518a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f34520c = nVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f34518a.length; i11 = com.google.android.gms.internal.vision.e2.e(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f34519b;
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
        if (arrayList.size() == this.f34519b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 &= !((j9) obj).getWord().isEmpty();
        }
        ci.d dVar = this.h;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dVar.setVisibility(i10);
        ci.d dVar2 = this.h;
        if (z10 && !this.f34527x) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        yw0 yw0Var = new yw0(context, null);
        yw0Var.setDelegate(new xw0() {
            @Override
            public final void H(int i11, boolean z10) {
                b9 b9Var = b9.this;
                b9Var.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                b9Var.f34523n = i11;
                b9Var.onInsets(b9Var.f34524r, b9Var.f34525s, b9Var.v, b9Var.f34526w);
            }
        });
        yw0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20560d6, this.resourceProvider));
        this.fragmentView = yw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f34521e = scrollView;
        scrollView.setFillViewport(true);
        this.f34521e.setVerticalScrollBarEnabled(false);
        this.f34521e.setClipToPadding(false);
        this.f34521e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        yw0Var.addView(this.f34521e, w7.w5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f34521e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34522f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34522f;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f34522f.setImageResource(R.drawable.ic_ab_close);
        this.f34522f.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20651i6, this.resourceProvider), 3, -1));
        this.f34522f.setOnClickListener(new View.OnClickListener(this) {
            public final b9 f34478b;

            {
                this.f34478b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34478b.finishFragment();
                        return;
                    default:
                        b9 b9Var = this.f34478b;
                        int[] iArr = b9Var.f34519b;
                        ArrayList arrayList = b9Var.d;
                        if (!b9Var.f34527x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList.get(i12);
                                    i12++;
                                    if (((j9) obj).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i13 = 0; i13 < iArr.length; i13++) {
                                    j9 j9Var = (j9) arrayList.get(i13);
                                    boolean equalsIgnoreCase = b9Var.f34518a[iArr[i13]].equalsIgnoreCase(j9Var.getWord());
                                    if (!equalsIgnoreCase && j9Var.v) {
                                        AndroidUtilities.shakeViewSpring(j9Var);
                                    }
                                    j9Var.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            b9Var.f34527x = true;
                            b9Var.U();
                            AndroidUtilities.hideKeyboard(b9Var.fragmentView);
                            n nVar = b9Var.f34520c;
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
        yw0Var.addView(this.f34522f, w7.w5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        y9 y9Var = new y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, w7.w5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.w5.t(-1, -2, 1, 32, 0, 32, 10), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        h.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20964z6, this.resourceProvider));
        int i12 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.f34519b;
        am.r(i12, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, h);
        linearLayout.addView(h, w7.w5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, w7.w5.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            arrayList.add(((j9) obj).getWord());
        }
        arrayList2.clear();
        for (int i14 = 0; i14 < iArr.length; i14++) {
            j9 j9Var = new j9(iArr[i14], context, this.resourceProvider, false);
            if (i14 < arrayList.size()) {
                j9Var.setText((String) arrayList.get(i14));
            }
            j9Var.setOnTextChangedListener(new n(this, 15));
            j9Var.setOnNextListener(new ci0(this, i14, j9Var, 15));
            if (i14 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout2.addView(j9Var, w7.w5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(j9Var);
        }
        linearLayout.addView(new View(context), w7.w5.l(1.0f, -1, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.e();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final b9 f34478b;

            {
                this.f34478b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f34478b.finishFragment();
                        return;
                    default:
                        b9 b9Var = this.f34478b;
                        int[] iArr2 = b9Var.f34519b;
                        ArrayList arrayList3 = b9Var.d;
                        if (!b9Var.f34527x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i122 = 0;
                                while (i122 < size2) {
                                    Object obj2 = arrayList3.get(i122);
                                    i122++;
                                    if (((j9) obj2).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i132 = 0; i132 < iArr2.length; i132++) {
                                    j9 j9Var2 = (j9) arrayList3.get(i132);
                                    boolean equalsIgnoreCase = b9Var.f34518a[iArr2[i132]].equalsIgnoreCase(j9Var2.getWord());
                                    if (!equalsIgnoreCase && j9Var2.v) {
                                        AndroidUtilities.shakeViewSpring(j9Var2);
                                    }
                                    j9Var2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            b9Var.f34527x = true;
                            b9Var.U();
                            AndroidUtilities.hideKeyboard(b9Var.fragmentView);
                            n nVar = b9Var.f34520c;
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
        linearLayout.addView(this.h, w7.w5.t(-1, 48, 1, 0, 24, 0, 0));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34524r = i10;
        this.f34525s = i11;
        this.v = i12;
        this.f34526w = i13;
        ScrollView scrollView = this.f34521e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.f34523n);
        }
        ImageView imageView = this.f34522f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f34522f.setLayoutParams(layoutParams);
        }
    }
}
