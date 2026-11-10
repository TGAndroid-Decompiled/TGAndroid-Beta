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
import org.telegram.ui.Components.rt0;
import org.telegram.ui.Components.st0;
import org.telegram.ui.h10;
public final class ga extends org.telegram.ui.ActionBar.f2 {
    public final String[] f42549a;
    public final int[] f42550b;
    public final l f42551c;
    public final ArrayList d;
    public ScrollView f42552e;
    public ImageView f42553f;
    public fi.d h;
    public int f42554n;
    public int f42555r;
    public int f42556s;
    public int f42557w;
    public int f42558x;
    public boolean f42559y;

    public ga(ArrayList arrayList, l lVar) {
        super(null);
        this.f42550b = new int[3];
        this.d = new ArrayList();
        int i7 = 0;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f42549a = strArr;
        if (strArr.length != 12 && strArr.length != 24) {
            throw new IllegalArgumentException("Expected a 12- or 24-word recovery phrase");
        }
        this.f42551c = lVar;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < this.f42549a.length; i10 = com.google.android.recaptcha.internal.a.f(i10, i10, 1, arrayList2)) {
        }
        Collections.shuffle(arrayList2);
        while (true) {
            int[] iArr = this.f42550b;
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
        if (arrayList.size() == this.f42550b.length) {
            z9 = true;
        } else {
            z9 = false;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            z9 &= !((pa) obj).getWord().isEmpty();
        }
        fi.d dVar = this.h;
        if (z9) {
            i7 = 0;
        } else {
            i7 = 4;
        }
        dVar.setVisibility(i7);
        fi.d dVar2 = this.h;
        if (z9 && !this.f42559y) {
            z10 = true;
        }
        dVar2.setEnabled(z10);
    }

