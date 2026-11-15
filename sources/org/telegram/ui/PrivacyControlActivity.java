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
public class PrivacyControlActivity extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.l30 {
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
    public ht0 f43011a;
    public int f43012a0;
    public org.telegram.ui.ActionBar.z4 f43013b;
    public int f43014b0;
    public org.telegram.ui.Components.uj0 f43015c;
    public int f43016c0;
    private int currentPhotoForRestRow;
    public it0 d;
    public int f43017d0;
    public hi.l3 f43018e;
    public int f43019e0;
    private int everybodyRow;
    public final int[] f43020f;
    public int f43021f0;
    public int f43022g0;
    private int giftTypesHeaderRow;
    public int h;
    public int f43023h0;
    public int f43024i0;
    public int f43025j0;
    public int f43026k0;
    public int f43027l0;
    public int m0;
    public int f43028n;
    public int f43029n0;
    private int nobodyRow;
    public int f43030o0;
    public int f43031p0;
    private int photoForRestRow;
    private int priceRow;
    public int f43032q0;
    public final ArrayList f43033r;
    public int f43034r0;
    private int readRow;
    public final ArrayList f43035s;
    public int f43036s0;
    private int setBirthdayRow;
    private int showGiftIconRow;
    public int f43037t0;
    public final org.telegram.ui.Components.m30 f43038u0;
    public org.telegram.ui.Components.ch0 f43039v0;
    public final boolean[] f43040w;
    public org.telegram.ui.Cells.l8 f43041w0;
    public final boolean[] f43042x;
    public org.telegram.ui.Components.i9 f43043x0;
    public final boolean[] f43044y;
    public nr f43045y0;
    public TLRPC.PhotoSize f43046z0;

    public PrivacyControlActivity(int i7, boolean z10) {
        super(null);
        TLRPC.PhotoSize w10;
        this.f43020f = new int[2];
        this.f43033r = new ArrayList();
        this.f43035s = new ArrayList();
        this.f43040w = new boolean[4];
        this.f43042x = new boolean[4];
        this.f43044y = new boolean[4];
        this.F = new boolean[4];
        this.G = new boolean[4];
        this.H = new boolean[4];
        this.N = 10L;
        this.Q0 = 4;
        this.E = i7;
        if (z10) {
            org.telegram.messenger.g5.r(this.currentAccount).D(false);
        }
        if (i7 == 4) {
            org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(0, true, true);
            this.f43038u0 = m30Var;
            m30Var.f37040a = this;
            m30Var.f37041b = this;
            TLRPC.UserFull b22 = getMessagesController().b2(getUserConfig().f24953n);
            if (!org.telegram.messenger.q10.q(b22) || (w10 = org.telegram.messenger.w7.w(b22.fallback_photo.sizes, 1000, false, null, false)) == null) {
                return;
            }
            this.f43046z0 = w10;
            this.A0 = b22.fallback_photo;
        }
    }

