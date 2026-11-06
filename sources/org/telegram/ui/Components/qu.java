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
public class qu extends org.telegram.ui.ActionBar.v2 implements org.telegram.messenger.ls {
    public static Pattern M1;
    public float A1;
    public int B1;
    public int C1;
    public final w5 D1;
    public final bu E1;
    public int F1;
    public boolean G1;
    public long H1;
    public ValueAnimator I1;
    public boolean J1;
    public PorterDuffColorFilter K1;
    public int L1;
    public LongSparseArray f37390i1;
    public final org.telegram.ui.ActionBar.f2 f37391j1;
    public final tm f37392k1;
    public final cu l1;
    public final iu f37393m1;
    public final fi.v n1;
    public gu f37394o1;
    public final View f37395p1;
    public final FrameLayout f37396q1;
    public final TextView f37397r1;
    public final TextView f37398s1;
    public final ug.p0 f37399t1;
    public final v4.s f37400u1;
    public final ri0 f37401v1;
    public final cp f37402w1;
    public org.telegram.ui.ActionBar.g1 f37403x1;
    public final boolean f37404y1;
    public boolean f37405z1;

    public qu(org.telegram.ui.ActionBar.f2 r21, android.content.Context r22, org.telegram.ui.ActionBar.f6 r23, java.util.ArrayList r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.qu.<init>(org.telegram.ui.ActionBar.f2, android.content.Context, org.telegram.ui.ActionBar.f6, java.util.ArrayList):void");
    }

