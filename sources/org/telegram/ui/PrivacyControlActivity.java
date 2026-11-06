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
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
    public SpannableString A0;
    public boolean B0;
    public boolean C0;
    public final int D;
    public boolean D0;
    public final boolean[] E;
    public boolean E0;
    public final boolean[] F;
    public boolean F0;
    public final boolean[] G;
    public boolean G0;
    public ArrayList H;
    public boolean H0;
    public ArrayList I;
    public boolean I0;
    public int J;
    public boolean J0;
    public int K;
    public boolean K0;
    public long L;
    public boolean L0;
    public long M;
    public boolean M0;
    public int N;
    public boolean N0;
    public int O;
    public boolean O0;
    public int P;
    public int P0;
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
    public jt0 f41637a;
    public int f41638a0;
    public org.telegram.ui.ActionBar.b5 f41639b;
    public int f41640b0;
    public org.telegram.ui.Components.pj0 f41641c;
    public int f41642c0;
    private int currentPhotoForRestRow;
    public kt0 d;
    public int f41643d0;
    public fi.m3 f41644e;
    public int f41645e0;
    private int everybodyRow;
    public final int[] f41646f;
    public int f41647f0;
    public int f41648g0;
    private int giftTypesHeaderRow;
    public int h;
    public int f41649h0;
    public int f41650i0;
    public int f41651j0;
    public int f41652k0;
    public int f41653l0;
    public int m0;
    public int f41654n;
    public int f41655n0;
    private int nobodyRow;
    public int f41656o0;
    public int f41657p0;
    private int photoForRestRow;
    private int priceRow;
    public int f41658q0;
    public final ArrayList f41659r;
    public int f41660r0;
    private int readRow;
    public final ArrayList f41661s;
    public int f41662s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public final org.telegram.ui.Components.j30 f41663t0;
    public org.telegram.ui.Components.zg0 f41664u0;
    public org.telegram.ui.Cells.m8 f41665v0;
    public final boolean[] f41666w;
    public org.telegram.ui.Components.l9 f41667w0;
    public final boolean[] f41668x;
    public lr f41669x0;
    public final boolean[] f41670y;
    public TLRPC.PhotoSize f41671y0;
    public TLRPC.Photo f41672z0;

    public PrivacyControlActivity(int i7, boolean z9) {
        super(null);
        TLRPC.PhotoSize w10;
        this.f41646f = new int[2];
        this.f41659r = new ArrayList();
        this.f41661s = new ArrayList();
        this.f41666w = new boolean[4];
        this.f41668x = new boolean[4];
        this.f41670y = new boolean[4];
        this.E = new boolean[4];
        this.F = new boolean[4];
        this.G = new boolean[4];
        this.M = 10L;
        this.P0 = 4;
        this.D = i7;
        if (z9) {
            org.telegram.messenger.g5.r(this.currentAccount).D(false);
        }
        if (i7 == 4) {
            org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(0, true, true);
            this.f41663t0 = j30Var;
            j30Var.f34858a = this;
            j30Var.f34859b = this;
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().f24486n);
            if (!org.telegram.messenger.t10.q(b22) || (w10 = org.telegram.messenger.w7.w(b22.fallback_photo.sizes, 1000, false, null, false)) == null) {
                return;
            }
            this.f41671y0 = w10;
            this.f41672z0 = b22.fallback_photo;
        }
    }

    public static void Z(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f41671y0 = null;
        privacyControlActivity.f41672z0 = null;
        TLRPC.UserFull b22 = privacyControlActivity.getMessagesController().b2(privacyControlActivity.getUserConfig().f24486n);
        if (b22 != null && (photo = b22.fallback_photo) != null) {
            b22.flags &= -4194305;
            b22.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().j2(b22, true);
            privacyControlActivity.O0();
            privacyControlActivity.Q0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f26972id = photo.f26977id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).l0(tL_inputPhoto);
            org.telegram.messenger.qs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.qs.f24970c0, new Object[0]);
        }
    }

    public static void a0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
            org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
            org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(13, privacyrules.rules);
            org.telegram.messenger.g0.h3(new qn0(11, privacyControlActivity, zArr));
            return;
        }
        privacyControlActivity.M0();
    }

    public static void b0(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull b22 = privacyControlActivity.getMessagesController().b2(privacyControlActivity.getUserConfig().f24486n);
            b22.flags |= 4194304;
            b22.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().j2(b22, true);
            org.telegram.messenger.qs.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.qs.f24970c0, new Object[0]);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w10 != null && privacyControlActivity.f41671y0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.J(privacyControlActivity.f41671y0, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f41671y0.location.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(privacyControlActivity.f41671y0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.gc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.hc.e(w10.location));
            }
            if (w11 != null && privacyControlActivity.f41671y0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.J(privacyControlActivity.f41671y0.location, null, true, true).renameTo(J2);
            }
        }
    }

    public static void c0(final PrivacyControlActivity privacyControlActivity, View view, final int i7) {
        ArrayList arrayList;
        String str;
        int i10;
        final boolean z9;
        boolean z10;
        char c10;
        int i11;
        int i12 = privacyControlActivity.D;
        if (i7 == privacyControlActivity.currentPhotoForRestRow) {
            org.telegram.ui.ActionBar.u1 u1Var = org.telegram.ui.Components.v4.L(privacyControlActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131746288, null), org.telegram.messenger.hd.M0(2131746289, null), org.telegram.messenger.hd.M0(2131746320, null), new xs0(privacyControlActivity, 1), null).f27293a;
            u1Var.show();
            u1Var.i();
            return;
        }
        int i13 = 0;
        r8 = false;
        boolean z11 = false;
        int i14 = 0;
        if (i7 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.j30 j30Var = privacyControlActivity.f41663t0;
            if (j30Var != null) {
                j30Var.n(false, new ai.m0(22), new q5(privacyControlActivity, 12), 0);
                privacyControlActivity.f41664u0.M(0);
                privacyControlActivity.f41664u0.P(43);
                privacyControlActivity.f41665v0.f29567e.d();
                return;
            }
            return;
        }
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
        if (i12 == 10 && i7 == privacyControlActivity.P && !privacyControlActivity.getMessagesController().J5 && !privacyControlActivity.getUserConfig().q()) {
            org.telegram.ui.Components.hc.a0(privacyControlActivity).L(2131624216, org.telegram.messenger.hd.M0(2131747770, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747771, null)), org.telegram.messenger.hd.M0(2131747772, null), new xs0(privacyControlActivity, 2)).j();
            p2Var.a();
            int i15 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i15;
            org.telegram.messenger.g0.G3(i15, view, null);
        } else if (i12 == 8 && ((i7 == privacyControlActivity.P || i7 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().q())) {
            org.telegram.ui.Components.hc.a0(privacyControlActivity).L(2131624216, org.telegram.messenger.hd.M0(2131747770, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747771, null)), org.telegram.messenger.hd.M0(2131747772, null), new xs0(privacyControlActivity, 3)).j();
            p2Var.a();
            int i16 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i16;
            org.telegram.messenger.g0.G3(i16, view, null);
        } else if (i7 != privacyControlActivity.nobodyRow && i7 != privacyControlActivity.everybodyRow && i7 != privacyControlActivity.P && i7 != privacyControlActivity.f41649h0) {
            if (i7 != privacyControlActivity.Y && i7 != privacyControlActivity.X) {
                if (i7 != privacyControlActivity.U && i7 != privacyControlActivity.T) {
                    if (i7 == privacyControlActivity.f41642c0) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i7 == privacyControlActivity.readRow) {
                        privacyControlActivity.C0 = !privacyControlActivity.C0;
                        privacyControlActivity.P0();
                        ((org.telegram.ui.Cells.r8) view).setChecked(privacyControlActivity.C0);
                        return;
                    } else if (i7 == privacyControlActivity.f41647f0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i7 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.E0 = !privacyControlActivity.E0;
                        privacyControlActivity.P0();
                        ((org.telegram.ui.Cells.r8) view).setChecked(privacyControlActivity.E0);
                        return;
                    } else if (i7 == privacyControlActivity.f41655n0) {
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                            int i17 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i17;
                            org.telegram.messenger.g0.G3(i17, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F0 = privacyControlActivity.F0();
                        privacyControlActivity.I0 = !privacyControlActivity.I0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                        r8Var.setChecked(privacyControlActivity.I0);
                        if (privacyControlActivity.I0 && !privacyControlActivity.getUserConfig().q()) {
                            r8Var.setCheckBoxIcon(2131232513);
                        }
                        if (F0 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.b4(privacyControlActivity.f41641c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.m0) {
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                            int i18 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i18;
                            org.telegram.messenger.g0.G3(i18, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F02 = privacyControlActivity.F0();
                        privacyControlActivity.G0 = !privacyControlActivity.G0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.r8 r8Var2 = (org.telegram.ui.Cells.r8) view;
                        r8Var2.setChecked(privacyControlActivity.G0);
                        if (privacyControlActivity.G0 && !privacyControlActivity.getUserConfig().q()) {
                            r8Var2.setCheckBoxIcon(2131232513);
                        }
                        if (F02 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.b4(privacyControlActivity.f41641c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f41656o0) {
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                            int i19 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i19;
                            org.telegram.messenger.g0.G3(i19, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F03 = privacyControlActivity.F0();
                        privacyControlActivity.K0 = !privacyControlActivity.K0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.r8 r8Var3 = (org.telegram.ui.Cells.r8) view;
                        r8Var3.setChecked(privacyControlActivity.K0);
                        if (privacyControlActivity.K0 && !privacyControlActivity.getUserConfig().q()) {
                            r8Var3.setCheckBoxIcon(2131232513);
                        }
                        if (F03 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.b4(privacyControlActivity.f41641c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f41657p0) {
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                            int i20 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i20;
                            org.telegram.messenger.g0.G3(i20, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F04 = privacyControlActivity.F0();
                        privacyControlActivity.M0 = !privacyControlActivity.M0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.r8 r8Var4 = (org.telegram.ui.Cells.r8) view;
                        r8Var4.setChecked(privacyControlActivity.M0);
                        if (privacyControlActivity.M0 && !privacyControlActivity.getUserConfig().q()) {
                            r8Var4.setCheckBoxIcon(2131232513);
                        }
                        if (F04 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.b4(privacyControlActivity.f41641c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f41658q0) {
                        if (privacyControlActivity.O0 && !privacyControlActivity.getUserConfig().q()) {
                            int i21 = -privacyControlActivity.P0;
                            privacyControlActivity.P0 = i21;
                            org.telegram.messenger.g0.G3(i21, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F05 = privacyControlActivity.F0();
                        privacyControlActivity.O0 = !privacyControlActivity.O0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.r8 r8Var5 = (org.telegram.ui.Cells.r8) view;
                        r8Var5.setChecked(privacyControlActivity.O0);
                        if (privacyControlActivity.O0 && !privacyControlActivity.getUserConfig().q()) {
                            r8Var5.setCheckBoxIcon(2131232513);
                        }
                        if (F05 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.b4(privacyControlActivity.f41641c);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i12 == 12 && privacyControlActivity.F0()) {
                    int i22 = -privacyControlActivity.P0;
                    privacyControlActivity.P0 = i22;
                    org.telegram.messenger.g0.G3(i22, view, null);
                    return;
                } else {
                    if (i7 == privacyControlActivity.U) {
                        arrayList = privacyControlActivity.I;
                    } else {
                        arrayList = privacyControlActivity.H;
                    }
                    Bundle bundle = new Bundle();
                    if (i7 == privacyControlActivity.U) {
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
                    if (i7 == privacyControlActivity.T && i12 == 1) {
                        bundle.putBoolean("allowPremium", true);
                    }
                    if (i12 == 12 && ((i11 = privacyControlActivity.J) != 1 ? !(i11 != 2 ? i11 != 0 || i7 != privacyControlActivity.U : i7 != privacyControlActivity.T) : i7 == privacyControlActivity.T)) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    bundle.putBoolean("allowMiniapps", z9);
                    w40 w40Var = new w40(bundle);
                    if (i12 == 10) {
                        w40Var.L = org.telegram.messenger.hd.M0(2131746290, null);
                    }
                    if (i7 == privacyControlActivity.T) {
                        boolean[] zArr = privacyControlActivity.E;
                        if (privacyControlActivity.J == 2) {
                            c10 = 0;
                        } else {
                            c10 = 1;
                        }
                        if (zArr[c10]) {
                            z10 = true;
                            if (z9 && privacyControlActivity.F[privacyControlActivity.J]) {
                                z11 = true;
                            }
                            w40Var.u0(arrayList, z10, z11);
                            w40Var.f50952x = new s40() {
                                @Override
                                public final void a(ArrayList arrayList2, boolean z12, boolean z13) {
                                    char c11;
                                    PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                                    boolean[] zArr2 = privacyControlActivity2.F;
                                    int i23 = privacyControlActivity2.U;
                                    int i24 = i7;
                                    boolean z14 = z9;
                                    int i25 = 0;
                                    boolean z15 = true;
                                    if (i24 == i23) {
                                        privacyControlActivity2.I = arrayList2;
                                        int i26 = privacyControlActivity2.J;
                                        if (!z14 || !z13) {
                                            z15 = false;
                                        }
                                        zArr2[i26] = z15;
                                        while (i25 < privacyControlActivity2.I.size()) {
                                            privacyControlActivity2.H.remove(privacyControlActivity2.I.get(i25));
                                            i25++;
                                        }
                                    } else {
                                        boolean[] zArr3 = privacyControlActivity2.E;
                                        int i27 = privacyControlActivity2.J;
                                        if (i27 == 2) {
                                            c11 = 0;
                                        } else {
                                            c11 = 1;
                                        }
                                        zArr3[c11] = z12;
                                        if (!z14 || !z13) {
                                            z15 = false;
                                        }
                                        zArr2[i27] = z15;
                                        privacyControlActivity2.H = arrayList2;
                                        while (i25 < privacyControlActivity2.H.size()) {
                                            privacyControlActivity2.I.remove(privacyControlActivity2.H.get(i25));
                                            i25++;
                                        }
                                    }
                                    privacyControlActivity2.P0();
                                    privacyControlActivity2.f41637a.f();
                                }
                            };
                            w40Var.f50931e0 = true;
                            privacyControlActivity.presentFragment(w40Var);
                            return;
                        }
                    }
                    z10 = false;
                    if (z9) {
                        z11 = true;
                    }
                    w40Var.u0(arrayList, z10, z11);
                    w40Var.f50952x = new s40() {
                        @Override
                        public final void a(ArrayList arrayList2, boolean z12, boolean z13) {
                            char c11;
                            PrivacyControlActivity privacyControlActivity2 = PrivacyControlActivity.this;
                            boolean[] zArr2 = privacyControlActivity2.F;
                            int i23 = privacyControlActivity2.U;
                            int i24 = i7;
                            boolean z14 = z9;
                            int i25 = 0;
                            boolean z15 = true;
                            if (i24 == i23) {
                                privacyControlActivity2.I = arrayList2;
                                int i26 = privacyControlActivity2.J;
                                if (!z14 || !z13) {
                                    z15 = false;
                                }
                                zArr2[i26] = z15;
                                while (i25 < privacyControlActivity2.I.size()) {
                                    privacyControlActivity2.H.remove(privacyControlActivity2.I.get(i25));
                                    i25++;
                                }
                            } else {
                                boolean[] zArr3 = privacyControlActivity2.E;
                                int i27 = privacyControlActivity2.J;
                                if (i27 == 2) {
                                    c11 = 0;
                                } else {
                                    c11 = 1;
                                }
                                zArr3[c11] = z12;
                                if (!z14 || !z13) {
                                    z15 = false;
                                }
                                zArr2[i27] = z15;
                                privacyControlActivity2.H = arrayList2;
                                while (i25 < privacyControlActivity2.H.size()) {
                                    privacyControlActivity2.I.remove(privacyControlActivity2.H.get(i25));
                                    i25++;
                                }
                            }
                            privacyControlActivity2.P0();
                            privacyControlActivity2.f41637a.f();
                        }
                    };
                    w40Var.f50931e0 = true;
                    privacyControlActivity.presentFragment(w40Var);
                    return;
                }
            }
            if (i7 != privacyControlActivity.X) {
                i14 = 1;
            }
            if (i14 != privacyControlActivity.K) {
                privacyControlActivity.K = i14;
                privacyControlActivity.P0();
                privacyControlActivity.Q0(true);
            }
        } else if (i12 == 12 && privacyControlActivity.F0()) {
            int i23 = -privacyControlActivity.P0;
            privacyControlActivity.P0 = i23;
            org.telegram.messenger.g0.G3(i23, view, null);
        } else {
            if (i7 == privacyControlActivity.nobodyRow) {
                i13 = 1;
            } else if (i7 != privacyControlActivity.everybodyRow) {
                if (i7 == privacyControlActivity.f41649h0) {
                    i13 = 3;
                } else {
                    i13 = 2;
                }
            }
            if (i13 == privacyControlActivity.J) {
                return;
            }
            privacyControlActivity.J = i13;
            org.telegram.ui.Components.cc.e();
            privacyControlActivity.P0();
            privacyControlActivity.Q0(true);
        }
    }

    public static void d0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(7, ((TL_account.privacyRules) tLObject).rules);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.I0();
                return;
            }
            return;
        }
        org.telegram.ui.Components.hc.a0(privacyControlActivity).f0(tL_error, false);
    }

    public static void e0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
            org.telegram.messenger.qp.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
            org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(privacyControlActivity.D, privacyrules.rules);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.I0();
                return;
            }
            return;
        }
        privacyControlActivity.M0();
    }

    public static void w0(PrivacyControlActivity privacyControlActivity) {
        kt0 kt0Var;
        int[] iArr = privacyControlActivity.f41646f;
        if (privacyControlActivity.f41644e != null && (kt0Var = privacyControlActivity.d) != null && privacyControlActivity.fragmentView != null) {
            if (kt0Var.getParent() == privacyControlActivity.f41641c && privacyControlActivity.d.isAttachedToWindow()) {
                privacyControlActivity.d.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                privacyControlActivity.fragmentView.getLocationInWindow(iArr);
                privacyControlActivity.f41644e.x(privacyControlActivity.d.f47309b.getForwardNameCenterX() + privacyControlActivity.d.f47309b.getLeft() + (i7 - iArr[0]), org.telegram.messenger.g0.L(44.0f) + privacyControlActivity.d.getPaddingTop() + (i10 - iArr[1]), false);
                return;
            }
            privacyControlActivity.f41644e.f(false);
        }
    }

    public final void E0() {
        final AtomicInteger atomicInteger;
        char c10 = 0;
        boolean z9 = false;
        int i7 = this.D;
        if (i7 == 10) {
            boolean[] zArr = {true};
            if (this.J == 3) {
                ArrayList arrayList = this.f41659r;
                Collections.sort(arrayList);
                Collections.sort(this.H);
                if (!arrayList.equals(this.H)) {
                    zArr[0] = false;
                    TL_account.setPrivacy setprivacy = new TL_account.setPrivacy();
                    setprivacy.key = new TLRPC.TL_inputPrivacyKeyNoPaidMessages();
                    setprivacy.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                    if (this.J != 0 && this.H.size() > 0) {
                        TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers = new TLRPC.TL_inputPrivacyValueAllowUsers();
                        TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
                        for (int i10 = 0; i10 < this.H.size(); i10++) {
                            Long l10 = (Long) this.H.get(i10);
                            long longValue = l10.longValue();
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.qp.s1(this.currentAccount).a2(l10);
                                if (a22 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(org.telegram.messenger.qp.s1(this.currentAccount).q1(a22));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new h50(19, this, zArr));
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
            int i11 = this.J;
            if (i11 == 3) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings3 = setglobalprivacysettings.settings;
                globalPrivacySettings3.flags |= 32;
                globalPrivacySettings3.noncontact_peers_paid_stars = this.M;
                globalPrivacySettings3.new_noncontact_peers_require_premium = false;
            } else {
                TLRPC.GlobalPrivacySettings globalPrivacySettings4 = setglobalprivacysettings.settings;
                globalPrivacySettings4.flags |= 32;
                globalPrivacySettings4.noncontact_peers_paid_stars = 0L;
                if (i11 == 2) {
                    z9 = true;
                }
                globalPrivacySettings4.new_noncontact_peers_require_premium = z9;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings, new bi.g2(this, zArr, globalPrivacySettings, setglobalprivacysettings, 16));
            return;
        }
        final AtomicInteger atomicInteger2 = new AtomicInteger(0);
        TL_account.setPrivacy setprivacy2 = new TL_account.setPrivacy();
        if (i7 == 6) {
            setprivacy2.key = new TLRPC.TL_inputPrivacyKeyPhoneNumber();
            if (this.J == 1) {
                TL_account.setPrivacy setprivacy3 = new TL_account.setPrivacy();
                setprivacy3.key = new TLRPC.TL_inputPrivacyKeyAddedByPhone();
                if (this.K == 0) {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
                } else {
                    setprivacy3.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
                }
                atomicInteger2.incrementAndGet();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy3, new RequestDelegate(this) {
                    public final PrivacyControlActivity f52321b;

                    {
                        this.f52321b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f52321b;
                                final AtomicInteger atomicInteger3 = atomicInteger2;
                                org.telegram.messenger.g0.h3(new Runnable() {
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
                                final PrivacyControlActivity privacyControlActivity2 = this.f52321b;
                                final AtomicInteger atomicInteger4 = atomicInteger2;
                                org.telegram.messenger.g0.h3(new Runnable() {
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
        if (this.J != 0 && this.H.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i12 = 0; i12 < this.H.size(); i12++) {
                Long l11 = (Long) this.H.get(i12);
                long longValue2 = l11.longValue();
                if (org.telegram.messenger.m5.E(longValue2)) {
                    TLRPC.User a23 = org.telegram.messenger.qp.s1(this.currentAccount).a2(l11);
                    if (a23 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(org.telegram.messenger.qp.s1(this.currentAccount).q1(a23));
                    }
                } else {
                    tL_inputPrivacyValueAllowChatParticipants2.chats.add(Long.valueOf(-longValue2));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueAllowUsers2);
            setprivacy2.rules.add(tL_inputPrivacyValueAllowChatParticipants2);
        }
        if (this.J != 1 && this.I.size() > 0) {
            TLRPC.TL_inputPrivacyValueDisallowUsers tL_inputPrivacyValueDisallowUsers = new TLRPC.TL_inputPrivacyValueDisallowUsers();
            TLRPC.TL_inputPrivacyValueDisallowChatParticipants tL_inputPrivacyValueDisallowChatParticipants = new TLRPC.TL_inputPrivacyValueDisallowChatParticipants();
            for (int i13 = 0; i13 < this.I.size(); i13++) {
                Long l12 = (Long) this.I.get(i13);
                long longValue3 = l12.longValue();
                if (org.telegram.messenger.m5.E(longValue3)) {
                    TLRPC.User a24 = getMessagesController().a2(l12);
                    if (a24 != null) {
                        tL_inputPrivacyValueDisallowUsers.users.add(getMessagesController().q1(a24));
                    }
                } else {
                    tL_inputPrivacyValueDisallowChatParticipants.chats.add(Long.valueOf(-longValue3));
                }
            }
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowUsers);
            setprivacy2.rules.add(tL_inputPrivacyValueDisallowChatParticipants);
        }
        int i14 = this.J;
        if (i14 == 0) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowAll());
        } else if (i14 == 1) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowAll());
        } else if (i14 == 2) {
            setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowContacts());
        }
        int i15 = this.J;
        if (i15 != 0) {
            if (i15 != 2) {
                c10 = 1;
            }
            if (this.E[c10]) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowPremium());
            }
        }
        int i16 = this.J;
        if (this.F[i16]) {
            if (i16 == 0) {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueDisallowBots());
            } else {
                setprivacy2.rules.add(new TLRPC.TL_inputPrivacyValueAllowBots());
            }
        }
        atomicInteger2.incrementAndGet();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(setprivacy2, new RequestDelegate(this) {
            public final PrivacyControlActivity f52321b;

            {
                this.f52321b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f52321b;
                        final AtomicInteger atomicInteger3 = atomicInteger2;
                        org.telegram.messenger.g0.h3(new Runnable() {
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
                        final PrivacyControlActivity privacyControlActivity2 = this.f52321b;
                        final AtomicInteger atomicInteger4 = atomicInteger2;
                        org.telegram.messenger.g0.h3(new Runnable() {
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
        if (i7 == 0 && this.C0 != this.B0) {
            atomicInteger2.incrementAndGet();
            final TL_account.setGlobalPrivacySettings setglobalprivacysettings2 = new TL_account.setGlobalPrivacySettings();
            setglobalprivacysettings2.settings = new TLRPC.TL_globalPrivacySettings();
            final TLRPC.GlobalPrivacySettings globalPrivacySettings5 = getContactsController().X;
            TLRPC.GlobalPrivacySettings globalPrivacySettings6 = setglobalprivacysettings2.settings;
            globalPrivacySettings6.archive_and_mute_new_noncontact_peers = globalPrivacySettings5.archive_and_mute_new_noncontact_peers;
            globalPrivacySettings6.keep_archived_folders = globalPrivacySettings5.keep_archived_folders;
            globalPrivacySettings6.keep_archived_unmuted = globalPrivacySettings5.keep_archived_unmuted;
            globalPrivacySettings6.new_noncontact_peers_require_premium = globalPrivacySettings5.new_noncontact_peers_require_premium;
            globalPrivacySettings6.noncontact_peers_paid_stars = globalPrivacySettings5.noncontact_peers_paid_stars;
            globalPrivacySettings6.hide_read_marks = this.C0;
            globalPrivacySettings6.display_gifts_button = globalPrivacySettings5.display_gifts_button;
            atomicInteger = atomicInteger2;
            getConnectionsManager().sendRequest(setglobalprivacysettings2, new RequestDelegate(this) {
                public final PrivacyControlActivity f52669b;

                {
                    this.f52669b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f52669b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings7 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings3 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity2 = privacyControlActivity;
                                            privacyControlActivity2.getClass();
                                            boolean z10 = setglobalprivacysettings3.settings.hide_read_marks;
                                            privacyControlActivity2.B0 = z10;
                                            globalPrivacySettings7.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity2.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings7;
                                            boolean z11 = globalPrivacySettings8.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                                            if (z11 != setglobalprivacysettings4.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings4.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z12;
                                            globalPrivacySettings8.display_gifts_button = z12;
                                            if (globalPrivacySettings8.disallowed_stargifts == null) {
                                                globalPrivacySettings8.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings4.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings8.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings8.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.F0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.H0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.J0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.L0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.N0 = !z17;
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
                            final PrivacyControlActivity privacyControlActivity2 = this.f52669b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings8 = globalPrivacySettings5;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings2;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.B0 = z10;
                                            globalPrivacySettings8.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings8;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings2.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.F0 = !z13;
                                                boolean z14 = disallowedGiftsSettings.disallow_limited_stargifts;
                                                disallowedGiftsSettings2.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.H0 = !z14;
                                                boolean z15 = disallowedGiftsSettings.disallow_unique_stargifts;
                                                disallowedGiftsSettings2.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.J0 = !z15;
                                                boolean z16 = disallowedGiftsSettings.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings2.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.L0 = !z16;
                                                boolean z17 = disallowedGiftsSettings.disallow_premium_gifts;
                                                disallowedGiftsSettings2.disallow_premium_gifts = z17;
                                                privacyControlActivity3.N0 = !z17;
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
        if (i7 == 12 && (this.E0 != this.D0 || this.I0 != this.H0 || this.G0 != this.F0 || this.K0 != this.J0 || this.O0 != this.N0)) {
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
            globalPrivacySettings8.display_gifts_button = this.E0;
            if (getUserConfig().q()) {
                TLRPC.GlobalPrivacySettings globalPrivacySettings9 = setglobalprivacysettings3.settings;
                globalPrivacySettings9.flags |= 64;
                globalPrivacySettings9.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = setglobalprivacysettings3.settings.disallowed_stargifts;
                disallowedGiftsSettings.disallow_unlimited_stargifts = !this.G0;
                disallowedGiftsSettings.disallow_limited_stargifts = !this.I0;
                disallowedGiftsSettings.disallow_unique_stargifts = !this.K0;
                disallowedGiftsSettings.disallow_premium_gifts = !this.O0;
            }
            getConnectionsManager().sendRequest(setglobalprivacysettings3, new RequestDelegate(this) {
                public final PrivacyControlActivity f52669b;

                {
                    this.f52669b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f52669b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings72 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings32 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger3 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings32.settings.hide_read_marks;
                                            privacyControlActivity22.B0 = z10;
                                            globalPrivacySettings72.hide_read_marks = z10;
                                            if (atomicInteger3.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings72;
                                            boolean z11 = globalPrivacySettings82.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings32;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z12;
                                            globalPrivacySettings82.display_gifts_button = z12;
                                            if (globalPrivacySettings82.disallowed_stargifts == null) {
                                                globalPrivacySettings82.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings82.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings82.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.F0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.H0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.J0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.L0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.N0 = !z17;
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
                            final PrivacyControlActivity privacyControlActivity2 = this.f52669b;
                            final TLRPC.GlobalPrivacySettings globalPrivacySettings82 = globalPrivacySettings7;
                            final TL_account.setGlobalPrivacySettings setglobalprivacysettings4 = setglobalprivacysettings3;
                            final AtomicInteger atomicInteger4 = atomicInteger;
                            org.telegram.messenger.g0.h3(new Runnable() {
                                @Override
                                public final void run() {
                                    TLRPC.UserFull b22;
                                    switch (r5) {
                                        case 0:
                                            PrivacyControlActivity privacyControlActivity22 = privacyControlActivity2;
                                            privacyControlActivity22.getClass();
                                            boolean z10 = setglobalprivacysettings4.settings.hide_read_marks;
                                            privacyControlActivity22.B0 = z10;
                                            globalPrivacySettings82.hide_read_marks = z10;
                                            if (atomicInteger4.decrementAndGet() == 0) {
                                                privacyControlActivity22.I0();
                                                return;
                                            }
                                            return;
                                        default:
                                            PrivacyControlActivity privacyControlActivity3 = privacyControlActivity2;
                                            privacyControlActivity3.getClass();
                                            TLRPC.GlobalPrivacySettings globalPrivacySettings822 = globalPrivacySettings82;
                                            boolean z11 = globalPrivacySettings822.display_gifts_button;
                                            TL_account.setGlobalPrivacySettings setglobalprivacysettings42 = setglobalprivacysettings4;
                                            if (z11 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
                                            }
                                            boolean z12 = setglobalprivacysettings42.settings.display_gifts_button;
                                            privacyControlActivity3.D0 = z12;
                                            globalPrivacySettings822.display_gifts_button = z12;
                                            if (globalPrivacySettings822.disallowed_stargifts == null) {
                                                globalPrivacySettings822.disallowed_stargifts = new TLRPC.DisallowedGiftsSettings();
                                            }
                                            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2 = setglobalprivacysettings42.settings.disallowed_stargifts;
                                            if (disallowedGiftsSettings2 != null) {
                                                globalPrivacySettings822.flags |= 64;
                                                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings22 = globalPrivacySettings822.disallowed_stargifts;
                                                boolean z13 = disallowedGiftsSettings2.disallow_unlimited_stargifts;
                                                disallowedGiftsSettings22.disallow_unlimited_stargifts = z13;
                                                privacyControlActivity3.F0 = !z13;
                                                boolean z14 = disallowedGiftsSettings2.disallow_limited_stargifts;
                                                disallowedGiftsSettings22.disallow_limited_stargifts = z14;
                                                privacyControlActivity3.H0 = !z14;
                                                boolean z15 = disallowedGiftsSettings2.disallow_unique_stargifts;
                                                disallowedGiftsSettings22.disallow_unique_stargifts = z15;
                                                privacyControlActivity3.J0 = !z15;
                                                boolean z16 = disallowedGiftsSettings2.disallow_stargifts_from_channels;
                                                disallowedGiftsSettings22.disallow_stargifts_from_channels = z16;
                                                privacyControlActivity3.L0 = !z16;
                                                boolean z17 = disallowedGiftsSettings2.disallow_premium_gifts;
                                                disallowedGiftsSettings22.disallow_premium_gifts = z17;
                                                privacyControlActivity3.N0 = !z17;
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
            this.f41639b.b(true);
        }
    }

    public final boolean F0() {
        if (!this.K0 && !this.G0 && !this.I0) {
            return true;
        }
        return false;
    }

    public final boolean G0(boolean z9) {
        if (this.f41639b.f27354x.f55395f) {
            if (z9) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131743727, null);
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                u1Var.R = M0;
                u1Var.T = org.telegram.messenger.hd.M0(2131746769, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new bt0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747579, null), new bt0(this, 2));
                showDialog(u1Var);
            }
            return false;
        }
        return true;
    }

    public final void H0() {
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z13;
        int i7;
        char c10;
        boolean z14;
        boolean[] zArr;
        ArrayList arrayList;
        boolean[] zArr2;
        boolean[] zArr3;
        Boolean bool;
        ArrayList arrayList2 = this.f41659r;
        int i10 = 2;
        int i11 = this.D;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).X;
            i10 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.J = i10;
            this.h = i10;
            this.I = new ArrayList();
            this.H = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long k10 = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().I6, 1L);
                this.M = k10;
                this.L = k10;
                this.J = 3;
                this.h = 3;
            } else {
                this.M = 10L;
                this.L = 10L;
            }
            ArrayList v = org.telegram.messenger.g5.r(this.currentAccount).v(13);
            this.H = new ArrayList();
            if (v != null) {
                for (int i12 = 0; i12 < v.size(); i12++) {
                    TLRPC.PrivacyRule privacyRule = (TLRPC.PrivacyRule) v.get(i12);
                    if (privacyRule instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                        TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule;
                        int size = tL_privacyValueAllowChatParticipants.chats.size();
                        int i13 = 0;
                        while (i13 < size) {
                            i13 = com.google.android.recaptcha.internal.a.g(i13, 1, -tL_privacyValueAllowChatParticipants.chats.get(i13).longValue(), this.H);
                        }
                    } else if (privacyRule instanceof TLRPC.TL_privacyValueAllowUsers) {
                        this.H.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule).users);
                    }
                }
            }
            arrayList2.clear();
            arrayList2.addAll(this.H);
            return;
        }
        if (i11 == 1) {
            z9 = true;
        } else {
            z9 = false;
        }
        boolean[] zArr4 = this.f41666w;
        zArr4[0] = z9;
        boolean[] zArr5 = this.E;
        zArr5[0] = z9;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.f41668x;
        zArr6[0] = false;
        boolean[] zArr7 = this.F;
        zArr7[0] = false;
        if (i11 == 12) {
            z10 = true;
        } else {
            z10 = false;
        }
        zArr6[1] = z10;
        zArr7[1] = z10;
        zArr6[2] = false;
        zArr7[2] = false;
        zArr6[3] = false;
        zArr7[3] = false;
        boolean[] zArr8 = this.f41670y;
        zArr8[0] = false;
        boolean[] zArr9 = this.G;
        zArr9[0] = false;
        if (i11 == 12) {
            z11 = true;
        } else {
            z11 = false;
        }
        zArr8[1] = z11;
        zArr9[1] = z11;
        zArr8[2] = false;
        zArr9[2] = false;
        zArr8[3] = false;
        zArr9[3] = false;
        this.H = new ArrayList();
        this.I = new ArrayList();
        ArrayList v10 = org.telegram.messenger.g5.r(this.currentAccount).v(i11);
        if (v10 != null && v10.size() != 0) {
            Boolean bool2 = null;
            int i14 = 0;
            boolean z15 = false;
            boolean z16 = false;
            char c11 = 65535;
            while (i14 < v10.size()) {
                TLRPC.PrivacyRule privacyRule2 = (TLRPC.PrivacyRule) v10.get(i14);
                if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowChatParticipants) {
                    TLRPC.TL_privacyValueAllowChatParticipants tL_privacyValueAllowChatParticipants2 = (TLRPC.TL_privacyValueAllowChatParticipants) privacyRule2;
                    int size2 = tL_privacyValueAllowChatParticipants2.chats.size();
                    int i15 = 0;
                    while (i15 < size2) {
                        i15 = com.google.android.recaptcha.internal.a.g(i15, 1, -tL_privacyValueAllowChatParticipants2.chats.get(i15).longValue(), this.H);
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
                            i16 = com.google.android.recaptcha.internal.a.g(i16, 1, -tL_privacyValueDisallowChatParticipants.chats.get(i16).longValue(), this.I);
                            zArr5 = zArr5;
                        }
                    } else {
                        zArr3 = zArr5;
                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowUsers) {
                            this.H.addAll(((TLRPC.TL_privacyValueAllowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowUsers) {
                            this.I.addAll(((TLRPC.TL_privacyValueDisallowUsers) privacyRule2).users);
                        } else if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowPremium) {
                            z15 = true;
                        } else {
                            if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowBots) {
                                bool = Boolean.TRUE;
                            } else if (privacyRule2 instanceof TLRPC.TL_privacyValueDisallowBots) {
                                bool = Boolean.FALSE;
                            } else {
                                boolean z17 = privacyRule2 instanceof TLRPC.TL_privacyValueAllowAll;
                                if (!z17) {
                                    boolean z18 = privacyRule2 instanceof TLRPC.TL_privacyValueDisallowAll;
                                    if (!z18 || z16) {
                                        if (privacyRule2 instanceof TLRPC.TL_privacyValueAllowContacts) {
                                            c11 = 2;
                                            z16 = true;
                                        } else if (c11 == 65535) {
                                            if (!z17) {
                                                if (!z18 || z16) {
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
            if (c11 == 0 || (c11 == 65535 && (this.I.size() > 0 || (bool2 != null && !bool2.booleanValue())))) {
                i7 = 2;
                this.J = 0;
            } else {
                i7 = 2;
                if (c11 != 2) {
                    if (c11 == 65535 && this.I.size() > 0 && this.H.size() > 0) {
                        i7 = 2;
                    } else {
                        int i17 = 1;
                        if (c11 != 1) {
                            if (c11 == 65535 && (this.H.size() > 0 || (bool2 != null && bool2.booleanValue()))) {
                                i17 = 1;
                            }
                            i7 = 2;
                        }
                        this.J = i17;
                        i7 = 2;
                    }
                }
                this.J = i7;
            }
            int i18 = this.J;
            if (i18 == i7) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            zArr11[c10] = z15;
            zArr12[c10] = z15;
            if (bool2 != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            zArr10[i18] = z14;
            zArr7[i18] = z14;
            zArr8[i18] = false;
            zArr9[i18] = false;
            org.telegram.ui.ActionBar.b5 b5Var = this.f41639b;
            if (b5Var != null) {
                b5Var.a(false, false);
            }
        } else {
            this.J = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f41661s;
        arrayList3.clear();
        this.h = this.J;
        arrayList2.addAll(this.H);
        arrayList3.addAll(this.I);
        if (i11 == 6) {
            ArrayList v11 = org.telegram.messenger.g5.r(this.currentAccount).v(7);
            if (v11 != null && v11.size() != 0) {
                int i19 = 0;
                while (true) {
                    if (i19 >= v11.size()) {
                        break;
                    }
                    TLRPC.PrivacyRule privacyRule3 = (TLRPC.PrivacyRule) v11.get(i19);
                    if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowAll) {
                        this.K = 0;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueDisallowAll) {
                        this.K = 2;
                        break;
                    } else if (privacyRule3 instanceof TLRPC.TL_privacyValueAllowContacts) {
                        this.K = 1;
                        break;
                    } else {
                        i19++;
                    }
                }
            } else {
                this.K = 0;
            }
            this.f41654n = this.K;
        }
        if (i11 == 0) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings2 = getContactsController().X;
            if (globalPrivacySettings2 != null && globalPrivacySettings2.hide_read_marks) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.B0 = z13;
            this.C0 = z13;
        }
        if (i11 == 12) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings3 = getContactsController().X;
            if (globalPrivacySettings3 != null && globalPrivacySettings3.display_gifts_button) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.D0 = z12;
            this.E0 = z12;
            if (globalPrivacySettings3 != null && (disallowedGiftsSettings = globalPrivacySettings3.disallowed_stargifts) != null) {
                boolean z19 = !disallowedGiftsSettings.disallow_unlimited_stargifts;
                this.G0 = z19;
                this.F0 = z19;
                boolean z20 = !disallowedGiftsSettings.disallow_limited_stargifts;
                this.I0 = z20;
                this.H0 = z20;
                boolean z21 = !disallowedGiftsSettings.disallow_unique_stargifts;
                this.K0 = z21;
                this.J0 = z21;
                boolean z22 = !disallowedGiftsSettings.disallow_stargifts_from_channels;
                this.M0 = z22;
                this.L0 = z22;
                boolean z23 = !disallowedGiftsSettings.disallow_premium_gifts;
                this.O0 = z23;
                this.N0 = z23;
            } else {
                this.G0 = true;
                this.F0 = true;
                this.I0 = true;
                this.H0 = true;
                this.K0 = true;
                this.J0 = true;
                this.M0 = true;
                this.L0 = true;
                this.O0 = true;
                this.N0 = true;
            }
        }
        Q0(false);
        org.telegram.messenger.g0.b4(this.f41641c);
    }

    public final void I0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        int i7;
        int i10;
        this.f41639b.b(false);
        int i11 = this.D;
        if ((i11 == 10 || i11 == 1 || i11 == 2) && this.J != 0 && (globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).X) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
            int[] iArr = {1, 2};
            for (int i12 = 0; i12 < 2; i12++) {
                int i13 = iArr[i12];
                ArrayList v = org.telegram.messenger.g5.r(this.currentAccount).v(i13);
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
                            i7 = 2131752147;
                        } else {
                            i7 = 2131752149;
                        }
                        String M0 = org.telegram.messenger.hd.M0(i7, null);
                        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                        u1Var.R = M0;
                        if (i13 == 1) {
                            i10 = 2131752148;
                        } else {
                            i10 = 2131752150;
                        }
                        u1Var.T = org.telegram.messenger.hd.M0(i10, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752146, null), new l2.q(this, i13, 16));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new bt0(this, 1));
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
        int i7 = this.D;
        if (i7 == 0 && ((this.J != 0 || ((arrayList = this.I) != null && !arrayList.isEmpty())) && this.B0 != this.C0)) {
            return true;
        }
        if (i7 == 12 && (this.D0 != this.E0 || this.H0 != this.I0 || this.F0 != this.G0 || this.J0 != this.K0 || this.L0 != this.M0 || this.N0 != this.O0)) {
            return true;
        }
        int i10 = this.h;
        int i11 = this.J;
        if (i10 != i11) {
            return true;
        }
        if (i7 == 6 && i11 == 1 && this.f41654n != this.K) {
            return true;
        }
        if (i11 != 0) {
            if (i11 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            boolean z9 = this.f41666w[c10];
            if (i11 == 2) {
                c11 = 0;
            } else {
                c11 = 1;
            }
            if (z9 != this.E[c11]) {
                return true;
            }
        }
        if ((i7 == 10 && i11 == 3 && this.M != this.L) || this.f41668x[i11] != this.F[i11]) {
            return true;
        }
        ArrayList arrayList2 = this.f41661s;
        if (arrayList2.size() != this.I.size()) {
            return true;
        }
        ArrayList arrayList3 = this.f41659r;
        if (arrayList3.size() != this.H.size()) {
            return true;
        }
        if (i7 != 10 || this.J == 3) {
            Collections.sort(arrayList3);
            Collections.sort(this.H);
            if (!arrayList3.equals(this.H)) {
                return true;
            }
            Collections.sort(arrayList2);
            Collections.sort(this.I);
            if (!arrayList2.equals(this.I)) {
                return true;
            }
        }
        return false;
    }

    public final void K0() {
        if (getParentActivity() == null) {
            return;
        }
        int i7 = this.D;
        if (i7 == 10 && this.J == 3 && !getUserConfig().q()) {
            showDialog(new ug.w0((org.telegram.ui.ActionBar.f2) this, 27, true));
            return;
        }
        if (this.J != 0 && i7 == 0 && !getUserConfig().q()) {
            SharedPreferences e12 = org.telegram.messenger.qp.e1();
            if (!e12.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                if (i7 == 1) {
                    u1Var.T = org.telegram.messenger.hd.M0(2131742882, null);
                } else {
                    u1Var.T = org.telegram.messenger.hd.M0(2131751686, null);
                }
                u1Var.R = org.telegram.messenger.hd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), new lk0(8, this, e12));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                showDialog(u1Var);
                return;
            }
        }
        E0();
    }

    public final void L0() {
        kt0 kt0Var = this.d;
        if (kt0Var != null) {
            kt0Var.f47311e.f23244k.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i7 = this.J;
            if (i7 == 0) {
                String M0 = org.telegram.messenger.hd.M0(2131746834, null);
                fi.m3 m3Var = this.f41644e;
                if (m3Var != null) {
                    m3Var.u(M0);
                }
                this.d.f47311e.f23244k.fwd_from.from_id.user_id = 1L;
            } else if (i7 == 1) {
                String M02 = org.telegram.messenger.hd.M0(2131746830, null);
                fi.m3 m3Var2 = this.f41644e;
                if (m3Var2 != null) {
                    m3Var2.u(M02);
                }
                this.d.f47311e.f23244k.fwd_from.from_id.user_id = 0L;
            } else {
                String M03 = org.telegram.messenger.hd.M0(2131746835, null);
                fi.m3 m3Var3 = this.f41644e;
                if (m3Var3 != null) {
                    m3Var3.u(M03);
                }
                this.d.f47311e.f23244k.fwd_from.from_id.user_id = 1L;
            }
            this.d.f47309b.G1();
        }
    }

    public final void M0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
        u1Var.R = M0;
        u1Var.T = org.telegram.messenger.hd.M0(2131746837, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747830, null), null);
        showDialog(u1Var);
    }

    public final void N0() {
        org.telegram.ui.Components.hc.a0(this).L(2131624216, org.telegram.messenger.hd.M0(2131747770, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747771, null)), org.telegram.messenger.hd.M0(2131747772, null), new xs0(this, 0)).j();
    }

    public final void O0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.m8 m8Var = this.f41665v0;
        if (m8Var != null) {
            if (this.f41671y0 == null) {
                m8Var.getTextView().k(org.telegram.messenger.hd.a0("SetPhotoForRest", null, 2131745518, new Object[0]));
                this.f41665v0.setNeedDivider(false);
            } else {
                m8Var.getTextView().k(org.telegram.messenger.hd.a0("UpdatePhotoForRest", null, 2131743818, new Object[0]));
                this.f41665v0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.l9 l9Var = this.f41667w0;
        if (l9Var != null && (photoSize = this.f41671y0) != null) {
            TLRPC.Photo photo = this.f41672z0;
            if (photo != null) {
                l9Var.j(org.telegram.messenger.hc.i(photoSize, photo), "50_50", null, org.telegram.messenger.p10.i(this.currentAccount).f());
            } else {
                l9Var.j(org.telegram.messenger.hc.e(photoSize.location), "50_50", null, org.telegram.messenger.p10.i(this.currentAccount).f());
            }
        }
    }

    public final void P0() {
        this.f41639b.a(J0(), true);
    }

    public final void Q0(boolean z9) {
        gt0 gt0Var;
        ArrayList arrayList;
        int i7;
        v4.d1 T;
        int i10;
        boolean z10;
        int i11;
        boolean z11;
        TLRPC.UserFull b22;
        if (z9) {
            gt0Var = new gt0(this);
            gt0Var.f(gt0Var.f46109c);
            gt0Var.f46108b = this.f41662s0;
        } else {
            gt0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.f41638a0 = -1;
        this.N = -1;
        this.setBirthdayRow = -1;
        this.Z = -1;
        this.W = -1;
        this.X = -1;
        this.Y = -1;
        this.T = -1;
        this.U = -1;
        this.f41640b0 = -1;
        this.f41642c0 = -1;
        this.Q = -1;
        this.R = -1;
        this.f41643d0 = -1;
        this.f41645e0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.S = -1;
        this.V = -1;
        this.f41649h0 = -1;
        this.f41650i0 = -1;
        this.priceRow = -1;
        this.f41652k0 = -1;
        this.f41651j0 = -1;
        this.f41647f0 = -1;
        this.f41648g0 = -1;
        this.showGiftIconRow = -1;
        this.f41653l0 = -1;
        this.giftTypesHeaderRow = -1;
        this.m0 = -1;
        this.f41655n0 = -1;
        this.f41656o0 = -1;
        this.f41657p0 = -1;
        this.f41658q0 = -1;
        this.f41660r0 = -1;
        this.f41662s0 = 0;
        int i12 = this.D;
        if (i12 == 12) {
            this.showGiftIconRow = 0;
            this.f41662s0 = 2;
            this.f41653l0 = 1;
        }
        if (i12 == 11 && (b22 = getMessagesController().b2(getUserConfig().e())) != null && b22.birthday == null) {
            int i13 = this.f41662s0;
            this.f41662s0 = i13 + 1;
            this.setBirthdayRow = i13;
        }
        if (i12 == 5) {
            int i14 = this.f41662s0;
            this.f41662s0 = i14 + 1;
            this.N = i14;
        }
        int i15 = this.f41662s0;
        this.O = i15;
        this.everybodyRow = i15 + 1;
        int i16 = i15 + 3;
        this.f41662s0 = i16;
        this.P = i15 + 2;
        if (i12 == 4 || i12 == 9 || i12 == 14 || i12 == 0 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6 || i12 == 8 || i12 == 1 || i12 == 11 || i12 == 12) {
            this.f41662s0 = i15 + 4;
            this.nobodyRow = i16;
        }
        if (getMessagesController().L6 && i12 == 10) {
            int i17 = this.f41662s0;
            this.f41662s0 = i17 + 1;
            this.f41649h0 = i17;
        }
        if (i12 == 6 && this.J == 1) {
            int i18 = this.f41662s0;
            this.Z = i18;
            this.W = i18 + 1;
            this.X = i18 + 2;
            this.f41662s0 = i18 + 4;
            this.Y = i18 + 3;
        }
        if (i12 == 10 && this.J == 3) {
            int i19 = this.f41662s0;
            this.f41662s0 = i19 + 1;
            this.R = i19;
        } else {
            int i20 = this.f41662s0;
            this.f41662s0 = i20 + 1;
            this.Q = i20;
        }
        if (i12 == 10) {
            if (this.J == 3) {
                int i21 = this.f41662s0;
                this.f41650i0 = i21;
                this.f41662s0 = i21 + 2;
                this.priceRow = i21 + 1;
                if (!getUserConfig().q()) {
                    int i22 = this.f41662s0;
                    this.f41662s0 = i22 + 1;
                    this.f41651j0 = i22;
                }
                int i23 = this.f41662s0;
                this.f41662s0 = i23 + 1;
                this.f41652k0 = i23;
                if (getUserConfig().q()) {
                    int i24 = this.f41662s0;
                    this.S = i24;
                    this.T = i24 + 1;
                    this.f41662s0 = i24 + 3;
                    this.V = i24 + 2;
                }
            }
        } else if (i12 != 8 || getUserConfig().q()) {
            int i25 = this.f41662s0;
            int i26 = i25 + 1;
            this.f41662s0 = i26;
            this.S = i25;
            int i27 = this.J;
            if (i27 == 1 || i27 == 2) {
                this.f41662s0 = i25 + 2;
                this.T = i26;
            }
            if (i27 == 0 || i27 == 2) {
                int i28 = this.f41662s0;
                this.f41662s0 = i28 + 1;
                this.U = i28;
            }
            int i29 = this.f41662s0;
            int i30 = i29 + 1;
            this.f41662s0 = i30;
            this.V = i29;
            if (i12 == 2) {
                this.f41640b0 = i30;
                this.f41642c0 = i29 + 2;
                this.f41662s0 = i29 + 4;
                this.f41643d0 = i29 + 3;
            }
            if (i12 == 4 && (this.I.size() > 0 || (i7 = this.J) == 2 || i7 == 1)) {
                int i31 = this.f41662s0;
                int i32 = i31 + 1;
                this.f41662s0 = i32;
                this.photoForRestRow = i31;
                if (this.f41671y0 != null) {
                    this.f41662s0 = i31 + 2;
                    this.currentPhotoForRestRow = i32;
                }
                int i33 = this.f41662s0;
                this.f41662s0 = i33 + 1;
                this.f41638a0 = i33;
            }
            if (i12 == 0 && (this.J != 0 || ((arrayList = this.I) != null && !arrayList.isEmpty()))) {
                int i34 = this.f41662s0;
                this.readRow = i34;
                this.f41662s0 = i34 + 2;
                this.f41645e0 = i34 + 1;
            }
            if (i12 == 0 && !getMessagesController().D3()) {
                int i35 = this.f41662s0;
                this.f41647f0 = i35;
                this.f41662s0 = i35 + 2;
                this.f41648g0 = i35 + 1;
            }
        }
        if (i12 == 12) {
            int i36 = this.f41662s0;
            this.giftTypesHeaderRow = i36;
            this.f41655n0 = i36 + 1;
            this.m0 = i36 + 2;
            this.f41656o0 = i36 + 3;
            this.f41657p0 = i36 + 4;
            this.f41658q0 = i36 + 5;
            this.f41662s0 = i36 + 7;
            this.f41660r0 = i36 + 6;
        }
        L0();
        jt0 jt0Var = this.f41637a;
        if (jt0Var != null) {
            if (z9) {
                int childCount = this.f41641c.getChildCount();
                for (int i37 = 0; i37 < childCount; i37++) {
                    View childAt = this.f41641c.getChildAt(i37);
                    if (childAt instanceof org.telegram.ui.Cells.i6) {
                        org.telegram.ui.Components.pj0 pj0Var = this.f41641c;
                        View F = pj0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = pj0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.i6 i6Var = (org.telegram.ui.Cells.i6) childAt;
                            int i38 = this.everybodyRow;
                            if (b10 != i38 && b10 != this.P && b10 != this.nobodyRow && b10 != this.f41649h0) {
                                if (b10 == this.Y) {
                                    i11 = 1;
                                } else {
                                    i11 = 0;
                                }
                                if (this.K == i11) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                i6Var.a(z11, true);
                            } else {
                                if (b10 == i38) {
                                    i10 = 0;
                                } else if (b10 == this.P) {
                                    i10 = 2;
                                } else if (b10 == this.nobodyRow) {
                                    i10 = 1;
                                } else {
                                    i10 = 3;
                                }
                                if (this.J == i10) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                i6Var.a(z10, true);
                            }
                        }
                    }
                }
                gt0Var.f(gt0Var.d);
                v4.o.c(gt0Var, true).c(this.f41637a);
                org.telegram.messenger.g0.b4(this.f41641c);
                return;
            }
            jt0Var.f();
        }
    }

    @Override
    public final void U(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z9, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f41671y0 = photoSize3;
                privacyControlActivity.f41672z0 = null;
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
                    org.telegram.ui.Components.hc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), org.telegram.messenger.hd.M0(2131747264, null), null, null).j();
                }
                privacyControlActivity.Q0(false);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27911gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28263zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28245yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28227xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28094qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28074pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28054ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27849d6));
    }

    @Override
    public final boolean canBeginSlide() {
        return G0(true);
    }

    @Override
    public final View createView(Context context) {
        setHasOwnBackground(true);
        int i7 = this.D;
        if (i7 == 5) {
            this.d = new kt0(this, context);
        }
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (i7 == 6) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746789, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746836, null));
        } else if (i7 == 4) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746776, null));
        } else if (i7 == 9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746866, null));
        } else if (i7 == 14) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746803, null));
        } else if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746799, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752596, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746816, null));
        } else if (i7 == 8) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746757, null));
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746814, null));
        } else if (i7 == 10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746809, null));
        } else if (i7 == 11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746859, null));
        } else if (i7 == 12) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746828, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ux(this, 29));
        this.simpleActionBar.o();
        org.telegram.ui.ActionBar.b5 n10 = this.simpleActionBar.n(org.telegram.messenger.hd.M0(2131745947, null));
        this.f41639b = n10;
        n10.a(J0(), false);
        this.f41637a = new jt0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.pj0 pj0Var = new org.telegram.ui.Components.pj0(context, null);
        this.f41641c = pj0Var;
        pj0Var.r1();
        this.f41641c.setLayoutManager(new v4.b0(1, false));
        this.f41641c.setSectionsDrawBackground(true);
        this.f41641c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.f41641c.getItemAnimator()).C = false;
        frameLayout.addView(this.f41641c, c8.ha.c(-1.0f, -1));
        if (this.d != null) {
            fi.m3 m3Var = new fi.m3(context, 1);
            m3Var.r(true);
            m3Var.h = org.telegram.messenger.g0.L(250.0f);
            m3Var.d = -1L;
            m3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
            m3Var.T = false;
            this.f41644e = m3Var;
            m3Var.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
            this.f41644e.l(getBaseSimpleGlass().f21018c);
            frameLayout.addView(this.f41644e, c8.ha.e(-1, 150, 55));
            this.f41641c.j(new g3(this, 26));
        }
        this.f41641c.setAdapter(this.f41637a);
        this.f41641c.setOnItemClickListener(new h(this, 26));
        ft0 ft0Var = new ft0(this);
        ft0Var.n(350L);
        ft0Var.o(org.telegram.ui.Components.xq.h);
        ft0Var.C = false;
        this.f41641c.setItemAnimator(ft0Var);
        L0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        kt0 kt0Var;
        if (i7 == org.telegram.messenger.qs.f25016k0) {
            H0();
        } else if (i7 == org.telegram.messenger.qs.f25009i4) {
            this.f41641c.g1();
        } else if (i7 == org.telegram.messenger.qs.f25113z4 && (kt0Var = this.d) != null) {
            kt0Var.invalidate();
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
    public final org.telegram.ui.Components.pj0 getListViewForSimpleGlass() {
        return this.f41641c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Md));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27819be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27910gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27839ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41641c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27818bc));
        return arrayList;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        return G0(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        H0();
        Q0(false);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25016k0);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25113z4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25009i4);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25016k0);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25113z4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25009i4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.j30 j30Var = this.f41663t0;
        if (j30Var != null) {
            j30Var.i();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        Q0(false);
        org.telegram.ui.Components.j30 j30Var = this.f41663t0;
        if (j30Var != null) {
            j30Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            kt0 kt0Var = this.d;
            if (kt0Var != null) {
                kt0Var.invalidate();
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
    public final void H(float f10) {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void O(boolean z9, boolean z10) {
    }
}
