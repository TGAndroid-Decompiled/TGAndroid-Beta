package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PremiumPreviewFragment;
public class bv extends org.telegram.ui.ActionBar.x2 implements org.telegram.messenger.fs {
    public static Pattern Q1;
    public final sp A1;
    public org.telegram.ui.ActionBar.h1 B1;
    public final boolean C1;
    public boolean D1;
    public float E1;
    public int F1;
    public int G1;
    public final c6 H1;
    public final mu I1;
    public int J1;
    public boolean K1;
    public long L1;
    public ValueAnimator M1;
    public boolean N1;
    public PorterDuffColorFilter O1;
    public int P1;
    public LongSparseArray f33784m1;
    public final org.telegram.ui.ActionBar.h2 n1;
    public final jn f33785o1;
    public final nu f33786p1;
    public final tu f33787q1;
    public final hi.w f33788r1;
    public ru f33789s1;
    public final View f33790t1;
    public final FrameLayout f33791u1;
    public final TextView f33792v1;
    public final TextView f33793w1;
    public final ug.s0 f33794x1;
    public final v4.t f33795y1;
    public final org.telegram.ui.ActionBar.l5 f33796z1;

    public bv(org.telegram.ui.ActionBar.h2 r21, android.content.Context r22, org.telegram.ui.ActionBar.i6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bv.<init>(org.telegram.ui.ActionBar.h2, android.content.Context, org.telegram.ui.ActionBar.i6, java.util.ArrayList):void");
    }

