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
public class pu extends org.telegram.ui.ActionBar.t2 implements org.telegram.messenger.cs {
    public static Pattern N1;
    public boolean A1;
    public float B1;
    public int C1;
    public int D1;
    public final u5 E1;
    public final au F1;
    public int G1;
    public boolean H1;
    public long I1;
    public ValueAnimator J1;
    public boolean K1;
    public PorterDuffColorFilter L1;
    public int M1;
    public LongSparseArray f37240j1;
    public final org.telegram.ui.ActionBar.d2 k1;
    public final sm f37241l1;
    public final bu m1;
    public final hu f37242n1;
    public final gi.v f37243o1;
    public fu f37244p1;
    public final View f37245q1;
    public final FrameLayout f37246r1;
    public final TextView f37247s1;
    public final TextView f37248t1;
    public final vg.o0 f37249u1;
    public final u4.s f37250v1;
    public final vi0 f37251w1;
    public final cp f37252x1;
    public org.telegram.ui.ActionBar.f1 f37253y1;
    public final boolean f37254z1;

    public pu(org.telegram.ui.ActionBar.d2 r21, android.content.Context r22, org.telegram.ui.ActionBar.e6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pu.<init>(org.telegram.ui.ActionBar.d2, android.content.Context, org.telegram.ui.ActionBar.e6, java.util.ArrayList):void");
    }

