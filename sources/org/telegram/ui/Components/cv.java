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
public class cv extends org.telegram.ui.ActionBar.z2 implements org.telegram.messenger.us {
    public static Pattern M1;
    public float A1;
    public int B1;
    public int C1;
    public final t5 D1;
    public final nu E1;
    public int F1;
    public boolean G1;
    public long H1;
    public ValueAnimator I1;
    public boolean J1;
    public PorterDuffColorFilter K1;
    public int L1;
    public LongSparseArray f25161i1;
    public final org.telegram.ui.ActionBar.k2 f25162j1;
    public final bn f25163k1;
    public final ou l1;
    public final uu f25164m1;
    public final org.telegram.ui.g3 f25165n1;
    public su f25166o1;
    public final View f25167p1;
    public final FrameLayout f25168q1;
    public final TextView f25169r1;
    public final TextView f25170s1;
    public final kg.x0 f25171t1;
    public final s4.r f25172u1;
    public final vj0 f25173v1;
    public final kp f25174w1;
    public org.telegram.ui.ActionBar.k1 f25175x1;
    public final boolean f25176y1;
    public boolean f25177z1;

    public cv(org.telegram.ui.ActionBar.k2 r21, android.content.Context r22, org.telegram.ui.ActionBar.p6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cv.<init>(org.telegram.ui.ActionBar.k2, android.content.Context, org.telegram.ui.ActionBar.p6, java.util.ArrayList):void");
    }