    public static void Z(PrivacyControlActivity privacyControlActivity) {
        TLRPC.Photo photo;
        privacyControlActivity.f43046z0 = null;
        privacyControlActivity.A0 = null;
        TLRPC.UserFull b22 = privacyControlActivity.getMessagesController().b2(privacyControlActivity.getUserConfig().f24953n);
        if (b22 != null && (photo = b22.fallback_photo) != null) {
            b22.flags &= -4194305;
            b22.fallback_photo = null;
            privacyControlActivity.getMessagesStorage().j2(b22, true);
            privacyControlActivity.O0();
            privacyControlActivity.Q0(true);
            TLRPC.TL_inputPhoto tL_inputPhoto = new TLRPC.TL_inputPhoto();
            tL_inputPhoto.f28070id = photo.f28075id;
            tL_inputPhoto.access_hash = photo.access_hash;
            byte[] bArr = photo.file_reference;
            tL_inputPhoto.file_reference = bArr;
            if (bArr == null) {
                tL_inputPhoto.file_reference = new byte[0];
            }
            org.telegram.messenger.np.s1(privacyControlActivity.currentAccount).l0(tL_inputPhoto);
            org.telegram.messenger.ns.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.ns.f25475c0, new Object[0]);
        }
    }

    public static void a0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, boolean[] zArr) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.np.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
            org.telegram.messenger.np.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
            org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(13, privacyrules.rules);
            org.telegram.messenger.g0.h3(new mp0(7, privacyControlActivity, zArr));
            return;
        }
        privacyControlActivity.M0();
    }

    public static void b0(PrivacyControlActivity privacyControlActivity, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_photos_photo tL_photos_photo = (TLRPC.TL_photos_photo) tLObject;
            TLRPC.UserFull b22 = privacyControlActivity.getMessagesController().b2(privacyControlActivity.getUserConfig().f24953n);
            b22.flags |= 4194304;
            b22.fallback_photo = tL_photos_photo.photo;
            privacyControlActivity.getMessagesStorage().j2(b22, true);
            org.telegram.messenger.ns.f(privacyControlActivity.currentAccount).k(org.telegram.messenger.ns.f25475c0, new Object[0]);
            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 100, false, null, false);
            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(tL_photos_photo.photo.sizes, 1000, false, null, false);
            if (w10 != null && privacyControlActivity.f43046z0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.J(privacyControlActivity.f43046z0, null, true, true).renameTo(J);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(privacyControlActivity.f43046z0.location.volume_id);
                sb2.append("_");
                String n10 = a8.p0.n(privacyControlActivity.f43046z0.location.local_id, "@50_50", sb2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(w10.location.volume_id);
                sb3.append("_");
                org.telegram.messenger.fc.D().S(n10, a8.p0.n(w10.location.local_id, "@50_50", sb3), org.telegram.messenger.gc.e(w10.location));
            }
            if (w11 != null && privacyControlActivity.f43046z0 != null) {
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                File J2 = org.telegram.messenger.w7.J(w11, null, true, true);
                org.telegram.messenger.w7.G(privacyControlActivity.currentAccount);
                org.telegram.messenger.w7.J(privacyControlActivity.f43046z0.location, null, true, true).renameTo(J2);
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
            org.telegram.ui.ActionBar.t1 t1Var = org.telegram.ui.Components.t4.L(privacyControlActivity.getParentActivity(), org.telegram.messenger.hd.M0(2131746289, null), org.telegram.messenger.hd.M0(2131746290, null), org.telegram.messenger.hd.M0(2131746321, null), new us0(privacyControlActivity, 1), null).f28392a;
            t1Var.show();
            t1Var.i();
            return;
        }
        int i13 = 0;
        r8 = false;
        boolean z12 = false;
        int i14 = 0;
        if (i7 == privacyControlActivity.photoForRestRow) {
            org.telegram.ui.Components.m30 m30Var = privacyControlActivity.f43038u0;
            if (m30Var != null) {
                m30Var.n(false, new ai.o(28), new q5(privacyControlActivity, 12), 0);
                privacyControlActivity.f43039v0.M(0);
                privacyControlActivity.f43039v0.P(43);
                privacyControlActivity.f43041w0.f30656e.d();
                return;
            }
            return;
        }
        org.telegram.messenger.p2 p2Var = org.telegram.messenger.p2.APP_ERROR;
        if (i12 == 10 && i7 == privacyControlActivity.Q && !privacyControlActivity.getMessagesController().K5 && !privacyControlActivity.getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(privacyControlActivity).L(2131624217, org.telegram.messenger.hd.M0(2131747771, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747772, null)), org.telegram.messenger.hd.M0(2131747773, null), new us0(privacyControlActivity, 2)).j();
            p2Var.a();
            int i15 = -privacyControlActivity.Q0;
            privacyControlActivity.Q0 = i15;
            org.telegram.messenger.g0.F3(i15, view, null);
        } else if (i12 == 8 && ((i7 == privacyControlActivity.Q || i7 == privacyControlActivity.nobodyRow) && !privacyControlActivity.getUserConfig().q())) {
            org.telegram.ui.Components.cc.a0(privacyControlActivity).L(2131624217, org.telegram.messenger.hd.M0(2131747771, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747772, null)), org.telegram.messenger.hd.M0(2131747773, null), new us0(privacyControlActivity, 3)).j();
            p2Var.a();
            int i16 = -privacyControlActivity.Q0;
            privacyControlActivity.Q0 = i16;
            org.telegram.messenger.g0.F3(i16, view, null);
        } else if (i7 != privacyControlActivity.nobodyRow && i7 != privacyControlActivity.everybodyRow && i7 != privacyControlActivity.Q && i7 != privacyControlActivity.f43024i0) {
            if (i7 != privacyControlActivity.Z && i7 != privacyControlActivity.Y) {
                if (i7 != privacyControlActivity.V && i7 != privacyControlActivity.U) {
                    if (i7 == privacyControlActivity.f43017d0) {
                        privacyControlActivity.presentFragment(new PrivacyControlActivity(3, false));
                        return;
                    } else if (i7 == privacyControlActivity.readRow) {
                        privacyControlActivity.D0 = !privacyControlActivity.D0;
                        privacyControlActivity.P0();
                        ((org.telegram.ui.Cells.q8) view).setChecked(privacyControlActivity.D0);
                        return;
                    } else if (i7 == privacyControlActivity.f43022g0) {
                        privacyControlActivity.presentFragment(new PremiumPreviewFragment(0, "lastseen"));
                        return;
                    } else if (i7 == privacyControlActivity.showGiftIconRow) {
                        privacyControlActivity.F0 = !privacyControlActivity.F0;
                        privacyControlActivity.P0();
                        ((org.telegram.ui.Cells.q8) view).setChecked(privacyControlActivity.F0);
                        return;
                    } else if (i7 == privacyControlActivity.f43030o0) {
                        if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().q()) {
                            int i17 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i17;
                            org.telegram.messenger.g0.F3(i17, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F0 = privacyControlActivity.F0();
                        privacyControlActivity.J0 = !privacyControlActivity.J0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.q8 q8Var = (org.telegram.ui.Cells.q8) view;
                        q8Var.setChecked(privacyControlActivity.J0);
                        if (privacyControlActivity.J0 && !privacyControlActivity.getUserConfig().q()) {
                            q8Var.setCheckBoxIcon(2131232514);
                        }
                        if (F0 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.a4(privacyControlActivity.f43015c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43029n0) {
                        if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().q()) {
                            int i18 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i18;
                            org.telegram.messenger.g0.F3(i18, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F02 = privacyControlActivity.F0();
                        privacyControlActivity.H0 = !privacyControlActivity.H0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.q8 q8Var2 = (org.telegram.ui.Cells.q8) view;
                        q8Var2.setChecked(privacyControlActivity.H0);
                        if (privacyControlActivity.H0 && !privacyControlActivity.getUserConfig().q()) {
                            q8Var2.setCheckBoxIcon(2131232514);
                        }
                        if (F02 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.a4(privacyControlActivity.f43015c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43031p0) {
                        if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().q()) {
                            int i19 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i19;
                            org.telegram.messenger.g0.F3(i19, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F03 = privacyControlActivity.F0();
                        privacyControlActivity.L0 = !privacyControlActivity.L0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.q8 q8Var3 = (org.telegram.ui.Cells.q8) view;
                        q8Var3.setChecked(privacyControlActivity.L0);
                        if (privacyControlActivity.L0 && !privacyControlActivity.getUserConfig().q()) {
                            q8Var3.setCheckBoxIcon(2131232514);
                        }
                        if (F03 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.a4(privacyControlActivity.f43015c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43032q0) {
                        if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().q()) {
                            int i20 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i20;
                            org.telegram.messenger.g0.F3(i20, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F04 = privacyControlActivity.F0();
                        privacyControlActivity.N0 = !privacyControlActivity.N0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.q8 q8Var4 = (org.telegram.ui.Cells.q8) view;
                        q8Var4.setChecked(privacyControlActivity.N0);
                        if (privacyControlActivity.N0 && !privacyControlActivity.getUserConfig().q()) {
                            q8Var4.setCheckBoxIcon(2131232514);
                        }
                        if (F04 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.a4(privacyControlActivity.f43015c);
                            return;
                        }
                        return;
                    } else if (i7 == privacyControlActivity.f43034r0) {
                        if (privacyControlActivity.P0 && !privacyControlActivity.getUserConfig().q()) {
                            int i21 = -privacyControlActivity.Q0;
                            privacyControlActivity.Q0 = i21;
                            org.telegram.messenger.g0.F3(i21, view, null);
                            privacyControlActivity.N0();
                            return;
                        }
                        boolean F05 = privacyControlActivity.F0();
                        privacyControlActivity.P0 = !privacyControlActivity.P0;
                        privacyControlActivity.P0();
                        org.telegram.ui.Cells.q8 q8Var5 = (org.telegram.ui.Cells.q8) view;
                        q8Var5.setChecked(privacyControlActivity.P0);
                        if (privacyControlActivity.P0 && !privacyControlActivity.getUserConfig().q()) {
                            q8Var5.setCheckBoxIcon(2131232514);
                        }
                        if (F05 != privacyControlActivity.F0()) {
                            privacyControlActivity.Q0(true);
                            org.telegram.messenger.g0.a4(privacyControlActivity.f43015c);
                            return;
                        }
                        return;
                    } else {
                        return;
                    }
                } else if (i12 == 12 && privacyControlActivity.F0()) {
                    int i22 = -privacyControlActivity.Q0;
                    privacyControlActivity.Q0 = i22;
                    org.telegram.messenger.g0.F3(i22, view, null);
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
                    w40 w40Var = new w40(bundle);
                    if (i12 == 10) {
                        w40Var.M = org.telegram.messenger.hd.M0(2131746291, null);
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
                            w40Var.u0(arrayList, z11, z12);
                            w40Var.f52428x = new s40() {
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
                                    privacyControlActivity2.f43011a.f();
                                }
                            };
                            w40Var.f52408f0 = true;
                            privacyControlActivity.presentFragment(w40Var);
                            return;
                        }
                    }
                    z11 = false;
                    if (z10) {
                        z12 = true;
                    }
                    w40Var.u0(arrayList, z11, z12);
                    w40Var.f52428x = new s40() {
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
                            privacyControlActivity2.f43011a.f();
                        }
                    };
                    w40Var.f52408f0 = true;
                    privacyControlActivity.presentFragment(w40Var);
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
            org.telegram.messenger.g0.F3(i23, view, null);
        } else {
            if (i7 == privacyControlActivity.nobodyRow) {
                i13 = 1;
            } else if (i7 != privacyControlActivity.everybodyRow) {
                if (i7 == privacyControlActivity.f43024i0) {
                    i13 = 3;
                } else {
                    i13 = 2;
                }
            }
            if (i13 == privacyControlActivity.K) {
                return;
            }
            privacyControlActivity.K = i13;
            org.telegram.ui.Components.xb.e();
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
        org.telegram.ui.Components.cc.a0(privacyControlActivity).f0(tL_error, false);
    }

    public static void e0(PrivacyControlActivity privacyControlActivity, TLRPC.TL_error tL_error, TLObject tLObject, AtomicInteger atomicInteger) {
        if (tL_error == null) {
            TL_account.privacyRules privacyrules = (TL_account.privacyRules) tLObject;
            org.telegram.messenger.np.s1(privacyControlActivity.currentAccount).Y3(privacyrules.users, false);
            org.telegram.messenger.np.s1(privacyControlActivity.currentAccount).S3(privacyrules.chats, false);
            org.telegram.messenger.g5.r(privacyControlActivity.currentAccount).M(privacyControlActivity.E, privacyrules.rules);
            if (atomicInteger.decrementAndGet() == 0) {
                privacyControlActivity.I0();
                return;
            }
            return;
        }
        privacyControlActivity.M0();
    }

    public static void w0(PrivacyControlActivity privacyControlActivity) {
        it0 it0Var;
        int[] iArr = privacyControlActivity.f43020f;
        if (privacyControlActivity.f43018e != null && (it0Var = privacyControlActivity.d) != null && privacyControlActivity.fragmentView != null) {
            if (it0Var.getParent() == privacyControlActivity.f43015c && privacyControlActivity.d.isAttachedToWindow()) {
                privacyControlActivity.d.getLocationInWindow(iArr);
                int i7 = iArr[0];
                int i10 = iArr[1];
                privacyControlActivity.fragmentView.getLocationInWindow(iArr);
                privacyControlActivity.f43018e.x(privacyControlActivity.d.f48125b.getForwardNameCenterX() + privacyControlActivity.d.f48125b.getLeft() + (i7 - iArr[0]), org.telegram.messenger.g0.L(44.0f) + privacyControlActivity.d.getPaddingTop() + (i10 - iArr[1]), false);
                return;
            }
            privacyControlActivity.f43018e.f(false);
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
                ArrayList arrayList = this.f43033r;
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
                            if (org.telegram.messenger.m5.E(longValue)) {
                                TLRPC.User a22 = org.telegram.messenger.np.s1(this.currentAccount).a2(l10);
                                if (a22 != null) {
                                    tL_inputPrivacyValueAllowUsers.users.add(org.telegram.messenger.np.s1(this.currentAccount).q1(a22));
                                }
                            } else {
                                tL_inputPrivacyValueAllowChatParticipants.chats.add(Long.valueOf(-longValue));
                            }
                        }
                        setprivacy.rules.add(tL_inputPrivacyValueAllowUsers);
                        setprivacy.rules.add(tL_inputPrivacyValueAllowChatParticipants);
                    }
                    getConnectionsManager().sendRequest(setprivacy, new b00(21, this, zArr));
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
            getConnectionsManager().sendRequest(setglobalprivacysettings, new bi.l1(this, zArr, globalPrivacySettings, setglobalprivacysettings, 17));
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
                    public final PrivacyControlActivity f52277b;

                    {
                        this.f52277b = this;
                    }

                    @Override
                    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                        switch (r3) {
                            case 0:
                                final PrivacyControlActivity privacyControlActivity = this.f52277b;
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
                                final PrivacyControlActivity privacyControlActivity2 = this.f52277b;
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
        if (this.K != 0 && this.I.size() > 0) {
            TLRPC.TL_inputPrivacyValueAllowUsers tL_inputPrivacyValueAllowUsers2 = new TLRPC.TL_inputPrivacyValueAllowUsers();
            TLRPC.TL_inputPrivacyValueAllowChatParticipants tL_inputPrivacyValueAllowChatParticipants2 = new TLRPC.TL_inputPrivacyValueAllowChatParticipants();
            for (int i12 = 0; i12 < this.I.size(); i12++) {
                Long l11 = (Long) this.I.get(i12);
                long longValue2 = l11.longValue();
                if (org.telegram.messenger.m5.E(longValue2)) {
                    TLRPC.User a23 = org.telegram.messenger.np.s1(this.currentAccount).a2(l11);
                    if (a23 != null) {
                        tL_inputPrivacyValueAllowUsers2.users.add(org.telegram.messenger.np.s1(this.currentAccount).q1(a23));
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
            public final PrivacyControlActivity f52277b;

            {
                this.f52277b = this;
            }

            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                switch (r3) {
                    case 0:
                        final PrivacyControlActivity privacyControlActivity = this.f52277b;
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
                        final PrivacyControlActivity privacyControlActivity2 = this.f52277b;
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
                public final PrivacyControlActivity f52991b;

                {
                    this.f52991b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f52991b;
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
                                            if (z12 != setglobalprivacysettings4.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings4.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
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
                            final PrivacyControlActivity privacyControlActivity2 = this.f52991b;
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
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
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
                public final PrivacyControlActivity f52991b;

                {
                    this.f52991b = this;
                }

                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    switch (r5) {
                        case 0:
                            final PrivacyControlActivity privacyControlActivity = this.f52991b;
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
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
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
                            final PrivacyControlActivity privacyControlActivity2 = this.f52991b;
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
                                            if (z12 != setglobalprivacysettings42.settings.display_gifts_button && (b22 = privacyControlActivity3.getMessagesController().b2(privacyControlActivity3.getUserConfig().e())) != null) {
                                                b22.display_gifts_button = setglobalprivacysettings42.settings.display_gifts_button;
                                                privacyControlActivity3.getMessagesStorage().j2(b22, false);
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
            this.f43013b.b(true);
        }
    }

    public final boolean F0() {
        if (!this.L0 && !this.H0 && !this.J0) {
            return true;
        }
        return false;
    }

    public final boolean G0(boolean z10) {
        if (this.f43013b.f29949x.f57082f) {
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                String M0 = org.telegram.messenger.hd.M0(2131743726, null);
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                t1Var.S = M0;
                t1Var.U = org.telegram.messenger.hd.M0(2131746770, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131754216, null), new ys0(this, 0));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131747580, null), new ys0(this, 2));
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
        ArrayList arrayList2 = this.f43033r;
        int i10 = 2;
        int i11 = this.E;
        if (i11 == 10) {
            TLRPC.GlobalPrivacySettings globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).Y;
            i10 = (globalPrivacySettings == null || !globalPrivacySettings.new_noncontact_peers_require_premium) ? 0 : 0;
            this.K = i10;
            this.h = i10;
            this.J = new ArrayList();
            this.I = new ArrayList();
            if (globalPrivacySettings != null && (globalPrivacySettings.flags & 32) != 0) {
                long k10 = Utilities.k(globalPrivacySettings.noncontact_peers_paid_stars, getMessagesController().J6, 1L);
                this.N = k10;
                this.M = k10;
                this.K = 3;
                this.h = 3;
            } else {
                this.N = 10L;
                this.M = 10L;
            }
            ArrayList v = org.telegram.messenger.g5.r(this.currentAccount).v(13);
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
        boolean[] zArr4 = this.f43040w;
        zArr4[0] = z10;
        boolean[] zArr5 = this.F;
        zArr5[0] = z10;
        zArr4[1] = false;
        zArr5[1] = false;
        boolean[] zArr6 = this.f43042x;
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
        boolean[] zArr8 = this.f43044y;
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
        ArrayList v10 = org.telegram.messenger.g5.r(this.currentAccount).v(i11);
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
            org.telegram.ui.ActionBar.z4 z4Var = this.f43013b;
            if (z4Var != null) {
                z4Var.a(false, false);
            }
        } else {
            this.K = 1;
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.f43035s;
        arrayList3.clear();
        this.h = this.K;
        arrayList2.addAll(this.I);
        arrayList3.addAll(this.J);
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
            this.f43028n = this.L;
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
        org.telegram.messenger.g0.a4(this.f43015c);
    }

    public final void I0() {
        TLRPC.GlobalPrivacySettings globalPrivacySettings;
        TLRPC.PrivacyRule privacyRule;
        int i7;
        int i10;
        this.f43013b.b(false);
        int i11 = this.E;
        if ((i11 == 10 || i11 == 1 || i11 == 2) && this.K != 0 && (globalPrivacySettings = org.telegram.messenger.g5.r(this.currentAccount).Y) != null && (globalPrivacySettings.new_noncontact_peers_require_premium || globalPrivacySettings.noncontact_peers_paid_stars > 0)) {
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
                        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                        t1Var.S = M0;
                        if (i13 == 1) {
                            i10 = 2131752148;
                        } else {
                            i10 = 2131752150;
                        }
                        t1Var.U = org.telegram.messenger.hd.M0(i10, null);
                        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131752146, null), new ai.r1(this, i13, 19));
                        alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), new ys0(this, 1));
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
        if (i7 == 6 && i11 == 1 && this.f43028n != this.L) {
            return true;
        }
        if (i11 != 0) {
            if (i11 == 2) {
                c10 = 0;
            } else {
                c10 = 1;
            }
            boolean z10 = this.f43040w[c10];
            if (i11 == 2) {
                c11 = 0;
            } else {
                c11 = 1;
            }
            if (z10 != this.F[c11]) {
                return true;
            }
        }
        if ((i7 == 10 && i11 == 3 && this.N != this.M) || this.f43042x[i11] != this.G[i11]) {
            return true;
        }
        ArrayList arrayList2 = this.f43035s;
        if (arrayList2.size() != this.J.size()) {
            return true;
        }
        ArrayList arrayList3 = this.f43033r;
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
            showDialog(new ug.x0((org.telegram.ui.ActionBar.e2) this, 27, true));
            return;
        }
        if (this.K != 0 && i7 == 0 && !getUserConfig().q()) {
            SharedPreferences e12 = org.telegram.messenger.np.e1();
            if (!e12.getBoolean("privacyAlertShowed", false)) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                if (i7 == 1) {
                    t1Var.U = org.telegram.messenger.hd.M0(2131742881, null);
                } else {
                    t1Var.U = org.telegram.messenger.hd.M0(2131751685, null);
                }
                t1Var.S = org.telegram.messenger.hd.M0(2131689472, null);
                alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), new xi0(12, this, e12));
                alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                showDialog(t1Var);
                return;
            }
        }
        E0();
    }

    public final void L0() {
        it0 it0Var = this.d;
        if (it0Var != null) {
            it0Var.f48127e.f23817k.fwd_from.from_id = new TLRPC.TL_peerUser();
            int i7 = this.K;
            if (i7 == 0) {
                String M0 = org.telegram.messenger.hd.M0(2131746835, null);
                hi.l3 l3Var = this.f43018e;
                if (l3Var != null) {
                    l3Var.u(M0);
                }
                this.d.f48127e.f23817k.fwd_from.from_id.user_id = 1L;
            } else if (i7 == 1) {
                String M02 = org.telegram.messenger.hd.M0(2131746831, null);
                hi.l3 l3Var2 = this.f43018e;
                if (l3Var2 != null) {
                    l3Var2.u(M02);
                }
                this.d.f48127e.f23817k.fwd_from.from_id.user_id = 0L;
            } else {
                String M03 = org.telegram.messenger.hd.M0(2131746836, null);
                hi.l3 l3Var3 = this.f43018e;
                if (l3Var3 != null) {
                    l3Var3.u(M03);
                }
                this.d.f48127e.f23817k.fwd_from.from_id.user_id = 1L;
            }
            this.d.f48125b.H1();
        }
    }

    public final void M0() {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.hd.M0(2131689472, null);
        org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
        t1Var.S = M0;
        t1Var.U = org.telegram.messenger.hd.M0(2131746838, null);
        alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131747831, null), null);
        showDialog(t1Var);
    }

    public final void N0() {
        org.telegram.ui.Components.cc.a0(this).L(2131624217, org.telegram.messenger.hd.M0(2131747771, null), org.telegram.messenger.g0.X2(org.telegram.messenger.hd.M0(2131747772, null)), org.telegram.messenger.hd.M0(2131747773, null), new us0(this, 0)).j();
    }

    public final void O0() {
        TLRPC.PhotoSize photoSize;
        org.telegram.ui.Cells.l8 l8Var = this.f43041w0;
        if (l8Var != null) {
            if (this.f43046z0 == null) {
                l8Var.getTextView().k(org.telegram.messenger.hd.a0("SetPhotoForRest", null, 2131745517, new Object[0]));
                this.f43041w0.setNeedDivider(false);
            } else {
                l8Var.getTextView().k(org.telegram.messenger.hd.a0("UpdatePhotoForRest", null, 2131743817, new Object[0]));
                this.f43041w0.setNeedDivider(true);
            }
        }
        org.telegram.ui.Components.i9 i9Var = this.f43043x0;
        if (i9Var != null && (photoSize = this.f43046z0) != null) {
            TLRPC.Photo photo = this.A0;
            if (photo != null) {
                i9Var.j(org.telegram.messenger.gc.i(photoSize, photo), "50_50", null, org.telegram.messenger.m10.i(this.currentAccount).f());
            } else {
                i9Var.j(org.telegram.messenger.gc.e(photoSize.location), "50_50", null, org.telegram.messenger.m10.i(this.currentAccount).f());
            }
        }
    }

    public final void P0() {
        this.f43013b.a(J0(), true);
    }

    public final void Q0(boolean z10) {
        et0 et0Var;
        ArrayList arrayList;
        int i7;
        v4.e1 T;
        int i10;
        boolean z11;
        int i11;
        boolean z12;
        TLRPC.UserFull b22;
        if (z10) {
            et0Var = new et0(this);
            et0Var.f(et0Var.f46919c);
            et0Var.f46918b = this.f43037t0;
        } else {
            et0Var = null;
        }
        this.photoForRestRow = -1;
        this.currentPhotoForRestRow = -1;
        this.f43014b0 = -1;
        this.O = -1;
        this.setBirthdayRow = -1;
        this.f43012a0 = -1;
        this.X = -1;
        this.Y = -1;
        this.Z = -1;
        this.U = -1;
        this.V = -1;
        this.f43016c0 = -1;
        this.f43017d0 = -1;
        this.R = -1;
        this.S = -1;
        this.f43019e0 = -1;
        this.f43021f0 = -1;
        this.readRow = -1;
        this.nobodyRow = -1;
        this.T = -1;
        this.W = -1;
        this.f43024i0 = -1;
        this.f43025j0 = -1;
        this.priceRow = -1;
        this.f43027l0 = -1;
        this.f43026k0 = -1;
        this.f43022g0 = -1;
        this.f43023h0 = -1;
        this.showGiftIconRow = -1;
        this.m0 = -1;
        this.giftTypesHeaderRow = -1;
        this.f43029n0 = -1;
        this.f43030o0 = -1;
        this.f43031p0 = -1;
        this.f43032q0 = -1;
        this.f43034r0 = -1;
        this.f43036s0 = -1;
        this.f43037t0 = 0;
        int i12 = this.E;
        if (i12 == 12) {
            this.showGiftIconRow = 0;
            this.f43037t0 = 2;
            this.m0 = 1;
        }
        if (i12 == 11 && (b22 = getMessagesController().b2(getUserConfig().e())) != null && b22.birthday == null) {
            int i13 = this.f43037t0;
            this.f43037t0 = i13 + 1;
            this.setBirthdayRow = i13;
        }
        if (i12 == 5) {
            int i14 = this.f43037t0;
            this.f43037t0 = i14 + 1;
            this.O = i14;
        }
        int i15 = this.f43037t0;
        this.P = i15;
        this.everybodyRow = i15 + 1;
        int i16 = i15 + 3;
        this.f43037t0 = i16;
        this.Q = i15 + 2;
        if (i12 == 4 || i12 == 9 || i12 == 14 || i12 == 0 || i12 == 2 || i12 == 3 || i12 == 5 || i12 == 6 || i12 == 8 || i12 == 1 || i12 == 11 || i12 == 12) {
            this.f43037t0 = i15 + 4;
            this.nobodyRow = i16;
        }
        if (getMessagesController().M6 && i12 == 10) {
            int i17 = this.f43037t0;
            this.f43037t0 = i17 + 1;
            this.f43024i0 = i17;
        }
        if (i12 == 6 && this.K == 1) {
            int i18 = this.f43037t0;
            this.f43012a0 = i18;
            this.X = i18 + 1;
            this.Y = i18 + 2;
            this.f43037t0 = i18 + 4;
            this.Z = i18 + 3;
        }
        if (i12 == 10 && this.K == 3) {
            int i19 = this.f43037t0;
            this.f43037t0 = i19 + 1;
            this.S = i19;
        } else {
            int i20 = this.f43037t0;
            this.f43037t0 = i20 + 1;
            this.R = i20;
        }
        if (i12 == 10) {
            if (this.K == 3) {
                int i21 = this.f43037t0;
                this.f43025j0 = i21;
                this.f43037t0 = i21 + 2;
                this.priceRow = i21 + 1;
                if (!getUserConfig().q()) {
                    int i22 = this.f43037t0;
                    this.f43037t0 = i22 + 1;
                    this.f43026k0 = i22;
                }
                int i23 = this.f43037t0;
                this.f43037t0 = i23 + 1;
                this.f43027l0 = i23;
                if (getUserConfig().q()) {
                    int i24 = this.f43037t0;
                    this.T = i24;
                    this.U = i24 + 1;
                    this.f43037t0 = i24 + 3;
                    this.W = i24 + 2;
                }
            }
        } else if (i12 != 8 || getUserConfig().q()) {
            int i25 = this.f43037t0;
            int i26 = i25 + 1;
            this.f43037t0 = i26;
            this.T = i25;
            int i27 = this.K;
            if (i27 == 1 || i27 == 2) {
                this.f43037t0 = i25 + 2;
                this.U = i26;
            }
            if (i27 == 0 || i27 == 2) {
                int i28 = this.f43037t0;
                this.f43037t0 = i28 + 1;
                this.V = i28;
            }
            int i29 = this.f43037t0;
            int i30 = i29 + 1;
            this.f43037t0 = i30;
            this.W = i29;
            if (i12 == 2) {
                this.f43016c0 = i30;
                this.f43017d0 = i29 + 2;
                this.f43037t0 = i29 + 4;
                this.f43019e0 = i29 + 3;
            }
            if (i12 == 4 && (this.J.size() > 0 || (i7 = this.K) == 2 || i7 == 1)) {
                int i31 = this.f43037t0;
                int i32 = i31 + 1;
                this.f43037t0 = i32;
                this.photoForRestRow = i31;
                if (this.f43046z0 != null) {
                    this.f43037t0 = i31 + 2;
                    this.currentPhotoForRestRow = i32;
                }
                int i33 = this.f43037t0;
                this.f43037t0 = i33 + 1;
                this.f43014b0 = i33;
            }
            if (i12 == 0 && (this.K != 0 || ((arrayList = this.J) != null && !arrayList.isEmpty()))) {
                int i34 = this.f43037t0;
                this.readRow = i34;
                this.f43037t0 = i34 + 2;
                this.f43021f0 = i34 + 1;
            }
            if (i12 == 0 && !getMessagesController().D3()) {
                int i35 = this.f43037t0;
                this.f43022g0 = i35;
                this.f43037t0 = i35 + 2;
                this.f43023h0 = i35 + 1;
            }
        }
        if (i12 == 12) {
            int i36 = this.f43037t0;
            this.giftTypesHeaderRow = i36;
            this.f43030o0 = i36 + 1;
            this.f43029n0 = i36 + 2;
            this.f43031p0 = i36 + 3;
            this.f43032q0 = i36 + 4;
            this.f43034r0 = i36 + 5;
            this.f43037t0 = i36 + 7;
            this.f43036s0 = i36 + 6;
        }
        L0();
        ht0 ht0Var = this.f43011a;
        if (ht0Var != null) {
            if (z10) {
                int childCount = this.f43015c.getChildCount();
                for (int i37 = 0; i37 < childCount; i37++) {
                    View childAt = this.f43015c.getChildAt(i37);
                    if (childAt instanceof org.telegram.ui.Cells.h6) {
                        org.telegram.ui.Components.uj0 uj0Var = this.f43015c;
                        View F = uj0Var.F(childAt);
                        if (F == null) {
                            T = null;
                        } else {
                            T = uj0Var.T(F);
                        }
                        if (T != null) {
                            int b10 = T.b();
                            org.telegram.ui.Cells.h6 h6Var = (org.telegram.ui.Cells.h6) childAt;
                            int i38 = this.everybodyRow;
                            if (b10 != i38 && b10 != this.Q && b10 != this.nobodyRow && b10 != this.f43024i0) {
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
                                h6Var.a(z12, true);
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
                                h6Var.a(z11, true);
                            }
                        }
                    }
                }
                et0Var.f(et0Var.d);
                v4.o.c(et0Var, true).c(this.f43011a);
                org.telegram.messenger.g0.a4(this.f43015c);
                return;
            }
            ht0Var.f();
        }
    }

    @Override
    public final void V(final TLRPC.InputFile inputFile, final TLRPC.InputFile inputFile2, final double d, String str, final TLRPC.PhotoSize photoSize, final TLRPC.PhotoSize photoSize2, boolean z10, final TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new Runnable() {
            @Override
            public final void run() {
                PrivacyControlActivity privacyControlActivity = PrivacyControlActivity.this;
                TLRPC.PhotoSize photoSize3 = photoSize2;
                privacyControlActivity.f43046z0 = photoSize3;
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
                    org.telegram.ui.Components.cc.a0(privacyControlActivity).V(Collections.singletonList(tL_user), org.telegram.messenger.hd.M0(2131747265, null), null, null).j();
                }
                privacyControlActivity.Q0(false);
            }
        });
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28965jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29150tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29131sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29208wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29189vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29170ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29113rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29149ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29112ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.h7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28905g7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.I6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
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
            this.d = new it0(this, context);
        }
        this.simpleActionBar.setBackButtonImage(2131231240);
        if (i7 == 6) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746790, null));
        } else if (i7 == 5) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746837, null));
        } else if (i7 == 4) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746777, null));
        } else if (i7 == 9) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746867, null));
        } else if (i7 == 14) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746804, null));
        } else if (i7 == 3) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746800, null));
        } else if (i7 == 2) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131752596, null));
        } else if (i7 == 1) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746817, null));
        } else if (i7 == 8) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746758, null));
        } else if (i7 == 0) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746815, null));
        } else if (i7 == 10) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746810, null));
        } else if (i7 == 11) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746860, null));
        } else if (i7 == 12) {
            this.simpleActionBar.setTitle(org.telegram.messenger.hd.M0(2131746829, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new ct0(this, 0));
        this.simpleActionBar.r();
        org.telegram.ui.ActionBar.z4 q10 = this.simpleActionBar.q(org.telegram.messenger.hd.M0(2131745946, null));
        this.f43013b = q10;
        q10.a(J0(), false);
        this.f43011a = new ht0(this, context);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(context, null);
        this.f43015c = uj0Var;
        uj0Var.r1();
        this.f43015c.setLayoutManager(new v4.b0(1, false));
        this.f43015c.setSectionsDrawBackground(true);
        this.f43015c.setVerticalScrollBarEnabled(false);
        ((v4.k) this.f43015c.getItemAnimator()).C = false;
        frameLayout.addView(this.f43015c, c8.ja.c(-1.0f, -1));
        if (this.d != null) {
            hi.l3 l3Var = new hi.l3(context, 1);
            l3Var.r(true);
            l3Var.h = org.telegram.messenger.g0.L(250.0f);
            l3Var.d = -1L;
            l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
            l3Var.U = false;
            this.f43018e = l3Var;
            l3Var.setPadding(org.telegram.messenger.g0.L(19.0f), 0, org.telegram.messenger.g0.L(19.0f), 0);
            this.f43018e.l(getBaseSimpleGlass().f56042c);
            frameLayout.addView(this.f43018e, c8.ja.e(-1, 150, 55));
            this.f43015c.j(new g3(this, 26));
        }
        this.f43015c.setAdapter(this.f43011a);
        this.f43015c.setOnItemClickListener(new h(this, 26));
        dt0 dt0Var = new dt0(this);
        dt0Var.n(350L);
        dt0Var.o(org.telegram.ui.Components.er.h);
        dt0Var.C = false;
        this.f43015c.setItemAnimator(dt0Var);
        L0();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        it0 it0Var;
        if (i7 == org.telegram.messenger.ns.f25521k0) {
            H0();
        } else if (i7 == org.telegram.messenger.ns.f25514i4) {
            this.f43015c.g1();
        } else if (i7 == org.telegram.messenger.ns.f25618z4 && (it0Var = this.d) != null) {
            it0Var.invalidate();
        }
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final uq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return null;
    }

    @Override
    public final org.telegram.ui.Components.uj0 getListViewForSimpleGlass() {
        return this.f43015c;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Tb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ub));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Rd));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28875ee));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28964jc));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f43015c, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28873ec));
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
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25521k0);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25618z4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25514i4);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25521k0);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25618z4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25514i4);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.m30 m30Var = this.f43038u0;
        if (m30Var != null) {
            m30Var.i();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        Q0(false);
        org.telegram.ui.Components.m30 m30Var = this.f43038u0;
        if (m30Var != null) {
            m30Var.k();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            it0 it0Var = this.d;
            if (it0Var != null) {
                it0Var.invalidate();
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
    public final void O(boolean z10, boolean z11) {
    }
}
