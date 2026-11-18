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
import org.telegram.messenger.n10;
import org.telegram.messenger.ri;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.zt0;
public final class va extends org.telegram.ui.ActionBar.h2 {
    public final String[] f45177a;
    public final int[] f45178b;
    public final m f45179c;
    public final ArrayList d;
    public ScrollView f45180e;
    public ImageView f45181f;
    public hi.d h;
    public int f45182n;
    public int f45183r;
    public int f45184s;
    public int f45185w;
    public int f45186x;
    public boolean f45187y;

    public va(ArrayList arrayList, m mVar) {
        super(null);
        this.f45178b = new int[3];
        this.d = new ArrayList();
        int i7 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f45177a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f45179c = mVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f45177a.length; i10 = com.google.android.gms.internal.vision.e2.f(i10, i10, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f45178b;
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
        if (arrayList.size() == this.f45178b.length) {
            z10 = true;
        } else {
            z10 = false;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z10 &= !((db) obj).getWord().isEmpty();
        }
        hi.d dVar = this.h;
        if (z10) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        dVar.setVisibility(i7);
        hi.d dVar2 = this.h;
        if (z10 && !this.f45187y) {
            z11 = true;
        }
        dVar2.setEnabled(z11);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        au0 au0Var = new au0(context, null);
        au0Var.setDelegate(new zt0() {
            @Override
            public final void L(int i10, boolean z10) {
                va vaVar = va.this;
                vaVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                vaVar.f45182n = i10;
                vaVar.onInsets(vaVar.f45183r, vaVar.f45184s, vaVar.f45185w, vaVar.f45186x);
            }
        });
        org.telegram.ui.ActionBar.u6.h(org.telegram.ui.ActionBar.n6.f29396d6, au0Var, this.resourceProvider);
        this.fragmentView = au0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f45180e = scrollView;
        scrollView.setFillViewport(true);
        this.f45180e.setVerticalScrollBarEnabled(false);
        this.f45180e.setClipToPadding(false);
        this.f45180e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        au0Var.addView(this.f45180e, c8.ma.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f45180e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f45181f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f45181f;
        int i10 = org.telegram.ui.ActionBar.n6.G6;
        org.telegram.ui.ActionBar.u6.s(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f45181f.setImageResource(2131231241);
        ImageView imageView3 = this.f45181f;
        int i11 = org.telegram.ui.ActionBar.n6.f29488i6;
        org.telegram.ui.ActionBar.u6.Q(imageView3, org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.u6.M(i11), this.resourceProvider);
        this.f45181f.setOnClickListener(new View.OnClickListener(this) {
            public final va f45150b;

            {
                this.f45150b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                va vaVar = this.f45150b;
                switch (i12) {
                    case 0:
                        vaVar.finishFragment();
                        return;
                    default:
                        int[] iArr = vaVar.f45178b;
                        ArrayList arrayList = vaVar.d;
                        if (!vaVar.f45187y && arrayList.size() == iArr.length) {
                            boolean z10 = org.telegram.messenger.s2.f26723a;
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                if (((db) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i14 = 0; i14 < iArr.length; i14++) {
                                db dbVar = (db) arrayList.get(i14);
                                boolean equalsIgnoreCase = vaVar.f45177a[iArr[i14]].equalsIgnoreCase(dbVar.getWord());
                                if (!equalsIgnoreCase && dbVar.f44092w) {
                                    org.telegram.messenger.g0.F3(dbVar);
                                }
                                dbVar.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                vaVar.f45187y = true;
                                vaVar.Z();
                                org.telegram.messenger.g0.v1(vaVar.fragmentView);
                                m mVar = vaVar.f45179c;
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
        au0Var.addView(this.f45181f, c8.ma.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.q9 q9Var = new org.telegram.ui.Components.q9(context);
        q9Var.setAspectFit(true);
        q9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ri.d0(org.telegram.messenger.g0.t0()).h2(q9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        q9Var.getImageReceiver().X(1);
        linearLayout.addView(q9Var, c8.ma.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        n10.r(textView, i10, this.resourceProvider, null, 2131742747);
        TextView f10 = n10.f(linearLayout, textView, c8.ma.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.u6.U(f10, org.telegram.ui.ActionBar.n6.f29807z6, this.resourceProvider);
        int[] iArr = this.f45178b;
        org.telegram.messenger.f3.q(null, null, 2131742746, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
        linearLayout.addView(f10, c8.ma.t(-1, -2, 1, 32, 0, 32, 8));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(1);
        linearLayout2.setClipChildren(false);
        linearLayout.addView(linearLayout2, c8.ma.t(-1, -2, 1, 0, 16, 0, 0));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        int i12 = 0;
        while (i12 < size) {
            Object obj = arrayList2.get(i12);
            i12++;
            arrayList.add(((db) obj).getWord());
        }
        arrayList2.clear();
        for (int i13 = 0; i13 < iArr.length; i13++) {
            db dbVar = new db(iArr[i13], context, this.resourceProvider, false);
            if (i13 < arrayList.size()) {
                dbVar.setText((String) arrayList.get(i13));
            }
            dbVar.setOnTextChangedListener(new m(this, 14));
            dbVar.setOnNextListener(new h01(this, i13, dbVar, 22));
            if (i13 == 0) {
                i7 = 0;
            } else {
                i7 = 12;
            }
            linearLayout2.addView(dbVar, c8.ma.t(-1, 50, 1, 0, i7, 0, 0));
            arrayList2.add(dbVar);
        }
        linearLayout.addView(new View(context), c8.ma.l(1.0f, -1, 0));
        hi.d dVar = new hi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(gd.M0(2131742916, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final va f45150b;

            {
                this.f45150b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                va vaVar = this.f45150b;
                switch (i122) {
                    case 0:
                        vaVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = vaVar.f45178b;
                        ArrayList arrayList3 = vaVar.d;
                        if (!vaVar.f45187y && arrayList3.size() == iArr2.length) {
                            boolean z10 = org.telegram.messenger.s2.f26723a;
                            int size2 = arrayList3.size();
                            int i132 = 0;
                            while (i132 < size2) {
                                Object obj2 = arrayList3.get(i132);
                                i132++;
                                if (((db) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z11 = true;
                            for (int i14 = 0; i14 < iArr2.length; i14++) {
                                db dbVar2 = (db) arrayList3.get(i14);
                                boolean equalsIgnoreCase = vaVar.f45177a[iArr2[i14]].equalsIgnoreCase(dbVar2.getWord());
                                if (!equalsIgnoreCase && dbVar2.f44092w) {
                                    org.telegram.messenger.g0.F3(dbVar2);
                                }
                                dbVar2.setError(!equalsIgnoreCase);
                                z11 &= equalsIgnoreCase;
                            }
                            if (z11) {
                                vaVar.f45187y = true;
                                vaVar.Z();
                                org.telegram.messenger.g0.v1(vaVar.fragmentView);
                                m mVar = vaVar.f45179c;
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
        linearLayout.addView(this.h, c8.ma.t(-1, 48, 1, 0, 24, 0, 0));
        Z();
        return this.fragmentView;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final void onInsets(int i7, int i10, int i11, int i12) {
        this.f45183r = i7;
        this.f45184s = i10;
        this.f45185w = i11;
        this.f45186x = i12;
        ScrollView scrollView = this.f45180e;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12 + this.f45182n);
        }
        ImageView imageView = this.f45181f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f45181f.setLayoutParams(layoutParams);
        }
    }
}
