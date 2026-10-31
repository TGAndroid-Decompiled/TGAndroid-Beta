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
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40 {
    public boolean A0;
    public boolean B0;
    public boolean C0;
    public final boolean[] D;
    public boolean D0;
    public final boolean[] E;
    public boolean E0;
    public ArrayList F;
    public boolean F0;
    public ArrayList G;
    public boolean G0;
    public int H;
    public boolean H0;
    public int I;
    public boolean I0;
    public long J;
    public boolean J0;
    public long K;
    public boolean K0;
    public int L;
    public boolean L0;
    public int M;
    public boolean M0;
    public int N;
    public int N0;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public su0 f33724a;
    public int f33725a0;
    public org.telegram.ui.ActionBar.l5 f33726b;
    public int f33727b0;
    public org.telegram.ui.Components.tk0 f33728c;
    public int f33729c0;
    private int currentPhotoForRestRow;
    public tu0 d;
    public int f33730d0;
    public int e;
    public int f33731e0;
    private int everybodyRow;
    public int f33732f;
    public int f33733f0;
    public int f33734g0;
    private int giftTypesHeaderRow;
    public final ArrayList h;
    public int f33735h0;
    public int f33736i0;
    public int f33737j0;
    public int f33738k0;
    public int f33739l0;
    public int m0;
    public final ArrayList f33740n;
    public int f33741n0;
    private int nobodyRow;
    public int f33742o0;
    public int f33743p0;
    private int photoForRestRow;
    private int priceRow;
    public int f33744q0;
    public final boolean[] f33745r;
    public final org.telegram.ui.Components.b40 f33746r0;
    private int readRow;
    public final boolean[] f33747s;
    public org.telegram.ui.Components.bi0 f33748s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public org.telegram.ui.Cells.p8 f33749t0;
    public org.telegram.ui.Components.g9 f33750u0;
    public ls f33751v0;
    public final boolean[] f33752w;
    public TLRPC.PhotoSize f33753w0;
    public final int f33754x;
    public TLRPC.Photo f33755x0;
    public final boolean[] f33756y;
    public SpannableString f33757y0;
    public boolean f33758z0;

    public PrivacyControlActivity(int i10, boolean z10) {
        super(null);
        TLRPC.PhotoSize w9;
        this.h = new ArrayList();
        this.f33740n = new ArrayList();
        this.f33745r = new boolean[4];
        this.f33747s = new boolean[4];
        this.f33752w = new boolean[4];
        this.f33756y = new boolean[4];
        this.D = new boolean[4];
        this.E = new boolean[4];
        this.K = 10L;
        this.N0 = 4;
        this.f33754x = i10;
        if (z10) {
            org.telegram.messenger.i5.r(this.currentAccount).D(false);
        }
        if (i10 == 4) {
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(0, true, true);
            this.f33746r0 = b40Var;
            b40Var.f24523a = this;
            b40Var.f24524b = this;
            TLRPC.UserFull a2 = getMessagesController().a2(getUserConfig().f15165n);
            if (!org.telegram.messenger.h20.q(a2) || (w9 = org.telegram.messenger.b8.w(a2.fallback_photo.sizes, 1000, false, null, false)) == null) {
                return;
            }
            this.f33753w0 = w9;
            this.f33755x0 = a2.fallback_photo;
        }
    }

    public static void Y(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f33753w0 = null;
        privacyControlActivity.f33755x0 = null;
        TLRPC.UserFull a2 = privacyControlActivity.getMessagesController().a2(privacyControlActivity.getUserConfig().f15165n);
        if (a2 != null && (photo = a2.fallback_photo) != null) {
            a2.flags &= -4194305;
            a2.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().j2(a2, true);
            privacyControlActivity.H0();
            privacyControlActivity.J0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f19812id = photo.f19817id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).l0(tL_inputPhoto);
            org.telegram.messenger.zs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.zs.f19590c0, new Object[0]);
        }
    }

    public static void Z(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).V3(privacyrules.users, false);
            org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).P3(privacyrules.chats, false);
            org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(13, privacyrules.rules);
            org.telegram.messenger.i0.g3(new et0(4, privacyControlActivity, zArr));
            return;
        }
        privacyControlActivity.F0();
    }

    public static void a0(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull a2 = privacyControlActivity.getMessagesController().a2(privacyControlActivity.getUserConfig().f15165n);
            a2.flags |= 4194304;
            a2.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().j2(a2, true);
            org.telegram.messenger.zs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.zs.f19590c0, new Object[0]);
            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w9 != null && privacyControlActivity.f33753w0 != null) {
                org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
                File K = org.telegram.messenger.b8.K(w9, null, true, true);
                org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.b8.K(privacyControlActivity.f33753w0, null, true, true).renameTo(K);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f33753w0.location.volume_id);
                sb2.append("_");
                String p5 = a1.g.p(sb2, privacyControlActivity.f33753w0.location.local_id, "@50_50");
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w9.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.hc.D().S(p5, a1.g.p(sb3, w9.location.local_id, "@50_50"), org.telegram.messenger.ic.e(w9.location));
            }
            if (w10 != null && privacyControlActivity.f33753w0 != null) {
                org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
                File K2 = org.telegram.messenger.b8.K(w10, null, true, true);
                org.telegram.messenger.b8.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.b8.K(privacyControlActivity.f33753w0.location, null, true, true).renameTo(K2);
            }
        }
    }

    public static void b0(PrivacyControlActivity privacyControlActivity, View view, final int i10) {
        ArrayList arrayList;
        String str;
        int i11;
        final boolean z10;
        boolean z11;
        char c10;
        int i12;
        int i13 = privacyControlActivity.f33754x;
        if (i10 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.x1 x1Var = org.telegram.ui.Components.s4.N(privacyControlActivity.getParentActivity(), org.telegram.messenger.cd.L0(2131746304, null), org.telegram.messenger.cd.L0(2131746305, null), org.telegram.messenger.cd.L0(2131746336, null), new gu0(privacyControlActivity, 1), null).f20134a;
            x1Var.show();
            x1Var.i();
            return;
        }
        int i14 = 0;
        r8 = false;
        boolean z12 = false;
        int i15 = 0;
        if (i10 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.b40 b40Var = privacyControlActivity.f33746r0;
            if (b40Var != null) {
                b40Var.n(false, new ag.f3(13), new q5(privacyControlActivity, 12), 0);
                privacyControlActivity.f33748s0.M(0);
                privacyControlActivity.f33748s0.P(43);
                privacyControlActivity.f33749t0.e.d();
                return;
            }
            return;
        }
        org.telegram.messenger.t2 t2Var = org.telegram.messenger.t2.APP_ERROR;
        if (i13 == 10 && i10 == privacyControlActivity.N && !privacyControlActivity.getMessagesController().K5 && !privacyControlActivity.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(privacyControlActivity).L(2131624214, org.telegram.messenger.cd.L0(2131747787, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747788, null)), org.telegram.messenger.cd.L0(2131747789, null), new gu0(privacyControlActivity, 2)).j();
            t2Var.a();
            int i16 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i16;
            org.telegram.messenger.i0.F3(i16, view, null);
        } else if (i13 == 8 && ((i10 == privacyControlActivity.N || i10 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().q())) {
            org.telegram.ui.Components.cc.a0(privacyControlActivity).L(2131624214, org.telegram.messenger.cd.L0(2131747787, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747788, null)), org.telegram.messenger.cd.L0(2131747789, null), new gu0(privacyControlActivity, 3)).j();
            t2Var.a();
            int i17 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i17;
            org.telegram.messenger.i0.F3(i17, view, null);
        } else if (i10 != privacyControlActivity.nobodyRow && i10 != privacyControlActivity.everybodyRow && i10 != privacyControlActivity.N && i10 != privacyControlActivity.f33733f0) {
            if (i10 != privacyControlActivity.W && i10 != privacyControlActivity.V) {
                if (i10 != privacyControlActivity.S && i10 != privacyControlActivity.R) {
                    if (i10 == privacyControlActivity.f33725a0) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i10 == privacyControlActivity.readRow) {
                        privacyControlActivity.A0 = !privacyControlActivity.A0;
                        privacyControlActivity.I0();
                        ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.A0);
                        return;
                    } else if (i10 == privacyControlActivity.f33730d0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i10 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.C0 = !privacyControlActivity.C0;
                        privacyControlActivity.I0();
                        ((org.telegram.ui.Cells.t8) view).setChecked(privacyControlActivity.C0);
                        return;
                    } else if (i10 == privacyControlActivity.f33739l0) {
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                            int i18 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i18;
                            org.telegram.messenger.i0.F3(i18, view, null);
                            privacyControlActivity.G0();
                            return;
                        }
                        boolean y02 = privacyControlActivity.y0();
                        privacyControlActivity.G0 = !privacyControlActivity.G0;
                        privacyControlActivity.I0();
                        org.telegram.ui.Cells.t8 t8Var = (org.telegram.ui.Cells.t8) view;
                        t8Var.setChecked(privacyControlActivity.G0);
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                            t8Var.setCheckBoxIcon(2131232512);
                        }
                        if (y02 != privacyControlActivity.y0()) {
                            privacyControlActivity.J0(true);
                            org.telegram.messenger.i0.a4(privacyControlActivity.f33728c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f33738k0) {
                        if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().q()) {
                            int i19 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i19;
                            org.telegram.messenger.i0.F3(i19, view, null);
                            privacyControlActivity.G0();
                            return;
                        }
                        boolean y03 = privacyControlActivity.y0();
                        privacyControlActivity.E0 = !privacyControlActivity.E0;
                        privacyControlActivity.I0();
                        org.telegram.ui.Cells.t8 t8Var2 = (org.telegram.ui.Cells.t8) view;
                        t8Var2.setChecked(privacyControlActivity.E0);
                        if (privacyControlActivity.E0 && !privacyControlActivity.getUserConfig().q()) {
                            t8Var2.setCheckBoxIcon(2131232512);
                        }
                        if (y03 != privacyControlActivity.y0()) {
                            privacyControlActivity.J0(true);
                            org.telegram.messenger.i0.a4(privacyControlActivity.f33728c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.m0) {
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                            int i20 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i20;
                            org.telegram.messenger.i0.F3(i20, view, null);
                            privacyControlActivity.G0();
                            return;
                        }
                        boolean y04 = privacyControlActivity.y0();
                        privacyControlActivity.I0 = !privacyControlActivity.I0;
                        privacyControlActivity.I0();
                        org.telegram.ui.Cells.t8 t8Var3 = (org.telegram.ui.Cells.t8) view;
                        t8Var3.setChecked(privacyControlActivity.I0);
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                            t8Var3.setCheckBoxIcon(2131232512);
                        }
                        if (y04 != privacyControlActivity.y0()) {
                            privacyControlActivity.J0(true);
                            org.telegram.messenger.i0.a4(privacyControlActivity.f33728c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f33741n0) {
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                            int i21 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i21;
                            org.telegram.messenger.i0.F3(i21, view, null);
                            privacyControlActivity.G0();
                            return;
                        }
                        boolean y05 = privacyControlActivity.y0();
                        privacyControlActivity.K0 = !privacyControlActivity.K0;
                        privacyControlActivity.I0();
                        org.telegram.ui.Cells.t8 t8Var4 = (org.telegram.ui.Cells.t8) view;
                        t8Var4.setChecked(privacyControlActivity.K0);
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                            t8Var4.setCheckBoxIcon(2131232512);
                        }
                        if (y05 != privacyControlActivity.y0()) {
                            privacyControlActivity.J0(true);
                            org.telegram.messenger.i0.a4(privacyControlActivity.f33728c);
                            return;
                        }
                        return;
                    } else if (i10 == privacyControlActivity.f33742o0) {
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                            int i22 = -privacyControlActivity.N0;
                            privacyControlActivity.N0 = i22;
                            org.telegram.messenger.i0.F3(i22, view, null);
                            privacyControlActivity.G0();
                            return;
                        }
                        boolean y06 = privacyControlActivity.y0();
                        privacyControlActivity.M0 = !privacyControlActivity.M0;
                        privacyControlActivity.I0();
                        org.telegram.ui.Cells.t8 t8Var5 = (org.telegram.ui.Cells.t8) view;
                        t8Var5.setChecked(privacyControlActivity.M0);
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                            t8Var5.setCheckBoxIcon(2131232512);
                        }
                        if (y06 != privacyControlActivity.y0()) {
                            privacyControlActivity.J0(true);
                            org.telegram.messenger.i0.a4(privacyControlActivity.f33728c);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i13 == 12 && privacyControlActivity.y0()) {
                    int i23 = -privacyControlActivity.N0;
                    privacyControlActivity.N0 = i23;
                    org.telegram.messenger.i0.F3(i23, view, null);
                    return;
                } else {
                    if (i10 == privacyControlActivity.S) {
                        arrayList = privacyControlActivity.G;
                    } else {
                        arrayList = privacyControlActivity.F;
                    }
                    Bundle bundle = new Bundle();
                    if (i10 == privacyControlActivity.S) {
                        str = "isNeverShare";
                    } else {
                        str = "isAlwaysShare";
                    }
                    bundle.putBoolean(str, true);
                    if (i13 != 0) {
                        i11 = 1;
                    } else {
                        i11 = 0;
                    }
                    bundle.putInt("chatAddType", i11);
                    if (i10 == privacyControlActivity.R && i13 == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (i13 == 12 && ((i12 = privacyControlActivity.H) != 1 ? !(i12 != 2 ? i12 != 0 || i10 != privacyControlActivity.S : i10 != privacyControlActivity.R) : i10 == privacyControlActivity.R)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    bundle.putBoolean("allowMiniapps", z10);
                    v50 v50Var = new v50(bundle);
                    if (i13 == 10) {
                        v50Var.L = org.telegram.messenger.cd.L0(2131746306, null);
                    }
                    if (i10 == privacyControlActivity.R) {
                        boolean[] zArr = privacyControlActivity.f33756y;
                        if (privacyControlActivity.H == 2) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (zArr[c10]) {
                            z11 = true;
                            if (z10 && privacyControlActivity.D[privacyControlActivity.H]) {
                                z12 = true;
                            }
                            v50Var.t0(arrayList, z11, z12);
                            v50Var.f42633x = new r50() {
                                @Override
                                public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                                    char c11;
                                    PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                                    boolean[] zArr2 = privacyControlActivity2.D;
                                    int i24 = privacyControlActivity2.S;
                                    int i25 = i10;
                                    boolean z15 = z10;
                                    int i26 = 0;
                                    boolean z16 = true;
                                    if (i25 == i24) {
                                        privacyControlActivity2.G = arrayList2;
                                        int i27 = privacyControlActivity2.H;
                                        if (!z15 || !z14) {
                                            z16 = false;
                                        }
                                        zArr2[i27] = z16;
                                        while (i26 < privacyControlActivity2.G.size()) {
                                            privacyControlActivity2.F.remove(privacyControlActivity2.G.get(i26));
                                            i26++;
                                        }
                                    } else {
                                        boolean[] zArr3 = privacyControlActivity2.f33756y;
                                        int i28 = privacyControlActivity2.H;
                                        if (i28 == 2) {
                                            c11 = 0;
                                        } else {
                                            c11 = 1;
                                        }
                                        zArr3[c11] = z13;
                                        if (!z15 || !z14) {
                                            z16 = false;
                                        }
                                        zArr2[i28] = z16;
                                        privacyControlActivity2.F = arrayList2;
                                        while (i26 < privacyControlActivity2.F.size()) {
                                            privacyControlActivity2.G.remove(privacyControlActivity2.F.get(i26));
                                            i26++;
                                        }
                                    }
                                    privacyControlActivity2.I0();
                                    privacyControlActivity2.f33724a.f();
                                }
                            };
                            v50Var.f42612e0 = true;
                            privacyControlActivity.presentFragment(v50Var);
                            return;
                        }
                    }
                    z11 = false;
                    if (z10) {
                        z12 = true;
                    }
                    v50Var.t0(arrayList, z11, z12);
                    v50Var.f42633x = new r50() {
                        @Override
                        public final void a(ArrayList arrayList2, boolean z13, boolean z14) {
                            char c11;
                            PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                            boolean[] zArr2 = privacyControlActivity2.D;
                            int i24 = privacyControlActivity2.S;
                            int i25 = i10;
                            boolean z15 = z10;
                            int i26 = 0;
                            boolean z16 = true;
                            if (i25 == i24) {
                                privacyControlActivity2.G = arrayList2;
                                int i27 = privacyControlActivity2.H;
                                if (!z15 || !z14) {
                                    z16 = false;
                                }
                                zArr2[i27] = z16;
                                while (i26 < privacyControlActivity2.G.size()) {
                                    privacyControlActivity2.F.remove(privacyControlActivity2.G.get(i26));
                                    i26++;
                                }
                            } else {
                                boolean[] zArr3 = privacyControlActivity2.f33756y;
                                int i28 = privacyControlActivity2.H;
                                if (i28 == 2) {
                                    c11 = 0;
                                } else {
                                    c11 = 1;
                                }
                                zArr3[c11] = z13;
                                if (!z15 || !z14) {
                                    z16 = false;
                                }
                                zArr2[i28] = z16;
                                privacyControlActivity2.F = arrayList2;
                                while (i26 < privacyControlActivity2.F.size()) {
                                    privacyControlActivity2.G.remove(privacyControlActivity2.F.get(i26));
                                    i26++;
                                }
                            }
                            privacyControlActivity2.I0();
                            privacyControlActivity2.f33724a.f();
                        }
                    };
                    v50Var.f42612e0 = true;
                    privacyControlActivity.presentFragment(v50Var);
                    return;
                }
            }
            if (i10 != privacyControlActivity.V) {
                i15 = 1;
            }
            if (i15 != privacyControlActivity.I) {
                privacyControlActivity.I = i15;
                privacyControlActivity.I0();
                privacyControlActivity.J0(true);
            }
        } else if (i13 == 12 && privacyControlActivity.y0()) {
            int i24 = -privacyControlActivity.N0;
            privacyControlActivity.N0 = i24;
            org.telegram.messenger.i0.F3(i24, view, null);
        } else {
            if (i10 == privacyControlActivity.nobodyRow) {
                i14 = 1;
            } else if (i10 != privacyControlActivity.everybodyRow) {
                if (i10 == privacyControlActivity.f33733f0) {
                    i14 = 3;
                } else {
                    i14 = 2;
                }
            }
            if (i14 == privacyControlActivity.H) {
                return;
            }
            privacyControlActivity.H = i14;
            org.telegram.ui.Components.wb.e();
            privacyControlActivity.I0();
            privacyControlActivity.J0(true);
        }
    }

    public static void c0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(7, ((TL_account.privacyRules) tLObject).rules);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.B0();
                return;
            }
            return;
        }
        org.telegram.ui.Components.cc.a0(privacyControlActivity).f0(tL_error, false);
    }

    public static void d0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).V3(privacyrules.users, false);
            org.telegram.messenger.vp.r1(privacyControlActivity.currentAccount).P3(privacyrules.chats, false);
            org.telegram.messenger.i5.r(privacyControlActivity.currentAccount).M(privacyControlActivity.f33754x, privacyrules.rules);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.B0();
                return;
            }
            return;
        }
        privacyControlActivity.F0();
    }

    public static org.telegram.ui.ActionBar.p6 w0(PrivacyControlActivity privacyControlActivity) {
        return privacyControlActivity.resourceProvider;
    }

    public final void A0() {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z14;
        int i10;
        char c10;
        boolean z15;
        boolean[] zArr;
        ArrayList arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.h;
        int i11 = 2;
        int i12 = this.f33754x;
        if (i12 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.i5.r(this.currentAccount).X;
            i11 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.H = i11;
            this.e = i11;
            this.G = new ArrayList();
            this.F = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long k10 = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().J6, 1L);
                this.K = k10;
                this.J = k10;
                this.H = 3;
                this.e = 3;
            } else {
                this.K = 10L;
                this.J = 10L;
            }
            ArrayList v = org.telegram.messenger.i5.r(this.currentAccount).v(13);
            this.F = new ArrayList();
            if (v != null) {
                for (int i13 = 0; i13 < v.size(); i13++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i13);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i14 = 0;
                        while (i14 < size) {
                            i14 = c3.i0.k(i14, 1, -tL_privacyValueAllowChatParticipants.chats.get(i14).longValue(), this.F);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.F.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.F);
            return;
        }
        if (i12 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean[] zArr4 = this.f33745r;
        zArr4[0] = z10;
        boolean[] zArr5 = this.f33756y;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.f33747s;
        zArr6[0] = false;
        boolean[] zArr7 = this.D;
        zArr7[0] = false;
        if (i12 == 12) {
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
        boolean[] zArr8 = this.f33752w;
        zArr8[0] = false;
        boolean[] zArr9 = this.E;
        zArr9[0] = false;
        if (i12 == 12) {
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
        this.F = new ArrayList();
        this.G = new ArrayList();
        ArrayList v10 = org.telegram.messenger.i5.r(this.currentAccount).v(i12);
        if (v10 != null && v10.size() != 0) {
            Boolean bool2 = null;
            int i15 = 0;
            boolean z16 = false;
            boolean z17 = false;
            char c11 = 65535;
            while (i15 < v10.size()) {
                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) v10.get(i15);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i16 = 0;
                    while (i16 < size2) {
                        i16 = c3.i0.k(i16, 1, -tL_privacyValueAllowChatParticipants2.chats.get(i16).longValue(), this.F);
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
                        int i17 = 0;
                        for (int size3 = tL_privacyValueDisallowChatParticipants.chats.size(); i17 < size3; size3 = size3) {
                            i17 = c3.i0.k(i17, 1, -tL_privacyValueDisallowChatParticipants.chats.get(i17).longValue(), this.G);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.F.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.G.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
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
                        i15++;
                        zArr5 = zArr3;
                        zArr6 = zArr;
                        v10 = arrayList;
                        zArr4 = zArr2;
                    }
                }
                zArr3 = zArr5;
                i15++;
                zArr5 = zArr3;
                zArr6 = zArr;
                v10 = arrayList;
                zArr4 = zArr2;
            }
            boolean[] zArr10 = zArr6;
            boolean[] zArr11 = zArr4;
            boolean[] zArr12 = zArr5;
            if (c11 == 0 || (c11 == 65535 && (this.G.size() > 0 || (bool2 != null && !bool2.booleanValue())))) {
                i10 = 2;
                this.H = 0;
            } else {
                i10 = 2;
                if (c11 != 2) {
                    if (c11 == 65535 && this.G.size() > 0 && this.F.size() > 0) {
                        i10 = 2;
                    } else {
                        int i18 = 1;
                        if (c11 != 1) {
                            if (c11 == 65535 && (this.F.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                i18 = 1;
                            }
                            i10 = 2;
                        }
                        this.H = i18;
                        i10 = 2;
                    }
                }
                this.H = i10;
            }
            int i19 = this.H;
            if (i19 == i10) {
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
            zArr10[i19] = z15;
            zArr7[i19] = z15;
            zArr8[i19] = false;
            zArr9[i19] = false;
            org.telegram.ui.ActionBar.l5 l5Var = this.f33726b;
            if (l5Var != null) {
                l5Var.a(false, false);
            }
        } else {
            this.H = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f33740n;
        arrayList3.clear();
        this.e = this.H;
        arrayList2.addAll(this.F);
        arrayList3.addAll(this.G);
        if (i12 == 6) {
            ArrayList v11 = org.telegram.messenger.i5.r(this.currentAccount).v(7);
            if (v11 != null && v11.size() != 0) {
                int i20 = 0;
                while (true) {
                    if (i20 >= v11.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = (TLRPC.PrivacyRule) v11.get(i20);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.I = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.I = 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.I = 1;
                        break;
                    } else {
                        i20++;
                    }
                }
            } else {
                this.I = 0;
            }
            this.f33732f = this.I;
        }
        if (i12 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().X;
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f33758z0 = z14;
            this.A0 = z14;
        }
        if (i12 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().X;
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.B0 = z13;
            this.C0 = z13;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z20 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.E0 = z20;
                this.D0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.G0 = z21;
                this.F0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.I0 = z22;
                this.H0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.K0 = z23;
                this.J0 = z23;
                boolean z24 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.M0 = z24;
                this.L0 = z24;
            } else {
                this.E0 = true;
                this.D0 = true;
                this.G0 = true;
                this.F0 = true;
                this.I0 = true;
                this.H0 = true;
                this.K0 = true;
                this.J0 = true;
                this.M0 = true;
                this.L0 = true;
            }
        }
        J0(false);
        org.telegram.messenger.i0.a4(this.f33728c);
    }

    public final void B0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        int i10;
        int i11;
        this.f33726b.b(false);
        int i12 = this.f33754x;
        if ((i12 == 10 || i12 == 1 || i12 == 2) && this.H != 0 && (globalPrivacySettings = org.telegram.messenger.i5.r(this.currentAccount).X) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i13 = 0; i13 < 2; i13++) {
                int i14 = iArr[i13];
                ArrayList v = org.telegram.messenger.i5.r(this.currentAccount).v(i14);
                if (i14 != i12) {
                    if (v != null) {
                        int size = v.size();
                        int i15 = 0;
                        while (i15 < size) {
                            Object obj = v.get(i15);
                            i15++;
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
                        if (i14 == 1) {
                            i10 = 2131752147;
                        } else {
                            i10 = 2131752149;
                        }
                        String L0 = org.telegram.messenger.cd.L0(i10, null);
                        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                        x1Var.R = L0;
                        if (i14 == 1) {
                            i11 = 2131752148;
                        } else {
                            i11 = 2131752150;
                        }
                        x1Var.T = org.telegram.messenger.cd.L0(i11, null);
                        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752146, null), new i2.q(this, i14, 18));
                        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new ku0(this, 1));
                        alertDialog$Builder.p();
                        return;
                    }
                }
            }
        }
        finishFragment();
    }

    public final boolean C0() {
        char c10;
        char c11;
        ArrayList arrayList;
        int i10 = this.f33754x;
        if (i10 == 0 && ((this.H != 0 || ((arrayList = this.G) != null && !arrayList.isEmpty())) && this.f33758z0 != this.A0)) {
            return true;
        }
        if (i10 == 12 && (this.B0 != this.C0 || this.F0 != this.G0 || this.D0 != this.E0 || this.H0 != this.I0 || this.J0 != this.K0 || this.L0 != this.M0)) {
            return true;
        }
        int i11 = this.e;
        int i12 = this.H;
        if (i11 != i12) {
            return true;
        }
        if (i10 == 6 && i12 == 1 && this.f33732f != this.I) {
            return true;
        }
        if (i12 != 0) {
            if (i12 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            boolean z10 = this.f33745r[c10];
            if (i12 == 2) {
                c11 = 0;
            } else {
                c11 = 1;
            }
            if (z10 != this.f33756y[c11]) {
                return true;
            }
        }
        if ((i10 == 10 && i12 == 3 && this.K != this.J) || this.f33747s[i12] != this.D[i12]) {
            return true;
        }
        ArrayList arrayList2 = this.f33740n;
        if (arrayList2.size() != this.G.size()) {
            return true;
        }
        ArrayList arrayList3 = this.h;
        if (arrayList3.size() != this.F.size()) {
            return true;
        }
        if (i10 != 10 || this.H == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.F);
            if (!arrayList3.equals(this.F)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.G);
            if (!arrayList2.equals(this.G)) {
                return true;
            }
        }
        return false;
    }

    public final void D0() {
        if (getParentActivity() == null) {
            return;
        }
        int i10 = this.f33754x;
        if (i10 == 10 && this.H == 3 && !getUserConfig().q()) {
            showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) this, 27, true));
            return;
        }
        if (this.H != 0 && i10 == 0 && !getUserConfig().q()) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                if (i10 == 1) {
                    x1Var.T = org.telegram.messenger.cd.L0(2131742907, null);
                } else {
                    x1Var.T = org.telegram.messenger.cd.L0(2131751686, null);
                }
                x1Var.R = org.telegram.messenger.cd.L0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new ep0(7, this, d12));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                showDialog(x1Var);
                return;
            }
        }
        x0();
    }

    public final void E0() {
        tu0 tu0Var = this.d;
        if (tu0Var != null) {
            tu0Var.f41947f.f16337k.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i10 = this.H;
            if (i10 == 0) {
                this.d.e.setOverrideText(org.telegram.messenger.cd.L0(2131746850, null));
                this.d.f41947f.f16337k.fwd_from.from_id.user_id = 1L;
            } else if (i10 == 1) {
                this.d.e.setOverrideText(org.telegram.messenger.cd.L0(2131746846, null));
                this.d.f41947f.f16337k.fwd_from.from_id.user_id = 0L;
            } else {
                this.d.e.setOverrideText(org.telegram.messenger.cd.L0(2131746851, null));
                this.d.f41947f.f16337k.fwd_from.from_id.user_id = 1L;
            }
            this.d.f41945b.E1();
        }
    }

    public final void F0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131746853, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        showDialog(x1Var);
    }

    public final void G0() {
        org.telegram.ui.Components.cc.a0(this).L(2131624214, org.telegram.messenger.cd.L0(2131747787, null), org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131747788, null)), org.telegram.messenger.cd.L0(2131747789, null), new gu0(this, 0)).j();
    }

    public final void H0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.p8 p8Var = this.f33749t0;
        if (p8Var != null) {
            if (this.f33753w0 == null) {
                p8Var.getTextView().k(org.telegram.messenger.cd.a0("SetPhotoForRest", null, 2131745534, new Object[0]));
                this.f33749t0.setNeedDivider(false);
            } else {
                p8Var.getTextView().k(org.telegram.messenger.cd.a0("UpdatePhotoForRest", null, 2131743843, new Object[0]));
                this.f33749t0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.g9 g9Var = this.f33750u0;
        if (g9Var != null && (photoSize = this.f33753w0) != null) {
            TLRPC.Photo photo = this.f33755x0;
            if (photo != null) {
                g9Var.j(org.telegram.messenger.ic.i(photoSize, photo), "50_50", null, org.telegram.messenger.d20.i(this.currentAccount).f());
            } else {
                g9Var.j(org.telegram.messenger.ic.e(photoSize.location), "50_50", null, org.telegram.messenger.d20.i(this.currentAccount).f());
            }
        }
    }

    public final void I0() {
        this.f33726b.a(C0(), true);
    }

    public final void J0(boolean z10) {
        pu0 pu0Var;
        ArrayList arrayList;
        int i10;
        s4.c1 T;
        int i11;
        boolean z11;
        int i12;
        boolean z12;
        TLRPC.UserFull a2;
        if (z10) {
            pu0Var = new pu0(this);
            pu0Var.f(pu0Var.f40791c);
            pu0Var.f40790b = this.f33744q0;
        } else {
            pu0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.Y = -1;
        this.L = -1;
        this.setBirthdayRow = -1;
        this.X = -1;
        this.U = -1;
        this.V = -1;
        this.W = -1;
        this.R = -1;
        this.S = -1;
        this.Z = -1;
        this.f33725a0 = -1;
        this.O = -1;
        this.P = -1;
        this.f33727b0 = -1;
        this.f33729c0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.Q = -1;
        this.T = -1;
        this.f33733f0 = -1;
        this.f33734g0 = -1;
        this.priceRow = -1;
        this.f33736i0 = -1;
        this.f33735h0 = -1;
        this.f33730d0 = -1;
        this.f33731e0 = -1;
        this.showGiftIconRow = -1;
        this.f33737j0 = -1;
        this.giftTypesHeaderRow = -1;
        this.f33738k0 = -1;
        this.f33739l0 = -1;
        this.m0 = -1;
        this.f33741n0 = -1;
        this.f33742o0 = -1;
        this.f33743p0 = -1;
        this.f33744q0 = 0;
        int i13 = this.f33754x;
        if (i13 == 12) {
            this.showGiftIconRow = 0;
            this.f33744q0 = 2;
            this.f33737j0 = 1;
        }
        if (i13 == 11 && (a2 = getMessagesController().a2(getUserConfig().e())) != null && a2.birthday == null) {
            int i14 = this.f33744q0;
            this.f33744q0 = i14 + 1;
            this.setBirthdayRow = i14;
        }
        if (i13 == 5) {
            int i15 = this.f33744q0;
            this.f33744q0 = i15 + 1;
            this.L = i15;
        }
        int i16 = this.f33744q0;
        this.M = i16;
        this.everybodyRow = i16 + 1;
        int i17 = i16 + 3;
        this.f33744q0 = i17;
        this.N = i16 + 2;
        if (i13 == 4 || i13 == 9 || i13 == 14 || i13 == 0 || i13 == 2 || i13 == 3 || i13 == 5 || i13 == 6 || i13 == 8 || i13 == 1 || i13 == 11 || i13 == 12) {
            this.f33744q0 = i16 + 4;
            this.nobodyRow = i17;
        }
        if (getMessagesController().M6 && i13 == 10) {
            int i18 = this.f33744q0;
            this.f33744q0 = i18 + 1;
            this.f33733f0 = i18;
        }
        if (i13 == 6 && this.H == 1) {
            int i19 = this.f33744q0;
            this.X = i19;
            this.U = i19 + 1;
            this.V = i19 + 2;
            this.f33744q0 = i19 + 4;
            this.W = i19 + 3;
        }
        if (i13 == 10 && this.H == 3) {
            int i20 = this.f33744q0;
            this.f33744q0 = i20 + 1;
            this.P = i20;
        } else {
            int i21 = this.f33744q0;
            this.f33744q0 = i21 + 1;
            this.O = i21;
        }
        if (i13 == 10) {
            if (this.H == 3) {
                int i22 = this.f33744q0;
                this.f33734g0 = i22;
                this.f33744q0 = i22 + 2;
                this.priceRow = i22 + 1;
                if (!getUserConfig().q()) {
                    int i23 = this.f33744q0;
                    this.f33744q0 = i23 + 1;
                    this.f33735h0 = i23;
                }
                int i24 = this.f33744q0;
                this.f33744q0 = i24 + 1;
                this.f33736i0 = i24;
                if (getUserConfig().q()) {
                    int i25 = this.f33744q0;
                    this.Q = i25;
                    this.R = i25 + 1;
                    this.f33744q0 = i25 + 3;
                    this.T = i25 + 2;
                }
            }
        } else if (i13 != 8 || getUserConfig().q()) {
            int i26 = this.f33744q0;
            int i27 = i26 + 1;
            this.f33744q0 = i27;
            this.Q = i26;
            int i28 = this.H;
            if (i28 == 1 || i28 == 2) {
                this.f33744q0 = i26 + 2;
                this.R = i27;
            }
            if (i28 == 0 || i28 == 2) {
                int i29 = this.f33744q0;
                this.f33744q0 = i29 + 1;
                this.S = i29;
            }
            int i30 = this.f33744q0;
            int i31 = i30 + 1;
            this.f33744q0 = i31;
            this.T = i30;
            if (i13 == 2) {
                this.Z = i31;
                this.f33725a0 = i30 + 2;
                this.f33744q0 = i30 + 4;
                this.f33727b0 = i30 + 3;
            }
            if (i13 == 4 && (this.G.size() > 0 || (i10 = this.H) == 2 || i10 == 1)) {
                int i32 = this.f33744q0;
                int i33 = i32 + 1;
                this.f33744q0 = i33;
                this.photoForRestRow = i32;
                if (this.f33753w0 != null) {
                    this.f33744q0 = i32 + 2;
                    this.currentPhotoForRestRow = i33;
                }
                int i34 = this.f33744q0;
                this.f33744q0 = i34 + 1;
                this.Y = i34;
            }
            if (i13 == 0 && (this.H != 0 || ((arrayList = this.G) != null && !arrayList.isEmpty()))) {
                int i35 = this.f33744q0;
                this.readRow = i35;
                this.f33744q0 = i35 + 2;
                this.f33729c0 = i35 + 1;
            }
            if (i13 == 0 && !getMessagesController().A3()) {
                int i36 = this.f33744q0;
                this.f33730d0 = i36;
                this.f33744q0 = i36 + 2;
                this.f33731e0 = i36 + 1;
            }
        }
        if (i13 == 12) {
            int i37 = this.f33744q0;
            this.giftTypesHeaderRow = i37;
            this.f33739l0 = i37 + 1;
            this.f33738k0 = i37 + 2;
            this.m0 = i37 + 3;
            this.f33741n0 = i37 + 4;
            this.f33742o0 = i37 + 5;
            this.f33744q0 = i37 + 7;
            this.f33743p0 = i37 + 6;
        }
        E0();
        su0 su0Var = this.f33724a;
        if (su0Var != null) {
            if (z10) {
                int childCount = this.f33728c.getChildCount();
                for (int i38 = 0; i38 < childCount; i38++) {
                    View childAt = this.f33728c.getChildAt(i38);
                    if (childAt instanceof org.telegram.ui.Cells.m6) {
                        org.telegram.ui.Components.tk0 tk0Var = this.f33728c;
                        View F = tk0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = tk0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.m6 m6Var = (org.telegram.ui.Cells.m6) childAt;
                            int i39 = this.everybodyRow;
                            if (b10 != i39 && b10 != this.N && b10 != this.nobodyRow && b10 != this.f33733f0) {
                                if (b10 == this.W) {
                                    i12 = 1;
                                } else {
                                    i12 = 0;
                                }
                                if (this.I == i12) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                m6Var.a(z12, true);
                            } else {
                                if (b10 == i39) {
                                    i11 = 0;
                                } else if (b10 == this.N) {
                                    i11 = 2;
                                } else if (b10 == this.nobodyRow) {
                                    i11 = 1;
                                } else {
                                    i11 = 3;
                                }
                                if (this.H == i11) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                m6Var.a(z11, true);
                            }
                        }
                    }
                }
                pu0Var.f(pu0Var.d);
                s4.n.c(pu0Var, true).c(this.f33724a);
                org.telegram.messenger.i0.a4(this.f33728c);
                return;
            }
            su0Var.f();
        }
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f33753w0 = photoSize3;
                privacyControlActivity.f33755x0 = null;
                privacyControlActivity.H0();
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
                        int i10 = tL_photos_uploadProfilePhoto.flags;
                        tL_photos_uploadProfilePhoto.video_start_ts = d;
                        tL_photos_uploadProfilePhoto.flags = i10 | 6;
                    }
                    TLRPC.VideoSize videoSize2 = videoSize;
                    if (videoSize2 != null) {
                        tL_photos_uploadProfilePhoto.video_emoji_markup = videoSize2;
                        tL_photos_uploadProfilePhoto.flags |= 16;
                    }
                    tL_photos_uploadProfilePhoto.fallback = true;
                    tL_photos_uploadProfilePhoto.flags |= 8;
                    privacyControlActivity.getConnectionsManager().sendRequest(tL_photos_uploadProfilePhoto, new k(privacyControlActivity, 19));
                    TLRPC.TL_user tL_user = new TLRPC.TL_user();
                    TLRPC.TL_userProfilePhoto tL_userProfilePhoto = new TLRPC.TL_userProfilePhoto();
                    tL_user.photo = tL_userProfilePhoto;
                    tL_userProfilePhoto.photo_small = photoSize3.location;
                    tL_userProfilePhoto.photo_big = photoSize.location;
                    tL_user.first_name = privacyControlActivity.getUserConfig().f().first_name;
                    tL_user.last_name = privacyControlActivity.getUserConfig().f().last_name;
                    tL_user.access_hash = privacyControlActivity.getUserConfig().f().access_hash;
                    org.telegram.ui.Components.cc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), org.telegram.messenger.cd.L0(2131747281, null), null, null).j();
                }
                privacyControlActivity.J0(false);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20990gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21316yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21174qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21156pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21228tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21209sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21191rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21139ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21227ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21190ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21003h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20986g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return z0(true);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i10 = this.f33754x;
        if (i10 == 5) {
            ?? frameLayout = new FrameLayout(context);
            frameLayout.setWillNotDraw(false);
            frameLayout.setClipToPadding(false);
            frameLayout.d = org.telegram.ui.ActionBar.t6.Y0(context, 2131231231, org.telegram.ui.ActionBar.t6.f20892b7);
            frameLayout.setPadding(0, org.telegram.messenger.i0.L(11.0f), 0, org.telegram.messenger.i0.L(11.0f));
            TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(Long.valueOf(org.telegram.messenger.d20.i(this.currentAccount).e()));
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = org.telegram.messenger.cd.L0(2131746847, null);
            tL_message.date = ((int) (System.currentTimeMillis() / 1000)) - 3540;
            tL_message.dialog_id = 1L;
            tL_message.flags = 261;
            tL_message.from_id = new TLRPC.TL_peerUser();
            tL_message.f19814id = 1;
            TLRPC.TL_messageFwdHeader tL_messageFwdHeader = new TLRPC.TL_messageFwdHeader();
            tL_message.fwd_from = tL_messageFwdHeader;
            tL_messageFwdHeader.from_name = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.out = false;
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_message.peer_id = tL_peerUser;
            tL_peerUser.user_id = org.telegram.messenger.d20.i(this.currentAccount).e();
            org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(this.currentAccount, tL_message, true, false);
            frameLayout.f41947f = jjVar;
            jjVar.T = 1L;
            jjVar.Q1 = false;
            org.telegram.ui.Cells.q1 q1Var = new org.telegram.ui.Cells.q1(context, this.currentAccount);
            frameLayout.f41945b = q1Var;
            q1Var.setDelegate(new t7.u(15));
            q1Var.f22532d6 = false;
            q1Var.setFullyDraw(true);
            q1Var.s3(jjVar, null, false, false, false, false);
            frameLayout.addView(q1Var, w7.b6.o(-1, -2));
            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(1, context, null, true);
            frameLayout.e = q30Var;
            frameLayout.addView(q30Var, w7.b6.d(-2, -2.0f, 51, 19.0f, 0.0f, 19.0f, 0.0f));
            this.d = frameLayout;
        }
        this.simpleActionBar.setBackButtonImage(2131231241);
        if (i10 == 6) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746805, null));
        } else if (i10 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746852, null));
        } else if (i10 == 4) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746792, null));
        } else if (i10 == 9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746882, null));
        } else if (i10 == 14) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746819, null));
        } else if (i10 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746815, null));
        } else if (i10 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131752596, null));
        } else if (i10 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746832, null));
        } else if (i10 == 8) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746773, null));
        } else if (i10 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746830, null));
        } else if (i10 == 10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746825, null));
        } else if (i10 == 11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746875, null));
        } else if (i10 == 12) {
            this.simpleActionBar.setTitle(org.telegram.messenger.cd.L0(2131746844, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new t60(this, 20));
        this.simpleActionBar.o();
        org.telegram.ui.ActionBar.l5 n10 = this.simpleActionBar.n(org.telegram.messenger.cd.L0(2131745963, null));
        this.f33726b = n10;
        n10.a(C0(), false);
        this.f33724a = new su0(this, context);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.fragmentView = frameLayout2;
        org.telegram.ui.Components.tk0 tk0Var = new org.telegram.ui.Components.tk0(context, null);
        this.f33728c = tk0Var;
        tk0Var.r1();
        this.f33728c.setLayoutManager(new s4.a0(1, false));
        this.f33728c.setSectionsDrawBackground(true);
        this.f33728c.setVerticalScrollBarEnabled(false);
        ((s4.j) this.f33728c.getItemAnimator()).C = false;
        frameLayout2.addView(this.f33728c, w7.b6.c(-1.0f, -1));
        this.f33728c.setAdapter(this.f33724a);
        this.f33728c.setOnItemClickListener(new g(this, 26));
        ou0 ou0Var = new ou0(this);
        ou0Var.n(350L);
        ou0Var.o(org.telegram.ui.Components.gr.h);
        ou0Var.C = false;
        this.f33728c.setItemAnimator(ou0Var);
        E0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        tu0 tu0Var;
        if (i10 == org.telegram.messenger.zs.f19638k0) {
            A0();
        } else if (i10 == org.telegram.messenger.zs.f19630i4) {
            this.f33728c.g1();
        } else if (i10 == org.telegram.messenger.zs.f19735z4 && (tu0Var = this.d) != null) {
            tu0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final gs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.tk0 getListViewForSimpleGlass() {
        return this.f33728c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20899be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20918ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f33728c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20897bc));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        return z0(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        A0();
        J0(false);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19638k0);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19735z4);
        org.telegram.messenger.zs.e().c(this, org.telegram.messenger.zs.f19630i4);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19638k0);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19735z4);
        org.telegram.messenger.zs.e().n(this, org.telegram.messenger.zs.f19630i4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.b40 b40Var = this.f33746r0;
        if (b40Var != null) {
            b40Var.i();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        J0(false);
        org.telegram.ui.Components.b40 b40Var = this.f33746r0;
        if (b40Var != null) {
            b40Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            tu0 tu0Var = this.d;
            if (tu0Var != null) {
                tu0Var.invalidate();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
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

    public final void x0() {
        PrivacyControlActivity privacyControlActivity;
        char c10 = 0;
        boolean z10 = false;
        int i10 = this.f33754x;
        if (i10 == 10) {
            boolean[] zArr = {true};
            if (this.H == 3) {
                ArrayList arrayList = this.h;
                Collections.sort(arrayList);
                Collections.sort(this.F);
                if (!arrayList.equals(this.F)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.H != 0 && this.F.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i11 = 0; i11 < this.F.size(); i11++) {
                            Long l4 = (Long) this.F.get(i11);
                            long longValue = l4.longValue();
                            if (org.telegram.messenger.o5.E(longValue)) {
                                TLRPC.User Z1 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(l4);
                                if (Z1 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(org.telegram.messenger.vp.r1(this.currentAccount).p1(Z1));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new ul0(3, this, zArr));
                }
            }
            TL_account.setGlobalPrivacySettings setglobalprivacysettings = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings.settings = new TLRPC.TL_globalPrivacySettings();
            TLRPC.GlobalPrivacySettings globalPrivacySettings = getContactsController().X;
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
            int i12 = this.H;
            if (i12 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.K;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                if (i12 == 2) {
                    z10 = true;
                }
                globalPrivacySettings4.new_noncontact_peers_require_premium = z10;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new mb(this, zArr, globalPrivacySettings, setglobalprivacysettings));
            return;
        }
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i10 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.H == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.I == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f38035b;

                    {
                        this.f38035b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity2 = this.f38035b;
                                final AtomicInteger atomicInteger2 = atomicInteger;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.c0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                                return;
                                            default:
                                                PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                                return;
                                        }
                                    }
                                });
                                return;
                            default:
                                final PrivacyControlActivity privacyControlActivity3 = this.f38035b;
                                final AtomicInteger atomicInteger3 = atomicInteger;
                                org.telegram.messenger.i0.g3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r5) {
                                            case 0:
                                                PrivacyControlActivity.c0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                                return;
                                            default:
                                                PrivacyControlActivity.d0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                                return;
                                        }
                                    }
                                });
                                return;
                        }
                    }
                }, 2);
            }
        } else if (i10 == 5) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyForwards();
        } else if (i10 == 4) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyProfilePhoto();
        } else if (i10 == 9) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyAbout();
        } else if (i10 == 14) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeySavedMusic();
        } else if (i10 == 3) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneP2P();
        } else if (i10 == 2) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneCall();
        } else if (i10 == 1) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyChatInvite();
        } else if (i10 == 8) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyVoiceMessages();
        } else if (i10 == 11) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyBirthday();
        } else if (i10 == 12) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStarGiftsAutoSave();
        } else {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyStatusTimestamp();
        }
        if (this.H != 0 && this.F.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i13 = 0; i13 < this.F.size(); i13++) {
                Long l10 = (Long) this.F.get(i13);
                long longValue2 = l10.longValue();
                if (org.telegram.messenger.o5.E(longValue2)) {
                    TLRPC.User Z12 = org.telegram.messenger.vp.r1(this.currentAccount).Z1(l10);
                    if (Z12 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(org.telegram.messenger.vp.r1(this.currentAccount).p1(Z12));
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.H != 1 && this.G.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i14 = 0; i14 < this.G.size(); i14++) {
                Long l11 = (Long) this.G.get(i14);
                long longValue3 = l11.longValue();
                if (org.telegram.messenger.o5.E(longValue3)) {
                    TLRPC.User Z13 = getMessagesController().Z1(l11);
                    if (Z13 != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(getMessagesController().p1(Z13));
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i15 = this.H;
        if (i15 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i15 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i15 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i16 = this.H;
        if (i16 != 0) {
            if (i16 != 2) {
                c10 = 1;
            }
            if (this.f33756y[c10]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i17 = this.H;
        if (this.D[i17]) {
            if (i17 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f38035b;

            {
                this.f38035b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity2 = this.f38035b;
                        final AtomicInteger atomicInteger2 = atomicInteger;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.c0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                        return;
                                    default:
                                        PrivacyControlActivity.d0(privacyControlActivity2, tL_error, tLObject, atomicInteger2);
                                        return;
                                }
                            }
                        });
                        return;
                    default:
                        final PrivacyControlActivity privacyControlActivity3 = this.f38035b;
                        final AtomicInteger atomicInteger3 = atomicInteger;
                        org.telegram.messenger.i0.g3(new Runnable() {
                            @Override
                            public final void run() {
                                switch (r5) {
                                    case 0:
                                        PrivacyControlActivity.c0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                        return;
                                    default:
                                        PrivacyControlActivity.d0(privacyControlActivity3, tL_error, tLObject, atomicInteger3);
                                        return;
                                }
                            }
                        });
                        return;
                }
            }
        }, 2);
        if (i10 == 0 && this.A0 != this.f33758z0) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().X;
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.A0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            privacyControlActivity = this;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(privacyControlActivity) {
                public final PrivacyControlActivity f38352b;

                {
                    this.f38352b = privacyControlActivity;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity2 = this.f38352b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger2 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            boolean z11 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity3.f33758z0 = z11;
                                            globalPrivacySettings7.hide_read_marks = z11;
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity3.B0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z12 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z12 != setglobalprivacysettings4.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z13;
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
                                                privacyControlActivity4.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity4.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity4.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity4.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity4.L0 = !z18;
                                            }
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity3 = this.f38352b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity32 = privacyControlActivity3;
                                            privacyControlActivity32.getClass();
                                            boolean z11 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity32.f33758z0 = z11;
                                            globalPrivacySettings8.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity32.B0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity3;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z12 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z13;
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
                                                privacyControlActivity4.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z15;
                                                privacyControlActivity4.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z16;
                                                privacyControlActivity4.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity4.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z18;
                                                privacyControlActivity4.L0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
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
            privacyControlActivity = this;
        }
        if (i10 == 12 && (privacyControlActivity.C0 != privacyControlActivity.B0 || privacyControlActivity.G0 != privacyControlActivity.F0 || privacyControlActivity.E0 != privacyControlActivity.D0 || privacyControlActivity.I0 != privacyControlActivity.H0 || privacyControlActivity.M0 != privacyControlActivity.L0)) {
            atomicInteger.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings3.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = getContactsController().X;
            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = setglobalprivacysettings3.settings;
            globalPrivacySettings8.archive_and_mute_new_noncontact_peers = globalPrivacySettings7.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings8.keep_archived_folders = globalPrivacySettings7.keep_archived_folders;
            globalPrivacySettings8.keep_archived_unmuted = globalPrivacySettings7.keep_archived_unmuted;
            globalPrivacySettings8.new_noncontact_peers_require_premium = globalPrivacySettings7.new_noncontact_peers_require_premium;
            globalPrivacySettings8.noncontact_peers_paid_stars = globalPrivacySettings7.noncontact_peers_paid_stars;
            globalPrivacySettings8.hide_read_marks = globalPrivacySettings7.hide_read_marks;
            globalPrivacySettings8.display_gifts_button = privacyControlActivity.C0;
            if (getUserConfig().q()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !privacyControlActivity.E0;
                disallowedGiftsSettings.disallow_limited_stargifts = !privacyControlActivity.G0;
                disallowedGiftsSettings.disallow_unique_stargifts = !privacyControlActivity.I0;
                disallowedGiftsSettings.disallow_premium_gifts = !privacyControlActivity.M0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(privacyControlActivity) {
                public final PrivacyControlActivity f38352b;

                {
                    this.f38352b = privacyControlActivity;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity2 = this.f38352b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger2 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity32 = privacyControlActivity2;
                                            privacyControlActivity32.getClass();
                                            boolean z11 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity32.f33758z0 = z11;
                                            globalPrivacySettings72.hide_read_marks = z11;
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity32.B0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity2;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z12 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z13;
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
                                                privacyControlActivity4.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity4.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity4.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity4.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity4.L0 = !z18;
                                            }
                                            if (atomicInteger2.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
                                                return;
                                            }
                                            return;
                                    }
                                }
                            });
                            return;
                        default:
                            final PrivacyControlActivity privacyControlActivity3 = this.f38352b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.i0.g3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull a2;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity32 = privacyControlActivity3;
                                            privacyControlActivity32.getClass();
                                            boolean z11 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity32.f33758z0 = z11;
                                            globalPrivacySettings82.hide_read_marks = z11;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity32.B0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity4 = privacyControlActivity3;
                                            privacyControlActivity4.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z12 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (a2 = privacyControlActivity4.getMessagesController().a2(privacyControlActivity4.getUserConfig().e())) != null) {
                                                a2.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity4.getMessagesStorage().j2(a2, false);
                                            }
                                            boolean z13 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity4.B0 = z13;
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
                                                privacyControlActivity4.D0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z15;
                                                privacyControlActivity4.F0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z16;
                                                privacyControlActivity4.H0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z17;
                                                privacyControlActivity4.J0 = !z17;
                                                boolean z18 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z18;
                                                privacyControlActivity4.L0 = !z18;
                                            }
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity4.B0();
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
            privacyControlActivity.f33726b.b(true);
        }
    }

    public final boolean y0() {
        if (!this.I0 && !this.E0 && !this.G0) {
            return true;
        }
        return false;
    }

    public final boolean z0(boolean z10) {
        if (this.f33726b.f20546x.f7021f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String L0 = org.telegram.messenger.cd.L0(2131743752, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131746785, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131754216, null), new ku0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747596, null), new ku0(this, 2));
                showDialog(x1Var);
            }
            return false;
        }
        return true;
    }

    public PrivacyControlActivity(int i10) {
        this(i10, false);
    }

    @Override
    public final void H(float f7) {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z10, boolean z11) {
    }
}