    public static void J0(final org.telegram.ui.ActionBar.f2 f2Var, TLObject tLObject, final boolean z9, final bi.ya yaVar, final gp gpVar) {
        int currentAccount;
        final View fragmentView;
        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (f2Var == null) {
            currentAccount = org.telegram.messenger.p10.f24467s0;
        } else {
            currentAccount = f2Var.getCurrentAccount();
        }
        final int i7 = currentAccount;
        TLRPC.StickerSet stickerSet = null;
        if (f2Var == null) {
            fragmentView = null;
        } else {
            fragmentView = f2Var.getFragmentView();
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
                Runnable runnable = (Runnable) org.telegram.messenger.ui.b0(i7).T.f(stickerSet2.f26980id);
                if (runnable != null) {
                    runnable.run();
                    if (yaVar != null) {
                        yaVar.a(Boolean.TRUE);
                        return;
                    }
                    return;
                }
                TLRPC.TL_messages_installStickerSet tL_messages_installStickerSet = new TLRPC.TL_messages_installStickerSet();
                TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                tL_messages_installStickerSet.stickerset = tL_inputStickerSetID;
                tL_inputStickerSetID.f26973id = stickerSet2.f26980id;
                tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                ConnectionsManager.getInstance(i7).sendRequest(tL_messages_installStickerSet, new RequestDelegate() {
                    @Override
                    public final void run(final TLObject tLObject2, final TLRPC.TL_error tL_error) {
                        final TLRPC.StickerSet stickerSet3 = TLRPC.StickerSet.this;
                        final boolean z10 = z9;
                        final View view = fragmentView;
                        final org.telegram.ui.ActionBar.f2 f2Var2 = f2Var;
                        final TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = tL_messages_stickerSet;
                        final int i10 = i7;
                        final org.telegram.messenger.c20 c20Var = yaVar;
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
                                org.telegram.ui.ActionBar.f2 f2Var3 = f2Var2;
                                int i12 = i10;
                                org.telegram.messenger.c20 c20Var2 = c20Var;
                                try {
                                    if (tL_error2 == null) {
                                        if (z10 && view2 != null) {
                                            Context context = f2Var3.getFragmentView().getContext();
                                            TLObject tLObject5 = tL_messages_stickerSet2;
                                            if (tLObject5 == null) {
                                                tLObject3 = stickerSet4;
                                            } else {
                                                tLObject3 = tLObject5;
                                            }
                                            cc.g(f2Var3, new cv0(context, tLObject3, 1, 2, null, f2Var3.getResourceProvider()), 1500).j();
                                        }
                                        if (tLObject4 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                            org.telegram.messenger.ui.b0(i12).A1(f2Var3, true, i11, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject4);
                                        }
                                        if (c20Var2 != null) {
                                            c20Var2.a(Boolean.TRUE);
                                        }
                                    } else if (view2 != null) {
                                        Toast.makeText(f2Var3.getFragmentView().getContext(), org.telegram.messenger.hd.M0(2131751106, null), 0).show();
                                        if (c20Var2 != null) {
                                            c20Var2.a(Boolean.FALSE);
                                        }
                                    } else if (c20Var2 != null) {
                                        c20Var2.a(Boolean.FALSE);
                                    }
                                } catch (Exception e10) {
                                    org.telegram.messenger.a8.g(e10, true);
                                }
                                org.telegram.messenger.ui.b0(i12).b1(i11, false, true, false, new s2(runnable2, 4));
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
        if (this.f28616b == null) {
            return 0;
        }
        fi.v vVar = this.n1;
        if (vVar != null && vVar.getChildCount() >= 1) {
            View childAt = vVar.getChildAt(0);
            tm tmVar = this.f37392k1;
            if (childAt != tmVar) {
                return this.f28616b.getPaddingTop();
            }
            return tmVar.getBottom() + ((int) vVar.getY());
        }
        return this.f28616b.getPaddingTop();
    }

    public final void M0() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f37391j1;
        if (f2Var != null) {
            new ug.w0(f2Var, 11, false).show();
        } else if (getContext() instanceof LaunchActivity) {
            ((LaunchActivity) getContext()).t0(new PremiumPreviewFragment(0, null));
        }
    }

    public final void N0() {
        ArrayList arrayList;
        boolean z9;
        int i7;
        int i10;
        TLRPC.StickerSet stickerSet;
        if (this.f37396q1 == null) {
            return;
        }
        cu cuVar = this.l1;
        if (cuVar.f36676b == null) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList(cuVar.f36676b);
        }
        int i11 = 0;
        while (i11 < arrayList.size()) {
            if (arrayList.get(i11) == null) {
                arrayList.remove(i11);
                i11--;
            }
            i11++;
        }
        org.telegram.messenger.ui b02 = org.telegram.messenger.ui.b0(this.f28613a);
        final ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i12);
            if (tL_messages_stickerSet != null && (stickerSet = tL_messages_stickerSet.set) != null) {
                if (!b02.B0(stickerSet.f26980id, true)) {
                    arrayList3.add(tL_messages_stickerSet);
                } else {
                    arrayList2.add(tL_messages_stickerSet);
                }
            }
        }
        final ArrayList arrayList4 = new ArrayList(arrayList3);
        if (cuVar.f36675a != null && arrayList.size() == cuVar.f36675a.size()) {
            z9 = true;
        } else {
            z9 = false;
        }
        if (!this.J1 && z9 && this.I1 == null) {
            this.I1 = ValueAnimator.ofFloat(this.A1, 1.0f);
            this.f28616b.getY();
            this.I1.addUpdateListener(new e6(this, 16));
            this.I1.setDuration(250L);
            this.I1.setInterpolator(xq.h);
            this.I1.start();
        }
        this.J1 = z9;
        fi.v vVar = this.n1;
        if (!z9) {
            vVar.setAlpha(0.0f);
        } else if (this.F1 >= 0) {
            int L0 = this.f37400u1.L0();
            int E = this.f37394o1.E(this.F1);
            if (Math.abs(L0 - E) > 54) {
                if (L0 < E) {
                    i10 = 0;
                } else {
                    i10 = 1;
                }
                ri0 ri0Var = this.f37401v1;
                ri0Var.f37652b = i10;
                ri0Var.d(E, (org.telegram.messenger.g0.f22544q.y / 2) - org.telegram.messenger.g0.L(170.0f), false, false);
            } else {
                vVar.y0(E);
            }
            this.B1 = this.f37394o1.E(this.F1);
            gu guVar = this.f37394o1;
            int i13 = this.F1;
            qu quVar = guVar.f33997c;
            boolean z10 = quVar.f37405z1;
            cu cuVar2 = quVar.l1;
            if (z10) {
                i7 = 2;
            } else {
                i7 = 1;
            }
            int i14 = 0;
            while (true) {
                ArrayList[] arrayListArr = cuVar2.f36677c;
                if (i14 >= arrayListArr.length) {
                    break;
                }
                int size = arrayListArr[i14].size();
                if (cuVar2.f36677c.length > 1) {
                    size = Math.min(quVar.f37400u1.J * 2, size);
                }
                if (i14 == i13) {
                    i7 = i7 + size + 1;
                    break;
                } else {
                    i7 += size + 2;
                    i14++;
                }
            }
            this.C1 = i7;
            this.D1.e(true, 1.0f);
            vVar.invalidate();
            this.F1 = -1;
        }
        boolean z11 = this.J1;
        ug.p0 p0Var = this.f37399t1;
        TextView textView = this.f37398s1;
        TextView textView2 = this.f37397r1;
        if (z11 && !this.f37404y1) {
            p0Var.setVisibility(4);
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
                        boolean z12;
                        bi.ya yaVar;
                        qu quVar2;
                        boolean z13;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        qu quVar3;
                        int i16;
                        boolean z14;
                        int i17 = r1;
                        qu quVar4 = this;
                        int i18 = 0;
                        boolean z15 = true;
                        switch (i17) {
                            case 0:
                                ArrayList arrayList5 = arrayList4;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    org.telegram.ui.ActionBar.f2 f2Var = quVar4.f37391j1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i19);
                                    if (size2 == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (size2 > 1) {
                                        yaVar = new bi.ya(quVar4, iArr, size2, arrayList5);
                                    } else {
                                        yaVar = null;
                                    }
                                    qu.J0(f2Var, tLObject, z12, yaVar, null);
                                }
                                quVar4.K0(true);
                                if (size2 <= 1) {
                                    quVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                quVar4.dismiss();
                                org.telegram.ui.ActionBar.f2 f2Var2 = quVar4.f37391j1;
                                ArrayList arrayList6 = arrayList4;
                                if (f2Var2 != null) {
                                    org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(f2Var2.getCurrentAccount());
                                    Context context = f2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.G;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) jg.g.i(1, arrayList6)) == null) {
                                        quVar2 = quVar4;
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
                                                    z14 = z15;
                                                    quVar3 = quVar4;
                                                    if (tL_messages_stickerSet3.set.f26980id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.f26980id) {
                                                        r82[i22] = i21;
                                                        arrayListArr2[i15].remove(i21);
                                                        b03.I.l(tL_messages_stickerSet3.set.f26980id);
                                                        b03.J.l(tL_messages_stickerSet3.set.f26980id);
                                                        b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i22++;
                                                        i18 = i16;
                                                        z15 = z14;
                                                        quVar4 = quVar3;
                                                    }
                                                } else {
                                                    quVar3 = quVar4;
                                                    i16 = i18;
                                                    z14 = z15;
                                                }
                                            }
                                            i21++;
                                            i18 = i16;
                                            z15 = z14;
                                            quVar4 = quVar3;
                                        }
                                        quVar2 = quVar4;
                                        boolean z16 = i18;
                                        int i23 = z15;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i24 = b03.Y[i15];
                                        long[] jArr = b03.X;
                                        int i25 = i15;
                                        long q10 = org.telegram.messenger.ui.q(arrayList7);
                                        jArr[i25] = q10;
                                        b03.J1(i25, i24, q10, arrayList7);
                                        org.telegram.messenger.qs notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z16 ? 1 : 0] = Integer.valueOf(i25);
                                        objArr[i23] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i26 = z16 ? 1 : 0; i26 < arrayList6.size(); i26++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f26980id, i23);
                                        }
                                        cv0 cv0Var = new cv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, f2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i23];
                                        ac acVar = new ac(context, null, z16);
                                        acVar.f31756b = new org.telegram.messenger.ck(b03, (Serializable) r15, arrayList6, i25, (Serializable) r82, 2);
                                        acVar.f31757c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, f2Var2, i25);
                                        cv0Var.setButton(acVar);
                                        for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                            b03.T.k(new org.telegram.messenger.a(acVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f26980id);
                                        }
                                        cc.g(f2Var2, cv0Var, 2750).j();
                                    }
                                } else {
                                    quVar2 = quVar4;
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i28);
                                        Context context2 = quVar2.getContext();
                                        if (i28 == 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24467s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z13, null, true);
                                        }
                                    }
                                }
                                quVar2.K0(false);
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
                        boolean z12;
                        bi.ya yaVar;
                        qu quVar2;
                        boolean z13;
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2;
                        int i15;
                        qu quVar3;
                        int i16;
                        boolean z14;
                        int i17 = r1;
                        qu quVar4 = this;
                        int i18 = 0;
                        boolean z15 = true;
                        switch (i17) {
                            case 0:
                                ArrayList arrayList5 = arrayList2;
                                int size2 = arrayList5.size();
                                int[] iArr = new int[2];
                                for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                                    org.telegram.ui.ActionBar.f2 f2Var = quVar4.f37391j1;
                                    TLObject tLObject = (TLObject) arrayList5.get(i19);
                                    if (size2 == 1) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (size2 > 1) {
                                        yaVar = new bi.ya(quVar4, iArr, size2, arrayList5);
                                    } else {
                                        yaVar = null;
                                    }
                                    qu.J0(f2Var, tLObject, z12, yaVar, null);
                                }
                                quVar4.K0(true);
                                if (size2 <= 1) {
                                    quVar4.dismiss();
                                    return;
                                }
                                return;
                            default:
                                quVar4.dismiss();
                                org.telegram.ui.ActionBar.f2 f2Var2 = quVar4.f37391j1;
                                ArrayList arrayList6 = arrayList2;
                                if (f2Var2 != null) {
                                    org.telegram.messenger.ui b03 = org.telegram.messenger.ui.b0(f2Var2.getCurrentAccount());
                                    Context context = f2Var2.getContext();
                                    ArrayList[] arrayListArr2 = b03.G;
                                    if (arrayList6.isEmpty() || (tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) jg.g.i(1, arrayList6)) == null) {
                                        quVar2 = quVar4;
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
                                                    z14 = z15;
                                                    quVar3 = quVar4;
                                                    if (tL_messages_stickerSet3.set.f26980id == ((TLRPC.TL_messages_stickerSet) arrayList6.get(i22)).set.f26980id) {
                                                        r82[i22] = i21;
                                                        arrayListArr2[i15].remove(i21);
                                                        b03.I.l(tL_messages_stickerSet3.set.f26980id);
                                                        b03.J.l(tL_messages_stickerSet3.set.f26980id);
                                                        b03.N.remove(tL_messages_stickerSet3.set.short_name);
                                                    } else {
                                                        i22++;
                                                        i18 = i16;
                                                        z15 = z14;
                                                        quVar4 = quVar3;
                                                    }
                                                } else {
                                                    quVar3 = quVar4;
                                                    i16 = i18;
                                                    z14 = z15;
                                                }
                                            }
                                            i21++;
                                            i18 = i16;
                                            z15 = z14;
                                            quVar4 = quVar3;
                                        }
                                        quVar2 = quVar4;
                                        boolean z16 = i18;
                                        int i23 = z15;
                                        ArrayList arrayList7 = arrayListArr2[i15];
                                        int i24 = b03.Y[i15];
                                        long[] jArr = b03.X;
                                        int i25 = i15;
                                        long q10 = org.telegram.messenger.ui.q(arrayList7);
                                        jArr[i25] = q10;
                                        b03.J1(i25, i24, q10, arrayList7);
                                        org.telegram.messenger.qs notificationCenter = b03.getNotificationCenter();
                                        Object[] objArr = new Object[2];
                                        objArr[z16 ? 1 : 0] = Integer.valueOf(i25);
                                        objArr[i23] = Boolean.TRUE;
                                        notificationCenter.k(60, objArr);
                                        for (int i26 = z16 ? 1 : 0; i26 < arrayList6.size(); i26++) {
                                            b03.g1(((TLRPC.TL_messages_stickerSet) arrayList6.get(i26)).set.f26980id, i23);
                                        }
                                        cv0 cv0Var = new cv0(context, tL_messages_stickerSet2, arrayList6.size(), 0, null, f2Var2.getResourceProvider());
                                        ?? r15 = new boolean[i23];
                                        ac acVar = new ac(context, null, z16);
                                        acVar.f31756b = new org.telegram.messenger.ck(b03, (Serializable) r15, arrayList6, i25, (Serializable) r82, 2);
                                        acVar.f31757c = new bg.l0(b03, (boolean[]) r15, arrayList6, context, f2Var2, i25);
                                        cv0Var.setButton(acVar);
                                        for (int i27 = 0; i27 < arrayList6.size(); i27++) {
                                            b03.T.k(new org.telegram.messenger.a(acVar, 22), ((TLRPC.TL_messages_stickerSet) arrayList6.get(i27)).set.f26980id);
                                        }
                                        cc.g(f2Var2, cv0Var, 2750).j();
                                    }
                                } else {
                                    quVar2 = quVar4;
                                    for (int i28 = 0; i28 < arrayList6.size(); i28++) {
                                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet4 = (TLRPC.TL_messages_stickerSet) arrayList6.get(i28);
                                        Context context2 = quVar2.getContext();
                                        if (i28 == 0) {
                                            z13 = true;
                                        } else {
                                            z13 = false;
                                        }
                                        if (tL_messages_stickerSet4 != null) {
                                            org.telegram.messenger.ui.b0(org.telegram.messenger.p10.f24467s0).g2(context2, tL_messages_stickerSet4, null, 0, null, null, true, z13, null, true);
                                        }
                                    }
                                }
                                quVar2.K0(false);
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
        p0Var.setVisibility(8);
        textView2.setVisibility(8);
        textView.setVisibility(8);
        P0(false);
    }

    public final void O0(boolean z9) {
        boolean z10;
        boolean z11 = false;
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27922h5, this.I0)) > 0.721f) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28129s8, this.I0), 855638016)) > 0.721f) {
            z11 = true;
        }
        if (!z9) {
            z10 = z11;
        }
        org.telegram.messenger.g0.q3(this, z10);
    }

    public final void P0(boolean z9) {
        boolean z10;
        float f10;
        float L;
        float f11;
        float L2;
        float f12;
        float f13;
        int i7 = 0;
        if (!this.G1 && z9) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f37398s1.getVisibility() == 0) {
            i7 = org.telegram.messenger.g0.L(19.0f);
        }
        float f14 = i7;
        boolean z11 = this.f37404y1;
        fi.v vVar = this.n1;
        View view = this.f37395p1;
        FrameLayout frameLayout = this.f37396q1;
        float f15 = 1.0f;
        float f16 = 0.0f;
        if (z10) {
            ViewPropertyAnimator animate = frameLayout.animate();
            if (z9) {
                L2 = f14;
            } else {
                L2 = org.telegram.messenger.g0.L(16.0f);
            }
            ViewPropertyAnimator translationY = animate.translationY(L2);
            if (z9) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            ViewPropertyAnimator duration = translationY.alpha(f12).setDuration(250L);
            xq xqVar = xq.h;
            duration.setInterpolator(xqVar).start();
            ViewPropertyAnimator animate2 = view.animate();
            if (z9) {
                f13 = -(org.telegram.messenger.g0.L(68.0f) - f14);
            } else {
                f13 = 0.0f;
            }
            ViewPropertyAnimator translationY2 = animate2.translationY(f13);
            if (!z9) {
                f15 = 0.0f;
            }
            translationY2.alpha(f15).setDuration(250L).setInterpolator(xqVar).start();
            ViewPropertyAnimator animate3 = vVar.animate();
            if (!z11 && !z9) {
                f16 = org.telegram.messenger.g0.L(68.0f) - f14;
            }
            animate3.translationY(f16).setDuration(250L).setInterpolator(xqVar).start();
        } else {
            if (z9) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            frameLayout.setAlpha(f10);
            if (z9) {
                L = f14;
            } else {
                L = org.telegram.messenger.g0.L(16.0f);
            }
            frameLayout.setTranslationY(L);
            if (!z9) {
                f15 = 0.0f;
            }
            view.setAlpha(f15);
            if (z9) {
                f11 = -(org.telegram.messenger.g0.L(68.0f) - f14);
            } else {
                f11 = 0.0f;
            }
            view.setTranslationY(f11);
            if (!z11 && !z9) {
                f16 = org.telegram.messenger.g0.L(68.0f) - f14;
            }
            vVar.setTranslationY(f16);
        }
        this.G1 = z9;
    }

    @Override
    public final int R() {
        int measuredHeight;
        int i7 = 0;
        fi.v vVar = this.n1;
        if (vVar == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = vVar.getMeasuredHeight();
        }
        int I0 = measuredHeight - I0();
        ViewGroup viewGroup = this.f28616b;
        if (viewGroup != null) {
            i7 = viewGroup.getPaddingTop();
        }
        return org.telegram.messenger.g0.L(8.0f) + I0 + i7 + org.telegram.messenger.g0.f22539n;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        mu muVar;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        if (i7 == org.telegram.messenger.qs.f25095x0) {
            int i11 = 0;
            while (true) {
                fi.v vVar = this.n1;
                if (i11 < vVar.getChildCount()) {
                    View childAt = vVar.getChildAt(i11);
                    if ((childAt instanceof mu) && (tL_messages_stickerSet = (muVar = (mu) childAt).f36095r) != null && tL_messages_stickerSet.set != null) {
                        muVar.a(org.telegram.messenger.ui.b0(this.f28613a).B0(muVar.f36095r.set.f26980id, true), true);
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
        iu iuVar = this.f37393m1;
        if (iuVar != null && iuVar.f34792x) {
            iuVar.f34792x = false;
            iuVar.invalidate();
        }
        super.dismiss();
        cu cuVar = this.l1;
        if (cuVar != null) {
            org.telegram.messenger.qs.f(cuVar.d).n(cuVar, org.telegram.messenger.qs.B0);
        }
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25017k1, 4);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.qs.f(this.f28613a).c(this, org.telegram.messenger.qs.f25095x0);
    }

    @Override
    public final void onBackPressed() {
        if (org.telegram.ui.ks.p().E) {
            org.telegram.ui.ks.p().n();
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.qs.f(this.f28613a).n(this, org.telegram.messenger.qs.f25095x0);
    }

    @Override
    public final void s0() {
        Boolean bool;
        try {
            super.s0();
            cp cpVar = this.f37402w1;
            if (cpVar != null) {
                cpVar.b(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Ci, this.I0));
            }
            iu iuVar = this.f37393m1;
            if (iuVar != null && (bool = iuVar.f34785c) != null) {
                O0(bool.booleanValue());
            }
            ViewGroup viewGroup = this.f28616b;
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
        gu guVar = new gu(this);
        this.f37394o1 = guVar;
        this.n1.setAdapter(guVar);
        org.telegram.messenger.qs.e().k(org.telegram.messenger.qs.f25012j1, 4);
        cu cuVar = this.l1;
        if (!cuVar.f36678e) {
            cuVar.f36678e = true;
            qu quVar = cuVar.f36679f;
            int i7 = cuVar.d;
            cuVar.f36676b = new ArrayList(cuVar.f36675a.size());
            cuVar.f36677c = new ArrayList[cuVar.f36675a.size()];
            org.telegram.messenger.qs.f(i7).c(cuVar, 64);
            boolean[] zArr = new boolean[1];
            int i10 = 0;
            while (true) {
                if (i10 < cuVar.f36677c.length) {
                    TLRPC.TL_messages_stickerSet l02 = org.telegram.messenger.ui.b0(i7).l0((TLRPC.InputStickerSet) cuVar.f36675a.get(i10), null, false, false, new org.telegram.messenger.voip.k(27, cuVar, zArr));
                    if (cuVar.f36677c.length == 1 && l02 != null && (stickerSet = l02.set) != null && !stickerSet.emojis) {
                        org.telegram.messenger.g0.h3(new nu(cuVar, 0));
                        Context context = quVar.getContext();
                        org.telegram.ui.ActionBar.f2 f2Var = quVar.f37391j1;
                        TLRPC.InputStickerSet inputStickerSet = (TLRPC.InputStickerSet) cuVar.f36675a.get(i10);
                        org.telegram.ui.ActionBar.f2 f2Var2 = quVar.f37391j1;
                        if (f2Var2 instanceof org.telegram.ui.an) {
                            qjVar = ((org.telegram.ui.an) f2Var2).Z;
                        } else {
                            qjVar = null;
                        }
                        new yv0(context, f2Var, inputStickerSet, null, qjVar, quVar.I0).show();
                    } else {
                        cuVar.f36676b.add(l02);
                        cuVar.a(i10, l02);
                        i10++;
                    }
                } else {
                    qu quVar2 = cuVar.h;
                    quVar2.N0();
                    fi.v vVar = quVar2.n1;
                    if (vVar != null && vVar.getAdapter() != null) {
                        vVar.getAdapter().f();
                    }
                }
            }
        }
        N0();
        org.telegram.ui.ActionBar.f2 f2Var3 = this.f37391j1;
        if (f2Var3 == null) {
            currentAccount = org.telegram.messenger.p10.f24467s0;
        } else {
            currentAccount = f2Var3.getCurrentAccount();
        }
        org.telegram.messenger.ui.b0(currentAccount).B(5);
    }

    public void K0(boolean z9) {
    }

    public void L0() {
    }
}
