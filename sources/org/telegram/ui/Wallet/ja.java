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
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.vi;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.vu0;
public final class ja extends org.telegram.ui.ActionBar.k2 {
    public final String[] f34769a;
    public final int[] f34770b;
    public final l f34771c;
    public final ArrayList d;
    public ScrollView e;
    public ImageView f34772f;
    public vh.d h;
    public int f34773n;
    public int f34774r;
    public int f34775s;
    public int f34776w;
    public int f34777x;
    public boolean f34778y;

    public ja(ArrayList arrayList, l lVar) {
        super(null);
        this.f34770b = new int[3];
        this.d = new ArrayList();
        int i10 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f34769a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f34771c = lVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i11 = 0; i11 < this.f34769a.length; i11 = c3.i0.j(i11, i11, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f34770b;
            if (i10 < iArr.length) {
                iArr[i10] = ((Integer) arrayList2.get(i10)).intValue();
                i10++;
            } else {
                Arrays.sort(iArr);
                return;
            }
        }
    }

    public final void Z() {
        boolean z10;
        int i10;
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z11 = false;
        if (arrayList.size() == this.f34770b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            z10 &= !((ra) obj).getWord().isEmpty();
        }
        vh.d dVar = this.h;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        dVar.setVisibility(i10);
        vh.d dVar2 = this.h;
        if (z10 && !this.f34778y) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i10;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        vu0 vu0Var = new vu0(context, null);
        vu0Var.setDelegate(new uu0() {
            @Override
            public final void L(int i11, boolean z10) {
                ja jaVar = ja.this;
                jaVar.getClass();
                if (i11 <= org.telegram.messenger.i0.L(20.0f)) {
                    i11 = 0;
                }
                jaVar.f34773n = i11;
                jaVar.onInsets(jaVar.f34774r, jaVar.f34775s, jaVar.f34776w, jaVar.f34777x);
            }
        });
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20930d6, vu0Var, this.resourceProvider);
        this.fragmentView = vu0Var;
        ScrollView scrollView = new ScrollView(context);
        this.e = scrollView;
        scrollView.setFillViewport(true);
        this.e.setVerticalScrollBarEnabled(false);
        this.e.setClipToPadding(false);
        this.e.setPadding(0, org.telegram.messenger.i0.L(96.0f), 0, 0);
        vu0Var.addView(this.e, w7.b6.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.i0.L(36.0f), 0, org.telegram.messenger.i0.L(36.0f), org.telegram.messenger.i0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f34772f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f34772f;
        int i11 = org.telegram.ui.ActionBar.t6.G6;
        org.telegram.ui.ActionBar.a7.t(imageView2, i11, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f34772f.setImageResource(2131231242);
        ImageView imageView3 = this.f34772f;
        int i12 = org.telegram.ui.ActionBar.t6.f21021i6;
        org.telegram.ui.ActionBar.a7.R(imageView3, org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.w0(i12, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.a7.N(i12), this.resourceProvider);
        this.f34772f.setOnClickListener(new View.OnClickListener(this) {
            public final ja f34730b;

            {
                this.f34730b = this;
            }

            @Override
            public final void onClick(View view) {
                int i13 = r2;
                ja jaVar = this.f34730b;
                switch (i13) {
                    case 0:
                        jaVar.finishFragment();
                        return;
                    default:
                        int[] iArr = jaVar.f34770b;
                        ArrayList arrayList = jaVar.d;
                        if (!jaVar.f34778y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.v2.f18578a;
                            int size = arrayList.size();
                            int i14 = 0;
                            while (i14 < size) {
                                Object obj = arrayList.get(i14);
                                i14++;
                                if (((ra) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr.length; i15++) {
                                ra raVar = (ra) arrayList.get(i15);
                                boolean equalsIgnoreCase = jaVar.f34769a[iArr[i15]].equalsIgnoreCase(raVar.getWord());
                                if (!equalsIgnoreCase && raVar.f35166w) {
                                    org.telegram.messenger.i0.G3(raVar);
                                }
                                raVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                jaVar.f34778y = true;
                                jaVar.Z();
                                org.telegram.messenger.i0.v1(jaVar.fragmentView);
                                l lVar = jaVar.f34771c;
                                if (lVar != null) {
                                    lVar.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        vu0Var.addView(this.f34772f, w7.b6.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(context);
        g9Var.setAspectFit(true);
        g9Var.getImageReceiver().d = org.telegram.messenger.i0.t0();
        vi.b0(org.telegram.messenger.i0.t0()).c2(g9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        g9Var.getImageReceiver().X(1);
        linearLayout.addView(g9Var, w7.b6.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(1);
        a30.p(textView, i11, this.resourceProvider, null, 2131743031);
        TextView f7 = a30.f(linearLayout, textView, w7.b6.t(-1, -2, 1, 32, 0, 32, 10), context);
        f7.setTextSize(1, 14.0f);
        f7.setGravity(1);
        org.telegram.ui.ActionBar.a7.V(f7, org.telegram.ui.ActionBar.t6.f21331z6, this.resourceProvider);
        int[] iArr = this.f34770b;
        org.telegram.messenger.m5.q(null, null, 2131743030, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f7);
        linearLayout.addView(f7, w7.b6.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, w7.b6.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i13 = 0;
        while (i13 < size) {
            Object obj = arrayList2.get(i13);
            i13++;
            arrayList.add(((ra) obj).getWord());
        }
        arrayList2.clear();
        for (int i14 = 0; i14 < iArr.length; i14++) {
            ra raVar = new ra(iArr[i14], context, this.resourceProvider, false);
            if (i14 < arrayList.size()) {
                raVar.setText((String) arrayList.get(i14));
            }
            raVar.setOnTextChangedListener(new l(this, 14));
            raVar.setOnNextListener(new x0(this, i14, raVar, 5));
            if (i14 == 0) {
                i10 = 0;
            } else {
                i10 = 12;
            }
            linearLayout2.addView(raVar, w7.b6.t(-1, 50, 1, 0, i10, 0, 0));
            arrayList2.add(raVar);
        }
        linearLayout.addView(new View(context), w7.b6.l(1.0f, -1, 0));
        vh.d dVar = new vh.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(dd.L0(2131743180, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ja f34730b;

            {
                this.f34730b = this;
            }

            @Override
            public final void onClick(View view) {
                int i132 = r2;
                ja jaVar = this.f34730b;
                switch (i132) {
                    case 0:
                        jaVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = jaVar.f34770b;
                        ArrayList arrayList3 = jaVar.d;
                        if (!jaVar.f34778y && arrayList3.size() == iArr2.length) {
                            boolean z10 = org.telegram.messenger.v2.f18578a;
                            int size2 = arrayList3.size();
                            int i142 = 0;
                            while (i142 < size2) {
                                Object obj2 = arrayList3.get(i142);
                                i142++;
                                if (((ra) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i15 = 0; i15 < iArr2.length; i15++) {
                                ra raVar2 = (ra) arrayList3.get(i15);
                                boolean equalsIgnoreCase = jaVar.f34769a[iArr2[i15]].equalsIgnoreCase(raVar2.getWord());
                                if (!equalsIgnoreCase && raVar2.f35166w) {
                                    org.telegram.messenger.i0.G3(raVar2);
                                }
                                raVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                jaVar.f34778y = true;
                                jaVar.Z();
                                org.telegram.messenger.i0.v1(jaVar.fragmentView);
                                l lVar = jaVar.f34771c;
                                if (lVar != null) {
                                    lVar.run();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        linearLayout.addView(this.h, w7.b6.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.f34774r = i10;
        this.f34775s = i11;
        this.f34776w = i12;
        this.f34777x = i13;
        ScrollView scrollView = this.e;
        if (scrollView != null) {
            scrollView.setPadding(i10, org.telegram.messenger.i0.L(96.0f) + i11, i12, i13 + this.f34773n);
        }
        ImageView imageView = this.f34772f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.i0.L(4.0f) + i10;
            layoutParams.topMargin = org.telegram.messenger.i0.L(12.0f) + i11;
            this.f34772f.setLayoutParams(layoutParams);
        }
    }
}
