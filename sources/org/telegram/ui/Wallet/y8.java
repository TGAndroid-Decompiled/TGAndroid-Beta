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
import org.telegram.messenger.bi;
import org.telegram.ui.Components.rw0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bi0;
public final class y8 extends org.telegram.ui.ActionBar.n2 {
    public final String[] f35666a;
    public final int[] f35667b;
    public final m f35668c;
    public final ArrayList d;
    public ScrollView f35669e;
    public ImageView f35670f;
    public ci.d h;
    public int f35671n;
    public int f35672r;
    public int f35673s;
    public int v;
    public int f35674w;
    public boolean f35675x;

    public y8(ArrayList arrayList, m mVar) {
        super(null);
        this.f35667b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f35666a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f35668c = mVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f35666a.length; i11 = com.google.android.gms.internal.vision.e2.e(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f35667b;
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
        if (arrayList.size() == this.f35667b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 &= !((g9) obj).getWord().isEmpty();
        }
        ci.d dVar = this.h;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dVar.setVisibility(i10);
        ci.d dVar2 = this.h;
        if (z10 && !this.f35675x) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        sw0 sw0Var = new sw0(context, null);
        sw0Var.setDelegate(new rw0() {
            @Override
            public final void H(int i11, boolean z10) {
                y8 y8Var = y8.this;
                y8Var.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                y8Var.f35671n = i11;
                y8Var.onInsets(y8Var.f35672r, y8Var.f35673s, y8Var.v, y8Var.f35674w);
            }
        });
        sw0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, this.resourceProvider));
        this.fragmentView = sw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f35669e = scrollView;
        scrollView.setFillViewport(true);
        this.f35669e.setVerticalScrollBarEnabled(false);
        this.f35669e.setClipToPadding(false);
        this.f35669e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        sw0Var.addView(this.f35669e, w7.x5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f35669e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f35670f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f35670f;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f35670f.setImageResource(R.drawable.ic_ab_close);
        this.f35670f.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, this.resourceProvider), 3, -1));
        this.f35670f.setOnClickListener(new View.OnClickListener(this) {
            public final y8 f35636b;

            {
                this.f35636b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35636b.finishFragment();
                        return;
                    default:
                        y8 y8Var = this.f35636b;
                        int[] iArr = y8Var.f35667b;
                        ArrayList arrayList = y8Var.d;
                        if (!y8Var.f35675x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList.get(i12);
                                    i12++;
                                    if (((g9) obj).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i13 = 0; i13 < iArr.length; i13++) {
                                    g9 g9Var = (g9) arrayList.get(i13);
                                    boolean equalsIgnoreCase = y8Var.f35666a[iArr[i13]].equalsIgnoreCase(g9Var.getWord());
                                    if (!equalsIgnoreCase && g9Var.v) {
                                        AndroidUtilities.shakeViewSpring(g9Var);
                                    }
                                    g9Var.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            y8Var.f35675x = true;
                            y8Var.U();
                            AndroidUtilities.hideKeyboard(y8Var.fragmentView);
                            m mVar = y8Var.f35668c;
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
        sw0Var.addView(this.f35670f, w7.x5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        y9 y9Var = new y9(context);
        y9Var.setAspectFit(true);
        y9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(y9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        y9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(y9Var, w7.x5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider));
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-1, -2, 1, 32, 0, 32, 10), context);
        h.setTextSize(1, 14.0f);
        h.setGravity(1);
        h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21199z6, this.resourceProvider));
        int i12 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.f35667b;
        bi.r(i12, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, h);
        linearLayout.addView(h, w7.x5.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, w7.x5.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            arrayList.add(((g9) obj).getWord());
        }
        arrayList2.clear();
        for (int i14 = 0; i14 < iArr.length; i14++) {
            g9 g9Var = new g9(iArr[i14], context, this.resourceProvider, false);
            if (i14 < arrayList.size()) {
                g9Var.setText((String) arrayList.get(i14));
            }
            g9Var.setOnTextChangedListener(new m(this, 16));
            g9Var.setOnNextListener(new bi0(this, i14, g9Var, 15));
            if (i14 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout2.addView(g9Var, w7.x5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(g9Var);
        }
        linearLayout.addView(new View(context), w7.x5.l(1.0f, -1, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.e();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final y8 f35636b;

            {
                this.f35636b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35636b.finishFragment();
                        return;
                    default:
                        y8 y8Var = this.f35636b;
                        int[] iArr2 = y8Var.f35667b;
                        ArrayList arrayList3 = y8Var.d;
                        if (!y8Var.f35675x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i122 = 0;
                                while (i122 < size2) {
                                    Object obj2 = arrayList3.get(i122);
                                    i122++;
                                    if (((g9) obj2).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i132 = 0; i132 < iArr2.length; i132++) {
                                    g9 g9Var2 = (g9) arrayList3.get(i132);
                                    boolean equalsIgnoreCase = y8Var.f35666a[iArr2[i132]].equalsIgnoreCase(g9Var2.getWord());
                                    if (!equalsIgnoreCase && g9Var2.v) {
                                        AndroidUtilities.shakeViewSpring(g9Var2);
                                    }
                                    g9Var2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            y8Var.f35675x = true;
                            y8Var.U();
                            AndroidUtilities.hideKeyboard(y8Var.fragmentView);
                            m mVar = y8Var.f35668c;
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
        linearLayout.addView(this.h, w7.x5.t(-1, 48, 1, 0, 24, 0, 0));
        U();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f35672r = i10;
        this.f35673s = i11;
        this.v = i12;
        this.f35674w = i13;
        ScrollView scrollView = this.f35669e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.f35671n);
        }
        ImageView imageView = this.f35670f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f35670f.setLayoutParams(layoutParams);
        }
    }
}
