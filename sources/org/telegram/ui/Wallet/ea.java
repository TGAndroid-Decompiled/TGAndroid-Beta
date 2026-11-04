package org.telegram.ui.Wallet;

import android.content.Context;
import android.graphics.PorterDuff;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import b8.mf;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import org.telegram.messenger.bd;
import org.telegram.messenger.li;
import org.telegram.ui.Components.pt0;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.rw;
public final class ea extends org.telegram.ui.ActionBar.d2 {
    public final String[] f42491a;
    public final int[] f42492b;
    public final l f42493c;
    public final ArrayList d;
    public ScrollView f42494e;
    public ImageView f42495f;
    public gi.d h;
    public int f42496n;
    public int f42497r;
    public int f42498s;
    public int f42499w;
    public int f42500x;
    public boolean f42501y;

    public ea(ArrayList arrayList, l lVar) {
        super(null);
        this.f42492b = new int[3];
        this.d = new ArrayList();
        int i3 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f42491a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f42493c = lVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f42491a.length; i10 = com.google.android.recaptcha.internal.a.f(i10, i10, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f42492b;
            if (i3 < iArr.length) {
                iArr[i3] = ((Integer) arrayList2.get(i3)).intValue();
                i3++;
            } else {
                Arrays.sort(iArr);
                return;
            }
        }
    }

    public final void Z() {
        boolean z10;
        int i3;
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z11 = false;
        if (arrayList.size() == this.f42492b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 &= !((na) obj).getWord().isEmpty();
        }
        gi.d dVar = this.h;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        dVar.setVisibility(i3);
        gi.d dVar2 = this.h;
        if (z10 && !this.f42501y) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i3;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        qt0 qt0Var = new qt0(context, null);
        qt0Var.setDelegate(new pt0() {
            @Override
            public final void K(int i10, boolean z10) {
                ea eaVar = ea.this;
                eaVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                eaVar.f42496n = i10;
                eaVar.onInsets(eaVar.f42497r, eaVar.f42498s, eaVar.f42499w, eaVar.f42500x);
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27878d6, qt0Var, this.resourceProvider);
        this.fragmentView = qt0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f42494e = scrollView;
        scrollView.setFillViewport(true);
        this.f42494e.setVerticalScrollBarEnabled(false);
        this.f42494e.setClipToPadding(false);
        this.f42494e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        qt0Var.addView(this.f42494e, mf.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f42494e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f42495f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f42495f;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f42495f.setImageResource(2131231241);
        ImageView imageView3 = this.f42495f;
        int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i11), this.resourceProvider);
        this.f42495f.setOnClickListener(new View.OnClickListener(this) {
            public final ea f42444b;

            {
                this.f42444b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                ea eaVar = this.f42444b;
                switch (i12) {
                    case 0:
                        eaVar.finishFragment();
                        return;
                    default:
                        int[] iArr = eaVar.f42492b;
                        ArrayList arrayList = eaVar.d;
                        if (!eaVar.f42501y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.r2.f25040a;
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                if (((na) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i14 = 0; i14 < iArr.length; i14++) {
                                na naVar = (na) arrayList.get(i14);
                                boolean equalsIgnoreCase = eaVar.f42491a[iArr[i14]].equalsIgnoreCase(naVar.getWord());
                                if (!equalsIgnoreCase && naVar.f42968w) {
                                    org.telegram.messenger.g0.H3(naVar);
                                }
                                naVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                eaVar.f42501y = true;
                                eaVar.Z();
                                org.telegram.messenger.g0.v1(eaVar.fragmentView);
                                l lVar = eaVar.f42493c;
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
        qt0Var.addView(this.f42495f, mf.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setAspectFit(true);
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        li.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        k9Var.getImageReceiver().X(1);
        linearLayout.addView(k9Var, mf.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.messenger.camera.q.o(textView, i10, this.resourceProvider, null, 2131743015);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, mf.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.f28290z6, this.resourceProvider);
        int[] iArr = this.f42492b;
        org.telegram.messenger.k5.r(null, null, 2131743014, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, mf.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, mf.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(((na) obj).getWord());
        }
        arrayList2.clear();
        for (int i13 = 0; i13 < iArr.length; i13++) {
            na naVar = new na(iArr[i13], context, this.resourceProvider, false);
            if (i13 < arrayList.size()) {
                naVar.setText((String) arrayList.get(i13));
            }
            naVar.setOnTextChangedListener(new l(this, 14));
            naVar.setOnNextListener(new rw(this, i13, naVar, 19));
            if (i13 == 0) {
                i3 = 0;
            } else {
                i3 = 12;
            }
            linearLayout2.addView(naVar, mf.t(-1, 50, 1, 0, i3, 0, 0));
            arrayList2.add(naVar);
        }
        linearLayout.addView(new View(context), mf.l(1.0f, -1, 0));
        gi.d dVar = new gi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(bd.M0(2131743164, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ea f42444b;

            {
                this.f42444b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                ea eaVar = this.f42444b;
                switch (i122) {
                    case 0:
                        eaVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = eaVar.f42492b;
                        ArrayList arrayList3 = eaVar.d;
                        if (!eaVar.f42501y && arrayList3.size() == iArr2.length) {
                            boolean z10 = org.telegram.messenger.r2.f25040a;
                            int size2 = arrayList3.size();
                            int i132 = 0;
                            while (i132 < size2) {
                                Object obj2 = arrayList3.get(i132);
                                i132++;
                                if (((na) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i14 = 0; i14 < iArr2.length; i14++) {
                                na naVar2 = (na) arrayList3.get(i14);
                                boolean equalsIgnoreCase = eaVar.f42491a[iArr2[i14]].equalsIgnoreCase(naVar2.getWord());
                                if (!equalsIgnoreCase && naVar2.f42968w) {
                                    org.telegram.messenger.g0.H3(naVar2);
                                }
                                naVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                eaVar.f42501y = true;
                                eaVar.Z();
                                org.telegram.messenger.g0.v1(eaVar.fragmentView);
                                l lVar = eaVar.f42493c;
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
        linearLayout.addView(this.h, mf.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i3, int i10, int i11, int i12) {
        this.f42497r = i3;
        this.f42498s = i10;
        this.f42499w = i11;
        this.f42500x = i12;
        ScrollView scrollView = this.f42494e;
        if (scrollView != null) {
            scrollView.setPadding(i3, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12 + this.f42496n);
        }
        ImageView imageView = this.f42495f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i3;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f42495f.setLayoutParams(layoutParams);
        }
    }
}
