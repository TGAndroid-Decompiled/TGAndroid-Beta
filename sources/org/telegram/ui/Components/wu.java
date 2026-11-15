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
public class wu extends org.telegram.ui.ActionBar.u2 implements org.telegram.messenger.is {
    public static Pattern Q1;
    public final lp A1;
    public org.telegram.ui.ActionBar.g1 B1;
    public final boolean C1;
    public boolean D1;
    public float E1;
    public int F1;
    public int G1;
    public final u5 H1;
    public final hu I1;
    public int J1;
    public boolean K1;
    public long L1;
    public ValueAnimator M1;
    public boolean N1;
    public PorterDuffColorFilter O1;
    public int P1;
    public LongSparseArray f41446m1;
    public final org.telegram.ui.ActionBar.e2 n1;
    public final bn f41447o1;
    public final iu f41448p1;
    public final ou f41449q1;
    public final hi.v f41450r1;
    public mu f41451s1;
    public final View f41452t1;
    public final FrameLayout f41453u1;
    public final TextView f41454v1;
    public final TextView f41455w1;
    public final ug.q0 f41456x1;
    public final v4.s f41457y1;
    public final wi0 f41458z1;

    public wu(org.telegram.ui.ActionBar.e2 r21, android.content.Context r22, org.telegram.ui.ActionBar.e6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wu.<init>(org.telegram.ui.ActionBar.e2, android.content.Context, org.telegram.ui.ActionBar.e6, java.util.ArrayList):void");
    }

