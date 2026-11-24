package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.View;
import android.widget.FrameLayout;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.PrivacyControlActivity;
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.d implements gk7, vl5 {
    public TLRPC.Photo A0;
    public SpannableString B0;
    public boolean C0;
    public boolean D0;
    public final int E;
    public boolean E0;
    public final boolean[] F;
    public boolean F0;
    public final boolean[] G;
    public boolean G0;
    public final boolean[] H;
    public boolean H0;
    public ArrayList I;
    public boolean I0;
    public ArrayList J;
    public boolean J0;
    public byte K;
    public boolean K0;
    public byte L;
    public boolean L0;
    public long M;
    public boolean M0;
    public long N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public boolean P0;
    public int Q;
    public int Q0;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public yj8 a;
    public int a0;
    public sha b;
    public int b0;
    public o39 c;
    public int c0;
    private int currentPhotoForRestRow;
    public zj8 d;
    public int d0;
    public je5 e;
    public int e0;
    private int everybodyRow;
    public final int[] f;
    public int f0;
    public int g0;
    private int giftTypesHeaderRow;
    public byte h;
    public int h0;
    public int i0;
    public int j0;
    public int k0;
    public int l0;
    public int m0;
    public byte n;
    public int n0;
    private int nobodyRow;
    public int o0;
    public int p0;
    private int photoForRestRow;
    private int priceRow;
    public int q0;
    public final ArrayList r;
    public int r0;
    private int readRow;
    public final ArrayList s;
    public int s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public int t0;
    public final wl5 u0;
    public oy8 v0;
    public final boolean[] w;
    public wgb w0;
    public final boolean[] x;
    public be0 x0;
    public final boolean[] y;
    public gt2 y0;
    public TLRPC.PhotoSize z0;

    public PrivacyControlActivity(int i, boolean z) {
        super(null);
        TLRPC.PhotoSize w;
        this.f = new int[2];
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new boolean[4];
        this.x = new boolean[4];
        this.y = new boolean[4];
        this.F = new boolean[4];
        this.G = new boolean[4];
        this.H = new boolean[4];
        this.N = 10L;
        this.Q0 = 4;
        this.E = i;
        if (z) {
            qu2.r(this.currentAccount).D(false);
        }
        if (i == 4) {
            wl5 wl5Var = new wl5(0, true, true);
            this.u0 = wl5Var;
            wl5Var.a = this;
            wl5Var.b = this;
            TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().n);
            if (l7c.s(W1) && (w = ba4.w(W1.fallback_photo.sizes, 1000, false, null, false)) != null) {
                this.z0 = w;
                this.A0 = W1.fallback_photo;
            }
        }
    }

    public final void A0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        int i;
        int i2;
        this.b.b(false);
        int i3 = this.E;
        if ((i3 == 10 || i3 == 1 || i3 == 2) && this.K != 0 && (globalPrivacySettings = qu2.r(this.currentAccount).Y) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i4 = 0; i4 < 2; i4++) {
                int i5 = iArr[i4];
                ArrayList v = qu2.r(this.currentAccount).v(i5);
                if (i5 != i3) {
                    if (v != null) {
                        int size = v.size();
                        int i6 = 0;
                        while (i6 < size) {
                            Object obj = v.get(i6);
                            i6++;
                            TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) obj;
                            if (TLRPC.TL_privacyValueAllowAll.class.isInstance(privacyRule2)) {
                                privacyRule = (TLRPC.PrivacyRule) TLRPC.TL_privacyValueAllowAll.class.cast(privacyRule2);
                                break;
                            }
                        }
                    }
                    privacyRule = null;
                    if (privacyRule != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, this.resourceProvider, getParentActivity());
                        if (i5 == 1) {
                            i = 2131752135;
                        } else {
                            i = 2131752137;
                        }
                        String M0 = k96.M0(i, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        if (i5 == 1) {
                            i2 = 2131752136;
                        } else {
                            i2 = 2131752138;
                        }
                        hdVar.U = k96.M0(i2, null);
                        alertDialog$Builder.j(k96.M0(2131752134, null), new jh(this, i5, (byte) 17));
                        alertDialog$Builder.g(k96.M0(2131752577, null), new qj8(this, (byte) 1));
                        alertDialog$Builder.o();
                        return;
                    }
                }
            }
        }
        finishFragment();
    }

    public final boolean B0() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.PrivacyControlActivity.B0():boolean");
    }

    public final void C0(TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            na7.q1(this.currentAccount).b4(privacyrules.users, false);
            na7.q1(this.currentAccount).V3(privacyrules.chats, false);
            qu2.r(this.currentAccount).M(13, privacyrules.rules);
            gl.c3(new h18(this, zArr, (byte) 25));
            return;
        }
        K0();
    }

    public final void D0(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            qu2.r(this.currentAccount).M(7, ((TL_account.privacyRules) tLObject).rules);
            if (atomicInteger.decrementAndGet() == 0) {
                A0();
                return;
            }
            return;
        }
        u21.b0(this).g0(tL_error, false);
    }

    public final void E0(TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            na7.q1(this.currentAccount).b4(privacyrules.users, false);
            na7.q1(this.currentAccount).V3(privacyrules.chats, false);
            qu2.r(this.currentAccount).M(this.E, privacyrules.rules);
            if (atomicInteger.decrementAndGet() == 0) {
                A0();
                return;
            }
            return;
        }
        K0();
    }

    public final void F0() {
        TLRPC.Photo photo;
        this.z0 = null;
        this.A0 = null;
        TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().n);
        if (W1 != null && (photo = W1.fallback_photo) != null) {
            W1.flags &= -4194305;
            W1.fallback_photo = null;
            getMessagesStorage().g2(W1, true);
            M0();
            P0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.id = photo.id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            na7.q1(this.currentAccount).h0(tL_inputPhoto);
            kk7.f(this.currentAccount).k(kk7.b0, new Object[0]);
        }
    }

    public final void G0(final int i, View view) {
        ArrayList arrayList;
        String str;
        int i2;
        final boolean z;
        boolean z2;
        char c;
        byte b;
        pw0 pw0Var = pw0.APP_ERROR;
        if (i == this.currentPhotoForRestRow) {
            hd hdVar = ij.L(getParentActivity(), k96.M0(2131746096, null), k96.M0(2131746097, null), k96.M0(2131746128, null), new mj8(this, (byte) 1), null).a;
            hdVar.show();
            hdVar.h();
            return;
        }
        byte b2 = 0;
        r8 = false;
        boolean z3 = false;
        byte b3 = 0;
        if (i == this.photoForRestRow) {
            wl5 wl5Var = this.u0;
            if (wl5Var != null) {
                wl5Var.n(false, new jc((byte) 10), new ph8(this, (byte) 1), 0);
                this.v0.H(0);
                this.v0.K(43);
                this.w0.e.d();
            }
        } else if (this.E == 10 && i == this.Q && !getMessagesController().k4.n2.f && !getUserConfig().p()) {
            u21.b0(this).L(2131624211, k96.M0(2131747578, null), gl.S2(k96.M0(2131747579, null)), k96.M0(2131747580, null), new mj8(this, (byte) 2)).j();
            pw0Var.a();
            int i3 = -this.Q0;
            this.Q0 = i3;
            gl.A3(i3, view, null);
        } else if (this.E == 8 && ((i == this.Q || i == this.nobodyRow) && !getUserConfig().p())) {
            u21.b0(this).L(2131624211, k96.M0(2131747578, null), gl.S2(k96.M0(2131747579, null)), k96.M0(2131747580, null), new mj8(this, (byte) 3)).j();
            pw0Var.a();
            int i4 = -this.Q0;
            this.Q0 = i4;
            gl.A3(i4, view, null);
        } else if (i != this.nobodyRow && i != this.everybodyRow && i != this.Q && i != this.i0) {
            if (i != this.Z && i != this.Y) {
                if (i != this.V && i != this.U) {
                    if (i == this.d0) {
                        presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i == this.readRow) {
                        this.D0 = !this.D0;
                        N0();
                        ((ahb) view).setChecked(this.D0);
                        return;
                    } else if (i == this.g0) {
                        presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i == this.showGiftIconRow) {
                        this.F0 = !this.F0;
                        N0();
                        ((ahb) view).setChecked(this.F0);
                        return;
                    } else if (i == this.o0) {
                        if (this.J0 && !getUserConfig().p()) {
                            int i5 = -this.Q0;
                            this.Q0 = i5;
                            gl.A3(i5, view, null);
                            L0();
                            return;
                        }
                        boolean x0 = x0();
                        this.J0 = !this.J0;
                        N0();
                        ahb ahbVar = (ahb) view;
                        ahbVar.setChecked(this.J0);
                        if (this.J0 && !getUserConfig().p()) {
                            ahbVar.setCheckBoxIcon(2131232518);
                        }
                        if (x0 != x0()) {
                            P0(true);
                            gl.V3(this.c);
                            return;
                        }
                        return;
                    } else if (i == this.n0) {
                        if (this.H0 && !getUserConfig().p()) {
                            int i6 = -this.Q0;
                            this.Q0 = i6;
                            gl.A3(i6, view, null);
                            L0();
                            return;
                        }
                        boolean x02 = x0();
                        this.H0 = !this.H0;
                        N0();
                        ahb ahbVar2 = (ahb) view;
                        ahbVar2.setChecked(this.H0);
                        if (this.H0 && !getUserConfig().p()) {
                            ahbVar2.setCheckBoxIcon(2131232518);
                        }
                        if (x02 != x0()) {
                            P0(true);
                            gl.V3(this.c);
                            return;
                        }
                        return;
                    } else if (i == this.p0) {
                        if (this.L0 && !getUserConfig().p()) {
                            int i7 = -this.Q0;
                            this.Q0 = i7;
                            gl.A3(i7, view, null);
                            L0();
                            return;
                        }
                        boolean x03 = x0();
                        this.L0 = !this.L0;
                        N0();
                        ahb ahbVar3 = (ahb) view;
                        ahbVar3.setChecked(this.L0);
                        if (this.L0 && !getUserConfig().p()) {
                            ahbVar3.setCheckBoxIcon(2131232518);
                        }
                        if (x03 != x0()) {
                            P0(true);
                            gl.V3(this.c);
                            return;
                        }
                        return;
                    } else if (i == this.q0) {
                        if (this.N0 && !getUserConfig().p()) {
                            int i8 = -this.Q0;
                            this.Q0 = i8;
                            gl.A3(i8, view, null);
                            L0();
                            return;
                        }
                        boolean x04 = x0();
                        this.N0 = !this.N0;
                        N0();
                        ahb ahbVar4 = (ahb) view;
                        ahbVar4.setChecked(this.N0);
                        if (this.N0 && !getUserConfig().p()) {
                            ahbVar4.setCheckBoxIcon(2131232518);
                        }
                        if (x04 != x0()) {
                            P0(true);
                            gl.V3(this.c);
                            return;
                        }
                        return;
                    } else if (i == this.r0) {
                        if (this.P0 && !getUserConfig().p()) {
                            int i9 = -this.Q0;
                            this.Q0 = i9;
                            gl.A3(i9, view, null);
                            L0();
                            return;
                        }
                        boolean x05 = x0();
                        this.P0 = !this.P0;
                        N0();
                        ahb ahbVar5 = (ahb) view;
                        ahbVar5.setChecked(this.P0);
                        if (this.P0 && !getUserConfig().p()) {
                            ahbVar5.setCheckBoxIcon(2131232518);
                        }
                        if (x05 != x0()) {
                            P0(true);
                            gl.V3(this.c);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (this.E == 12 && x0()) {
                    int i10 = -this.Q0;
                    this.Q0 = i10;
                    gl.A3(i10, view, null);
                    return;
                } else {
                    if (i == this.V) {
                        arrayList = this.J;
                    } else {
                        arrayList = this.I;
                    }
                    Bundle bundle = new Bundle();
                    if (i == this.V) {
                        str = "isNeverShare";
                    } else {
                        str = "isAlwaysShare";
                    }
                    bundle.putBoolean(str, true);
                    if (this.E != 0) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    bundle.putInt("chatAddType", i2);
                    if (i == this.U && this.E == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (this.E == 12 && ((b = this.K) != 1 ? !(b != 2 ? b != 0 || i != this.V : i != this.U) : i == this.U)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bundle.putBoolean("allowMiniapps", z);
                    qa5 qa5Var = new qa5(bundle);
                    if (this.E == 10) {
                        qa5Var.M = k96.M0(2131746098, null);
                    }
                    if (i == this.U) {
                        boolean[] zArr = this.F;
                        if (this.K == 2) {
                            c = 0;
                        } else {
                            c = 1;
                        }
                        if (zArr[c]) {
                            z2 = true;
                            if (z && this.G[this.K]) {
                                z3 = true;
                            }
                            qa5Var.s0(arrayList, z2, z3);
                            qa5Var.x = new la5() {
                                @Override
                                public final void a(ArrayList arrayList2, boolean z4, boolean z5) {
                                    char c2;
                                    PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                                    boolean[] zArr2 = privacyControlActivity.G;
                                    int i11 = privacyControlActivity.V;
                                    int i12 = i;
                                    boolean z6 = z;
                                    int i13 = 0;
                                    boolean z7 = true;
                                    if (i12 == i11) {
                                        privacyControlActivity.J = arrayList2;
                                        byte b4 = privacyControlActivity.K;
                                        if (!z6 || !z5) {
                                            z7 = false;
                                        }
                                        zArr2[b4] = z7;
                                        while (i13 < privacyControlActivity.J.size()) {
                                            privacyControlActivity.I.remove(privacyControlActivity.J.get(i13));
                                            i13++;
                                        }
                                    } else {
                                        boolean[] zArr3 = privacyControlActivity.F;
                                        byte b5 = privacyControlActivity.K;
                                        if (b5 == 2) {
                                            c2 = 0;
                                        } else {
                                            c2 = 1;
                                        }
                                        zArr3[c2] = z4;
                                        if (!z6 || !z5) {
                                            z7 = false;
                                        }
                                        zArr2[b5] = z7;
                                        privacyControlActivity.I = arrayList2;
                                        while (i13 < privacyControlActivity.I.size()) {
                                            privacyControlActivity.J.remove(privacyControlActivity.I.get(i13));
                                            i13++;
                                        }
                                    }
                                    privacyControlActivity.N0();
                                    privacyControlActivity.a.f();
                                }
                            };
                            qa5Var.f0 = true;
                            presentFragment(qa5Var);
                            return;
                        }
                    }
                    z2 = false;
                    if (z) {
                        z3 = true;
                    }
                    qa5Var.s0(arrayList, z2, z3);
                    qa5Var.x = new la5() {
                        @Override
                        public final void a(ArrayList arrayList2, boolean z4, boolean z5) {
                            char c2;
                            PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                            boolean[] zArr2 = privacyControlActivity.G;
                            int i11 = privacyControlActivity.V;
                            int i12 = i;
                            boolean z6 = z;
                            int i13 = 0;
                            boolean z7 = true;
                            if (i12 == i11) {
                                privacyControlActivity.J = arrayList2;
                                byte b4 = privacyControlActivity.K;
                                if (!z6 || !z5) {
                                    z7 = false;
                                }
                                zArr2[b4] = z7;
                                while (i13 < privacyControlActivity.J.size()) {
                                    privacyControlActivity.I.remove(privacyControlActivity.J.get(i13));
                                    i13++;
                                }
                            } else {
                                boolean[] zArr3 = privacyControlActivity.F;
                                byte b5 = privacyControlActivity.K;
                                if (b5 == 2) {
                                    c2 = 0;
                                } else {
                                    c2 = 1;
                                }
                                zArr3[c2] = z4;
                                if (!z6 || !z5) {
                                    z7 = false;
                                }
                                zArr2[b5] = z7;
                                privacyControlActivity.I = arrayList2;
                                while (i13 < privacyControlActivity.I.size()) {
                                    privacyControlActivity.J.remove(privacyControlActivity.I.get(i13));
                                    i13++;
                                }
                            }
                            privacyControlActivity.N0();
                            privacyControlActivity.a.f();
                        }
                    };
                    qa5Var.f0 = true;
                    presentFragment(qa5Var);
                    return;
                }
            }
            if (i != this.Y) {
                b3 = 1;
            }
            if (b3 != this.L) {
                this.L = b3;
                N0();
                P0(true);
            }
        } else if (this.E == 12 && x0()) {
            int i11 = -this.Q0;
            this.Q0 = i11;
            gl.A3(i11, view, null);
        } else {
            if (i == this.nobodyRow) {
                b2 = 1;
            } else if (i != this.everybodyRow) {
                if (i == this.i0) {
                    b2 = 3;
                } else {
                    b2 = 2;
                }
            }
            if (b2 == this.K) {
                return;
            }
            this.K = b2;
            m21.e();
            N0();
            P0(true);
        }
    }

    public final void H0(TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull W1 = getMessagesController().W1(getUserConfig().n);
            W1.flags |= 4194304;
            W1.fallback_photo = tL_photos_photo.photo;
            getMessagesStorage().g2(W1, true);
            kk7.f(this.currentAccount).k(kk7.b0, new Object[0]);
            TLRPC.PhotoSize w = ba4.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w2 = ba4.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w != null && this.z0 != null) {
                ba4.G(this.currentAccount);
                File J = ba4.J(w, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.z0, null, true, true).renameTo(J);
                StringBuilder sb = new StringBuilder();
                sb.append(this.z0.location.volume_id);
                sb.append("_");
                String l = de9.l(sb, this.z0.location.local_id, "@50_50");
                StringBuilder sb2 = new StringBuilder();
                sb2.append(w.location.volume_id);
                sb2.append("_");
                fl5.z().O(l, de9.l(sb2, w.location.local_id, "@50_50"), gl5.e(w.location));
            }
            if (w2 != null && this.z0 != null) {
                ba4.G(this.currentAccount);
                File J2 = ba4.J(w2, null, true, true);
                ba4.G(this.currentAccount);
                ba4.J(this.z0.location, null, true, true).renameTo(J2);
            }
        }
    }

    public final void I0() {
        if (getParentActivity() == null) {
            return;
        }
        int i = this.E;
        if (i == 10 && this.K == 3 && !getUserConfig().p()) {
            showDialog(new jh8((org.telegram.ui.ActionBar.d) this, 27, true));
            return;
        }
        if (this.K != 0 && i == 0 && !getUserConfig().p()) {
            SharedPreferences c1 = na7.c1();
            if (!c1.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                hd hdVar = alertDialog$Builder.a;
                if (i == 1) {
                    hdVar.U = k96.M0(2131742618, null);
                } else {
                    hdVar.U = k96.M0(2131751673, null);
                }
                hdVar.S = k96.M0(2131689472, null);
                alertDialog$Builder.j(k96.M0(2131747638, null), new dx6(this, c1, (byte) 25));
                alertDialog$Builder.g(k96.M0(2131752577, null), null);
                showDialog(hdVar);
                return;
            }
        }
        w0();
    }

    public final void J0() {
        zj8 zj8Var;
        zj8 zj8Var2 = this.d;
        if (zj8Var2 != null) {
            zj8Var2.e.k.fwd_from.from_id = new TLRPC.TL_peerUser();
            byte b = this.K;
            if (b == 0) {
                String M0 = k96.M0(2131746644, null);
                je5 je5Var = this.e;
                if (je5Var != null) {
                    je5Var.t(M0);
                }
                zj8Var = this.d;
                zj8Var.e.k.fwd_from.from_id.user_id = 1L;
            } else if (b == 1) {
                String M02 = k96.M0(2131746640, null);
                je5 je5Var2 = this.e;
                if (je5Var2 != null) {
                    je5Var2.t(M02);
                }
                zj8Var = this.d;
                zj8Var.e.k.fwd_from.from_id.user_id = 0L;
            } else {
                String M03 = k96.M0(2131746645, null);
                je5 je5Var3 = this.e;
                if (je5Var3 != null) {
                    je5Var3.t(M03);
                }
                zj8Var = this.d;
                zj8Var.e.k.fwd_from.from_id.user_id = 1L;
            }
            zj8Var.b.J1();
        }
    }

    public final void K0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = k96.M0(2131689472, null);
        hd hdVar = alertDialog$Builder.a;
        hdVar.S = M0;
        hdVar.U = k96.M0(2131746647, null);
        alertDialog$Builder.j(k96.M0(2131747638, null), null);
        showDialog(hdVar);
    }

    public final void L0() {
        u21.b0(this).L(2131624211, k96.M0(2131747578, null), gl.S2(k96.M0(2131747579, null)), k96.M0(2131747580, null), new mj8(this, (byte) 0)).j();
    }

    public final void M0() {
        TLRPC.PhotoSize photoSize;
        wgb wgbVar = this.w0;
        if (wgbVar != null) {
            if (this.z0 == null) {
                wgbVar.getTextView().k(k96.a0("SetPhotoForRest", null, 2131745325, new Object[0]));
                this.w0.setNeedDivider(false);
            } else {
                wgbVar.getTextView().k(k96.a0("UpdatePhotoForRest", null, 2131743578, new Object[0]));
                this.w0.setNeedDivider(true);
            }
        }
        be0 be0Var = this.x0;
        if (be0Var != null && (photoSize = this.z0) != null) {
            TLRPC.Photo photo = this.A0;
            if (photo != null) {
                be0Var.m(gl5.i(photoSize, photo), "50_50", null, y6c.h(this.currentAccount).f());
            } else {
                be0Var.m(gl5.e(photoSize.location), "50_50", null, y6c.h(this.currentAccount).f());
            }
        }
    }

    public final void N0() {
        this.b.a(B0(), true);
    }

    public final void O0() {
        zj8 zj8Var;
        if (this.e != null && (zj8Var = this.d) != null && this.fragmentView != null) {
            if (zj8Var.getParent() == this.c && this.d.isAttachedToWindow()) {
                zj8 zj8Var2 = this.d;
                int[] iArr = this.f;
                zj8Var2.getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                this.fragmentView.getLocationInWindow(iArr);
                this.e.w(this.d.b.getForwardNameCenterX() + this.d.b.getLeft() + (i - iArr[0]), gl.L(44.0f) + this.d.getPaddingTop() + (i2 - iArr[1]), false);
                return;
            }
            this.e.f(false);
        }
    }

    public final void P0(boolean z) {
        vj8 vj8Var;
        int i;
        ArrayList arrayList;
        byte b;
        s49 T;
        byte b2;
        boolean z2;
        byte b3;
        boolean z3;
        TLRPC.UserFull W1;
        if (z) {
            vj8Var = new vj8(this);
            vj8Var.e(vj8Var.b);
            vj8Var.a = this.t0;
        } else {
            vj8Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.b0 = -1;
        this.O = -1;
        this.setBirthdayRow = -1;
        this.a0 = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.U = -1;
        this.V = -1;
        this.c0 = -1;
        this.d0 = -1;
        this.R = -1;
        this.S = -1;
        this.e0 = -1;
        this.f0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.T = -1;
        this.W = -1;
        this.i0 = -1;
        this.j0 = -1;
        this.priceRow = -1;
        this.l0 = -1;
        this.k0 = -1;
        this.g0 = -1;
        this.h0 = -1;
        this.showGiftIconRow = -1;
        this.m0 = -1;
        this.giftTypesHeaderRow = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.t0 = 0;
        int i2 = this.E;
        if (i2 == 12) {
            this.showGiftIconRow = 0;
            this.t0 = 2;
            this.m0 = 1;
        }
        if (i2 == 11 && (W1 = getMessagesController().W1(getUserConfig().e())) != null && W1.birthday == null) {
            int i3 = this.t0;
            this.t0 = i3 + 1;
            this.setBirthdayRow = i3;
        }
        int i4 = this.E;
        if (i4 == 5) {
            int i5 = this.t0;
            this.t0 = i5 + 1;
            this.O = i5;
        }
        int i6 = this.t0;
        this.P = i6;
        this.everybodyRow = i6 + 1;
        int i7 = i6 + 3;
        this.t0 = i7;
        this.Q = i6 + 2;
        if (i4 == 4 || i4 == 9 || i4 == 14 || i4 == 0 || i4 == 2 || i4 == 3 || i4 == 5 || i4 == 6 || i4 == 8 || i4 == 1 || i4 == 11 || i4 == 12) {
            this.t0 = i6 + 4;
            this.nobodyRow = i7;
        }
        if (getMessagesController().k4.K1.f && this.E == 10) {
            int i8 = this.t0;
            this.t0 = i8 + 1;
            this.i0 = i8;
        }
        int i9 = this.E;
        if (i9 == 6 && this.K == 1) {
            int i10 = this.t0;
            this.a0 = i10;
            this.X = i10 + 1;
            this.Y = i10 + 2;
            this.t0 = i10 + 4;
            this.Z = i10 + 3;
        }
        if (i9 == 10 && this.K == 3) {
            int i11 = this.t0;
            i = i11 + 1;
            this.t0 = i;
            this.S = i11;
        } else {
            int i12 = this.t0;
            i = i12 + 1;
            this.t0 = i;
            this.R = i12;
        }
        if (i9 == 10) {
            if (this.K == 3) {
                this.j0 = i;
                this.t0 = i + 2;
                this.priceRow = i + 1;
                if (!getUserConfig().p()) {
                    int i13 = this.t0;
                    this.t0 = i13 + 1;
                    this.k0 = i13;
                }
                int i14 = this.t0;
                this.t0 = i14 + 1;
                this.l0 = i14;
                if (getUserConfig().p()) {
                    int i15 = this.t0;
                    this.T = i15;
                    this.U = i15 + 1;
                    this.t0 = i15 + 3;
                    this.W = i15 + 2;
                }
            }
        } else if (i9 != 8 || getUserConfig().p()) {
            int i16 = this.t0;
            int i17 = i16 + 1;
            this.t0 = i17;
            this.T = i16;
            byte b4 = this.K;
            if (b4 == 1 || b4 == 2) {
                int i18 = i16 + 2;
                this.t0 = i18;
                this.U = i17;
                i17 = i18;
            }
            if (b4 == 0 || b4 == 2) {
                int i19 = i17 + 1;
                this.t0 = i19;
                this.V = i17;
                i17 = i19;
            }
            int i20 = i17 + 1;
            this.t0 = i20;
            this.W = i17;
            int i21 = this.E;
            if (i21 == 2) {
                this.c0 = i20;
                this.d0 = i17 + 2;
                this.t0 = i17 + 4;
                this.e0 = i17 + 3;
            }
            if (i21 == 4 && (this.J.size() > 0 || (b = this.K) == 2 || b == 1)) {
                int i22 = this.t0;
                int i23 = i22 + 1;
                this.t0 = i23;
                this.photoForRestRow = i22;
                if (this.z0 != null) {
                    int i24 = i22 + 2;
                    this.t0 = i24;
                    this.currentPhotoForRestRow = i23;
                    i23 = i24;
                }
                this.t0 = i23 + 1;
                this.b0 = i23;
            }
            if (this.E == 0 && (this.K != 0 || ((arrayList = this.J) != null && !arrayList.isEmpty()))) {
                int i25 = this.t0;
                this.readRow = i25;
                this.t0 = i25 + 2;
                this.f0 = i25 + 1;
            }
            if (this.E == 0 && !getMessagesController().F3()) {
                int i26 = this.t0;
                this.g0 = i26;
                this.t0 = i26 + 2;
                this.h0 = i26 + 1;
            }
        }
        if (this.E == 12) {
            int i27 = this.t0;
            this.giftTypesHeaderRow = i27;
            this.o0 = i27 + 1;
            this.n0 = i27 + 2;
            this.p0 = i27 + 3;
            this.q0 = i27 + 4;
            this.r0 = i27 + 5;
            this.t0 = i27 + 7;
            this.s0 = i27 + 6;
        }
        J0();
        yj8 yj8Var = this.a;
        if (yj8Var != null) {
            if (z) {
                int childCount = this.c.getChildCount();
                for (int i28 = 0; i28 < childCount; i28++) {
                    View childAt = this.c.getChildAt(i28);
                    if (childAt instanceof vy8) {
                        o39 o39Var = this.c;
                        View F = o39Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = o39Var.T(F);
                        }
                        if (T != null) {
                            int b5 = T.b();
                            vy8 vy8Var = (vy8) childAt;
                            int i29 = this.everybodyRow;
                            if (b5 != i29 && b5 != this.Q && b5 != this.nobodyRow && b5 != this.i0) {
                                if (b5 == this.Z) {
                                    b3 = 1;
                                } else {
                                    b3 = 0;
                                }
                                if (this.L == b3) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                vy8Var.a(z3, true);
                            } else {
                                if (b5 == i29) {
                                    b2 = 0;
                                } else if (b5 == this.Q) {
                                    b2 = 2;
                                } else if (b5 == this.nobodyRow) {
                                    b2 = 1;
                                } else {
                                    b2 = 3;
                                }
                                if (this.K == b2) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                vy8Var.a(z2, true);
                            }
                        }
                    }
                }
                vj8Var.e(vj8Var.c);
                vu7.a(vj8Var, true).c(this.a);
                gl.V3(this.c);
                return;
            }
            yj8Var.f();
        }
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z, final TLRPC.VideoSize videoSize) {
        gl.c3(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.z0 = photoSize3;
                privacyControlActivity.A0 = null;
                privacyControlActivity.M0();
                TLRPC.InputFile inputFile3 = inputFile;
                TLRPC.InputFile inputFile4 = inputFile2;
                if (inputFile3 != null || inputFile4 != null) {
                    TLRPC.TL_photos_uploadProfilePhoto tL_photos_uploadProfilePhoto = new TLRPC.TL_photos_uploadProfilePhoto();
                    if (inputFile3 != null) {
                        tL_photos_uploadProfilePhoto.file = inputFile3;
                        tL_photos_uploadProfilePhoto.flags |= 1;
                    }
                    if (inputFile4 != null) {
                        tL_photos_uploadProfilePhoto.video = inputFile4;
                        int i = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new n35(privacyControlActivity, (byte) 19));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().f().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().f().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().f().access_hash;
                    u21.b0(privacyControlActivity).V(Collections.singletonList(tL_user), k96.M0(2131747072, null), null, null).j();
                }
                privacyControlActivity.P0(false);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.id));
        hashSet.add(Integer.valueOf(bkb.Cb));
        hashSet.add(Integer.valueOf(bkb.Bb));
        hashSet.add(Integer.valueOf(bkb.Ab));
        hashSet.add(Integer.valueOf(bkb.zb));
        hashSet.add(Integer.valueOf(bkb.sb));
        hashSet.add(Integer.valueOf(bkb.rb));
        hashSet.add(Integer.valueOf(bkb.vb));
        hashSet.add(Integer.valueOf(bkb.ub));
        hashSet.add(Integer.valueOf(bkb.tb));
        hashSet.add(Integer.valueOf(bkb.qb));
        hashSet.add(Integer.valueOf(bkb.sa));
        hashSet.add(Integer.valueOf(bkb.Tc));
        hashSet.add(Integer.valueOf(bkb.qa));
        hashSet.add(Integer.valueOf(bkb.g7));
        hashSet.add(Integer.valueOf(bkb.f7));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.K6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.r8));
        hashSet.add(Integer.valueOf(bkb.c6));
    }

    @Override
    public final boolean c() {
        return true;
    }

    @Override
    public final boolean canBeginSlide() {
        return y0(true);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i = this.E;
        if (i == 5) {
            this.d = new zj8(this, context);
        }
        this.simpleActionBar.setBackButtonImage(2131231243);
        if (i == 6) {
            this.simpleActionBar.setTitle(k96.M0(2131746599, null));
        } else if (i == 5) {
            this.simpleActionBar.setTitle(k96.M0(2131746646, null));
        } else if (i == 4) {
            this.simpleActionBar.setTitle(k96.M0(2131746586, null));
        } else if (i == 9) {
            this.simpleActionBar.setTitle(k96.M0(2131746676, null));
        } else if (i == 14) {
            this.simpleActionBar.setTitle(k96.M0(2131746613, null));
        } else if (i == 3) {
            this.simpleActionBar.setTitle(k96.M0(2131746609, null));
        } else if (i == 2) {
            this.simpleActionBar.setTitle(k96.M0(2131752584, null));
        } else if (i == 1) {
            this.simpleActionBar.setTitle(k96.M0(2131746626, null));
        } else if (i == 8) {
            this.simpleActionBar.setTitle(k96.M0(2131746567, null));
        } else if (i == 0) {
            this.simpleActionBar.setTitle(k96.M0(2131746624, null));
        } else if (i == 10) {
            this.simpleActionBar.setTitle(k96.M0(2131746619, null));
        } else if (i == 11) {
            this.simpleActionBar.setTitle(k96.M0(2131746669, null));
        } else if (i == 12) {
            this.simpleActionBar.setTitle(k96.M0(2131746638, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 27));
        this.simpleActionBar.t();
        sha s = this.simpleActionBar.s(k96.M0(2131745754, null));
        this.b = s;
        s.a(B0(), false);
        this.a = new yj8(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        o39 o39Var = new o39(context, null);
        this.c = o39Var;
        o39Var.r1();
        this.c.setLayoutManager(new t26(1, false));
        this.c.setSectionsDrawBackground(true);
        this.c.setVerticalScrollBarEnabled(false);
        ((gb3) this.c.getItemAnimator()).C = false;
        frameLayout.addView(this.c, nme.c(-1.0f, -1));
        if (this.d != null) {
            je5 je5Var = new je5(context, 1);
            je5Var.p(true);
            je5Var.h = gl.L(250.0f);
            je5Var.d = -1L;
            je5Var.m(11.0f, 6.0f, 11.0f, 7.0f);
            je5Var.U = false;
            this.e = je5Var;
            je5Var.setPadding(gl.L(19.0f), 0, gl.L(19.0f), 0);
            this.e.k(getBaseSimpleGlass().c);
            frameLayout.addView(this.e, nme.e(-1, 150, 55));
            this.c.j(new n58(this, (byte) 5));
        }
        this.c.setAdapter(this.a);
        this.c.setOnItemClickListener(new bf4(this, (byte) 24));
        uj8 uj8Var = new uj8(this);
        uj8Var.n(350L);
        uj8Var.o(s33.h);
        uj8Var.C = false;
        this.c.setItemAnimator(uj8Var);
        J0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        zj8 zj8Var;
        if (i == kk7.j0) {
            z0();
        } else if (i == kk7.k4) {
            this.c.h1();
        } else if (i == kk7.B4 && (zj8Var = this.d) != null) {
            zj8Var.invalidate();
        }
    }

    @Override
    public final p98 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Uc));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vc));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Kd));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qb));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Md));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Sb));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Od));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Tb));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Qd));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.Vb));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.de));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ic));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.ee));
        arrayList.add(new blb(this.c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (alb) null, bkb.dc));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        return y0(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        z0();
        P0(false);
        kk7.f(this.currentAccount).b(this, kk7.j0);
        kk7.e().b(this, kk7.B4);
        kk7.e().b(this, kk7.k4);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        kk7.f(this.currentAccount).n(this, kk7.j0);
        kk7.e().n(this, kk7.B4);
        kk7.e().n(this, kk7.k4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        wl5 wl5Var = this.u0;
        if (wl5Var != null) {
            wl5Var.i();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        P0(false);
        wl5 wl5Var = this.u0;
        if (wl5Var != null) {
            wl5Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            zj8 zj8Var = this.d;
            if (zj8Var != null) {
                zj8Var.invalidate();
            }
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    public final void w0() {
        final AtomicInteger atomicInteger;
        char c = 0;
        boolean z = false;
        int i = this.E;
        if (i == 10) {
            boolean[] zArr = {true};
            if (this.K == 3) {
                ArrayList arrayList = this.r;
                Collections.sort(arrayList);
                Collections.sort(this.I);
                if (!arrayList.equals(this.I)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.K != 0 && this.I.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i2 = 0; i2 < this.I.size(); i2++) {
                            Long l = (Long) this.I.get(i2);
                            long longValue = l.longValue();
                            if (cf3.D(longValue)) {
                                TLRPC.User V1 = na7.q1(this.currentAccount).V1(l);
                                if (V1 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(na7.q1(this.currentAccount).o1(V1));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new hj7(this, zArr, (byte) 9));
                }
            }
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().Y;
            if (globalPrivacySettings != null) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings2 = setglobalprivacysettings.settings;
                globalPrivacySettings2.flags = globalPrivacySettings.flags;
                globalPrivacySettings2.disallowed_stargifts = globalPrivacySettings.disallowed_stargifts;
                globalPrivacySettings2.archive_and_mute_new_noncontact_peers = globalPrivacySettings.archive_and_mute_new_noncontact_peers;
                globalPrivacySettings2.noncontact_peers_paid_stars = globalPrivacySettings.noncontact_peers_paid_stars;
                globalPrivacySettings2.keep_archived_folders = globalPrivacySettings.keep_archived_folders;
                globalPrivacySettings2.keep_archived_unmuted = globalPrivacySettings.keep_archived_unmuted;
                globalPrivacySettings2.hide_read_marks = globalPrivacySettings.hide_read_marks;
            }
            byte b = this.K;
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
            if (b == 3) {
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.N;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = 0L;
                if (b == 2) {
                    z = true;
                }
                globalPrivacySettings3.new_noncontact_peers_require_premium = z;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new rt0(this, zArr, globalPrivacySettings, setglobalprivacysettings, (byte) 15));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.K == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                byte b2 = this.L;
                ArrayList<TLRPC.InputPrivacyRule> arrayList2 = setprivacy3.rules;
                if (b2 == 0) {
                    arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    arrayList2.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity b;

                    {
                        this.b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b3 = r5;
                                        AtomicInteger atomicInteger4 = atomicInteger3;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                        switch (b3) {
                                            case 0:
                                                privacyControlActivity2.D0(tL_error2, tLObject2, atomicInteger4);
                                                return;
                                            default:
                                                privacyControlActivity2.E0(tL_error2, tLObject2, atomicInteger4);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final PrivacyControlActivity privacyControlActivity2 = this.b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                gl.c3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        byte b3 = r5;
                                        AtomicInteger atomicInteger42 = atomicInteger4;
                                        TLObject tLObject2 = tLObject;
                                        TLRPC.TL_error tL_error2 = tL_error;
                                        PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                        switch (b3) {
                                            case 0:
                                                privacyControlActivity22.D0(tL_error2, tLObject2, atomicInteger42);
                                                return;
                                            default:
                                                privacyControlActivity22.E0(tL_error2, tLObject2, atomicInteger42);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                }, 2);
            }
        } else if (i == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.K != 0 && this.I.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i3 = 0; i3 < this.I.size(); i3++) {
                Long l2 = (Long) this.I.get(i3);
                long longValue2 = l2.longValue();
                if (cf3.D(longValue2)) {
                    TLRPC.User V12 = na7.q1(this.currentAccount).V1(l2);
                    if (V12 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(na7.q1(this.currentAccount).o1(V12));
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.K != 1 && this.J.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i4 = 0; i4 < this.J.size(); i4++) {
                Long l3 = (Long) this.J.get(i4);
                long longValue3 = l3.longValue();
                if (cf3.D(longValue3)) {
                    TLRPC.User V13 = getMessagesController().V1(l3);
                    if (V13 != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(getMessagesController().o1(V13));
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        byte b3 = this.K;
        if (b3 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (b3 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (b3 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        byte b4 = this.K;
        if (b4 != 0) {
            if (b4 != 2) {
                c = 1;
            }
            if (this.F[c]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        byte b5 = this.K;
        if (this.G[b5]) {
            ArrayList<TLRPC.InputPrivacyRule> arrayList3 = setprivacy2.rules;
            if (b5 == 0) {
                arrayList3.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                arrayList3.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity b;

            {
                this.b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b32 = r5;
                                AtomicInteger atomicInteger42 = atomicInteger3;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                switch (b32) {
                                    case 0:
                                        privacyControlActivity22.D0(tL_error2, tLObject2, atomicInteger42);
                                        return;
                                    default:
                                        privacyControlActivity22.E0(tL_error2, tLObject2, atomicInteger42);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final PrivacyControlActivity privacyControlActivity2 = this.b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        gl.c3(new Runnable() {
                            @Override
                            public final void run() {
                                byte b32 = r5;
                                AtomicInteger atomicInteger42 = atomicInteger4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                switch (b32) {
                                    case 0:
                                        privacyControlActivity22.D0(tL_error2, tLObject2, atomicInteger42);
                                        return;
                                    default:
                                        privacyControlActivity22.E0(tL_error2, tLObject2, atomicInteger42);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }, 2);
        if (i == 0 && this.D0 != this.C0) {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings4 = getContactsController().Y;
            TLRPC.GlobalPrivacySettings globalPrivacySettings5 = setglobalprivacysettings2.settings;
            globalPrivacySettings5.archive_and_mute_new_noncontact_peers = globalPrivacySettings4.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings5.keep_archived_folders = globalPrivacySettings4.keep_archived_folders;
            globalPrivacySettings5.keep_archived_unmuted = globalPrivacySettings4.keep_archived_unmuted;
            globalPrivacySettings5.new_noncontact_peers_require_premium = globalPrivacySettings4.new_noncontact_peers_require_premium;
            globalPrivacySettings5.noncontact_peers_paid_stars = globalPrivacySettings4.noncontact_peers_paid_stars;
            globalPrivacySettings5.hide_read_marks = this.D0;
            globalPrivacySettings5.display_gifts_button = globalPrivacySettings4.display_gifts_button;
            atomicInteger = atomicInteger2;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings6 = globalPrivacySettings4;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            gl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull W1;
                                    byte b6 = r5;
                                    AtomicInteger atomicInteger4 = atomicInteger3;
                                    TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                    TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings6;
                                    PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                    switch (b6) {
                                        case 0:
                                            boolean z2 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity2.C0 = z2;
                                            globalPrivacySettings7.hide_read_marks = z2;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity2.A0();
                                                return;
                                            }
                                            return;
                                        default:
                                            if (globalPrivacySettings7.display_gifts_button != setglobalprivacysettings4.settings.display_gifts_button && (W1 = privacyControlActivity2.getMessagesController().W1(privacyControlActivity2.getUserConfig().e())) != null) {
                                                W1.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity2.getMessagesStorage().g2(W1, false);
                                            }
                                            boolean z3 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity2.E0 = z3;
                                            globalPrivacySettings7.display_gifts_button = z3;
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = globalPrivacySettings7.disallowed_stargifts;
                                            if (disallowedGiftsSettings == null) {
                                                disallowedGiftsSettings = new TLRPC.DisallowedGiftsSettings();
                                                globalPrivacySettings7.disallowed_stargifts = disallowedGiftsSettings;
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings7.flags |= 64;
                                                boolean z4 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity2.G0 = !z4;
                                                boolean z5 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings.disallow_limited_stargifts = z5;
                                                privacyControlActivity2.I0 = !z5;
                                                boolean z6 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings.disallow_unique_stargifts = z6;
                                                privacyControlActivity2.K0 = !z6;
                                                boolean z7 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity2.M0 = !z7;
                                                boolean z8 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings.disallow_premium_gifts = z8;
                                                privacyControlActivity2.O0 = !z8;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity2.A0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings4;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            gl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull W1;
                                    byte b6 = r5;
                                    AtomicInteger atomicInteger42 = atomicInteger4;
                                    TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                    TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                                    PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                    switch (b6) {
                                        case 0:
                                            boolean z2 = setglobalprivacysettings42.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z2;
                                            globalPrivacySettings72.hide_read_marks = z2;
                                            if (atomicInteger42.decrementAndGet() == 0) {
                                                privacyControlActivity22.A0();
                                                return;
                                            }
                                            return;
                                        default:
                                            if (globalPrivacySettings72.display_gifts_button != setglobalprivacysettings42.settings.display_gifts_button && (W1 = privacyControlActivity22.getMessagesController().W1(privacyControlActivity22.getUserConfig().e())) != null) {
                                                W1.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity22.getMessagesStorage().g2(W1, false);
                                            }
                                            boolean z3 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity22.E0 = z3;
                                            globalPrivacySettings72.display_gifts_button = z3;
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = globalPrivacySettings72.disallowed_stargifts;
                                            if (disallowedGiftsSettings == null) {
                                                disallowedGiftsSettings = new TLRPC.DisallowedGiftsSettings();
                                                globalPrivacySettings72.disallowed_stargifts = disallowedGiftsSettings;
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings72.flags |= 64;
                                                boolean z4 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity22.G0 = !z4;
                                                boolean z5 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings.disallow_limited_stargifts = z5;
                                                privacyControlActivity22.I0 = !z5;
                                                boolean z6 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings.disallow_unique_stargifts = z6;
                                                privacyControlActivity22.K0 = !z6;
                                                boolean z7 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity22.M0 = !z7;
                                                boolean z8 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings.disallow_premium_gifts = z8;
                                                privacyControlActivity22.O0 = !z8;
                                            }
                                            if (atomicInteger42.decrementAndGet() == 0) {
                                                privacyControlActivity22.A0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        } else {
            atomicInteger = atomicInteger2;
        }
        if (i == 12 && (this.F0 != this.E0 || this.J0 != this.I0 || this.H0 != this.G0 || this.L0 != this.K0 || this.P0 != this.O0)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings6 = getContactsController().Y;
            TLRPC.GlobalPrivacySettings globalPrivacySettings7 = setglobalprivacysettings3.settings;
            globalPrivacySettings7.archive_and_mute_new_noncontact_peers = globalPrivacySettings6.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings7.keep_archived_folders = globalPrivacySettings6.keep_archived_folders;
            globalPrivacySettings7.keep_archived_unmuted = globalPrivacySettings6.keep_archived_unmuted;
            globalPrivacySettings7.new_noncontact_peers_require_premium = globalPrivacySettings6.new_noncontact_peers_require_premium;
            globalPrivacySettings7.noncontact_peers_paid_stars = globalPrivacySettings6.noncontact_peers_paid_stars;
            globalPrivacySettings7.hide_read_marks = globalPrivacySettings6.hide_read_marks;
            globalPrivacySettings7.display_gifts_button = this.F0;
            if (getUserConfig().p()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
                globalPrivacySettings8.flags |= 64;
                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.H0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.J0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.L0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.P0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity b;

                {
                    this.b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings62 = globalPrivacySettings6;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            gl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull W1;
                                    byte b6 = r5;
                                    AtomicInteger atomicInteger42 = atomicInteger3;
                                    TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                    TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings62;
                                    PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                    switch (b6) {
                                        case 0:
                                            boolean z2 = setglobalprivacysettings42.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z2;
                                            globalPrivacySettings72.hide_read_marks = z2;
                                            if (atomicInteger42.decrementAndGet() == 0) {
                                                privacyControlActivity22.A0();
                                                return;
                                            }
                                            return;
                                        default:
                                            if (globalPrivacySettings72.display_gifts_button != setglobalprivacysettings42.settings.display_gifts_button && (W1 = privacyControlActivity22.getMessagesController().W1(privacyControlActivity22.getUserConfig().e())) != null) {
                                                W1.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity22.getMessagesStorage().g2(W1, false);
                                            }
                                            boolean z3 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity22.E0 = z3;
                                            globalPrivacySettings72.display_gifts_button = z3;
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings72.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 == null) {
                                                disallowedGiftsSettings2 = new TLRPC.DisallowedGiftsSettings();
                                                globalPrivacySettings72.disallowed_stargifts = disallowedGiftsSettings2;
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings22 != null) {
                                                globalPrivacySettings72.flags |= 64;
                                                boolean z4 = disallowedGiftsSettings22.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity22.G0 = !z4;
                                                boolean z5 = disallowedGiftsSettings22.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z5;
                                                privacyControlActivity22.I0 = !z5;
                                                boolean z6 = disallowedGiftsSettings22.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z6;
                                                privacyControlActivity22.K0 = !z6;
                                                boolean z7 = disallowedGiftsSettings22.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity22.M0 = !z7;
                                                boolean z8 = disallowedGiftsSettings22.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z8;
                                                privacyControlActivity22.O0 = !z8;
                                            }
                                            if (atomicInteger42.decrementAndGet() == 0) {
                                                privacyControlActivity22.A0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings6;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            gl.c3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull W1;
                                    byte b6 = r5;
                                    AtomicInteger atomicInteger42 = atomicInteger4;
                                    TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                    TLRPC.GlobalPrivacySettings globalPrivacySettings722 = globalPrivacySettings72;
                                    PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                    switch (b6) {
                                        case 0:
                                            boolean z2 = setglobalprivacysettings42.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z2;
                                            globalPrivacySettings722.hide_read_marks = z2;
                                            if (atomicInteger42.decrementAndGet() == 0) {
                                                privacyControlActivity22.A0();
                                                return;
                                            }
                                            return;
                                        default:
                                            if (globalPrivacySettings722.display_gifts_button != setglobalprivacysettings42.settings.display_gifts_button && (W1 = privacyControlActivity22.getMessagesController().W1(privacyControlActivity22.getUserConfig().e())) != null) {
                                                W1.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity22.getMessagesStorage().g2(W1, false);
                                            }
                                            boolean z3 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity22.E0 = z3;
                                            globalPrivacySettings722.display_gifts_button = z3;
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings722.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 == null) {
                                                disallowedGiftsSettings2 = new TLRPC.DisallowedGiftsSettings();
                                                globalPrivacySettings722.disallowed_stargifts = disallowedGiftsSettings2;
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings22 != null) {
                                                globalPrivacySettings722.flags |= 64;
                                                boolean z4 = disallowedGiftsSettings22.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z4;
                                                privacyControlActivity22.G0 = !z4;
                                                boolean z5 = disallowedGiftsSettings22.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z5;
                                                privacyControlActivity22.I0 = !z5;
                                                boolean z6 = disallowedGiftsSettings22.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z6;
                                                privacyControlActivity22.K0 = !z6;
                                                boolean z7 = disallowedGiftsSettings22.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z7;
                                                privacyControlActivity22.M0 = !z7;
                                                boolean z8 = disallowedGiftsSettings22.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z8;
                                                privacyControlActivity22.O0 = !z8;
                                            }
                                            if (atomicInteger42.decrementAndGet() == 0) {
                                                privacyControlActivity22.A0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                    }
                }
            });
        }
        if (atomicInteger.get() > 0) {
            this.b.b(true);
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    public final boolean x0() {
        if (!this.L0 && !this.H0 && !this.J0) {
            return true;
        }
        return false;
    }

    public final boolean y0(boolean z) {
        if (this.b.x.f) {
            if (z) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = k96.M0(2131743487, null);
                hd hdVar = alertDialog$Builder.a;
                hdVar.S = M0;
                hdVar.U = k96.M0(2131746579, null);
                alertDialog$Builder.j(k96.M0(2131754213, null), new qj8(this, (byte) 0));
                alertDialog$Builder.g(k96.M0(2131747387, null), new qj8(this, (byte) 2));
                showDialog(hdVar);
            }
            return false;
        }
        return true;
    }

    public final void z0() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z5;
        byte b;
        char c;
        boolean z6;
        boolean[] zArr;
        ArrayList arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.r;
        byte b2 = 2;
        int i = this.E;
        if (i == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = qu2.r(this.currentAccount).Y;
            b2 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? (byte) 0 : (byte) 0;
            this.K = b2;
            this.h = b2;
            this.J = new ArrayList();
            this.I = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long k = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().k4.H1.f(), 1L);
                this.N = k;
                this.M = k;
                this.K = (byte) 3;
                this.h = (byte) 3;
            } else {
                this.N = 10L;
                this.M = 10L;
            }
            ArrayList v = qu2.r(this.currentAccount).v(13);
            this.I = new ArrayList();
            if (v != null) {
                for (int i2 = 0; i2 < v.size(); i2++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i2);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i3 = 0;
                        while (i3 < size) {
                            i3 = mue.c(i3, 1, -tL_privacyValueAllowChatParticipants.chats.get(i3).longValue(), this.I);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.I.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.I);
            return;
        }
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean[] zArr4 = this.w;
        zArr4[0] = z;
        boolean[] zArr5 = this.F;
        zArr5[0] = z;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.x;
        zArr6[0] = false;
        boolean[] zArr7 = this.G;
        zArr7[0] = false;
        if (i == 12) {
            z2 = true;
        } else {
            z2 = false;
        }
        zArr6[1] = z2;
        zArr7[1] = z2;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.y;
        zArr8[0] = false;
        boolean[] zArr9 = this.H;
        zArr9[0] = false;
        if (i == 12) {
            z3 = true;
        } else {
            z3 = false;
        }
        zArr8[1] = z3;
        zArr9[1] = z3;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.I = new ArrayList();
        this.J = new ArrayList();
        ArrayList v2 = qu2.r(this.currentAccount).v(i);
        if (v2 != null && v2.size() != 0) {
            Boolean bool2 = null;
            int i4 = 0;
            boolean z7 = false;
            boolean z8 = false;
            char c2 = 65535;
            while (i4 < v2.size()) {
                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) v2.get(i4);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i5 = 0;
                    while (true) {
                        zArr = zArr6;
                        if (i5 >= size2) {
                            break;
                        }
                        i5 = mue.c(i5, 1, -tL_privacyValueAllowChatParticipants2.chats.get(i5).longValue(), this.I);
                        zArr6 = zArr;
                        v2 = v2;
                        tL_privacyValueAllowChatParticipants2 = tL_privacyValueAllowChatParticipants2;
                        zArr4 = zArr4;
                    }
                    arrayList = v2;
                    zArr2 = zArr4;
                } else {
                    zArr = zArr6;
                    arrayList = v2;
                    zArr2 = zArr4;
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                        int i6 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i6 < size3; size3 = size3) {
                            i6 = mue.c(i6, 1, -tL_privacyValueDisallowChatParticipants.chats.get(i6).longValue(), this.J);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.I.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.J.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z7 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z9 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z9) {
                                    boolean z10 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z10 || z8) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c2 = 2;
                                            z8 = true;
                                        } else if (c2 == 65535) {
                                            if (!z9) {
                                                if (!z10 || z8) {
                                                    c2 = 2;
                                                }
                                            }
                                        }
                                    }
                                    c2 = 1;
                                }
                                c2 = 0;
                            }
                            bool2 = bool;
                        }
                        i4++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        v2 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i4++;
                zArr5 = zArr3;
                zArr6 = zArr;
                v2 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c2 != 0 && (c2 != 65535 || (this.J.size() <= 0 && (bool2 == null || bool2.booleanValue())))) {
                b = 2;
                if (c2 != 2) {
                    if (c2 == 65535 && this.J.size() > 0 && this.I.size() > 0) {
                        b = 2;
                    } else {
                        byte b3 = 1;
                        if (c2 != 1) {
                            if (c2 == 65535 && (this.I.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                b3 = 1;
                            }
                            b = 2;
                        }
                        this.K = b3;
                        b = 2;
                    }
                }
                this.K = b;
            } else {
                b = 2;
                this.K = (byte) 0;
            }
            byte b4 = this.K;
            if (b4 == b) {
                c = 0;
            } else {
                c = 1;
            }
            zArr11[c] = z7;
            zArr12[c] = z7;
            if (bool2 != null) {
                z6 = true;
            } else {
                z6 = false;
            }
            zArr10[b4] = z6;
            zArr7[b4] = z6;
            zArr8[b4] = false;
            zArr9[b4] = false;
            sha shaVar = this.b;
            if (shaVar != null) {
                shaVar.a(false, false);
            }
        } else {
            this.K = (byte) 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.s;
        arrayList3.clear();
        this.h = this.K;
        arrayList2.addAll(this.I);
        arrayList3.addAll(this.J);
        if (i == 6) {
            ArrayList v3 = qu2.r(this.currentAccount).v(7);
            if (v3 != null && v3.size() != 0) {
                int i7 = 0;
                while (true) {
                    if (i7 >= v3.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = (TLRPC.PrivacyRule) v3.get(i7);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.L = (byte) 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.L = (byte) 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.L = (byte) 1;
                        break;
                    } else {
                        i7++;
                    }
                }
            } else {
                this.L = (byte) 0;
            }
            this.n = this.L;
        }
        if (i == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().Y;
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z5 = true;
            } else {
                z5 = false;
            }
            this.C0 = z5;
            this.D0 = z5;
        }
        if (i == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().Y;
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.E0 = z4;
            this.F0 = z4;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z11 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.H0 = z11;
                this.G0 = z11;
                boolean z12 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.J0 = z12;
                this.I0 = z12;
                boolean z13 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.L0 = z13;
                this.K0 = z13;
                boolean z14 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.N0 = z14;
                this.M0 = z14;
                boolean z15 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.P0 = z15;
                this.O0 = z15;
            } else {
                this.H0 = true;
                this.G0 = true;
                this.J0 = true;
                this.I0 = true;
                this.L0 = true;
                this.K0 = true;
                this.N0 = true;
                this.M0 = true;
                this.P0 = true;
                this.O0 = true;
            }
        }
        P0(false);
        gl.V3(this.c);
    }

    @Override
    public final void T() {
    }

    @Override
    public final void H(float f) {
    }

    @Override
    public final void O(boolean z, boolean z2) {
    }

    public PrivacyControlActivity(int i) {
        this(i, false);
    }
}
