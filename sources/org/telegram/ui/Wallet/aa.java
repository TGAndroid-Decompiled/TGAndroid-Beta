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
import org.telegram.messenger.wh;
import org.telegram.ui.Components.iw0;
import org.telegram.ui.Components.jw0;
import org.telegram.ui.Components.w31;
public final class aa extends org.telegram.ui.ActionBar.n2 {
    public final String[] f34004a;
    public final int[] f34005b;
    public final n f34006c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f34007f;
    public ei.d h;
    public int f34008n;
    public int f34009r;
    public int f34010s;
    public int v;
    public int f34011w;
    public boolean f34012x;

    public aa(ArrayList arrayList, n nVar) {
        super(null);
        this.f34005b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f34004a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f34006c = nVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f34004a.length; i11 = com.google.android.gms.internal.cast.a6.f(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f34005b;
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
        if (arrayList.size() == this.f34005b.length) {
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
        if (z10 && !this.f34012x) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        jw0 jw0Var = new jw0(context, null);
        jw0Var.setDelegate(new iw0() {
            @Override
            public final void H(int i11, boolean z10) {
                aa aaVar = aa.this;
                aaVar.getClass();
                if (i11 <= AndroidUtilities.dp(20.0f)) {
                    i11 = 0;
                }
                aaVar.f34008n = i11;
                aaVar.onInsets(aaVar.f34009r, aaVar.f34010s, aaVar.v, aaVar.f34011w);
            }
        });
        jw0Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20986d6, this.resourceProvider));
        this.fragmentView = jw0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, AndroidUtilities.dp(96.0f), 0, 0);
        jw0Var.addView(this.e, w7.z5.d(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(36.0f), 0, AndroidUtilities.dp(36.0f), AndroidUtilities.dp(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34007f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34007f;
        int i11 = org.telegram.ui.ActionBar.h6.G6;
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider), PorterDuff.Mode.SRC_IN));
        this.f34007f.setImageResource(R.drawable.ic_ab_close);
        this.f34007f.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, this.resourceProvider), 3, -1));
        this.f34007f.setOnClickListener(new View.OnClickListener(this) {
            public final aa f35222b;

            {
                this.f35222b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35222b.finishFragment();
                        return;
                    default:
                        aa aaVar = this.f35222b;
                        int[] iArr = aaVar.f34005b;
                        ArrayList arrayList = aaVar.d;
                        if (!aaVar.f34012x && arrayList.size() == iArr.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size = arrayList.size();
                                int i12 = 0;
                                while (i12 < size) {
                                    Object obj = arrayList.get(i12);
                                    i12++;
                                    if (((ia) obj).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i13 = 0; i13 < iArr.length; i13++) {
                                    ia iaVar = (ia) arrayList.get(i13);
                                    boolean equalsIgnoreCase = aaVar.f34004a[iArr[i13]].equalsIgnoreCase(iaVar.getWord());
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
                            aaVar.f34012x = true;
                            aaVar.U();
                            AndroidUtilities.hideKeyboard(aaVar.fragmentView);
                            n nVar = aaVar.f34006c;
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
        jw0Var.addView(this.f34007f, w7.z5.a(48.0f, 4.0f, 12.0f, 0.0f, 0.0f, 48, 51));
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(context);
        w9Var.setAspectFit(true);
        w9Var.getImageReceiver().setCurrentAccount(AndroidUtilities.getAccountInProduction());
        MediaDataController.getInstance(AndroidUtilities.getAccountInProduction()).setPlaceholderImage(w9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        w9Var.getImageReceiver().setAutoRepeatCount(1);
        linearLayout.addView(w9Var, w7.z5.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(1);
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.resourceProvider));
        textView.setText(LocaleController.getString(R.string.WalletTestPhrase));
        TextView i12 = com.google.android.gms.internal.cast.a6.i(linearLayout, textView, w7.z5.t(-1, -2, 1, 32, 0, 32, 10), context);
        i12.setTextSize(1, 14.0f);
        i12.setGravity(1);
        i12.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21391z6, this.resourceProvider));
        int i13 = R.string.WalletTestPhraseInfo;
        int[] iArr = this.f34005b;
        wh.r(i13, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, i12);
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
            arrayList.add(((ia) obj).getWord());
        }
        arrayList2.clear();
        for (int i15 = 0; i15 < iArr.length; i15++) {
            ia iaVar = new ia(iArr[i15], context, this.resourceProvider, false);
            if (i15 < arrayList.size()) {
                iaVar.setText((String) arrayList.get(i15));
            }
            iaVar.setOnTextChangedListener(new n(this, 17));
            iaVar.setOnNextListener(new w31(this, i15, iaVar, 20));
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
        dVar.e();
        this.h.setText(LocaleController.getString(R.string.WalletContinue));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final aa f35222b;

            {
                this.f35222b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        this.f35222b.finishFragment();
                        return;
                    default:
                        aa aaVar = this.f35222b;
                        int[] iArr2 = aaVar.f34005b;
                        ArrayList arrayList3 = aaVar.d;
                        if (!aaVar.f34012x && arrayList3.size() == iArr2.length) {
                            if (!BuildVars.DEBUG_PRIVATE_VERSION) {
                                int size2 = arrayList3.size();
                                int i122 = 0;
                                while (i122 < size2) {
                                    Object obj2 = arrayList3.get(i122);
                                    i122++;
                                    if (((ia) obj2).getWord().isEmpty()) {
                                        return;
                                    }
                                }
                                boolean z10 = true;
                                for (int i132 = 0; i132 < iArr2.length; i132++) {
                                    ia iaVar2 = (ia) arrayList3.get(i132);
                                    boolean equalsIgnoreCase = aaVar.f34004a[iArr2[i132]].equalsIgnoreCase(iaVar2.getWord());
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
                            aaVar.f34012x = true;
                            aaVar.U();
                            AndroidUtilities.hideKeyboard(aaVar.fragmentView);
                            n nVar = aaVar.f34006c;
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
        this.f34009r = i10;
        this.f34010s = i11;
        this.v = i12;
        this.f34011w = i13;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i10, AndroidUtilities.dp(96.0f) + i11, i12, i13 + this.f34008n);
        }
        ImageView imageView = this.f34007f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = AndroidUtilities.dp(4.0f) + i10;
            layoutParams.topMargin = AndroidUtilities.dp(12.0f) + i11;
            this.f34007f.setLayoutParams(layoutParams);
        }
    }
}
