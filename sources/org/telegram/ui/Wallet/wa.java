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
import org.telegram.messenger.gd;
import org.telegram.messenger.m10;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.bu0;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.e21;
public final class wa extends org.telegram.ui.ActionBar.g2 {
    public final String[] f45349a;
    public final int[] f45350b;
    public final m f45351c;
    public final ArrayList d;
    public ScrollView f45352e;
    public ImageView f45353f;
    public hi.e h;
    public int f45354n;
    public int f45355r;
    public int f45356s;
    public int f45357w;
    public int f45358x;
    public boolean f45359y;

    public wa(ArrayList arrayList, m mVar) {
        super(null);
        this.f45350b = new int[3];
        this.d = new ArrayList();
        int i7 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f45349a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f45351c = mVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f45349a.length; i10 = com.google.android.gms.internal.vision.e2.f(i10, i10, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f45350b;
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
        boolean z10;
        int i7;
        if (this.h == null) {
            return;
        }
        ArrayList arrayList = this.d;
        boolean z11 = false;
        if (arrayList.size() == this.f45350b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 &= !((eb) obj).getWord().isEmpty();
        }
        hi.e eVar = this.h;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        eVar.setVisibility(i7);
        hi.e eVar2 = this.h;
        if (z10 && !this.f45359y) {
            z11 = true;
        }
        eVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        cu0 cu0Var = new cu0(context, null);
        cu0Var.setDelegate(new bu0() {
            @Override
            public final void L(int i10, boolean z10) {
                wa waVar = wa.this;
                waVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                waVar.f45354n = i10;
                waVar.onInsets(waVar.f45355r, waVar.f45356s, waVar.f45357w, waVar.f45358x);
            }
        });
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29451d6, cu0Var, this.resourceProvider);
        this.fragmentView = cu0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f45352e = scrollView;
        scrollView.setFillViewport(true);
        this.f45352e.setVerticalScrollBarEnabled(false);
        this.f45352e.setClipToPadding(false);
        this.f45352e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        cu0Var.addView(this.f45352e, c8.na.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f45352e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f45353f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f45353f;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f45353f.setImageResource(2131231244);
        ImageView imageView3 = this.f45353f;
        int i11 = org.telegram.ui.ActionBar.n6.f29543i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.u6.M(i11), this.resourceProvider);
        this.f45353f.setOnClickListener(new View.OnClickListener(this) {
            public final wa f45322b;

            {
                this.f45322b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                wa waVar = this.f45322b;
                switch (i12) {
                    case 0:
                        waVar.finishFragment();
                        return;
                    default:
                        int[] iArr = waVar.f45350b;
                        ArrayList arrayList = waVar.d;
                        if (!waVar.f45359y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.s2.f26829a;
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                if (((eb) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i14 = 0; i14 < iArr.length; i14++) {
                                eb ebVar = (eb) arrayList.get(i14);
                                boolean equalsIgnoreCase = waVar.f45349a[iArr[i14]].equalsIgnoreCase(ebVar.getWord());
                                if (!equalsIgnoreCase && ebVar.f44264w) {
                                    org.telegram.messenger.g0.F3(ebVar);
                                }
                                ebVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                waVar.f45359y = true;
                                waVar.Z();
                                org.telegram.messenger.g0.v1(waVar.fragmentView);
                                m mVar = waVar.f45351c;
                                if (mVar != null) {
                                    mVar.run();
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
        cu0Var.addView(this.f45353f, c8.na.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
        p9Var.setAspectFit(true);
        p9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(p9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        p9Var.getImageReceiver().Y(1);
        linearLayout.addView(p9Var, c8.na.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        m10.r(textView, i10, this.resourceProvider, null, 2131742734);
        TextView f10 = m10.f(linearLayout, textView, c8.na.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.f29862z6, this.resourceProvider);
        int[] iArr = this.f45350b;
        org.telegram.messenger.f3.q(null, null, 2131742733, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, c8.na.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, c8.na.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(((eb) obj).getWord());
        }
        arrayList2.clear();
        for (int i13 = 0; i13 < iArr.length; i13++) {
            eb ebVar = new eb(iArr[i13], context, this.resourceProvider, false);
            if (i13 < arrayList.size()) {
                ebVar.setText((String) arrayList.get(i13));
            }
            ebVar.setOnTextChangedListener(new m(this, 14));
            ebVar.setOnNextListener(new e21(this, i13, ebVar, 21));
            if (i13 == 0) {
                i7 = 0;
            } else {
                i7 = 12;
            }
            linearLayout2.addView(ebVar, c8.na.t(-1, 50, 1, 0, i7, 0, 0));
            arrayList2.add(ebVar);
        }
        linearLayout.addView(new View(context), c8.na.l(1.0f, -1, 0));
        hi.e eVar = new hi.e(context, this.resourceProvider, true);
        this.h = eVar;
        eVar.f();
        this.h.setText(gd.N0(2131742903, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final wa f45322b;

            {
                this.f45322b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                wa waVar = this.f45322b;
                switch (i122) {
                    case 0:
                        waVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = waVar.f45350b;
                        ArrayList arrayList3 = waVar.d;
                        if (!waVar.f45359y && arrayList3.size() == iArr2.length) {
                            boolean z10 = org.telegram.messenger.s2.f26829a;
                            int size2 = arrayList3.size();
                            int i132 = 0;
                            while (i132 < size2) {
                                Object obj2 = arrayList3.get(i132);
                                i132++;
                                if (((eb) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i14 = 0; i14 < iArr2.length; i14++) {
                                eb ebVar2 = (eb) arrayList3.get(i14);
                                boolean equalsIgnoreCase = waVar.f45349a[iArr2[i14]].equalsIgnoreCase(ebVar2.getWord());
                                if (!equalsIgnoreCase && ebVar2.f44264w) {
                                    org.telegram.messenger.g0.F3(ebVar2);
                                }
                                ebVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                waVar.f45359y = true;
                                waVar.Z();
                                org.telegram.messenger.g0.v1(waVar.fragmentView);
                                m mVar = waVar.f45351c;
                                if (mVar != null) {
                                    mVar.run();
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
        linearLayout.addView(this.h, c8.na.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f45355r = i7;
        this.f45356s = i10;
        this.f45357w = i11;
        this.f45358x = i12;
        ScrollView scrollView = this.f45352e;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12 + this.f45354n);
        }
        ImageView imageView = this.f45353f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f45353f.setLayoutParams(layoutParams);
        }
    }
}