    @Override
    public final View createView(Context context) {
        int i7;
        this.actionBar.setAddToContainer(false);
        this.actionBar.setOccupyStatusBar(false);
        st0 st0Var = new st0(context, null);
        st0Var.setDelegate(new rt0() {
            @Override
            public final void K(int i10, boolean z9) {
                ga gaVar = ga.this;
                gaVar.getClass();
                if (i10 <= org.telegram.messenger.g0.L(20.0f)) {
                    i10 = 0;
                }
                gaVar.f42554n = i10;
                gaVar.onInsets(gaVar.f42555r, gaVar.f42556s, gaVar.f42557w, gaVar.f42558x);
            }
        });
        org.telegram.ui.ActionBar.t6.h(org.telegram.ui.ActionBar.m6.f27890d6, st0Var, this.resourceProvider);
        this.fragmentView = st0Var;
        ScrollView scrollView = new ScrollView(context);
        this.f42552e = scrollView;
        scrollView.setFillViewport(true);
        this.f42552e.setVerticalScrollBarEnabled(false);
        this.f42552e.setClipToPadding(false);
        this.f42552e.setPadding(0, org.telegram.messenger.g0.L(96.0f), 0, 0);
        st0Var.addView(this.f42552e, c8.ha.c(-1.0f, -1));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(36.0f), 0, org.telegram.messenger.g0.L(36.0f), org.telegram.messenger.g0.L(24.0f));
        linearLayout.setClipToPadding(false);
        this.f42552e.addView(linearLayout, new FrameLayout.LayoutParams(-1, -2));
        ImageView imageView = new ImageView(context);
        this.f42553f = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView2 = this.f42553f;
        int i10 = org.telegram.ui.ActionBar.m6.G6;
        org.telegram.ui.ActionBar.t6.s(imageView2, i10, this.resourceProvider, PorterDuff.Mode.SRC_IN);
        this.f42553f.setImageResource(2131231241);
        ImageView imageView3 = this.f42553f;
        int i11 = org.telegram.ui.ActionBar.m6.f27982i6;
        org.telegram.ui.ActionBar.t6.Q(imageView3, org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.w0(i11, this.resourceProvider), 3, -1), null, org.telegram.ui.ActionBar.t6.M(i11), this.resourceProvider);
        this.f42553f.setOnClickListener(new View.OnClickListener(this) {
            public final ga f42513b;

            {
                this.f42513b = this;
            }

            @Override
            public final void onClick(View view) {
                int i12 = r2;
                ga gaVar = this.f42513b;
                switch (i12) {
                    case 0:
                        gaVar.finishFragment();
                        return;
                    default:
                        int[] iArr = gaVar.f42550b;
                        ArrayList arrayList = gaVar.d;
                        if (!gaVar.f42559y && arrayList.size() == iArr.length) {
                            boolean z9 = org.telegram.messenger.r2.f25216a;
                            int size = arrayList.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayList.get(i13);
                                i13++;
                                if (((pa) obj).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z10 = true;
                            for (int i14 = 0; i14 < iArr.length; i14++) {
                                pa paVar = (pa) arrayList.get(i14);
                                boolean equalsIgnoreCase = gaVar.f42549a[iArr[i14]].equalsIgnoreCase(paVar.getWord());
                                if (!equalsIgnoreCase && paVar.f43032w) {
                                    org.telegram.messenger.g0.H3(paVar);
                                }
                                paVar.setError(!equalsIgnoreCase);
                                z10 &= equalsIgnoreCase;
                            }
                            if (z10) {
                                gaVar.f42559y = true;
                                gaVar.Z();
                                org.telegram.messenger.g0.v1(gaVar.fragmentView);
                                l lVar = gaVar.f42551c;
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
        st0Var.addView(this.f42553f, c8.ha.d(48, 48.0f, 51, 4.0f, 12.0f, 0.0f, 0.0f));
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(context);
        k9Var.setAspectFit(true);
        k9Var.getImageReceiver().d = org.telegram.messenger.g0.t0();
        ui.b0(org.telegram.messenger.g0.t0()).c2(k9Var, "RestrictedEmoji", "👨\u200d🏫", "100_100");
        k9Var.getImageReceiver().X(1);
        linearLayout.addView(k9Var, c8.ha.t(100, 100, 1, 0, 0, 0, 12));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(1);
        org.telegram.messenger.camera.q.o(textView, i10, this.resourceProvider, null, 2131743005);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-1, -2, 1, 32, 0, 32, 10), context);
        f10.setTextSize(1, 14.0f);
        f10.setGravity(1);
        org.telegram.ui.ActionBar.t6.U(f10, org.telegram.ui.ActionBar.m6.f28300z6, this.resourceProvider);
        int[] iArr = this.f42550b;
        org.telegram.messenger.k5.r(null, null, 2131743004, new Object[]{Integer.valueOf(iArr[0] + 1), Integer.valueOf(iArr[1] + 1), Integer.valueOf(iArr[2] + 1)}, f10);
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
            arrayList.add(((pa) obj).getWord());
        }
        arrayList2.clear();
        for (int i13 = 0; i13 < iArr.length; i13++) {
            pa paVar = new pa(iArr[i13], context, this.resourceProvider, false);
            if (i13 < arrayList.size()) {
                paVar.setText((String) arrayList.get(i13));
            }
            paVar.setOnTextChangedListener(new l(this, 14));
            paVar.setOnNextListener(new h10(this, i13, paVar, 18));
            if (i13 == 0) {
                i7 = 0;
            } else {
                i7 = 12;
            }
            linearLayout2.addView(paVar, c8.ha.t(-1, 50, 1, 0, i7, 0, 0));
            arrayList2.add(paVar);
        }
        linearLayout.addView(new View(context), c8.ha.l(1.0f, -1, 0));
        fi.d dVar = new fi.d(context, this.resourceProvider, true);
        this.h = dVar;
        dVar.f();
        this.h.setText(id.M0(2131743154, null));
        this.h.setOnClickListener(new View.OnClickListener(this) {
            public final ga f42513b;

            {
                this.f42513b = this;
            }

            @Override
            public final void onClick(View view) {
                int i122 = r2;
                ga gaVar = this.f42513b;
                switch (i122) {
                    case 0:
                        gaVar.finishFragment();
                        return;
                    default:
                        int[] iArr2 = gaVar.f42550b;
                        ArrayList arrayList3 = gaVar.d;
                        if (!gaVar.f42559y && arrayList3.size() == iArr2.length) {
                            boolean z9 = org.telegram.messenger.r2.f25216a;
                            int size2 = arrayList3.size();
                            int i132 = 0;
                            while (i132 < size2) {
                                Object obj2 = arrayList3.get(i132);
                                i132++;
                                if (((pa) obj2).getWord().isEmpty()) {
                                    return;
                                }
                            }
                            boolean z10 = true;
                            for (int i14 = 0; i14 < iArr2.length; i14++) {
                                pa paVar2 = (pa) arrayList3.get(i14);
                                boolean equalsIgnoreCase = gaVar.f42549a[iArr2[i14]].equalsIgnoreCase(paVar2.getWord());
                                if (!equalsIgnoreCase && paVar2.f43032w) {
                                    org.telegram.messenger.g0.H3(paVar2);
                                }
                                paVar2.setError(!equalsIgnoreCase);
                                z10 &= equalsIgnoreCase;
                            }
                            if (z10) {
                                gaVar.f42559y = true;
                                gaVar.Z();
                                org.telegram.messenger.g0.v1(gaVar.fragmentView);
                                l lVar = gaVar.f42551c;
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
        this.f42555r = i7;
        this.f42556s = i10;
        this.f42557w = i11;
        this.f42558x = i12;
        ScrollView scrollView = this.f42552e;
        if (scrollView != null) {
            scrollView.setPadding(i7, org.telegram.messenger.g0.L(96.0f) + i10, i11, i12 + this.f42554n);
        }
        ImageView imageView = this.f42553f;
        if (imageView != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
            layoutParams.leftMargin = org.telegram.messenger.g0.L(4.0f) + i7;
            layoutParams.topMargin = org.telegram.messenger.g0.L(12.0f) + i10;
            this.f42553f.setLayoutParams(layoutParams);
        }
    }
}