    public static void J0(final org.telegram.ui.ActionBar.k2 k2Var, TLObject tLObject, final boolean z10, final bi.i6 i6Var, final ho hoVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (k2Var == null) {
            currentAccount = org.telegram.messenger.d20.f15147s0;
        } else {
            currentAccount = k2Var.getCurrentAccount();
        }
        final int i10 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (k2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = k2Var.getFragmentView();
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
                Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(i10).T.f(stickerSet2.f19820id);
                if (runnable != null) {
                    runnable.run();
                    if (i6Var != null) {
                        i6Var.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f19813id = stickerSet2.f19820id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i10).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z11 = z10;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.k2 k2Var2 = k2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i11 = i10;
                        final org.telegram.messenger.q20 q20Var = i6Var;
                        final Runnable runnable2 = hoVar;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                int i12;
                                TLObject tLObject3;
                                TLObject tLObject4 = tLObject2;
                                TLRPC.StickerSet stickerSet4 = TLRPC.StickerSet.this;
                                if (stickerSet4.masks) {
                                    i12 = 1;
                                } else if (stickerSet4.emojis) {
                                    i12 = 5;
                                } else {
                                    i12 = 0;
                                }
                                TLRPC.TL_error tL_error2 = tL_error;
                                View view2 = view;
                                org.telegram.ui.ActionBar.k2 k2Var3 = k2Var2;
                                int i13 = i11;
                                org.telegram.messenger.q20 q20Var2 = q20Var;
                                try {
                                    if (tL_error2 == null) {
                                        if (z11 && view2 != null) {
                                            Context context = k2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            wb.g(k2Var3, new fw0(context, tLObject3, 1, 2, null, k2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            org.telegram.messenger.ui.b0(i13).A1(k2Var3, true, i12, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (q20Var2 != null) {
                                            q20Var2.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(k2Var3.getFragmentView().getContext(), org.telegram.messenger.cd.L0(2131751106, null), 0).show();
                                        if (q20Var2 != null) {
                                            q20Var2.a(Boolean.FALSE);
                                        }
                                    } else if (q20Var2 != null) {
                                        q20Var2.a(Boolean.FALSE);
                                    }
                                } catch (Exception e) {
                                    org.telegram.messenger.f8.g(e, true);
                                }
                                org.telegram.messenger.ui.b0(i13).b1(i12, false, true, false, new r2(runnable2, 4));
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
        if (this.f21586b == null) {
            return 0;
        }
        org.telegram.ui.g3 g3Var = this.f25165n1;
        if (g3Var != null && g3Var.getChildCount() >= 1) {
            View childAt = g3Var.getChildAt(0);
            bn bnVar = this.f25163k1;
            if (childAt != bnVar) {
                return this.f21586b.getPaddingTop();
            }
            return bnVar.getBottom() + ((int) g3Var.getY());
        }
        return this.f21586b.getPaddingTop();
    }

    public final void M0() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f25162j1;
        if (k2Var != null) {
            new kg.i1(k2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        ArrayList arrayList;
        boolean z10;
        int i10;
        int i11;
        TLRPC.StickerSet stickerSet;
        if (this.f25168q1 == null) {
            return;
        }
        ou ouVar = this.l1;
        if (ouVar.f24465b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(ouVar.f24465b);
        }
        int i12 = 0;
        while (i12 < arrayList.size()) {
            if (arrayList.get(i12) == null) {
                arrayList.remove(i12);
                i12--;
            }
            i12++;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f21583a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i13);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!b02.B0(stickerSet.f19820id, true)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (ouVar.f24464a != null && arrayList.size() == ouVar.f24464a.size()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!this.J1 && z10 && this.I1 == null) {
            this.I1 = ValueAnimator.ofFloat(this.A1, 1.0f);
            this.f21586b.getY();
            this.I1.addUpdateListener(new a6(this, 16));
            this.I1.setDuration(250L);
            this.I1.setInterpolator(gr.h);
            this.I1.start();
        }
        this.J1 = z10;
        org.telegram.ui.g3 g3Var = this.f25165n1;
        if (!z10) {
            g3Var.setAlpha(0.0f);
        } else if (this.F1 >= 0) {
            int L0 = this.f25172u1.L0();
            int E = this.f25166o1.E(this.F1);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i11 = 0;
                } else {
                    i11 = 1;
                }
                vj0 vj0Var = this.f25173v1;
                vj0Var.f31273b = i11;
                vj0Var.d(E, (org.telegram.messenger.i0.f16026q.y / 2) - org.telegram.messenger.i0.L(170.0f), false, false);
            } else {
                g3Var.y0(E);
            }
            this.B1 = this.f25166o1.E(this.F1);
            su suVar = this.f25166o1;
            int i14 = this.F1;
            cv cvVar = suVar.f30358c;
            boolean z11 = cvVar.f25177z1;
            ou ouVar2 = cvVar.l1;
            if (z11) {
                i10 = 2;
            } else {
                i10 = 1;
            }
            int i15 = 0;
            while (true) {
                ArrayList[] arrayListArr = ouVar2.f24466c;
                if (i15 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i15].size();
                if (ouVar2.f24466c.length > 1) {
                    size = Math.min(cvVar.f25172u1.J * 2, size);
                }
                if (i15 == i14) {
                    i10 = i10 + size + 1;
                    break;
                } else {
                    i10 += size + 2;
                    i15++;
                }
            }
            this.C1 = i10;
            this.D1.e(true, 1.0f);
            g3Var.invalidate();
            this.F1 = -1;
        }
        boolean z12 = this.J1;
        kg.x0 x0Var = this.f25171t1;
        TextView textView = this.f25170s1;
        TextView textView2 = this.f25169r1;
        if (z12 && !this.f25176y1) {
            x0Var.setVisibility(4);
            if (arrayList4.size() > 0) {
                textView2.setVisibility(0);
                textView.setVisibility(8);
                if (arrayList4.size() == 1) {
                    textView2.setText(org.telegram.messenger.cd.G(((TLRPC.TL_messages_stickerSet) arrayList4.get(0)).documents.size(), "AddManyEmojiCount", new Object[0]));
                } else {
                    textView2.setText(org.telegram.messenger.cd.G(arrayList4.size(), "AddManyEmojiPacksCount", new Object[0]));
                }
                textView2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        bi.i6 i6Var;
                        cv cvVar2;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i16;
                        cv cvVar3;
                        int i17;
                        boolean z15;
                        int i18 = r1;
                        cv cvVar4 = this;
                        int i19 = 0;
                        boolean z16 = true;
                        switch (i18) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                    org.telegram.ui.ActionBar.k2 k2Var = cvVar4.f25162j1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i20);
                                    if (size2 == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (size2 > 1) {
                                        i6Var = new bi.i6(cvVar4, iArr, size2, arrayList5);
                                    } else {
                                        i6Var = null;
                                    }
                                    cv.J0(k2Var, tLObject, z13, i6Var, null);
                                }
                                cvVar4.K0(true);
                                if (size2 <= 1) {
                                    cvVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                cvVar4.dismiss();
                                org.telegram.ui.ActionBar.k2 k2Var2 = cvVar4.f25162j1;
                                ArrayList arrayList6 = arrayList4;
                                if (k2Var2 != null) {
                                    org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(k2Var2.getCurrentAccount());
                                    Context context = k2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.G;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i0.a.g(1, arrayList6)) == null) {
                                        cvVar2 = cvVar4;
                                    } else {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i16 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i16 = 5;
                                        } else {
                                            i16 = 0;
                                        }
                                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i21)).set.archived = false;
                                        }
                                        ?? r82 = new int[arrayList6.size()];
                                        int i22 = 0;
                                        while (i22 < arrayListArr2[i16].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i16].get(i22);
                                            int i23 = i19;
                                            while (true) {
                                                if (i23 < arrayList6.size()) {
                                                    i17 = i19;
                                                    z15 = z16;
                                                    cvVar3 = cvVar4;
                                                    if (tL_messages_stickerSet3.set.f19820id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i23)).set.f19820id) {
                                                        r82[i23] = i22;
                                                        arrayListArr2[i16].remove(i22);
                                                        b03.I.l(tL_messages_stickerSet3.set.f19820id);
                                                        b03.J.l(tL_messages_stickerSet3.set.f19820id);
                                                        b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i23++;
                                                        i19 = i17;
                                                        z16 = z15;
                                                        cvVar4 = cvVar3;
                                                    }
                                                } else {
                                                    cvVar3 = cvVar4;
                                                    i17 = i19;
                                                    z15 = z16;
                                                }
                                            }
                                            i22++;
                                            i19 = i17;
                                            z16 = z15;
                                            cvVar4 = cvVar3;
                                        }
                                        cvVar2 = cvVar4;
                                        boolean z17 = i19;
                                        int i24 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i16];
                                        int i25 = b03.Y[i16];
                                        long[] jArr = b03.X;
                                        int i26 = i16;
                                        long q6 = org.telegram.messenger.ui.q(arrayList7);
                                        jArr[i26] = q6;
                                        b03.J1(i26, i25, q6, arrayList7);
                                        org.telegram.messenger.zs notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i26);
                                        objArr[i24] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i27 = z17 ? 1 : 0; i27 < arrayList6.size(); i27++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f19820id, i24);
                                        }
                                        fw0 fw0Var = new fw0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, k2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i24];
                                        ub ubVar = new ub(context, null, z17);
                                        ubVar.f30890b = new org.telegram.messenger.kk(b03, (Serializable) r15, arrayList6, i26, (Serializable) r82, 2);
                                        ubVar.f30891c = new m4.a1(b03, (Object) r15, arrayList6, context, k2Var2, i26, 3);
                                        fw0Var.setButton(ubVar);
                                        for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                            b03.T.k(new org.telegram.messenger.a(ubVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.f19820id);
                                        }
                                        wb.g(k2Var2, fw0Var, 2750).j();
                                    }
                                } else {
                                    cvVar2 = cvVar4;
                                    for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i29);
                                        Context context2 = cvVar2.getContext();
                                        if (i29 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                cvVar2.K0(false);
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
                    textView.setText(org.telegram.messenger.cd.G(((TLRPC.TL_messages_stickerSet) arrayList2.get(0)).documents.size(), "RemoveManyEmojiCount", new Object[0]));
                } else {
                    textView.setText(org.telegram.messenger.cd.G(arrayList2.size(), "RemoveManyEmojiPacksCount", new Object[0]));
                }
                textView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        boolean z13;
                        bi.i6 i6Var;
                        cv cvVar2;
                        boolean z14;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i16;
                        cv cvVar3;
                        int i17;
                        boolean z15;
                        int i18 = r1;
                        cv cvVar4 = this;
                        int i19 = 0;
                        boolean z16 = true;
                        switch (i18) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i20 = 0; i20 < arrayList5.size(); i20++) {
                                    org.telegram.ui.ActionBar.k2 k2Var = cvVar4.f25162j1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i20);
                                    if (size2 == 1) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (size2 > 1) {
                                        i6Var = new bi.i6(cvVar4, iArr, size2, arrayList5);
                                    } else {
                                        i6Var = null;
                                    }
                                    cv.J0(k2Var, tLObject, z13, i6Var, null);
                                }
                                cvVar4.K0(true);
                                if (size2 <= 1) {
                                    cvVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                cvVar4.dismiss();
                                org.telegram.ui.ActionBar.k2 k2Var2 = cvVar4.f25162j1;
                                ArrayList arrayList6 = arrayList2;
                                if (k2Var2 != null) {
                                    org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(k2Var2.getCurrentAccount());
                                    Context context = k2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.G;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) i0.a.g(1, arrayList6)) == null) {
                                        cvVar2 = cvVar4;
                                    } else {
                                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet2.set;
                                        if (stickerSet2.masks) {
                                            i16 = 1;
                                        } else if (stickerSet2.emojis) {
                                            i16 = 5;
                                        } else {
                                            i16 = 0;
                                        }
                                        for (int i21 = 0; i21 < arrayList6.size(); i21++) {
                                            ((TLRPC.TL_messages_stickerSet) arrayList6.get(i21)).set.archived = false;
                                        }
                                        ?? r82 = new int[arrayList6.size()];
                                        int i22 = 0;
                                        while (i22 < arrayListArr2[i16].size()) {
                                            TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) arrayListArr2[i16].get(i22);
                                            int i23 = i19;
                                            while (true) {
                                                if (i23 < arrayList6.size()) {
                                                    i17 = i19;
                                                    z15 = z16;
                                                    cvVar3 = cvVar4;
                                                    if (tL_messages_stickerSet3.set.f19820id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i23)).set.f19820id) {
                                                        r82[i23] = i22;
                                                        arrayListArr2[i16].remove(i22);
                                                        b03.I.l(tL_messages_stickerSet3.set.f19820id);
                                                        b03.J.l(tL_messages_stickerSet3.set.f19820id);
                                                        b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i23++;
                                                        i19 = i17;
                                                        z16 = z15;
                                                        cvVar4 = cvVar3;
                                                    }
                                                } else {
                                                    cvVar3 = cvVar4;
                                                    i17 = i19;
                                                    z15 = z16;
                                                }
                                            }
                                            i22++;
                                            i19 = i17;
                                            z16 = z15;
                                            cvVar4 = cvVar3;
                                        }
                                        cvVar2 = cvVar4;
                                        boolean z17 = i19;
                                        int i24 = z16;
                                        ArrayList arrayList7 = arrayListArr2[i16];
                                        int i25 = b03.Y[i16];
                                        long[] jArr = b03.X;
                                        int i26 = i16;
                                        long q6 = org.telegram.messenger.ui.q(arrayList7);
                                        jArr[i26] = q6;
                                        b03.J1(i26, i25, q6, arrayList7);
                                        org.telegram.messenger.zs notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z17 ? 1 : 0] = Integer.valueOf(i26);
                                        objArr[i24] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i27 = z17 ? 1 : 0; i27 < arrayList6.size(); i27++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f19820id, i24);
                                        }
                                        fw0 fw0Var = new fw0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, k2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i24];
                                        ub ubVar = new ub(context, null, z17);
                                        ubVar.f30890b = new org.telegram.messenger.kk(b03, (Serializable) r15, arrayList6, i26, (Serializable) r82, 2);
                                        ubVar.f30891c = new m4.a1(b03, (Object) r15, arrayList6, context, k2Var2, i26, 3);
                                        fw0Var.setButton(ubVar);
                                        for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                            b03.T.k(new org.telegram.messenger.a(ubVar, 21), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i28)).set.f19820id);
                                        }
                                        wb.g(k2Var2, fw0Var, 2750).j();
                                    }
                                } else {
                                    cvVar2 = cvVar4;
                                    for (int i29 = 0; i29 < arrayList6.size(); i29++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i29);
                                        Context context2 = cvVar2.getContext();
                                        if (i29 == 0) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z14, null, true);
                                        }
                                    }
                                }
                                cvVar2.K0(false);
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
        x0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        P0(false);
    }

    public final void O0(boolean z10) {
        boolean z11;
        boolean z12 = false;
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21001h5, this.I0)) > 0.721f) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (org.telegram.messenger.i0.B(org.telegram.ui.ActionBar.t6.w(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.f21206s8, this.I0), 855638016)) > 0.721f) {
            z12 = true;
        }
        if (!z10) {
            z11 = z12;
        }
        org.telegram.messenger.i0.p3(this, z11);
    }

    public final void P0(boolean z10) {
        boolean z11;
        float f7;
        float L;
        float f10;
        float L2;
        float f11;
        float f12;
        int i10 = 0;
        if (!this.G1 && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (this.f25170s1.getVisibility() == 0) {
            i10 = org.telegram.messenger.i0.L(19.0f);
        }
        float f13 = i10;
        boolean z12 = this.f25176y1;
        org.telegram.ui.g3 g3Var = this.f25165n1;
        View view = this.f25167p1;
        FrameLayout frameLayout = this.f25168q1;
        float f14 = 1.0f;
        float f15 = 0.0f;
        if (z11) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z10) {
                L2 = f13;
            } else {
                L2 = org.telegram.messenger.i0.L(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L2);
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f11).setDuration(250L);
            gr grVar = gr.h;
            duration.setInterpolator(grVar).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z10) {
                f12 = -(org.telegram.messenger.i0.L(68.0f) - f13);
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f12);
            if (!z10) {
                f14 = 0.0f;
            }
            translationY2.alpha(f14).setDuration(250L).setInterpolator(grVar).start();
            ViewPropertyAnimator animate3 = g3Var.animate();
            if (!z12 && !z10) {
                f15 = org.telegram.messenger.i0.L(68.0f) - f13;
            }
            animate3.translationY(f15).setDuration(250L).setInterpolator(grVar).start();
        } else {
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            frameLayout.setAlpha(f7);
            if (z10) {
                L = f13;
            } else {
                L = org.telegram.messenger.i0.L(16.0f);
            }
            frameLayout.setTranslationY(L);
            if (!z10) {
                f14 = 0.0f;
            }
            view.setAlpha(f14);
            if (z10) {
                f10 = -(org.telegram.messenger.i0.L(68.0f) - f13);
            } else {
                f10 = 0.0f;
            }
            view.setTranslationY(f10);
            if (!z12 && !z10) {
                f15 = org.telegram.messenger.i0.L(68.0f) - f13;
            }
            g3Var.setTranslationY(f15);
        }
        this.G1 = z10;
    }

    @Override
    public final int S() {
        int measuredHeight;
        int i10 = 0;
        org.telegram.ui.g3 g3Var = this.f25165n1;
        if (g3Var == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = g3Var.getMeasuredHeight();
        }
        int I0 = measuredHeight - I0();
        ViewGroup viewGroup = this.f21586b;
        if (viewGroup != null) {
            i10 = viewGroup.getPaddingTop();
        }
        return org.telegram.messenger.i0.L(8.0f) + I0 + i10 + org.telegram.messenger.i0.f16021n;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        yu yuVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i10 == org.telegram.messenger.zs.f19718x0) {
            int i12 = 0;
            while (true) {
                org.telegram.ui.g3 g3Var = this.f25165n1;
                if (i12 < g3Var.getChildCount()) {
                    View childAt = g3Var.getChildAt(i12);
                    if ((childAt instanceof yu) && (tL_messages_stickerSet = (yuVar = (yu) childAt).f32796r) != null && tL_messages_stickerSet.set != null) {
                        yuVar.a(org.telegram.messenger.ui.b0(this.f21583a).B0(yuVar.f32796r.set.f19820id, true), true);
                    }
                    i12++;
                } else {
                    N0();
                    return;
                }
            }
        }
    }

    @Override
    public void dismiss() {
        uu uuVar = this.f25164m1;
        if (uuVar != null && uuVar.f31046x) {
            uuVar.f31046x = false;
            uuVar.invalidate();
        }
        super.dismiss();
        ou ouVar = this.l1;
        if (ouVar != null) {
            org.telegram.messenger.zs.f(ouVar.d).n(ouVar, org.telegram.messenger.zs.B0);
        }
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19639k1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.zs.f(this.f21583a).c(this, org.telegram.messenger.zs.f19718x0);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.lt.p().E) {
            org.telegram.ui.lt.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.zs.f(this.f21583a).n(this, org.telegram.messenger.zs.f19718x0);
    }

    @Override
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            kp kpVar = this.f25174w1;
            if (kpVar != null) {
                kpVar.b(org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.Ci, this.I0));
            }
            uu uuVar = this.f25164m1;
            if (uuVar != null && (bool = uuVar.f31040c) != null) {
                O0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.f21586b;
            if (viewGroup != null) {
                viewGroup.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final void show() {
        int currentAccount;
        TLRPC.StickerSet stickerSet;
        org.telegram.ui.mk mkVar;
        super.show();
        su suVar = new su(this);
        this.f25166o1 = suVar;
        this.f25165n1.setAdapter(suVar);
        org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.f19633j1, 4);
        ou ouVar = this.l1;
        if (!ouVar.e) {
            ouVar.e = true;
            cv cvVar = ouVar.f24467f;
            int i10 = ouVar.d;
            ouVar.f24465b = new ArrayList(ouVar.f24464a.size());
            ouVar.f24466c = new ArrayList[ouVar.f24464a.size()];
            org.telegram.messenger.zs.f(i10).c(ouVar, 64);
            boolean[] zArr = new boolean[1];
            int i11 = 0;
            while (true) {
                if (i11 < ouVar.f24466c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i10).l0((TLRPC.InputStickerSet) ouVar.f24464a.get(i11), null, false, false, new vg(5, ouVar, zArr));
                    if (ouVar.f24466c.length == 1 && l02 != null && (stickerSet = l02.set) != null && !stickerSet.emojis) {
                        org.telegram.messenger.i0.g3(new zu(ouVar, 0));
                        Context context = cvVar.getContext();
                        org.telegram.ui.ActionBar.k2 k2Var = cvVar.f25162j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) ouVar.f24464a.get(i11);
                        org.telegram.ui.ActionBar.k2 k2Var2 = cvVar.f25162j1;
                        if (k2Var2 instanceof org.telegram.ui.un) {
                            mkVar = ((org.telegram.ui.un) k2Var2).Z;
                        } else {
                            mkVar = null;
                        }
                        new cx0(context, k2Var, inputStickerSet, null, mkVar, cvVar.I0).show();
                    } else {
                        ouVar.f24465b.add(l02);
                        ouVar.a(i11, l02);
                        i11++;
                    }
                } else {
                    cv cvVar2 = ouVar.h;
                    cvVar2.N0();
                    org.telegram.ui.g3 g3Var = cvVar2.f25165n1;
                    if (g3Var != null && g3Var.getAdapter() != null) {
                        g3Var.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.k2 k2Var3 = this.f25162j1;
        if (k2Var3 == null) {
            currentAccount = org.telegram.messenger.d20.f15147s0;
        } else {
            currentAccount = k2Var3.getCurrentAccount();
        }
        org.telegram.messenger.ui.b0(currentAccount).B(5);
    }

    public void K0(boolean z10) {
    }

    public void L0() {
    }
}
