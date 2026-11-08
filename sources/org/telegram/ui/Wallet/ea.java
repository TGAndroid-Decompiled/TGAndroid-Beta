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
import org.telegram.messenger.id;
import org.telegram.messenger.ui;
import org.telegram.ui.Components.qt0;
import org.telegram.ui.Components.rt0;
import org.telegram.ui.d10;
public final class ea extends org.telegram.ui.ActionBar.f2 {
    public final String[] f42468a;
    public final int[] f42469b;
    public final l f42470c;
    public final ArrayList d;
    public ScrollView f42471e;
    public ImageView f42472f;
    public fi.d h;
    public int f42473n;
    public int f42474r;
    public int f42475s;
    public int f42476w;
    public int f42477x;
    public boolean f42478y;

    public ea(ArrayList arrayList, l lVar) {
        super(null);
        this.f42469b = new int[3];
        this.d = new ArrayList();
        int i7 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f42468a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f42470c = lVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f42468a.length; i10 = com.google.android.recaptcha.internal.a.f(i10, i10, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f42469b;
            if (i7 < iArr.length) {
                iArr[i7] = ((Integer) arrayList2.get(i7)).intValue();
                i7++;
            } else {
                Arrays.sort(iArr);
                return;
            }
        }
    }

    public final void Z() {
        boolean z9;
        int i7;
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z10 = false;
        if (arrayList.size() == this.f42469b.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z9 &= !((na) obj).getWord().isEmpty();
        }
        fi.d dVar = this.h;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        dVar.setVisibility(i7);
        fi.d dVar2 = this.h;
        if (z9 && !this.f42478y) {
            z10 = true;
        }
        dVar2.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        rt0 rt0Var = new rt0(context, null);
        rt0Var.setDelegate(new qt0() {
            @Override
            public final void K(int i10, boolean z9) {
                ea eaVar = ea.this;
                eaVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                eaVar.f42473n = i10;
                eaVar.onInsets(eaVar.f42474r, eaVar.f42475s, eaVar.f42476w, eaVar.f42477x);
            }
        });
        org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.f27852d6, rt0Var, this.resourceProvider);
        this.fragmentView = rt0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f42471e = scrollView;
        scrollView.setFillViewport(true);
        this.f42471e.setVerticalScrollBarEnabled(false);
        this.f42471e.setClipToPadding(false);
        this.f42471e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        rt0Var.addView(this.f42471e, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f42471e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f42472f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f42472f;
        int i10 = org.telegram.ui.ActionBar.k6.G6;
        org.telegram.ui.ActionBar.r6.t(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f42472f.setImageResource(2131231241);
        ImageView imageView3 = this.f42472f;
        int i11 = org.telegram.ui.ActionBar.k6.f27944i6;
        org.telegram.ui.ActionBar.r6.R(imageView3, org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.r6.N(i11), this.resourceProvider);
        this.f42472f.setOnClickListener(new View.OnClickListener(this) {
            public final ea f42406b;

            {
                this.f42406b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                ea eaVar = this.f42406b;
                switch (i12) {
                    case 0:
                        eaVar.finishFragment();
                        return;
                    default:
                        int[] iArr = eaVar.f42469b;
                        ArrayList arrayList = eaVar.d;
                        if (!eaVar.f42478y && arrayList.size() == iArr.length) {
                            boolean z9 = org.telegram.messenger.r2.f25212a;
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                if (((na) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z10 = true;
                            for (int i14 = 0; i14 < iArr.length; i14++) {
                                na naVar = (na) arrayList.get(i14);
                                boolean equalsIgnoreCase = eaVar.f42468a[iArr[i14]].equalsIgnoreCase(naVar.getWord());
                                if (!equalsIgnoreCase && naVar.f42919w) {
                                    org.telegram.messenger.g0.H3(naVar);
                                }
                                naVar.setError(!equalsIgnoreCase);
                                z10 &= equalsIgnoreCase;
                            }
                            if (z10) {
                                eaVar.f42478y = true;
                                eaVar.Z();
                                org.telegram.messenger.g0.v1(eaVar.fragmentView);
                                l lVar = eaVar.f42470c;
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
        rt0Var.addView(this.f42472f, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.l9 l9Var = new org.telegram.ui.Components.l9(context);
        l9Var.setAspectFit(true);
        l9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(l9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        l9Var.getImageReceiver().X(1);
        linearLayout.addView(l9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.messenger.camera.q.o(textView, i10, this.resourceProvider, null, 2131743008);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.r6.V(f10, org.telegram.ui.ActionBar.k6.f28262z6, this.resourceProvider);
        int[] iArr = this.f42469b;
        org.telegram.messenger.k5.r(null, null, 2131743007, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, c8.ha.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, c8.ha.t(-1, -2, 1, 0, 16, 0, 0));
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
            naVar.setOnNextListener(new d10(this, i13, naVar, 18));
            if (i13 == 0) {
                i7 = 0;
            } else {
                i7 = 12;
            }
            linearLayout2.addView(naVar, c8.ha.t(-1, 50, 1, 0, i7, 0, 0));
            arrayList2.add(naVar);
        }
        linearLayout.addView(new View(context), c8.ha.l(1.0f, -1, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(id.M0(2131743157, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ea f42406b;

            {
                this.f42406b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                ea eaVar = this.f42406b;
                switch (i122) {
                    case 0:
                        eaVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = eaVar.f42469b;
                        ArrayList arrayList3 = eaVar.d;
                        if (!eaVar.f42478y && arrayList3.size() == iArr2.length) {
                            boolean z9 = org.telegram.messenger.r2.f25212a;
                            int size2 = arrayList3.size();
                            int i132 = 0;
                            while (i132 < size2) {
                                Object obj2 = arrayList3.get(i132);
                                i132++;
                                if (((na) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z10 = true;
                            for (int i14 = 0; i14 < iArr2.length; i14++) {
                                na naVar2 = (na) arrayList3.get(i14);
                                boolean equalsIgnoreCase = eaVar.f42468a[iArr2[i14]].equalsIgnoreCase(naVar2.getWord());
                                if (!equalsIgnoreCase && naVar2.f42919w) {
                                    org.telegram.messenger.g0.H3(naVar2);
                                }
                                naVar2.setError(!equalsIgnoreCase);
                                z10 &= equalsIgnoreCase;
                            }
                            if (z10) {
                                eaVar.f42478y = true;
                                eaVar.Z();
                                org.telegram.messenger.g0.v1(eaVar.fragmentView);
                                l lVar = eaVar.f42470c;
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
        linearLayout.addView(this.h, c8.ha.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f42474r = i7;
        this.f42475s = i10;
        this.f42476w = i11;
        this.f42477x = i12;
        ScrollView scrollView = this.f42471e;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12 + this.f42473n);
        }
        ImageView imageView = this.f42472f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f42472f.setLayoutParams(layoutParams);
        }
    }
}