    public static void J0(final org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, final boolean z10, final ci.w9 w9Var, final gp gpVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (d2Var == null) {
            currentAccount = org.telegram.messenger.h10.f22829t0;
        } else {
            currentAccount = d2Var.getCurrentAccount();
        }
        final int i3 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (d2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = d2Var.getFragmentView();
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
                Runnable runnable = (Runnable) org.telegram.messenger.li.b0(i3).U.f(stickerSet2.f27028id);
                if (runnable != null) {
                    runnable.run();
                    if (w9Var != null) {
                        w9Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f27021id = stickerSet2.f27028id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i3).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i10 = i3;
                        final org.telegram.messenger.u10 u10Var = w9Var;
                        final Runnable runnable2 = gpVar;
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
                                org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                                int i12 = i10;
                                org.telegram.messenger.u10 u10Var2 = u10Var;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = d2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            ac.g(d2Var3, new bv0(context, tLObject3, 1, 2, null, d2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            org.telegram.messenger.li.b0(i12).A1(d2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (u10Var2 != null) {
                                            u10Var2.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(d2Var3.getFragmentView().getContext(), org.telegram.messenger.bd.M0(2131751106, null), 0).show();
                                        if (u10Var2 != null) {
                                            u10Var2.a(Boolean.FALSE);
                                        }
                                    } else if (u10Var2 != null) {
                                        u10Var2.a(Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                org.telegram.messenger.li.b0(i12).b1(i11, false, true, false, new p2(runnable2, 4));
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

    public final int I0() {
        if (this.f28586b == null) {
            return 0;
        }
        gi.v vVar = this.f37243o1;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            sm smVar = this.f37241l1;
            if (childAt != smVar) {
                return this.f28586b.getPaddingTop();
            }
            return smVar.getBottom() + ((int) vVar.getY());
        }
        return this.f28586b.getPaddingTop();
    }

    public final void M0() {
        org.telegram.ui.ActionBar.d2 d2Var = this.k1;
        if (d2Var != null) {
            new vg.v0(d2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        ArrayList arrayList;
        boolean z10;
        int i3;
        int i10;
        TLRPC.StickerSet stickerSet;
        if (this.f37246r1 == null) {
            return;
        }
        bu buVar = this.m1;
        if (buVar.f36622b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(buVar.f36622b);
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        org.telegram.messenger.li b02 = org.telegram.messenger.li.b0(this.f28583a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!b02.B0(stickerSet.f27028id, true)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (buVar.f36621a != null && arrayList.size() == buVar.f36621a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.K1 && z10 && this.J1 == null) {
            this.J1 = ValueAnimator.ofFloat(this.B1, 1.0f);
            this.f28586b.getY();
            this.J1.addUpdateListener(new c6(this, 16));
            this.J1.setDuration(250L);
            this.J1.setInterpolator(xq.h);
            this.J1.start();
        }
        this.K1 = z10;
        gi.v vVar = this.f37243o1;
        if (!z10) {
            vVar.setAlpha(0.0f);
        } else if (this.G1 >= 0) {
            int L0 = this.f37250v1.L0();
            int E = this.f37244p1.E(this.G1);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                vi0 vi0Var = this.f37251w1;
                vi0Var.f39126b = i10;
                vi0Var.d(E, (org.telegram.messenger.g0.f22608q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.C1 = this.f37244p1.E(this.G1);
            fu fuVar = this.f37244p1;
            int i13 = this.G1;
            pu puVar = fuVar.f33866c;
            boolean z11 = puVar.A1;
            bu buVar2 = puVar.m1;
            if (z11) {
                i3 = 2;
            } else {
                i3 = 1;
            }
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = buVar2.f36623c;
                if (i14 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i14].size();
                if (buVar2.f36623c.length > 1) {
                    size = Math.min(puVar.f37250v1.J * 2, size);
                }
                if (i14 == i13) {
                    i3 = i3 + size + 1;
                    break;
                } else {
                    i3 += size + 2;
                    i14++;
                }
            }
            this.D1 = i3;
            this.E1.e(true, 1.0f);
            vVar.invalidate();
            this.G1 = -1;
        }
        boolean z12 = this.K1;
        vg.o0 o0Var = this.f37249u1;
        TextView textView = this.f37248t1;
        TextView textView2 = this.f37247s1;
        if (z12 && !this.f37254z1) {
            o0Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView2.setVisibility(0);
                textView.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView2.setText(org.telegram.messenger.bd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
                } else {
                    textView2.setText(org.telegram.messenger.bd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        ci.w9 w9Var;
                        pu puVar2;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        pu puVar3;
                        int i16;
                        boolean z15;
                        int i17 = r1;
                        pu puVar4 = this;
                        int i18 = 0;
                        boolean z16 = true;
                        switch (i17) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    org.telegram.ui.ActionBar.d2 d2Var = puVar4.k1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i19);
                                    if (size2 == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (size2 > 1) {
                                        w9Var = new ci.w9(puVar4, iArr, size2, arrayList5);
                                    } else {
                                        w9Var = null;
                                    }
                                    pu.J0(d2Var, tLObject, z13, w9Var, null);
                                }
                                puVar4.K0(true);
                                if (size2 <= 1) {
                                    puVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                puVar4.dismiss();
                                org.telegram.ui.ActionBar.d2 d2Var2 = puVar4.k1;
                                ArrayList arrayList6 = arrayList4;
                                if (d2Var2 != null) {
                                    org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(d2Var2.getCurrentAccount());
                                    Context context = d2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.H;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) k2.p1.h(1, arrayList6)) == null) {
                                        puVar2 = puVar4;
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
                                                    puVar3 = puVar4;
                                                    if (tL_messages_stickerSet3.set.f27028id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.f27028id) {
                                                        r82[i22] = i21;
                                                        arrayListArr2[i15].remove(i21);
                                                        b03.J.l(tL_messages_stickerSet3.set.f27028id);
                                                        b03.K.l(tL_messages_stickerSet3.set.f27028id);
                                                        b03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i22++;
                                                        i18 = i16;
                                                        z16 = z15;
                                                        puVar4 = puVar3;
                                                    }
                                                } else {
                                                    puVar3 = puVar4;
                                                    i16 = i18;
                                                    z15 = z16;
                                                }
                                            }
                                            i21++;
                                            i18 = i16;
                                            z16 = z15;
                                            puVar4 = puVar3;
                                        }
                                        puVar2 = puVar4;
                                        boolean z17 = i18;
                                        int i23 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i24 = b03.Z[i15];
                                        long[] jArr = b03.Y;
                                        int i25 = i15;
                                        long q10 = org.telegram.messenger.li.q(arrayList7);
                                        jArr[i25] = q10;
                                        b03.J1(i25, i24, q10, arrayList7);
                                        org.telegram.messenger.hs notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i25);
                                        objArr[i23] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i26 = z17 ? 1 : 0; i26 < arrayList6.size(); i26++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f27028id, i23);
                                        }
                                        bv0 bv0Var = new bv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, d2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i23];
                                        yb ybVar = new yb(context, null, z17);
                                        ybVar.f40672b = new org.telegram.messenger.sj(b03, (Serializable) r15, arrayList6, i25, (Serializable) r82, 2);
                                        ybVar.f40673c = new cg.k0(b03, (boolean[]) r15, arrayList6, context, d2Var2, i25);
                                        bv0Var.setButton(ybVar);
                                        for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                            b03.U.k(new org.telegram.messenger.a(ybVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f27028id);
                                        }
                                        ac.g(d2Var2, bv0Var, 2750).j();
                                    }
                                } else {
                                    puVar2 = puVar4;
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i28);
                                        Context context2 = puVar2.getContext();
                                        if (i28 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                puVar2.K0(false);
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
                    textView.setText(org.telegram.messenger.bd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.bd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        ci.w9 w9Var;
                        pu puVar2;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        pu puVar3;
                        int i16;
                        boolean z15;
                        int i17 = r1;
                        pu puVar4 = this;
                        int i18 = 0;
                        boolean z16 = true;
                        switch (i17) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    org.telegram.ui.ActionBar.d2 d2Var = puVar4.k1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i19);
                                    if (size2 == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (size2 > 1) {
                                        w9Var = new ci.w9(puVar4, iArr, size2, arrayList5);
                                    } else {
                                        w9Var = null;
                                    }
                                    pu.J0(d2Var, tLObject, z13, w9Var, null);
                                }
                                puVar4.K0(true);
                                if (size2 <= 1) {
                                    puVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                puVar4.dismiss();
                                org.telegram.ui.ActionBar.d2 d2Var2 = puVar4.k1;
                                ArrayList arrayList6 = arrayList2;
                                if (d2Var2 != null) {
                                    org.telegram.messenger.li b03 = org.telegram.messenger.li.b0(d2Var2.getCurrentAccount());
                                    Context context = d2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.H;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) k2.p1.h(1, arrayList6)) == null) {
                                        puVar2 = puVar4;
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
                                                    puVar3 = puVar4;
                                                    if (tL_messages_stickerSet3.set.f27028id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.f27028id) {
                                                        r82[i22] = i21;
                                                        arrayListArr2[i15].remove(i21);
                                                        b03.J.l(tL_messages_stickerSet3.set.f27028id);
                                                        b03.K.l(tL_messages_stickerSet3.set.f27028id);
                                                        b03.O.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i22++;
                                                        i18 = i16;
                                                        z16 = z15;
                                                        puVar4 = puVar3;
                                                    }
                                                } else {
                                                    puVar3 = puVar4;
                                                    i16 = i18;
                                                    z15 = z16;
                                                }
                                            }
                                            i21++;
                                            i18 = i16;
                                            z16 = z15;
                                            puVar4 = puVar3;
                                        }
                                        puVar2 = puVar4;
                                        boolean z17 = i18;
                                        int i23 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i24 = b03.Z[i15];
                                        long[] jArr = b03.Y;
                                        int i25 = i15;
                                        long q10 = org.telegram.messenger.li.q(arrayList7);
                                        jArr[i25] = q10;
                                        b03.J1(i25, i24, q10, arrayList7);
                                        org.telegram.messenger.hs notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i25);
                                        objArr[i23] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i26 = z17 ? 1 : 0; i26 < arrayList6.size(); i26++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f27028id, i23);
                                        }
                                        bv0 bv0Var = new bv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, d2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i23];
                                        yb ybVar = new yb(context, null, z17);
                                        ybVar.f40672b = new org.telegram.messenger.sj(b03, (Serializable) r15, arrayList6, i25, (Serializable) r82, 2);
                                        ybVar.f40673c = new cg.k0(b03, (boolean[]) r15, arrayList6, context, d2Var2, i25);
                                        bv0Var.setButton(ybVar);
                                        for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                            b03.U.k(new org.telegram.messenger.a(ybVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f27028id);
                                        }
                                        ac.g(d2Var2, bv0Var, 2750).j();
                                    }
                                } else {
                                    puVar2 = puVar4;
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i28);
                                        Context context2 = puVar2.getContext();
                                        if (i28 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                puVar2.K0(false);
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
        o0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        P0(false);
    }

    public final void O0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27954h5, this.J0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28160s8, this.J0), 855638016)) > 0.721f) {
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
        int i3 = 0;
        if (!this.H1 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f37248t1.getVisibility() == 0) {
            i3 = org.telegram.messenger.g0.L(19.0f);
        }
        float f14 = i3;
        boolean z12 = this.f37254z1;
        gi.v vVar = this.f37243o1;
        View view = this.f37245q1;
        FrameLayout frameLayout = this.f37246r1;
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
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
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
            translationY2.alpha(f15).setDuration(250L).setInterpolator(xqVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z12 && !z10) {
                f16 = org.telegram.messenger.g0.L(68.0f) - f14;
            }
            animate3.translationY(f16).setDuration(250L).setInterpolator(xqVar).start();
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
        this.H1 = z10;
    }

    @Override
    public final int R() {
        int measuredHeight;
        int i3 = 0;
        gi.v vVar = this.f37243o1;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
        }
        int I0 = measuredHeight - I0();
        ViewGroup viewGroup = this.f28586b;
        if (viewGroup != null) {
            i3 = viewGroup.getPaddingTop();
        }
        return org.telegram.messenger.g0.L(8.0f) + I0 + i3 + org.telegram.messenger.g0.f22603n;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        lu luVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i3 == org.telegram.messenger.hs.f23333x0) {
            int i11 = 0;
            while (true) {
                gi.v vVar = this.f37243o1;
                if (i11 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i11);
                    if ((childAt instanceof lu) && (tL_messages_stickerSet = (luVar = (lu) childAt).f35886r) != null && tL_messages_stickerSet.set != null) {
                        luVar.a(org.telegram.messenger.li.b0(this.f28583a).B0(luVar.f35886r.set.f27028id, true), true);
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
        hu huVar = this.f37242n1;
        if (huVar != null && huVar.f34514x) {
            huVar.f34514x = false;
            huVar.invalidate();
        }
        super.dismiss();
        bu buVar = this.m1;
        if (buVar != null) {
            org.telegram.messenger.hs.f(buVar.d).n(buVar, org.telegram.messenger.hs.B0);
        }
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.k1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.hs.f(this.f28583a).c(this, org.telegram.messenger.hs.f23333x0);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.is.p().E) {
            org.telegram.ui.is.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.hs.f(this.f28583a).n(this, org.telegram.messenger.hs.f23333x0);
    }

    @Override
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            cp cpVar = this.f37252x1;
            if (cpVar != null) {
                cpVar.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.J0));
            }
            hu huVar = this.f37242n1;
            if (huVar != null && (bool = huVar.f34507c) != null) {
                O0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.f28586b;
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
        org.telegram.ui.mj mjVar;
        super.show();
        fu fuVar = new fu(this);
        this.f37244p1 = fuVar;
        this.f37243o1.setAdapter(fuVar);
        org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.f23249j1, 4);
        bu buVar = this.m1;
        if (!buVar.f36624e) {
            buVar.f36624e = true;
            pu puVar = buVar.f36625f;
            int i3 = buVar.d;
            buVar.f36622b = new ArrayList(buVar.f36621a.size());
            buVar.f36623c = new ArrayList[buVar.f36621a.size()];
            org.telegram.messenger.hs.f(i3).c(buVar, 64);
            boolean[] zArr = new boolean[1];
            int i10 = 0;
            while (true) {
                if (i10 < buVar.f36623c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.li.b0(i3).l0((TLRPC.InputStickerSet) buVar.f36621a.get(i10), null, false, false, new ei(1, buVar, zArr));
                    if (buVar.f36623c.length == 1 && l02 != null && (stickerSet = l02.set) != null && !stickerSet.emojis) {
                        org.telegram.messenger.g0.h3(new mu(buVar, 0));
                        Context context = puVar.getContext();
                        org.telegram.ui.ActionBar.d2 d2Var = puVar.k1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) buVar.f36621a.get(i10);
                        org.telegram.ui.ActionBar.d2 d2Var2 = puVar.k1;
                        if (d2Var2 instanceof org.telegram.ui.wm) {
                            mjVar = ((org.telegram.ui.wm) d2Var2).f51237a0;
                        } else {
                            mjVar = null;
                        }
                        new xv0(context, d2Var, inputStickerSet, null, mjVar, puVar.J0).show();
                    } else {
                        buVar.f36622b.add(l02);
                        buVar.a(i10, l02);
                        i10++;
                    }
                } else {
                    pu puVar2 = buVar.h;
                    puVar2.N0();
                    gi.v vVar = puVar2.f37243o1;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.d2 d2Var3 = this.k1;
        if (d2Var3 == null) {
            currentAccount = org.telegram.messenger.h10.f22829t0;
        } else {
            currentAccount = d2Var3.getCurrentAccount();
        }
        org.telegram.messenger.li.b0(currentAccount).B(5);
    }

    public void K0(boolean z10) {
    }

    public void L0() {
    }
}