    public static void J0(final org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, final boolean z10, final di.m9 m9Var, final fo foVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (e2Var == null) {
            currentAccount = org.telegram.messenger.m10.f24934t0;
        } else {
            currentAccount = e2Var.getCurrentAccount();
        }
        final int i7 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (e2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = e2Var.getFragmentView();
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
                Runnable runnable = (Runnable) org.telegram.messenger.si.b0(i7).U.f(stickerSet2.f28078id);
                if (runnable != null) {
                    runnable.run();
                    if (m9Var != null) {
                        m9Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f28071id = stickerSet2.f28078id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i10 = i7;
                        final org.telegram.messenger.z10 z10Var = m9Var;
                        final Runnable runnable2 = foVar;
                        org.telegram.messenger.g0.h3(new Runnable() {
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
                                org.telegram.ui.ActionBar.e2 e2Var3 = e2Var2;
                                int i12 = i10;
                                org.telegram.messenger.z10 z10Var2 = z10Var;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = e2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            xb.g(e2Var3, new ev0(context, tLObject3, 1, 2, null, e2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            org.telegram.messenger.si.b0(i12).A1(e2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (z10Var2 != null) {
                                            z10Var2.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(e2Var3.getFragmentView().getContext(), org.telegram.messenger.hd.M0(2131751105, null), 0).show();
                                        if (z10Var2 != null) {
                                            z10Var2.a(Boolean.FALSE);
                                        }
                                    } else if (z10Var2 != null) {
                                        z10Var2.a(Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                org.telegram.messenger.si.b0(i12).b1(i11, false, true, false, new q2(runnable2, 6));
                            }
                        });
                    }
                });
            }
        }
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final int I0() {
        if (this.f29682b == null) {
            return 0;
        }
        hi.v vVar = this.f41450r1;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            bn bnVar = this.f41447o1;
            if (childAt != bnVar) {
                return this.f29682b.getPaddingTop();
            }
            return bnVar.getBottom() + ((int) vVar.getY());
        }
        return this.f29682b.getPaddingTop();
    }

    public final void M0() {
        org.telegram.ui.ActionBar.e2 e2Var = this.n1;
        if (e2Var != null) {
            new ug.x0(e2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        ArrayList arrayList;
        boolean z10;
        int i7;
        int i10;
        TLRPC.StickerSet stickerSet;
        if (this.f41453u1 == null) {
            return;
        }
        iu iuVar = this.f41448p1;
        if (iuVar.f40161b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(iuVar.f40161b);
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        org.telegram.messenger.si b02 = org.telegram.messenger.si.b0(this.f29679a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!b02.B0(stickerSet.f28078id, true)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (iuVar.f40160a != null && arrayList.size() == iuVar.f40160a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.N1 && z10 && this.M1 == null) {
            this.M1 = ValueAnimator.ofFloat(this.E1, 1.0f);
            this.f29682b.getY();
            this.M1.addUpdateListener(new c6(this, 16));
            this.M1.setDuration(250L);
            this.M1.setInterpolator(er.h);
            this.M1.start();
        }
        this.N1 = z10;
        hi.v vVar = this.f41450r1;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.J1 >= 0) {
            int L0 = this.f41457y1.L0();
            int E = this.f41451s1.E(this.J1);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                wi0 wi0Var = this.f41458z1;
                wi0Var.f41354b = i10;
                wi0Var.d(E, (org.telegram.messenger.g0.f23609q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.F1 = this.f41451s1.E(this.J1);
            mu muVar = this.f41451s1;
            int i13 = this.J1;
            wu wuVar = muVar.f37379c;
            boolean z11 = wuVar.D1;
            iu iuVar2 = wuVar.f41448p1;
            if (z11) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = iuVar2.f40162c;
                if (i14 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i14].size();
                if (iuVar2.f40162c.length > 1) {
                    size = Math.min(wuVar.f41457y1.J * 2, size);
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
            vVar.invalidate();
            this.J1 = -1;
        }
        boolean z12 = this.N1;
        ug.q0 q0Var = this.f41456x1;
        TextView textView = this.f41455w1;
        TextView textView2 = this.f41454v1;
        if (z12 && !this.C1) {
            q0Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView2.setVisibility(0);
                textView.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView2.setText(org.telegram.messenger.hd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
                } else {
                    textView2.setText(org.telegram.messenger.hd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        di.m9 m9Var;
                        wu wuVar2;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        wu wuVar3;
                        int i16;
                        boolean z15;
                        int i17 = r1;
                        wu wuVar4 = this;
                        int i18 = 0;
                        boolean z16 = true;
                        switch (i17) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    org.telegram.ui.ActionBar.e2 e2Var = wuVar4.n1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i19);
                                    if (size2 == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (size2 > 1) {
                                        m9Var = new di.m9(wuVar4, iArr, size2, arrayList5);
                                    } else {
                                        m9Var = null;
                                    }
                                    wu.J0(e2Var, tLObject, z13, m9Var, null);
                                }
                                wuVar4.K0(true);
                                if (size2 <= 1) {
                                    wuVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                wuVar4.dismiss();
                                org.telegram.ui.ActionBar.e2 e2Var2 = wuVar4.n1;
                                ArrayList arrayList6 = arrayList4;
                                if (e2Var2 != null) {
                                    org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(e2Var2.getCurrentAccount());
                                    Context context = e2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.H;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) == null) {
                                        wuVar2 = wuVar4;
                                    } else {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i15 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i15 = 5;
                                        } else {
                                            i15 = 0;
                                        }
                                        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i20)).set.archived = false;
                                        }
                                        ?? r82 = new int[arrayList6.size()];
                                        int i21 = 0;
                                        while (i21 < arrayListArr2[i15].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i15].get(i21);
                                            int i22 = i18;
                                            while (true) {
                                                if (i22 < arrayList6.size()) {
                                                    i16 = i18;
                                                    z15 = z16;
                                                    wuVar3 = wuVar4;
                                                    if (tL_messages_stickerSet3.set.f28078id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.f28078id) {
                                                        r82[i22] = i21;
                                                        arrayListArr2[i15].remove(i21);
                                                        b03.J.l(tL_messages_stickerSet3.set.f28078id);
                                                        b03.K.l(tL_messages_stickerSet3.set.f28078id);
                                                        b03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i22++;
                                                        i18 = i16;
                                                        z16 = z15;
                                                        wuVar4 = wuVar3;
                                                    }
                                                } else {
                                                    wuVar3 = wuVar4;
                                                    i16 = i18;
                                                    z15 = z16;
                                                }
                                            }
                                            i21++;
                                            i18 = i16;
                                            z16 = z15;
                                            wuVar4 = wuVar3;
                                        }
                                        wuVar2 = wuVar4;
                                        boolean z17 = i18;
                                        int i23 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i24 = b03.Z[i15];
                                        long[] jArr = b03.Y;
                                        int i25 = i15;
                                        long q10 = org.telegram.messenger.si.q(arrayList7);
                                        jArr[i25] = q10;
                                        b03.J1(i25, i24, q10, arrayList7);
                                        org.telegram.messenger.ns notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i25);
                                        objArr[i23] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i26 = z17 ? 1 : 0; i26 < arrayList6.size(); i26++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f28078id, i23);
                                        }
                                        ev0 ev0Var = new ev0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, e2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i23];
                                        vb vbVar = new vb(context, null, z17);
                                        vbVar.f40369b = new org.telegram.messenger.zj(b03, (Serializable) r15, arrayList6, i25, (Serializable) r82, 2);
                                        vbVar.f40370c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, e2Var2, i25);
                                        ev0Var.setButton(vbVar);
                                        for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                            b03.U.k(new org.telegram.messenger.a(vbVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f28078id);
                                        }
                                        xb.g(e2Var2, ev0Var, 2750).j();
                                    }
                                } else {
                                    wuVar2 = wuVar4;
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i28);
                                        Context context2 = wuVar2.getContext();
                                        if (i28 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24934t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                wuVar2.K0(false);
                                return;
                        }
                    }
                });
                P0(true);
                return;
            } else if (arrayList2.size() > 0) {
                textView2.setVisibility(8);
                textView.setVisibility(0);
                if (arrayList2.size() == 1) {
                    textView.setText(org.telegram.messenger.hd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.hd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        di.m9 m9Var;
                        wu wuVar2;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        wu wuVar3;
                        int i16;
                        boolean z15;
                        int i17 = r1;
                        wu wuVar4 = this;
                        int i18 = 0;
                        boolean z16 = true;
                        switch (i17) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    org.telegram.ui.ActionBar.e2 e2Var = wuVar4.n1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i19);
                                    if (size2 == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (size2 > 1) {
                                        m9Var = new di.m9(wuVar4, iArr, size2, arrayList5);
                                    } else {
                                        m9Var = null;
                                    }
                                    wu.J0(e2Var, tLObject, z13, m9Var, null);
                                }
                                wuVar4.K0(true);
                                if (size2 <= 1) {
                                    wuVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                wuVar4.dismiss();
                                org.telegram.ui.ActionBar.e2 e2Var2 = wuVar4.n1;
                                ArrayList arrayList6 = arrayList2;
                                if (e2Var2 != null) {
                                    org.telegram.messenger.si b03 = org.telegram.messenger.si.b0(e2Var2.getCurrentAccount());
                                    Context context = e2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.H;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i5.c.h(1, arrayList6)) == null) {
                                        wuVar2 = wuVar4;
                                    } else {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i15 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i15 = 5;
                                        } else {
                                            i15 = 0;
                                        }
                                        for (int i20 = 0; i20 < arrayList6.size(); i20++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i20)).set.archived = false;
                                        }
                                        ?? r82 = new int[arrayList6.size()];
                                        int i21 = 0;
                                        while (i21 < arrayListArr2[i15].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i15].get(i21);
                                            int i22 = i18;
                                            while (true) {
                                                if (i22 < arrayList6.size()) {
                                                    i16 = i18;
                                                    z15 = z16;
                                                    wuVar3 = wuVar4;
                                                    if (tL_messages_stickerSet3.set.f28078id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.f28078id) {
                                                        r82[i22] = i21;
                                                        arrayListArr2[i15].remove(i21);
                                                        b03.J.l(tL_messages_stickerSet3.set.f28078id);
                                                        b03.K.l(tL_messages_stickerSet3.set.f28078id);
                                                        b03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i22++;
                                                        i18 = i16;
                                                        z16 = z15;
                                                        wuVar4 = wuVar3;
                                                    }
                                                } else {
                                                    wuVar3 = wuVar4;
                                                    i16 = i18;
                                                    z15 = z16;
                                                }
                                            }
                                            i21++;
                                            i18 = i16;
                                            z16 = z15;
                                            wuVar4 = wuVar3;
                                        }
                                        wuVar2 = wuVar4;
                                        boolean z17 = i18;
                                        int i23 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i24 = b03.Z[i15];
                                        long[] jArr = b03.Y;
                                        int i25 = i15;
                                        long q10 = org.telegram.messenger.si.q(arrayList7);
                                        jArr[i25] = q10;
                                        b03.J1(i25, i24, q10, arrayList7);
                                        org.telegram.messenger.ns notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i25);
                                        objArr[i23] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i26 = z17 ? 1 : 0; i26 < arrayList6.size(); i26++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f28078id, i23);
                                        }
                                        ev0 ev0Var = new ev0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, e2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i23];
                                        vb vbVar = new vb(context, null, z17);
                                        vbVar.f40369b = new org.telegram.messenger.zj(b03, (Serializable) r15, arrayList6, i25, (Serializable) r82, 2);
                                        vbVar.f40370c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, e2Var2, i25);
                                        ev0Var.setButton(vbVar);
                                        for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                            b03.U.k(new org.telegram.messenger.a(vbVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f28078id);
                                        }
                                        xb.g(e2Var2, ev0Var, 2750).j();
                                    }
                                } else {
                                    wuVar2 = wuVar4;
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i28);
                                        Context context2 = wuVar2.getContext();
                                        if (i28 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.si.b0(org.telegram.messenger.m10.f24934t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                wuVar2.K0(false);
                                return;
                        }
                    }
                });
                P0(true);
                return;
            } else {
                textView2.setVisibility(8);
                textView.setVisibility(8);
                P0(false);
                return;
            }
        }
        q0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        P0(false);
    }

    public final void O0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28922h5, this.J0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29129s8, this.J0), 855638016)) > 0.721f) {
            z12 = true;
        }
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.g0.q3(this, z11);
    }

    public final void P0(boolean z10) {
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
        if (this.f41455w1.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(19.0f);
        }
        float f14 = i7;
        boolean z12 = this.C1;
        hi.v vVar = this.f41450r1;
        View view = this.f41452t1;
        FrameLayout frameLayout = this.f41453u1;
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
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
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
            translationY2.alpha(f15).setDuration(250L).setInterpolator(erVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f16 = org.telegram.messenger.g0.L(68.0f) - f14;
            }
            animate3.translationY(f16).setDuration(250L).setInterpolator(erVar).start();
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
            vVar.setTranslationY(f16);
        }
        this.K1 = z10;
    }

    @Override
    public final int S() {
        int measuredHeight;
        int i7 = 0;
        hi.v vVar = this.f41450r1;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
        }
        int I0 = measuredHeight - I0();
        ViewGroup viewGroup = this.f29682b;
        if (viewGroup != null) {
            i7 = viewGroup.getPaddingTop();
        }
        return org.telegram.messenger.g0.L(8.0f) + I0 + i7 + org.telegram.messenger.g0.f23604n;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        su suVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i7 == org.telegram.messenger.ns.f25600x0) {
            int i11 = 0;
            while (true) {
                hi.v vVar = this.f41450r1;
                if (i11 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i11);
                    if ((childAt instanceof su) && (tL_messages_stickerSet = (suVar = (su) childAt).f39432r) != null && tL_messages_stickerSet.set != null) {
                        suVar.a(org.telegram.messenger.si.b0(this.f29679a).B0(suVar.f39432r.set.f28078id, true), true);
                    }
                    i11++;
                } else {
                    N0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        ou ouVar = this.f41449q1;
        if (ouVar != null && ouVar.f38086x) {
            ouVar.f38086x = false;
            ouVar.invalidate();
        }
        super.dismiss();
        iu iuVar = this.f41448p1;
        if (iuVar != null) {
            org.telegram.messenger.ns.f(iuVar.d).n(iuVar, org.telegram.messenger.ns.B0);
        }
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25522k1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.ns.f(this.f29679a).c(this, org.telegram.messenger.ns.f25600x0);
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
        org.telegram.messenger.ns.f(this.f29679a).n(this, org.telegram.messenger.ns.f25600x0);
    }

    @Override
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            lp lpVar = this.A1;
            if (lpVar != null) {
                lpVar.b(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.Fi, this.J0));
            }
            ou ouVar = this.f41449q1;
            if (ouVar != null && (bool = ouVar.f38079c) != null) {
                O0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.f29682b;
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
        org.telegram.ui.qj qjVar;
        super.show();
        mu muVar = new mu(this);
        this.f41451s1 = muVar;
        this.f41450r1.setAdapter(muVar);
        org.telegram.messenger.ns.e().k(org.telegram.messenger.ns.f25517j1, 4);
        iu iuVar = this.f41448p1;
        if (!iuVar.f40163e) {
            iuVar.f40163e = true;
            wu wuVar = iuVar.f40164f;
            int i7 = iuVar.d;
            iuVar.f40161b = new ArrayList(iuVar.f40160a.size());
            iuVar.f40162c = new ArrayList[iuVar.f40160a.size()];
            org.telegram.messenger.ns.f(i7).c(iuVar, 64);
            boolean[] zArr = new boolean[1];
            int i10 = 0;
            while (true) {
                if (i10 < iuVar.f40162c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.si.b0(i7).l0((TLRPC.InputStickerSet) iuVar.f40160a.get(i10), null, false, false, new gh(2, iuVar, zArr));
                    if (iuVar.f40162c.length == 1 && l02 != null && (stickerSet = l02.set) != null && !stickerSet.emojis) {
                        org.telegram.messenger.g0.h3(new tu(iuVar, 0));
                        Context context = wuVar.getContext();
                        org.telegram.ui.ActionBar.e2 e2Var = wuVar.n1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) iuVar.f40160a.get(i10);
                        org.telegram.ui.ActionBar.e2 e2Var2 = wuVar.n1;
                        if (e2Var2 instanceof org.telegram.ui.an) {
                            qjVar = ((org.telegram.ui.an) e2Var2).f45118a0;
                        } else {
                            qjVar = null;
                        }
                        new bw0(context, e2Var, inputStickerSet, null, qjVar, wuVar.J0).show();
                    } else {
                        iuVar.f40161b.add(l02);
                        iuVar.a(i10, l02);
                        i10++;
                    }
                } else {
                    wu wuVar2 = iuVar.h;
                    wuVar2.N0();
                    hi.v vVar = wuVar2.f41450r1;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.e2 e2Var3 = this.n1;
        if (e2Var3 == null) {
            currentAccount = org.telegram.messenger.m10.f24934t0;
        } else {
            currentAccount = e2Var3.getCurrentAccount();
        }
        org.telegram.messenger.si.b0(currentAccount).B(5);
    }

    public void K0(boolean z10) {
    }

    public void L0() {
    }
}