    public static void K0(final org.telegram.ui.ActionBar.h2 h2Var, TLObject tLObject, final boolean z10, final di.o9 o9Var, final mo moVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (h2Var == null) {
            currentAccount = org.telegram.messenger.j10.f24773t0;
        } else {
            currentAccount = h2Var.getCurrentAccount();
        }
        final int i7 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (h2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = h2Var.getFragmentView();
        }
        if (tLObject != null) {
            if (tLObject instanceof TLRPC.TL_messages_stickerSet) {
                tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) tLObject;
            } else {
                tL_messages_stickerSet = null;
            }
            if (tL_messages_stickerSet != null) {
                stickerSet = tL_messages_stickerSet.set;
            } else if (tLObject instanceof TLRPC.StickerSet) {
                stickerSet = (TLRPC.StickerSet) tLObject;
            }
            final TLRPC.StickerSet stickerSet2 = stickerSet;
            if (stickerSet2 != null) {
                Runnable runnable = (Runnable) org.telegram.messenger.ri.d0(i7).U.f(stickerSet2.f28432id);
                if (runnable != null) {
                    runnable.run();
                    if (o9Var != null) {
                        o9Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f28425id = stickerSet2.f28432id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.h2 h2Var2 = h2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i10 = i7;
                        final org.telegram.messenger.x10 x10Var = o9Var;
                        final Runnable runnable2 = moVar;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                int i11;
                                TLObject tLObject3;
                                TLObject tLObject4 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                if (stickerSet4.masks) {
                                    i11 = 1;
                                } else if (stickerSet4.emojis) {
                                    i11 = 5;
                                } else {
                                    i11 = 0;
                                }
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                org.telegram.ui.ActionBar.h2 h2Var3 = h2Var2;
                                int i12 = i10;
                                org.telegram.messenger.x10 x10Var2 = x10Var;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = h2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            gc.g(h2Var3, new mv0(context, tLObject3, 1, 2, null, h2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            org.telegram.messenger.ri.d0(i12).E1(h2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (x10Var2 != null) {
                                            x10Var2.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(h2Var3.getFragmentView().getContext(), org.telegram.messenger.gd.M0(2131751094, null), 0).show();
                                        if (x10Var2 != null) {
                                            x10Var2.a(Boolean.FALSE);
                                        }
                                    } else if (x10Var2 != null) {
                                        x10Var2.a(Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                org.telegram.messenger.ri.d0(i12).e1(i11, false, true, false, new y2(runnable2, 6));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final int J0() {
        if (this.f30192b == null) {
            return 0;
        }
        hi.w wVar = this.f33788r1;
        if (wVar != null && wVar.getChildCount() >= 1) {
            View childAt = wVar.getChildAt(0);
            jn jnVar = this.f33785o1;
            if (childAt != jnVar) {
                return this.f30192b.getPaddingTop();
            }
            return jnVar.getBottom() + ((int) wVar.getY());
        }
        return this.f30192b.getPaddingTop();
    }

    public final void N0() {
        org.telegram.ui.ActionBar.h2 h2Var = this.n1;
        if (h2Var != null) {
            new ug.z0(h2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void O0() {
        ArrayList arrayList;
        boolean z10;
        int i7;
        int i10;
        TLRPC.StickerSet stickerSet;
        if (this.f33791u1 == null) {
            return;
        }
        nu nuVar = this.f33786p1;
        if (nuVar.f42946b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(nuVar.f42946b);
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        org.telegram.messenger.ri d02 = org.telegram.messenger.ri.d0(this.f30189a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!d02.E0(stickerSet.f28432id, true)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (nuVar.f42945a != null && arrayList.size() == nuVar.f42945a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.N1 && z10 && this.M1 == null) {
            this.M1 = ValueAnimator.ofFloat(this.E1, 1.0f);
            this.f30192b.getY();
            this.M1.addUpdateListener(new w(this, 17));
            this.M1.setDuration(250L);
            this.M1.setInterpolator(lr.h);
            this.M1.start();
        }
        this.N1 = z10;
        hi.w wVar = this.f33788r1;
        if (!z10) {
            wVar.setAlpha(0.0f);
        } else if (this.J1 >= 0) {
            int L0 = this.f33795y1.L0();
            int E = this.f33789s1.E(this.J1);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                org.telegram.ui.ActionBar.l5 l5Var = this.f33796z1;
                l5Var.f29201b = i10;
                l5Var.k(E, (org.telegram.messenger.g0.f24121q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                wVar.y0(E);
            }
            this.F1 = this.f33789s1.E(this.J1);
            ru ruVar = this.f33789s1;
            int i13 = this.J1;
            bv bvVar = ruVar.f39309c;
            boolean z11 = bvVar.D1;
            nu nuVar2 = bvVar.f33786p1;
            if (z11) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = nuVar2.f42947c;
                if (i14 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i14].size();
                if (nuVar2.f42947c.length > 1) {
                    size = Math.min(bvVar.f33795y1.J * 2, size);
                }
                if (i14 == i13) {
                    i7 = i7 + size + 1;
                    break;
                } else {
                    i7 += size + 2;
                    i14++;
                }
            }
            this.G1 = i7;
            this.H1.e(true, 1.0f);
            wVar.invalidate();
            this.J1 = -1;
        }
        boolean z12 = this.N1;
        ug.s0 s0Var = this.f33794x1;
        TextView textView = this.f33793w1;
        TextView textView2 = this.f33792v1;
        if (z12 && !this.C1) {
            s0Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView2.setVisibility(0);
                textView.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView2.setText(org.telegram.messenger.gd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
                } else {
                    textView2.setText(org.telegram.messenger.gd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        di.o9 o9Var;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        int i16;
                        boolean z15;
                        int i17 = 0;
                        boolean z16 = true;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i18 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    bv bvVar2 = this;
                                    if (i18 < size3) {
                                        org.telegram.ui.ActionBar.h2 h2Var = bvVar2.n1;
                                        TLObject tLObject = (TLObject) arrayList5.get(i18);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            o9Var = new di.o9(bvVar2, iArr, size2, arrayList5, 4);
                                        } else {
                                            o9Var = null;
                                        }
                                        bv.K0(h2Var, tLObject, z13, o9Var, null);
                                        i18++;
                                    } else {
                                        bvVar2.L0(true);
                                        if (size2 <= 1) {
                                            bvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                bv bvVar3 = this;
                                bvVar3.dismiss();
                                org.telegram.ui.ActionBar.h2 h2Var2 = bvVar3.n1;
                                ArrayList arrayList6 = arrayList4;
                                if (h2Var2 != null) {
                                    org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(h2Var2.getCurrentAccount());
                                    Context context = h2Var2.getContext();
                                    ArrayList[] arrayListArr2 = d03.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) != null) {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i15 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i15 = 5;
                                        } else {
                                            i15 = 0;
                                        }
                                        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i19)).set.archived = false;
                                        }
                                        ?? r92 = new int[arrayList6.size()];
                                        int i20 = 0;
                                        while (i20 < arrayListArr2[i15].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i15].get(i20);
                                            int i21 = i17;
                                            while (true) {
                                                if (i21 < arrayList6.size()) {
                                                    i16 = i17;
                                                    z15 = z16;
                                                    if (tL_messages_stickerSet3.set.f28432id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i21)).set.f28432id) {
                                                        r92[i21] = i20;
                                                        arrayListArr2[i15].remove(i20);
                                                        d03.J.l(tL_messages_stickerSet3.set.f28432id);
                                                        d03.K.l(tL_messages_stickerSet3.set.f28432id);
                                                        d03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i21++;
                                                        i17 = i16;
                                                        z16 = z15;
                                                    }
                                                } else {
                                                    i16 = i17;
                                                    z15 = z16;
                                                }
                                            }
                                            i20++;
                                            i17 = i16;
                                            z16 = z15;
                                        }
                                        boolean z17 = i17;
                                        int i22 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i23 = d03.Z[i15];
                                        long[] jArr = d03.Y;
                                        long s5 = org.telegram.messenger.ri.s(arrayList7);
                                        jArr[i15] = s5;
                                        int i24 = i15;
                                        d03.O1(i24, i23, s5, arrayList7);
                                        org.telegram.messenger.ks notificationCenter = d03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i24);
                                        objArr[i22] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i25 = z17 ? 1 : 0; i25 < arrayList6.size(); i25++) {
                                            d03.j1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i25)).set.f28432id, i22);
                                        }
                                        mv0 mv0Var = new mv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, h2Var2.getResourceProvider());
                                        ?? r14 = new boolean[i22];
                                        ec ecVar = new ec(context, null, z17);
                                        ecVar.f34666b = new org.telegram.messenger.yj(d03, (Serializable) r14, arrayList6, i24, (Serializable) r92, 2);
                                        ecVar.f34667c = new bg.m0(d03, (boolean[]) r14, arrayList6, context, h2Var2, i24);
                                        mv0Var.setButton(ecVar);
                                        for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                                            d03.U.k(new org.telegram.messenger.a(ecVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f28432id);
                                        }
                                        gc.g(h2Var2, mv0Var, 2750).j();
                                    }
                                } else {
                                    for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i27);
                                        Context context2 = bvVar3.getContext();
                                        if (i27 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).l2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                bvVar3.L0(false);
                                return;
                        }
                    }
                });
                Q0(true);
                return;
            } else if (arrayList2.size() > 0) {
                textView2.setVisibility(8);
                textView.setVisibility(0);
                if (arrayList2.size() == 1) {
                    textView.setText(org.telegram.messenger.gd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.gd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        di.o9 o9Var;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        int i16;
                        boolean z15;
                        int i17 = 0;
                        boolean z16 = true;
                        switch (r1) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                int i18 = 0;
                                while (true) {
                                    int size3 = arrayList5.size();
                                    bv bvVar2 = this;
                                    if (i18 < size3) {
                                        org.telegram.ui.ActionBar.h2 h2Var = bvVar2.n1;
                                        TLObject tLObject = (TLObject) arrayList5.get(i18);
                                        if (size2 == 1) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (size2 > 1) {
                                            o9Var = new di.o9(bvVar2, iArr, size2, arrayList5, 4);
                                        } else {
                                            o9Var = null;
                                        }
                                        bv.K0(h2Var, tLObject, z13, o9Var, null);
                                        i18++;
                                    } else {
                                        bvVar2.L0(true);
                                        if (size2 <= 1) {
                                            bvVar2.dismiss();
                                            return;
                                        }
                                        return;
                                    }
                                }
                            default:
                                bv bvVar3 = this;
                                bvVar3.dismiss();
                                org.telegram.ui.ActionBar.h2 h2Var2 = bvVar3.n1;
                                ArrayList arrayList6 = arrayList2;
                                if (h2Var2 != null) {
                                    org.telegram.messenger.ri d03 = org.telegram.messenger.ri.d0(h2Var2.getCurrentAccount());
                                    Context context = h2Var2.getContext();
                                    ArrayList[] arrayListArr2 = d03.H;
                                    if (!arrayList6.isEmpty() && (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) != null) {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i15 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i15 = 5;
                                        } else {
                                            i15 = 0;
                                        }
                                        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i19)).set.archived = false;
                                        }
                                        ?? r92 = new int[arrayList6.size()];
                                        int i20 = 0;
                                        while (i20 < arrayListArr2[i15].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i15].get(i20);
                                            int i21 = i17;
                                            while (true) {
                                                if (i21 < arrayList6.size()) {
                                                    i16 = i17;
                                                    z15 = z16;
                                                    if (tL_messages_stickerSet3.set.f28432id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i21)).set.f28432id) {
                                                        r92[i21] = i20;
                                                        arrayListArr2[i15].remove(i20);
                                                        d03.J.l(tL_messages_stickerSet3.set.f28432id);
                                                        d03.K.l(tL_messages_stickerSet3.set.f28432id);
                                                        d03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i21++;
                                                        i17 = i16;
                                                        z16 = z15;
                                                    }
                                                } else {
                                                    i16 = i17;
                                                    z15 = z16;
                                                }
                                            }
                                            i20++;
                                            i17 = i16;
                                            z16 = z15;
                                        }
                                        boolean z17 = i17;
                                        int i22 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i23 = d03.Z[i15];
                                        long[] jArr = d03.Y;
                                        long s5 = org.telegram.messenger.ri.s(arrayList7);
                                        jArr[i15] = s5;
                                        int i24 = i15;
                                        d03.O1(i24, i23, s5, arrayList7);
                                        org.telegram.messenger.ks notificationCenter = d03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i24);
                                        objArr[i22] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i25 = z17 ? 1 : 0; i25 < arrayList6.size(); i25++) {
                                            d03.j1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i25)).set.f28432id, i22);
                                        }
                                        mv0 mv0Var = new mv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, h2Var2.getResourceProvider());
                                        ?? r14 = new boolean[i22];
                                        ec ecVar = new ec(context, null, z17);
                                        ecVar.f34666b = new org.telegram.messenger.yj(d03, (Serializable) r14, arrayList6, i24, (Serializable) r92, 2);
                                        ecVar.f34667c = new bg.m0(d03, (boolean[]) r14, arrayList6, context, h2Var2, i24);
                                        mv0Var.setButton(ecVar);
                                        for (int i26 = 0; i26 < arrayList6.size(); i26++) {
                                            d03.U.k(new org.telegram.messenger.a(ecVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f28432id);
                                        }
                                        gc.g(h2Var2, mv0Var, 2750).j();
                                    }
                                } else {
                                    for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i27);
                                        Context context2 = bvVar3.getContext();
                                        if (i27 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.ri.d0(org.telegram.messenger.j10.f24773t0).l2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                bvVar3.L0(false);
                                return;
                        }
                    }
                });
                Q0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                Q0(false);
                return;
            }
        }
        s0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        Q0(false);
    }

    public final void P0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29469h5, this.J0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29676s8, this.J0), 855638016)) > 0.721f) {
            z12 = true;
        }
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.p3(this, z11);
    }

    public final void Q0(boolean z10) {
        boolean z11;
        float f10;
        float L;
        float f11;
        float L2;
        float f12;
        float f13;
        int i7 = 0;
        if (!this.K1 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f33793w1.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(19.0f);
        }
        float f14 = i7;
        boolean z12 = this.C1;
        hi.w wVar = this.f33788r1;
        View view = this.f33790t1;
        FrameLayout frameLayout = this.f33791u1;
        float f15 = 1.0f;
        float f16 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                L2 = f14;
            } else {
                L2 = org.telegram.messenger.g0.L(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L2);
            if (z10) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f12).setDuration(250L);
            lr lrVar = lr.h;
            duration.setInterpolator(lrVar).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z10) {
                f13 = -(org.telegram.messenger.g0.L(68.0f) - f14);
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f13);
            if (!z10) {
                f15 = 0.0f;
            }
            translationY2.alpha(f15).setDuration(250L).setInterpolator(lrVar).start();
            ViewPropertyAnimator animate3 = wVar.animate();
            if (!z12 && !z10) {
                f16 = org.telegram.messenger.g0.L(68.0f) - f14;
            }
            animate3.translationY(f16).setDuration(250L).setInterpolator(lrVar).start();
        } else {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout.setAlpha(f10);
            if (z10) {
                L = f14;
            } else {
                L = org.telegram.messenger.g0.L(16.0f);
            }
            frameLayout.setTranslationY(L);
            if (!z10) {
                f15 = 0.0f;
            }
            view.setAlpha(f15);
            if (z10) {
                f11 = -(org.telegram.messenger.g0.L(68.0f) - f14);
            } else {
                f11 = 0.0f;
            }
            view.setTranslationY(f11);
            if (!z12 && !z10) {
                f16 = org.telegram.messenger.g0.L(68.0f) - f14;
            }
            wVar.setTranslationY(f16);
        }
        this.K1 = z10;
    }

    @Override
    public final int S() {
        int measuredHeight;
        int i7 = 0;
        hi.w wVar = this.f33788r1;
        if (wVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = wVar.getMeasuredHeight();
        }
        int J0 = measuredHeight - J0();
        ViewGroup viewGroup = this.f30192b;
        if (viewGroup != null) {
            i7 = viewGroup.getPaddingTop();
        }
        return org.telegram.messenger.g0.L(8.0f) + J0 + i7 + org.telegram.messenger.g0.f24116n;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        xu xuVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i7 == org.telegram.messenger.ks.f25220x0) {
            int i11 = 0;
            while (true) {
                hi.w wVar = this.f33788r1;
                if (i11 < wVar.getChildCount()) {
                    View childAt = wVar.getChildAt(i11);
                    if ((childAt instanceof xu) && (tL_messages_stickerSet = (xuVar = (xu) childAt).f42190r) != null && tL_messages_stickerSet.set != null) {
                        xuVar.a(org.telegram.messenger.ri.d0(this.f30189a).E0(xuVar.f42190r.set.f28432id, true), true);
                    }
                    i11++;
                } else {
                    O0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        tu tuVar = this.f33787q1;
        if (tuVar != null && tuVar.f40107x) {
            tuVar.f40107x = false;
            tuVar.invalidate();
        }
        super.dismiss();
        nu nuVar = this.f33786p1;
        if (nuVar != null) {
            org.telegram.messenger.ks.f(nuVar.d).n(nuVar, org.telegram.messenger.ks.B0);
        }
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25142k1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ks.f(this.f30189a).c(this, org.telegram.messenger.ks.f25220x0);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ns.p().E) {
            org.telegram.ui.ns.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.ks.f(this.f30189a).n(this, org.telegram.messenger.ks.f25220x0);
    }

    @Override
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            sp spVar = this.A1;
            if (spVar != null) {
                spVar.b(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.Fi, this.J0));
            }
            tu tuVar = this.f33787q1;
            if (tuVar != null && (bool = tuVar.f40100c) != null) {
                P0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.f30192b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.rj rjVar;
        super.show();
        ru ruVar = new ru(this);
        this.f33789s1 = ruVar;
        this.f33788r1.setAdapter(ruVar);
        org.telegram.messenger.ks.e().k(org.telegram.messenger.ks.f25137j1, 4);
        nu nuVar = this.f33786p1;
        if (!nuVar.f42948e) {
            nuVar.f42948e = true;
            bv bvVar = nuVar.f42949f;
            int i7 = nuVar.d;
            nuVar.f42946b = new ArrayList(nuVar.f42945a.size());
            nuVar.f42947c = new ArrayList[nuVar.f42945a.size()];
            org.telegram.messenger.ks.f(i7).c(nuVar, 64);
            boolean[] zArr = new boolean[1];
            int i10 = 0;
            while (true) {
                if (i10 < nuVar.f42947c.length) {
                    TLRPC.TL_messages_stickerSet n02 = org.telegram.messenger.ri.d0(i7).n0((TLRPC.InputStickerSet) nuVar.f42945a.get(i10), null, false, false, new ph(2, nuVar, zArr));
                    if (nuVar.f42947c.length == 1 && n02 != null && (stickerSet = n02.set) != null && !stickerSet.emojis) {
                        org.telegram.messenger.g0.g3(new yu(nuVar, 0));
                        Context context = bvVar.getContext();
                        org.telegram.ui.ActionBar.h2 h2Var = bvVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) nuVar.f42945a.get(i10);
                        org.telegram.ui.ActionBar.h2 h2Var2 = bvVar.n1;
                        if (h2Var2 instanceof org.telegram.ui.bn) {
                            rjVar = ((org.telegram.ui.bn) h2Var2).f45932a0;
                        } else {
                            rjVar = null;
                        }
                        new iw0(context, h2Var, inputStickerSet, null, rjVar, bvVar.J0).show();
                    } else {
                        nuVar.f42946b.add(n02);
                        nuVar.a(i10, n02);
                        i10++;
                    }
                } else {
                    bv bvVar2 = nuVar.h;
                    bvVar2.O0();
                    hi.w wVar = bvVar2.f33788r1;
                    if (wVar != null && wVar.getAdapter() != null) {
                        wVar.getAdapter().f();
                    }
                }
            }
        }
        O0();
        org.telegram.ui.ActionBar.h2 h2Var3 = this.n1;
        if (h2Var3 == null) {
            currentAccount = org.telegram.messenger.j10.f24773t0;
        } else {
            currentAccount = h2Var3.getCurrentAccount();
        }
        org.telegram.messenger.ri.d0(currentAccount).D(5);
    }

    public void L0(boolean z10) {
    }

    public void M0() {
    }
}
