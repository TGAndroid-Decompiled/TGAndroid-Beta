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
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.fs, org.telegram.ui.Components.w30 {
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
    public int K;
    public boolean K0;
    public int L;
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
    public kt0 f43497a;
    public int f43498a0;
    public org.telegram.ui.ActionBar.c5 f43499b;
    public int f43500b0;
    public org.telegram.ui.Components.ek0 f43501c;
    public int f43502c0;
    private int currentPhotoForRestRow;
    public lt0 d;
    public int f43503d0;
    public hi.l3 f43504e;
    public int f43505e0;
    private int everybodyRow;
    public final int[] f43506f;
    public int f43507f0;
    public int f43508g0;
    private int giftTypesHeaderRow;
    public int h;
    public int f43509h0;
    public int f43510i0;
    public int f43511j0;
    public int f43512k0;
    public int f43513l0;
    public int m0;
    public int f43514n;
    public int f43515n0;
    private int nobodyRow;
    public int f43516o0;
    public int f43517p0;
    private int photoForRestRow;
    private int priceRow;
    public int f43518q0;
    public final ArrayList f43519r;
    public int f43520r0;
    private int readRow;
    public final ArrayList f43521s;
    public int f43522s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public int f43523t0;
    public final org.telegram.ui.Components.x30 f43524u0;
    public org.telegram.ui.Components.oh0 f43525v0;
    public final boolean[] f43526w;
    public org.telegram.ui.Cells.n8 f43527w0;
    public final boolean[] f43528x;
    public org.telegram.ui.Components.q9 f43529x0;
    public final boolean[] f43530y;
    public or f43531y0;
    public TLRPC.PhotoSize f43532z0;

    public PrivacyControlActivity(int i7, boolean z10) {
        super(null);
        TLRPC.PhotoSize w10;
        this.f43506f = new int[2];
        this.f43519r = new ArrayList();
        this.f43521s = new ArrayList();
        this.f43526w = new boolean[4];
        this.f43528x = new boolean[4];
        this.f43530y = new boolean[4];
        this.F = new boolean[4];
        this.G = new boolean[4];
        this.H = new boolean[4];
        this.N = 10L;
        this.Q0 = 4;
        this.E = i7;
        if (z10) {
            org.telegram.messenger.i5.r(this.currentAccount).D(false);
        }
        if (i7 == 4) {
            org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(0, true, true);
            this.f43524u0 = x30Var;
            x30Var.f41966a = this;
            x30Var.f41967b = this;
            TLRPC.UserFull d2 = getMessagesController().d2(getUserConfig().f24817n);
            if (!org.telegram.messenger.o10.r(d2) || (w10 = org.telegram.messenger.w7.w(d2.fallback_photo.sizes, 1000, false, null, false)) == null) {
                return;
            }
            this.f43532z0 = w10;
            this.A0 = d2.fallback_photo;
        }
    }

    public static void Z(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f43532z0 = null;
        privacyControlActivity.A0 = null;
        TLRPC.UserFull d2 = privacyControlActivity.getMessagesController().d2(privacyControlActivity.getUserConfig().f24817n);
        if (d2 != null && (photo = d2.fallback_photo) != null) {
            d2.flags &= -4194305;
            d2.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().j2(d2, true);
            privacyControlActivity.O0();
            privacyControlActivity.Q0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f28450id = photo.f28455id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            org.telegram.messenger.mp.u1(privacyControlActivity.currentAccount).l0(tL_inputPhoto);
            org.telegram.messenger.ks.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.ks.f25121c0, new Object[0]);
        }
    }

    public static void a0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.mp.u1(privacyControlActivity.currentAccount).f4(privacyrules.users, false);
            org.telegram.messenger.mp.u1(privacyControlActivity.currentAccount).Z3(privacyrules.chats, false);
            org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(13, privacyrules.rules);
            org.telegram.messenger.g0.g3(new tr0(4, privacyControlActivity, zArr));
            return;
        }
        privacyControlActivity.M0();
    }

    public static void b0(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull d2 = privacyControlActivity.getMessagesController().d2(privacyControlActivity.getUserConfig().f24817n);
            d2.flags |= 4194304;
            d2.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().j2(d2, true);
            org.telegram.messenger.ks.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.ks.f25121c0, new Object[0]);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w10 != null && privacyControlActivity.f43532z0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.J(privacyControlActivity.f43532z0, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f43532z0.location.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(privacyControlActivity.f43532z0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.ec.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.fc.e(w10.location));
            }
            if (w11 != null && privacyControlActivity.f43532z0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.J(privacyControlActivity.f43532z0.location, null, true, true).renameTo(J2);
            }
        }
    }

    public static void c0(final PrivacyControlActivity privacyControlActivity, View view, final int i7) {
        ArrayList arrayList;
        String str;
        int i10;
        final boolean z10;
        boolean z11;
        char c10;
        int i11;
        int i12 = privacyControlActivity.E;
        if (i7 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.c5.L(privacyControlActivity.getParentActivity(), org.telegram.messenger.gd.N0(2131746093, null), org.telegram.messenger.gd.N0(2131746094, null), org.telegram.messenger.gd.N0(2131746125, null), new ys0(privacyControlActivity, 1), null).f28774a;
            t1Var.show();
            t1Var.i();
            return;
        }
        int i13 = 0;
        r8 = false;
        boolean z12 = false;
        int i14 = 0;
        if (i7 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.x30 x30Var = privacyControlActivity.f43524u0;
            if (x30Var != null) {
                x30Var.n(false, new org.telegram.messenger.j2(0), new q5(privacyControlActivity, 12), 0);
                privacyControlActivity.f43525v0.M(0);
                privacyControlActivity.f43525v0.P(43);
                privacyControlActivity.f43527w0.f31165e.d();
                return;
            }
            return;
        }
        org.telegram.messenger.q2 q2Var = org.telegram.messenger.q2.APP_ERROR;
        if (i12 == 10 && i7 == privacyControlActivity.Q && !privacyControlActivity.getMessagesController().M5 && !privacyControlActivity.getUserConfig().q()) {
            org.telegram.ui.Components.lc.b0(privacyControlActivity).L(2131624217, org.telegram.messenger.gd.N0(2131747577, null), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747578, null)), org.telegram.messenger.gd.N0(2131747579, null), new ys0(privacyControlActivity, 2)).j();
            q2Var.a();
            int i15 = -privacyControlActivity.Q0;
            privacyControlActivity.Q0 = i15;
            org.telegram.messenger.g0.E3(i15, view, null);
        } else if (i12 == 8 && ((i7 == privacyControlActivity.Q || i7 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().q())) {
            org.telegram.ui.Components.lc.b0(privacyControlActivity).L(2131624217, org.telegram.messenger.gd.N0(2131747577, null), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747578, null)), org.telegram.messenger.gd.N0(2131747579, null), new ys0(privacyControlActivity, 3)).j();
            q2Var.a();
            int i16 = -privacyControlActivity.Q0;
            privacyControlActivity.Q0 = i16;
            org.telegram.messenger.g0.E3(i16, view, null);
        } else if (i7 != privacyControlActivity.nobodyRow && i7 != privacyControlActivity.everybodyRow && i7 != privacyControlActivity.Q && i7 != privacyControlActivity.f43510i0) {
            if (i7 != privacyControlActivity.Z && i7 != privacyControlActivity.Y) {
                if (i7 != privacyControlActivity.V && i7 != privacyControlActivity.U) {
                    if (i7 == privacyControlActivity.f43503d0) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i7 == privacyControlActivity.readRow) {
                        privacyControlActivity.D0 = !privacyControlActivity.D0;
                        privacyControlActivity.P0();
                        ((org.telegram.ui.Cells.s8) view).setChecked(privacyControlActivity.D0);
                        return;
                    } else if (i7 == privacyControlActivity.f43508g0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i7 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.F0 = !privacyControlActivity.F0;
                        privacyControlActivity.P0();
                        ((org.telegram.ui.Cells.s8) view).setChecked(privacyControlActivity.F0);
                        return;
                    } else if (i7 == privacyControlActivity.f43516o0) {
                        if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().q()) {
                            int i17 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i17;
                            org.telegram.messenger.g0.E3(i17, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F0 = privacyControlActivity.F0();
                        privacyControlActivity.J0 = !privacyControlActivity.J0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                        s8Var.setChecked(privacyControlActivity.J0);
                        if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().q()) {
                            s8Var.setCheckBoxIcon(2131232515);
                        }
                        if (F0 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.Z3(privacyControlActivity.f43501c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43515n0) {
                        if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().q()) {
                            int i18 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i18;
                            org.telegram.messenger.g0.E3(i18, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F02 = privacyControlActivity.F0();
                        privacyControlActivity.H0 = !privacyControlActivity.H0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.s8 s8Var2 = (org.telegram.ui.Cells.s8) view;
                        s8Var2.setChecked(privacyControlActivity.H0);
                        if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().q()) {
                            s8Var2.setCheckBoxIcon(2131232515);
                        }
                        if (F02 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.Z3(privacyControlActivity.f43501c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43517p0) {
                        if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().q()) {
                            int i19 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i19;
                            org.telegram.messenger.g0.E3(i19, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F03 = privacyControlActivity.F0();
                        privacyControlActivity.L0 = !privacyControlActivity.L0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.s8 s8Var3 = (org.telegram.ui.Cells.s8) view;
                        s8Var3.setChecked(privacyControlActivity.L0);
                        if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().q()) {
                            s8Var3.setCheckBoxIcon(2131232515);
                        }
                        if (F03 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.Z3(privacyControlActivity.f43501c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43518q0) {
                        if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().q()) {
                            int i20 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i20;
                            org.telegram.messenger.g0.E3(i20, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F04 = privacyControlActivity.F0();
                        privacyControlActivity.N0 = !privacyControlActivity.N0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.s8 s8Var4 = (org.telegram.ui.Cells.s8) view;
                        s8Var4.setChecked(privacyControlActivity.N0);
                        if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().q()) {
                            s8Var4.setCheckBoxIcon(2131232515);
                        }
                        if (F04 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.Z3(privacyControlActivity.f43501c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43520r0) {
                        if (privacyControlActivity.P0 && !privacyControlActivity.getUserConfig().q()) {
                            int i21 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i21;
                            org.telegram.messenger.g0.E3(i21, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F05 = privacyControlActivity.F0();
                        privacyControlActivity.P0 = !privacyControlActivity.P0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.s8 s8Var5 = (org.telegram.ui.Cells.s8) view;
                        s8Var5.setChecked(privacyControlActivity.P0);
                        if (privacyControlActivity.P0 && !privacyControlActivity.getUserConfig().q()) {
                            s8Var5.setCheckBoxIcon(2131232515);
                        }
                        if (F05 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.Z3(privacyControlActivity.f43501c);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i12 == 12 && privacyControlActivity.F0()) {
                    int i22 = -privacyControlActivity.Q0;
                    privacyControlActivity.Q0 = i22;
                    org.telegram.messenger.g0.E3(i22, view, null);
                    return;
                } else {
                    if (i7 == privacyControlActivity.V) {
                        arrayList = privacyControlActivity.J;
                    } else {
                        arrayList = privacyControlActivity.I;
                    }
                    Bundle bundle = new Bundle();
                    if (i7 == privacyControlActivity.V) {
                        str = "isNeverShare";
                    } else {
                        str = "isAlwaysShare";
                    }
                    bundle.putBoolean(str, true);
                    if (i12 != 0) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    bundle.putInt("chatAddType", i10);
                    if (i7 == privacyControlActivity.U && i12 == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (i12 == 12 && ((i11 = privacyControlActivity.K) != 1 ? !(i11 != 2 ? i11 != 0 || i7 != privacyControlActivity.V : i7 != privacyControlActivity.U) : i7 == privacyControlActivity.U)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bundle.putBoolean("allowMiniapps", z10);
                    z40 z40Var = new z40(bundle);
                    if (i12 == 10) {
                        z40Var.M = org.telegram.messenger.gd.N0(2131746095, null);
                    }
                    if (i7 == privacyControlActivity.U) {
                        boolean[] zArr = privacyControlActivity.F;
                        if (privacyControlActivity.K == 2) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (zArr[c10]) {
                            z11 = true;
                            if (z10 && privacyControlActivity.G[privacyControlActivity.K]) {
                                z12 = true;
                            }
                            z40Var.u0(arrayList, z11, z12);
                            z40Var.f54430x = new v40() {
                                @Override
                                public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                                    char c11;
                                    PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                                    boolean[] zArr2 = privacyControlActivity2.G;
                                    int i23 = privacyControlActivity2.V;
                                    int i24 = i7;
                                    boolean z15 = z10;
                                    int i25 = 0;
                                    boolean z16 = true;
                                    if (i24 == i23) {
                                        privacyControlActivity2.J = arrayList2;
                                        int i26 = privacyControlActivity2.K;
                                        if (!z15 || !z14) {
                                            z16 = false;
                                        }
                                        zArr2[i26] = z16;
                                        while (i25 < privacyControlActivity2.J.size()) {
                                            privacyControlActivity2.I.remove(privacyControlActivity2.J.get(i25));
                                            i25++;
                                        }
                                    } else {
                                        boolean[] zArr3 = privacyControlActivity2.F;
                                        int i27 = privacyControlActivity2.K;
                                        if (i27 == 2) {
                                            c11 = 0;
                                        } else {
                                            c11 = 1;
                                        }
                                        zArr3[c11] = z13;
                                        if (!z15 || !z14) {
                                            z16 = false;
                                        }
                                        zArr2[i27] = z16;
                                        privacyControlActivity2.I = arrayList2;
                                        while (i25 < privacyControlActivity2.I.size()) {
                                            privacyControlActivity2.J.remove(privacyControlActivity2.I.get(i25));
                                            i25++;
                                        }
                                    }
                                    privacyControlActivity2.P0();
                                    privacyControlActivity2.f43497a.f();
                                }
                            };
                            z40Var.f54410f0 = true;
                            privacyControlActivity.presentFragment(z40Var);
                            return;
                        }
                    }
                    z11 = false;
                    if (z10) {
                        z12 = true;
                    }
                    z40Var.u0(arrayList, z11, z12);
                    z40Var.f54430x = new v40() {
                        @Override
                        public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                            char c11;
                            PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                            boolean[] zArr2 = privacyControlActivity2.G;
                            int i23 = privacyControlActivity2.V;
                            int i24 = i7;
                            boolean z15 = z10;
                            int i25 = 0;
                            boolean z16 = true;
                            if (i24 == i23) {
                                privacyControlActivity2.J = arrayList2;
                                int i26 = privacyControlActivity2.K;
                                if (!z15 || !z14) {
                                    z16 = false;
                                }
                                zArr2[i26] = z16;
                                while (i25 < privacyControlActivity2.J.size()) {
                                    privacyControlActivity2.I.remove(privacyControlActivity2.J.get(i25));
                                    i25++;
                                }
                            } else {
                                boolean[] zArr3 = privacyControlActivity2.F;
                                int i27 = privacyControlActivity2.K;
                                if (i27 == 2) {
                                    c11 = 0;
                                } else {
                                    c11 = 1;
                                }
                                zArr3[c11] = z13;
                                if (!z15 || !z14) {
                                    z16 = false;
                                }
                                zArr2[i27] = z16;
                                privacyControlActivity2.I = arrayList2;
                                while (i25 < privacyControlActivity2.I.size()) {
                                    privacyControlActivity2.J.remove(privacyControlActivity2.I.get(i25));
                                    i25++;
                                }
                            }
                            privacyControlActivity2.P0();
                            privacyControlActivity2.f43497a.f();
                        }
                    };
                    z40Var.f54410f0 = true;
                    privacyControlActivity.presentFragment(z40Var);
                    return;
                }
            }
            if (i7 != privacyControlActivity.Y) {
                i14 = 1;
            }
            if (i14 != privacyControlActivity.L) {
                privacyControlActivity.L = i14;
                privacyControlActivity.P0();
                privacyControlActivity.Q0(true);
            }
        } else if (i12 == 12 && privacyControlActivity.F0()) {
            int i23 = -privacyControlActivity.Q0;
            privacyControlActivity.Q0 = i23;
            org.telegram.messenger.g0.E3(i23, view, null);
        } else {
            if (i7 == privacyControlActivity.nobodyRow) {
                i13 = 1;
            } else if (i7 != privacyControlActivity.everybodyRow) {
                if (i7 == privacyControlActivity.f43510i0) {
                    i13 = 3;
                } else {
                    i13 = 2;
                }
            }
            if (i13 == privacyControlActivity.K) {
                return;
            }
            privacyControlActivity.K = i13;
            org.telegram.ui.Components.gc.e();
            privacyControlActivity.P0();
            privacyControlActivity.Q0(true);
        }
    }

    public static void d0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(7, ((TL_account.privacyRules) tLObject).rules);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.I0();
                return;
            }
            return;
        }
        org.telegram.ui.Components.lc.b0(privacyControlActivity).g0(tL_error, false);
    }

    public static void e0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.mp.u1(privacyControlActivity.currentAccount).f4(privacyrules.users, false);
            org.telegram.messenger.mp.u1(privacyControlActivity.currentAccount).Z3(privacyrules.chats, false);
            org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(privacyControlActivity.E, privacyrules.rules);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.I0();
                return;
            }
            return;
        }
        privacyControlActivity.M0();
    }

    public static void w0(PrivacyControlActivity privacyControlActivity) {
        lt0 lt0Var;
        int[] iArr = privacyControlActivity.f43506f;
        if (privacyControlActivity.f43504e != null && (lt0Var = privacyControlActivity.d) != null && privacyControlActivity.fragmentView != null) {
            if (lt0Var.getParent() == privacyControlActivity.f43501c && privacyControlActivity.d.isAttachedToWindow()) {
                privacyControlActivity.d.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                privacyControlActivity.fragmentView.getLocationInWindow(iArr);
                privacyControlActivity.f43504e.y(privacyControlActivity.d.f49701b.getForwardNameCenterX() + privacyControlActivity.d.f49701b.getLeft() + (i7 - iArr[0]), org.telegram.messenger.g0.L(44.0f) + privacyControlActivity.d.getPaddingTop() + (i10 - iArr[1]), false);
                return;
            }
            privacyControlActivity.f43504e.f(false);
        }
    }

    public final void E0() {
        final AtomicInteger atomicInteger;
        char c10 = 0;
        boolean z10 = false;
        int i7 = this.E;
        if (i7 == 10) {
            boolean[] zArr = {true};
            if (this.K == 3) {
                ArrayList arrayList = this.f43519r;
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
                        for (int i10 = 0; i10 < this.I.size(); i10++) {
                            Long l10 = (Long) this.I.get(i10);
                            long longValue = l10.longValue();
                            if (org.telegram.messenger.n5.E(longValue)) {
                                TLRPC.User c22 = org.telegram.messenger.mp.u1(this.currentAccount).c2(l10);
                                if (c22 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(org.telegram.messenger.mp.u1(this.currentAccount).s1(c22));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new e00(21, this, zArr));
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
            int i11 = this.K;
            if (i11 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.N;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                if (i11 == 2) {
                    z10 = true;
                }
                globalPrivacySettings4.new_noncontact_peers_require_premium = z10;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new bi.k2(this, zArr, globalPrivacySettings, setglobalprivacysettings, 17));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i7 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.K == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.L == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f54633b;

                    {
                        this.f54633b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f54633b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.d0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                            default:
                                                PrivacyControlActivity.e0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final PrivacyControlActivity privacyControlActivity2 = this.f54633b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                org.telegram.messenger.g0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                return;
                                            default:
                                                PrivacyControlActivity.e0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                }, 2);
            }
        } else if (i7 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i7 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i7 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i7 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i7 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i7 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i7 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i7 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i7 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i7 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.K != 0 && this.I.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i12 = 0; i12 < this.I.size(); i12++) {
                Long l11 = (Long) this.I.get(i12);
                long longValue2 = l11.longValue();
                if (org.telegram.messenger.n5.E(longValue2)) {
                    TLRPC.User c23 = org.telegram.messenger.mp.u1(this.currentAccount).c2(l11);
                    if (c23 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(org.telegram.messenger.mp.u1(this.currentAccount).s1(c23));
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
            for (int i13 = 0; i13 < this.J.size(); i13++) {
                Long l12 = (Long) this.J.get(i13);
                long longValue3 = l12.longValue();
                if (org.telegram.messenger.n5.E(longValue3)) {
                    TLRPC.User c24 = getMessagesController().c2(l12);
                    if (c24 != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(getMessagesController().s1(c24));
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i14 = this.K;
        if (i14 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i14 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i14 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i15 = this.K;
        if (i15 != 0) {
            if (i15 != 2) {
                c10 = 1;
            }
            if (this.F[c10]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i16 = this.K;
        if (this.G[i16]) {
            if (i16 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f54633b;

            {
                this.f54633b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f54633b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.d0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                    default:
                                        PrivacyControlActivity.e0(privacyControlActivity, tL_error, tLObject, atomicInteger3);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final PrivacyControlActivity privacyControlActivity2 = this.f54633b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        org.telegram.messenger.g0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                    default:
                                        PrivacyControlActivity.e0(privacyControlActivity2, tL_error, tLObject, atomicInteger4);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }, 2);
        if (i7 == 0 && this.D0 != this.C0) {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().Y;
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.D0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity f45696b;

                {
                    this.f45696b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f45696b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull d2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z11 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.C0 = z11;
                                            globalPrivacySettings7.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z12 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z12 != setglobalprivacysettings4.settings.display_gifts_button && (d2 = privacyControlActivity3.getMessagesController().d2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                d2.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(d2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z13;
                                            globalPrivacySettings8.display_gifts_button = z13;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.M0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.O0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f45696b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull d2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z11 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z11;
                                            globalPrivacySettings8.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z12 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (d2 = privacyControlActivity3.getMessagesController().d2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                d2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(d2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z13;
                                            globalPrivacySettings82.display_gifts_button = z13;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.M0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity3.O0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
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
        if (i7 == 12 && (this.F0 != this.E0 || this.J0 != this.I0 || this.H0 != this.G0 || this.L0 != this.K0 || this.P0 != this.O0)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().Y;
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = this.F0;
            if (getUserConfig().q()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.H0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.J0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.L0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.P0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity f45696b;

                {
                    this.f45696b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f45696b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull d2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                            privacyControlActivity22.getClass();
                                            boolean z11 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z11;
                                            globalPrivacySettings72.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z12 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (d2 = privacyControlActivity3.getMessagesController().d2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                d2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(d2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z13;
                                            globalPrivacySettings82.display_gifts_button = z13;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.M0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.O0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity2 = this.f45696b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            org.telegram.messenger.g0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull d2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z11 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.C0 = z11;
                                            globalPrivacySettings82.hide_read_marks = z11;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z12 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (d2 = privacyControlActivity3.getMessagesController().d2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                d2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(d2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.E0 = z13;
                                            globalPrivacySettings822.display_gifts_button = z13;
                                            if (globalPrivacySettings822.disallowed_stargifts == null) {
                                                globalPrivacySettings822.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings822.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings822.disallowed_stargifts;
                                                boolean z14 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z14;
                                                privacyControlActivity3.G0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity3.I0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity3.K0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity3.M0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity3.O0 = !z18;
                                            }
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity3.I0();
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
            this.f43499b.b(true);
        }
    }

    public final boolean F0() {
        if (!this.L0 && !this.H0 && !this.J0) {
            return true;
        }
        return false;
    }

    public final boolean G0(boolean z10) {
        if (this.f43499b.f28855x.f57697f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String N0 = org.telegram.messenger.gd.N0(2131743483, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                t1Var.S = N0;
                t1Var.U = org.telegram.messenger.gd.N0(2131746576, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131754213, null), new ct0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131747386, null), new ct0(this, 2));
                showDialog(t1Var);
            }
            return false;
        }
        return true;
    }

    public final void H0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z14;
        int i7;
        char c10;
        boolean z15;
        boolean[] zArr;
        ArrayList arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.f43519r;
        int i10 = 2;
        int i11 = this.E;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(this.currentAccount).Y;
            i10 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.K = i10;
            this.h = i10;
            this.J = new ArrayList();
            this.I = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long k10 = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().L6, 1L);
                this.N = k10;
                this.M = k10;
                this.K = 3;
                this.h = 3;
            } else {
                this.N = 10L;
                this.M = 10L;
            }
            ArrayList v = org.telegram.messenger.i5.r(this.currentAccount).v(13);
            this.I = new ArrayList();
            if (v != null) {
                for (int i12 = 0; i12 < v.size(); i12++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i12);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i13 = 0;
                        while (i13 < size) {
                            i13 = com.google.android.gms.internal.vision.e2.g(i13, 1, -tL_privacyValueAllowChatParticipants.chats.get(i13).longValue(), this.I);
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
        if (i11 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean[] zArr4 = this.f43526w;
        zArr4[0] = z10;
        boolean[] zArr5 = this.F;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.f43528x;
        zArr6[0] = false;
        boolean[] zArr7 = this.G;
        zArr7[0] = false;
        if (i11 == 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        zArr6[1] = z11;
        zArr7[1] = z11;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.f43530y;
        zArr8[0] = false;
        boolean[] zArr9 = this.H;
        zArr9[0] = false;
        if (i11 == 12) {
            z12 = true;
        } else {
            z12 = false;
        }
        zArr8[1] = z12;
        zArr9[1] = z12;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.I = new ArrayList();
        this.J = new ArrayList();
        ArrayList v10 = org.telegram.messenger.i5.r(this.currentAccount).v(i11);
        if (v10 != null && v10.size() != 0) {
            Boolean bool2 = null;
            int i14 = 0;
            boolean z16 = false;
            boolean z17 = false;
            char c11 = 65535;
            while (i14 < v10.size()) {
                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) v10.get(i14);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        i15 = com.google.android.gms.internal.vision.e2.g(i15, 1, -tL_privacyValueAllowChatParticipants2.chats.get(i15).longValue(), this.I);
                        zArr6 = zArr6;
                        v10 = v10;
                        tL_privacyValueAllowChatParticipants2 = tL_privacyValueAllowChatParticipants2;
                        zArr4 = zArr4;
                    }
                    zArr = zArr6;
                    arrayList = v10;
                    zArr2 = zArr4;
                } else {
                    zArr = zArr6;
                    arrayList = v10;
                    zArr2 = zArr4;
                    if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowChatParticipants) {
                        TLRPC.TL_privacyValueDisallowChatParticipants tL_privacyValueDisallowChatParticipants = (TLRPC.TL_privacyValueDisallowChatParticipants) privacyRule2;
                        int i16 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i16 < size3; size3 = size3) {
                            i16 = com.google.android.gms.internal.vision.e2.g(i16, 1, -tL_privacyValueDisallowChatParticipants.chats.get(i16).longValue(), this.J);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.I.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.J.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z16 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z18 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z18) {
                                    boolean z19 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z19 || z17) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c11 = 2;
                                            z17 = true;
                                        } else if (c11 == 65535) {
                                            if (!z18) {
                                                if (!z19 || z17) {
                                                    c11 = 2;
                                                }
                                            }
                                        }
                                    }
                                    c11 = 1;
                                }
                                c11 = 0;
                            }
                            bool2 = bool;
                        }
                        i14++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        v10 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i14++;
                zArr5 = zArr3;
                zArr6 = zArr;
                v10 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c11 == 0 || (c11 == 65535 && (this.J.size() > 0 || (bool2 != null && !bool2.booleanValue())))) {
                i7 = 2;
                this.K = 0;
            } else {
                i7 = 2;
                if (c11 != 2) {
                    if (c11 == 65535 && this.J.size() > 0 && this.I.size() > 0) {
                        i7 = 2;
                    } else {
                        int i17 = 1;
                        if (c11 != 1) {
                            if (c11 == 65535 && (this.I.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                i17 = 1;
                            }
                            i7 = 2;
                        }
                        this.K = i17;
                        i7 = 2;
                    }
                }
                this.K = i7;
            }
            int i18 = this.K;
            if (i18 == i7) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            zArr11[c10] = z16;
            zArr12[c10] = z16;
            if (bool2 != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            zArr10[i18] = z15;
            zArr7[i18] = z15;
            zArr8[i18] = false;
            zArr9[i18] = false;
            org.telegram.ui.ActionBar.c5 c5Var = this.f43499b;
            if (c5Var != null) {
                c5Var.a(false, false);
            }
        } else {
            this.K = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f43521s;
        arrayList3.clear();
        this.h = this.K;
        arrayList2.addAll(this.I);
        arrayList3.addAll(this.J);
        if (i11 == 6) {
            ArrayList v11 = org.telegram.messenger.i5.r(this.currentAccount).v(7);
            if (v11 != null && v11.size() != 0) {
                int i19 = 0;
                while (true) {
                    if (i19 >= v11.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = (TLRPC.PrivacyRule) v11.get(i19);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.L = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.L = 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.L = 1;
                        break;
                    } else {
                        i19++;
                    }
                }
            } else {
                this.L = 0;
            }
            this.f43514n = this.L;
        }
        if (i11 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().Y;
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.C0 = z14;
            this.D0 = z14;
        }
        if (i11 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().Y;
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.E0 = z13;
            this.F0 = z13;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.H0 = z20;
                this.G0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.J0 = z21;
                this.I0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.L0 = z22;
                this.K0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.N0 = z23;
                this.M0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.P0 = z24;
                this.O0 = z24;
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
        Q0(false);
        org.telegram.messenger.g0.Z3(this.f43501c);
    }

    public final void I0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        int i7;
        int i10;
        this.f43499b.b(false);
        int i11 = this.E;
        if ((i11 == 10 || i11 == 1 || i11 == 2) && this.K != 0 && (globalPrivacySettings = org.telegram.messenger.i5.r(this.currentAccount).Y) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = iArr[i12];
                ArrayList v = org.telegram.messenger.i5.r(this.currentAccount).v(i13);
                if (i13 != i11) {
                    if (v != null) {
                        int size = v.size();
                        int i14 = 0;
                        while (i14 < size) {
                            Object obj = v.get(i14);
                            i14++;
                            TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) obj;
                            if (TLRPC.TL_privacyValueAllowAll.class.isInstance(privacyRule2)) {
                                privacyRule = (TLRPC.PrivacyRule) TLRPC.TL_privacyValueAllowAll.class.cast(privacyRule2);
                                break;
                            }
                        }
                    }
                    privacyRule = null;
                    if (privacyRule != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.resourceProvider);
                        if (i13 == 1) {
                            i7 = 2131752135;
                        } else {
                            i7 = 2131752137;
                        }
                        String N0 = org.telegram.messenger.gd.N0(i7, null);
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                        t1Var.S = N0;
                        if (i13 == 1) {
                            i10 = 2131752136;
                        } else {
                            i10 = 2131752138;
                        }
                        t1Var.U = org.telegram.messenger.gd.N0(i10, null);
                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131752134, null), new ai.u1(this, i13, 19));
                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), new ct0(this, 1));
                        alertDialog$Builder.p();
                        return;
                    }
                }
            }
        }
        finishFragment();
    }

    public final boolean J0() {
        char c10;
        char c11;
        ArrayList arrayList;
        int i7 = this.E;
        if (i7 == 0 && ((this.K != 0 || ((arrayList = this.J) != null && !arrayList.isEmpty())) && this.C0 != this.D0)) {
            return true;
        }
        if (i7 == 12 && (this.E0 != this.F0 || this.I0 != this.J0 || this.G0 != this.H0 || this.K0 != this.L0 || this.M0 != this.N0 || this.O0 != this.P0)) {
            return true;
        }
        int i10 = this.h;
        int i11 = this.K;
        if (i10 != i11) {
            return true;
        }
        if (i7 == 6 && i11 == 1 && this.f43514n != this.L) {
            return true;
        }
        if (i11 != 0) {
            if (i11 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            boolean z10 = this.f43526w[c10];
            if (i11 == 2) {
                c11 = 0;
            } else {
                c11 = 1;
            }
            if (z10 != this.F[c11]) {
                return true;
            }
        }
        if ((i7 == 10 && i11 == 3 && this.N != this.M) || this.f43528x[i11] != this.G[i11]) {
            return true;
        }
        ArrayList arrayList2 = this.f43521s;
        if (arrayList2.size() != this.J.size()) {
            return true;
        }
        ArrayList arrayList3 = this.f43519r;
        if (arrayList3.size() != this.I.size()) {
            return true;
        }
        if (i7 != 10 || this.K == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.I);
            if (!arrayList3.equals(this.I)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.J);
            if (!arrayList2.equals(this.J)) {
                return true;
            }
        }
        return false;
    }

    public final void K0() {
        if (getParentActivity() == null) {
            return;
        }
        int i7 = this.E;
        if (i7 == 10 && this.K == 3 && !getUserConfig().q()) {
            showDialog(new ug.y0((org.telegram.ui.ActionBar.g2) this, 27, true));
            return;
        }
        if (this.K != 0 && i7 == 0 && !getUserConfig().q()) {
            SharedPreferences g12 = org.telegram.messenger.mp.g1();
            if (!g12.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
                if (i7 == 1) {
                    t1Var.U = org.telegram.messenger.gd.N0(2131742617, null);
                } else {
                    t1Var.U = org.telegram.messenger.gd.N0(2131751673, null);
                }
                t1Var.S = org.telegram.messenger.gd.N0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), new aj0(11, this, g12));
                alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                showDialog(t1Var);
                return;
            }
        }
        E0();
    }

    public final void L0() {
        lt0 lt0Var = this.d;
        if (lt0Var != null) {
            lt0Var.f49703e.f23993k.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i7 = this.K;
            if (i7 == 0) {
                String N0 = org.telegram.messenger.gd.N0(2131746641, null);
                hi.l3 l3Var = this.f43504e;
                if (l3Var != null) {
                    l3Var.v(N0);
                }
                this.d.f49703e.f23993k.fwd_from.from_id.user_id = 1L;
            } else if (i7 == 1) {
                String N02 = org.telegram.messenger.gd.N0(2131746637, null);
                hi.l3 l3Var2 = this.f43504e;
                if (l3Var2 != null) {
                    l3Var2.v(N02);
                }
                this.d.f49703e.f23993k.fwd_from.from_id.user_id = 0L;
            } else {
                String N03 = org.telegram.messenger.gd.N0(2131746642, null);
                hi.l3 l3Var3 = this.f43504e;
                if (l3Var3 != null) {
                    l3Var3.v(N03);
                }
                this.d.f49703e.f23993k.fwd_from.from_id.user_id = 1L;
            }
            this.d.f49701b.H1();
        }
    }

    public final void M0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String N0 = org.telegram.messenger.gd.N0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28774a;
        t1Var.S = N0;
        t1Var.U = org.telegram.messenger.gd.N0(2131746644, null);
        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131747637, null), null);
        showDialog(t1Var);
    }

    public final void N0() {
        org.telegram.ui.Components.lc.b0(this).L(2131624217, org.telegram.messenger.gd.N0(2131747577, null), org.telegram.messenger.g0.W2(org.telegram.messenger.gd.N0(2131747578, null)), org.telegram.messenger.gd.N0(2131747579, null), new ys0(this, 0)).j();
    }

    public final void O0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.n8 n8Var = this.f43527w0;
        if (n8Var != null) {
            if (this.f43532z0 == null) {
                n8Var.getTextView().k(org.telegram.messenger.gd.a0("SetPhotoForRest", null, 2131745321, new Object[0]));
                this.f43527w0.setNeedDivider(false);
            } else {
                n8Var.getTextView().k(org.telegram.messenger.gd.a0("UpdatePhotoForRest", null, 2131743574, new Object[0]));
                this.f43527w0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.q9 q9Var = this.f43529x0;
        if (q9Var != null && (photoSize = this.f43532z0) != null) {
            TLRPC.Photo photo = this.A0;
            if (photo != null) {
                q9Var.j(org.telegram.messenger.fc.i(photoSize, photo), "50_50", null, org.telegram.messenger.j10.i(this.currentAccount).f());
            } else {
                q9Var.j(org.telegram.messenger.fc.e(photoSize.location), "50_50", null, org.telegram.messenger.j10.i(this.currentAccount).f());
            }
        }
    }

    public final void P0() {
        this.f43499b.a(J0(), true);
    }

    public final void Q0(boolean z10) {
        ht0 ht0Var;
        ArrayList arrayList;
        int i7;
        v4.f1 T;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        TLRPC.UserFull d2;
        if (z10) {
            ht0Var = new ht0(this);
            ht0Var.f(ht0Var.f48523c);
            ht0Var.f48522b = this.f43523t0;
        } else {
            ht0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.f43500b0 = -1;
        this.O = -1;
        this.setBirthdayRow = -1;
        this.f43498a0 = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.U = -1;
        this.V = -1;
        this.f43502c0 = -1;
        this.f43503d0 = -1;
        this.R = -1;
        this.S = -1;
        this.f43505e0 = -1;
        this.f43507f0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.T = -1;
        this.W = -1;
        this.f43510i0 = -1;
        this.f43511j0 = -1;
        this.priceRow = -1;
        this.f43513l0 = -1;
        this.f43512k0 = -1;
        this.f43508g0 = -1;
        this.f43509h0 = -1;
        this.showGiftIconRow = -1;
        this.m0 = -1;
        this.giftTypesHeaderRow = -1;
        this.f43515n0 = -1;
        this.f43516o0 = -1;
        this.f43517p0 = -1;
        this.f43518q0 = -1;
        this.f43520r0 = -1;
        this.f43522s0 = -1;
        this.f43523t0 = 0;
        int i12 = this.E;
        if (i12 == 12) {
            this.showGiftIconRow = 0;
            this.f43523t0 = 2;
            this.m0 = 1;
        }
        if (i12 == 11 && (d2 = getMessagesController().d2(getUserConfig().e())) != null && d2.birthday == null) {
            int i13 = this.f43523t0;
            this.f43523t0 = i13 + 1;
            this.setBirthdayRow = i13;
        }
        if (i12 == 5) {
            int i14 = this.f43523t0;
            this.f43523t0 = i14 + 1;
            this.O = i14;
        }
        int i15 = this.f43523t0;
        this.P = i15;
        this.everybodyRow = i15 + 1;
        int i16 = i15 + 3;
        this.f43523t0 = i16;
        this.Q = i15 + 2;
        if (i12 == 4 || i12 == 9 || i12 == 14 || i12 == 0 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6 || i12 == 8 || i12 == 1 || i12 == 11 || i12 == 12) {
            this.f43523t0 = i15 + 4;
            this.nobodyRow = i16;
        }
        if (getMessagesController().O6 && i12 == 10) {
            int i17 = this.f43523t0;
            this.f43523t0 = i17 + 1;
            this.f43510i0 = i17;
        }
        if (i12 == 6 && this.K == 1) {
            int i18 = this.f43523t0;
            this.f43498a0 = i18;
            this.X = i18 + 1;
            this.Y = i18 + 2;
            this.f43523t0 = i18 + 4;
            this.Z = i18 + 3;
        }
        if (i12 == 10 && this.K == 3) {
            int i19 = this.f43523t0;
            this.f43523t0 = i19 + 1;
            this.S = i19;
        } else {
            int i20 = this.f43523t0;
            this.f43523t0 = i20 + 1;
            this.R = i20;
        }
        if (i12 == 10) {
            if (this.K == 3) {
                int i21 = this.f43523t0;
                this.f43511j0 = i21;
                this.f43523t0 = i21 + 2;
                this.priceRow = i21 + 1;
                if (!getUserConfig().q()) {
                    int i22 = this.f43523t0;
                    this.f43523t0 = i22 + 1;
                    this.f43512k0 = i22;
                }
                int i23 = this.f43523t0;
                this.f43523t0 = i23 + 1;
                this.f43513l0 = i23;
                if (getUserConfig().q()) {
                    int i24 = this.f43523t0;
                    this.T = i24;
                    this.U = i24 + 1;
                    this.f43523t0 = i24 + 3;
                    this.W = i24 + 2;
                }
            }
        } else if (i12 != 8 || getUserConfig().q()) {
            int i25 = this.f43523t0;
            int i26 = i25 + 1;
            this.f43523t0 = i26;
            this.T = i25;
            int i27 = this.K;
            if (i27 == 1 || i27 == 2) {
                this.f43523t0 = i25 + 2;
                this.U = i26;
            }
            if (i27 == 0 || i27 == 2) {
                int i28 = this.f43523t0;
                this.f43523t0 = i28 + 1;
                this.V = i28;
            }
            int i29 = this.f43523t0;
            int i30 = i29 + 1;
            this.f43523t0 = i30;
            this.W = i29;
            if (i12 == 2) {
                this.f43502c0 = i30;
                this.f43503d0 = i29 + 2;
                this.f43523t0 = i29 + 4;
                this.f43505e0 = i29 + 3;
            }
            if (i12 == 4 && (this.J.size() > 0 || (i7 = this.K) == 2 || i7 == 1)) {
                int i31 = this.f43523t0;
                int i32 = i31 + 1;
                this.f43523t0 = i32;
                this.photoForRestRow = i31;
                if (this.f43532z0 != null) {
                    this.f43523t0 = i31 + 2;
                    this.currentPhotoForRestRow = i32;
                }
                int i33 = this.f43523t0;
                this.f43523t0 = i33 + 1;
                this.f43500b0 = i33;
            }
            if (i12 == 0 && (this.K != 0 || ((arrayList = this.J) != null && !arrayList.isEmpty()))) {
                int i34 = this.f43523t0;
                this.readRow = i34;
                this.f43523t0 = i34 + 2;
                this.f43507f0 = i34 + 1;
            }
            if (i12 == 0 && !getMessagesController().K3()) {
                int i35 = this.f43523t0;
                this.f43508g0 = i35;
                this.f43523t0 = i35 + 2;
                this.f43509h0 = i35 + 1;
            }
        }
        if (i12 == 12) {
            int i36 = this.f43523t0;
            this.giftTypesHeaderRow = i36;
            this.f43516o0 = i36 + 1;
            this.f43515n0 = i36 + 2;
            this.f43517p0 = i36 + 3;
            this.f43518q0 = i36 + 4;
            this.f43520r0 = i36 + 5;
            this.f43523t0 = i36 + 7;
            this.f43522s0 = i36 + 6;
        }
        L0();
        kt0 kt0Var = this.f43497a;
        if (kt0Var != null) {
            if (z10) {
                int childCount = this.f43501c.getChildCount();
                for (int i37 = 0; i37 < childCount; i37++) {
                    View childAt = this.f43501c.getChildAt(i37);
                    if (childAt instanceof org.telegram.ui.Cells.j6) {
                        org.telegram.ui.Components.ek0 ek0Var = this.f43501c;
                        View F = ek0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = ek0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.j6 j6Var = (org.telegram.ui.Cells.j6) childAt;
                            int i38 = this.everybodyRow;
                            if (b10 != i38 && b10 != this.Q && b10 != this.nobodyRow && b10 != this.f43510i0) {
                                if (b10 == this.Z) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (this.L == i11) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                j6Var.a(z12, true);
                            } else {
                                if (b10 == i38) {
                                    i10 = 0;
                                } else if (b10 == this.Q) {
                                    i10 = 2;
                                } else if (b10 == this.nobodyRow) {
                                    i10 = 1;
                                } else {
                                    i10 = 3;
                                }
                                if (this.K == i10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                j6Var.a(z11, true);
                            }
                        }
                    }
                }
                ht0Var.f(ht0Var.d);
                v4.o.c(ht0Var, true).c(this.f43497a);
                org.telegram.messenger.g0.Z3(this.f43501c);
                return;
            }
            kt0Var.f();
        }
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f43532z0 = photoSize3;
                privacyControlActivity.A0 = null;
                privacyControlActivity.O0();
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
                        int i7 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i7 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new l(privacyControlActivity, 18));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().f().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().f().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().f().access_hash;
                    org.telegram.ui.Components.lc.b0(privacyControlActivity).V(Collections.singletonList(tL_user), org.telegram.messenger.gd.N0(2131747071, null), null, null).j();
                }
                privacyControlActivity.Q0(false);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29494jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29679tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29660sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29737wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29718vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29699ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29642rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29678ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29641ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29434g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29379d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29470i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29676t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29378d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return G0(true);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i7 = this.E;
        if (i7 == 5) {
            this.d = new lt0(this, context);
        }
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (i7 == 6) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746596, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746643, null));
        } else if (i7 == 4) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746583, null));
        } else if (i7 == 9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746673, null));
        } else if (i7 == 14) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746610, null));
        } else if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746606, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131752584, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746623, null));
        } else if (i7 == 8) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746564, null));
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746621, null));
        } else if (i7 == 10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746616, null));
        } else if (i7 == 11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746666, null));
        } else if (i7 == 12) {
            this.simpleActionBar.setTitle(org.telegram.messenger.gd.N0(2131746635, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new hs0(this, 2));
        this.simpleActionBar.t();
        org.telegram.ui.ActionBar.c5 s5 = this.simpleActionBar.s(org.telegram.messenger.gd.N0(2131745750, null));
        this.f43499b = s5;
        s5.a(J0(), false);
        this.f43497a = new kt0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.ek0 ek0Var = new org.telegram.ui.Components.ek0(context, null);
        this.f43501c = ek0Var;
        ek0Var.r1();
        this.f43501c.setLayoutManager(new v4.c0(1, false));
        this.f43501c.setSectionsDrawBackground(true);
        this.f43501c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.f43501c.getItemAnimator()).C = false;
        frameLayout.addView(this.f43501c, c8.ma.c(-1.0f, -1));
        if (this.d != null) {
            hi.l3 l3Var = new hi.l3(context, 1);
            l3Var.r(true);
            l3Var.h = org.telegram.messenger.g0.L(250.0f);
            l3Var.d = -1L;
            l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
            l3Var.U = false;
            this.f43504e = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
            this.f43504e.l(getBaseSimpleGlass().f56657c);
            frameLayout.addView(this.f43504e, c8.ma.e(-1, 150, 55));
            this.f43501c.j(new g3(this, 26));
        }
        this.f43501c.setAdapter(this.f43497a);
        this.f43501c.setOnItemClickListener(new h(this, 26));
        gt0 gt0Var = new gt0(this);
        gt0Var.n(350L);
        gt0Var.o(org.telegram.ui.Components.nr.h);
        gt0Var.C = false;
        this.f43501c.setItemAnimator(gt0Var);
        L0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        lt0 lt0Var;
        if (i7 == org.telegram.messenger.ks.f25167k0) {
            H0();
        } else if (i7 == org.telegram.messenger.ks.f25176l4) {
            this.f43501c.g1();
        } else if (i7 == org.telegram.messenger.ks.C4 && (lt0Var = this.d) != null) {
            lt0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.ek0 getListViewForSimpleGlass() {
        return this.f43501c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29404ee));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29493jc));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f43501c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29402ec));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return G0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        H0();
        Q0(false);
        org.telegram.messenger.ks.f(this.currentAccount).c(this, org.telegram.messenger.ks.f25167k0);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25176l4);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ks.f(this.currentAccount).n(this, org.telegram.messenger.ks.f25167k0);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.C4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25176l4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.x30 x30Var = this.f43524u0;
        if (x30Var != null) {
            x30Var.i();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        Q0(false);
        org.telegram.ui.Components.x30 x30Var = this.f43524u0;
        if (x30Var != null) {
            x30Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            lt0 lt0Var = this.d;
            if (lt0Var != null) {
                lt0Var.invalidate();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }

    @Override
    public final boolean x() {
        return false;
    }

    public PrivacyControlActivity(int i7) {
        this(i7, false);
    }

    @Override
    public final void I(float f10) {
    }

    @Override
    public final void U() {
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
    }
}
