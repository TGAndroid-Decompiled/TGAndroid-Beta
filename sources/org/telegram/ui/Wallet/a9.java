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
import org.telegram.ui.Components.sw0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.Components.y9;
import org.telegram.ui.bi0;
public final class a9 extends org.telegram.ui.ActionBar.n2 {
    public final String[] f34679a;
    public final int[] f34680b;
    public final n f34681c;
    public final ArrayList d;
    public ScrollView f34682e;
    public ImageView f34683f;
    public ci.d h;
    public int f34684n;
    public int f34685r;
    public int f34686s;
    public int v;
    public int f34687w;
    public boolean f34688x;

    public a9(ArrayList arrayList, n nVar) {
        super(null);
        this.f34680b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f34679a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f34681c = nVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f34679a.length; i11 = com.google.android.gms.internal.vision.e2.e(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f34680b;
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
        if (arrayList.size() == this.f34680b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 &= !((i9) obj).getWord().isEmpty();
        }
        ci.d dVar = this.h;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dVar.setVisibility(i10);
        ci.d dVar2 = this.h;
        if (z10 && !this.f34688x) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        tw0 tw0Var = new tw0(context, null);
        tw0Var.setDelegate(new sw0() {
            @Override
            public final void H(int i11, boolean z10) {
                a9 a9Var = a9.this;
                a9Var.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                a9Var.f34684n = i11;
                a9Var.onInsets(a9Var.f34685r, a9Var.f34686s, a9Var.v, a9Var.f34687w);
            }
        });
        tw0Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20801d6, this.resourceProvider));
        this.fragmentView = tw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f34682e = scrollView;
        scrollView.setFillViewport(true);
        this.f34682e.setVerticalScrollBarEnabled(false);
        this.f34682e.setClipToPadding(false);
        this.f34682e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        tw0Var.addView(this.f34682e, w7.x5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.f34682e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34683f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34683f;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f34683f.setImageResource(R.drawable.ic_ab_close);
        this.f34683f.setBackground(org.telegram.ui.ActionBar.i6.g0(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20892i6, this.resourceProvider), 3, -1));
        this.f34683f.setOnClickListener(new View.OnClickListener(this) {
            public final a9 f35804b;

            {
                this.f35804b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35804b.finishFragment();
                        return;
                    default:
                        a9 a9Var = this.f35804b;
                        int[] iArr = a9Var.f34680b;
                        ArrayList arrayList = a9Var.d;
                        if (!a9Var.f34688x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList.get(i12);
                                    i12++;
                                    if (((i9) obj).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i13 = 0; i13 < iArr.length; i13++) {
                                    i9 i9Var = (i9) arrayList.get(i13);
                                    boolean equalsIgnoreCase = a9Var.f34679a[iArr[i13]].equalsIgnoreCase(i9Var.getWord());
                                    if (!equalsIgnoreCase && i9Var.v) {
                                        AndroidUtilities.shakeViewSpring(i9Var);
                                    }
                                    i9Var.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            a9Var.f34688x = true;
                            a9Var.U();
                            AndroidUtilities.hideKeyboard(a9Var.fragmentView);
                            n nVar = a9Var.f34681c;
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
        tw0Var.addView(this.f34683f, w7.x5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
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
        h.setTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f21203z6, this.resourceProvider));
        int i12 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.f34680b;
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
            arrayList.add(((i9) obj).getWord());
        }
        arrayList2.clear();
        for (int i14 = 0; i14 < iArr.length; i14++) {
            i9 i9Var = new i9(iArr[i14], context, this.resourceProvider, false);
            if (i14 < arrayList.size()) {
                i9Var.setText((String) arrayList.get(i14));
            }
            i9Var.setOnTextChangedListener(new n(this, 15));
            i9Var.setOnNextListener(new bi0(this, i14, i9Var, 15));
            if (i14 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout2.addView(i9Var, w7.x5.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(i9Var);
        }
        linearLayout.addView(new View(context), w7.x5.l(1.0f, -1, 0));
        ci.d dVar = new ci.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.e();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final a9 f35804b;

            {
                this.f35804b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35804b.finishFragment();
                        return;
                    default:
                        a9 a9Var = this.f35804b;
                        int[] iArr2 = a9Var.f34680b;
                        ArrayList arrayList3 = a9Var.d;
                        if (!a9Var.f34688x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i122 = 0;
                                while (i122 < size2) {
                                    Object obj2 = arrayList3.get(i122);
                                    i122++;
                                    if (((i9) obj2).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i132 = 0; i132 < iArr2.length; i132++) {
                                    i9 i9Var2 = (i9) arrayList3.get(i132);
                                    boolean equalsIgnoreCase = a9Var.f34679a[iArr2[i132]].equalsIgnoreCase(i9Var2.getWord());
                                    if (!equalsIgnoreCase && i9Var2.v) {
                                        AndroidUtilities.shakeViewSpring(i9Var2);
                                    }
                                    i9Var2.setError(!equalsIgnoreCase);
                                    z10 &= equalsIgnoreCase;
                                }
                                if (!z10) {
                                    return;
                                }
                            }
                            a9Var.f34688x = true;
                            a9Var.U();
                            AndroidUtilities.hideKeyboard(a9Var.fragmentView);
                            n nVar = a9Var.f34681c;
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
        this.f34685r = i10;
        this.f34686s = i11;
        this.v = i12;
        this.f34687w = i13;
        ScrollView scrollView = this.f34682e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.f34684n);
        }
        ImageView imageView = this.f34683f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f34683f.setLayoutParams(layoutParams);
        }
    }
}
