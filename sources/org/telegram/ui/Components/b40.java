package org.telegram.ui.Components;

import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.Pair;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.PhotoViewer;
public final class b40 implements org.telegram.messenger.vs, org.telegram.ui.yn0 {
    public org.telegram.messenger.kj D;
    public String E;
    public boolean F;
    public boolean H;
    public final boolean I;
    public TLRPC.User L;
    public TLRPC.InputFile M;
    public TLRPC.InputFile N;
    public TLRPC.VideoSize O;
    public double P;
    public final boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public int U;
    public final int V;
    public float W;
    public org.telegram.ui.ActionBar.k2 f24618a;
    public a40 f24619b;
    public bi f24620c;
    public String f24621f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f24622n;
    public Bitmap f24623r;
    public boolean f24624s;
    public String f24625w;
    public String f24626x;
    public String f24627y;
    public final int d = org.telegram.messenger.e20.f15506s0;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver e = new ImageReceiver(null);

    public b40(int i10, boolean z10, boolean z11) {
        this.Q = z10;
        this.I = z11;
        this.V = i10;
    }

    public static void a(b40 b40Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.kj kjVar;
        Bitmap K;
        ImageReceiver imageReceiver = b40Var.e;
        int i10 = b40Var.d;
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.qz qzVar = (org.telegram.messenger.qz) arrayList.get(0);
            Bitmap bitmap = null;
            if ((qzVar.f17859o || qzVar.f17855k != null) && !qzVar.f17860p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f19815id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                kjVar = new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, tL_message, false, false);
                kjVar.f16690k.attachPath = new File(org.telegram.messenger.b8.z(4), org.telegram.messenger.uz.p() + "_avatar.mp4").getAbsolutePath();
                kjVar.f16709p0 = qzVar.f17855k;
                kjVar.f16720s = qzVar.v;
                bitmap = org.telegram.messenger.ic.K(qzVar.e, null, 800.0f, 800.0f, true);
            } else {
                String str = qzVar.f17850c;
                if (str != null) {
                    K = org.telegram.messenger.ic.K(str, null, 800.0f, 800.0f, true);
                } else {
                    org.telegram.messenger.jf jfVar = qzVar.f17856l;
                    if (jfVar != null) {
                        TLRPC.Photo photo = jfVar.K;
                        if (photo != null) {
                            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(photo.sizes, org.telegram.messenger.i0.Z0(false), false, null, false);
                            if (w9 != null) {
                                org.telegram.messenger.b8.G(i10);
                                File K2 = org.telegram.messenger.b8.K(w9, null, true, true);
                                b40Var.E = K2.getAbsolutePath();
                                if (!K2.exists()) {
                                    org.telegram.messenger.b8.G(i10);
                                    K2 = org.telegram.messenger.b8.K(w9, null, false, true);
                                    if (!K2.exists()) {
                                        K2 = null;
                                    }
                                }
                                if (K2 != null) {
                                    K = org.telegram.messenger.ic.K(K2.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    org.telegram.messenger.at.f(i10).b(b40Var, org.telegram.messenger.at.Y1);
                                    org.telegram.messenger.at.f(i10).b(b40Var, org.telegram.messenger.at.Z1);
                                    b40Var.f24625w = org.telegram.messenger.b8.r(null, w9.location);
                                    imageReceiver.q0(org.telegram.messenger.jc.i(w9, qzVar.f17856l.K), null, null, "jpg", null, 1);
                                }
                            }
                            K = null;
                        } else if (jfVar.C != null) {
                            File file = new File(org.telegram.messenger.b8.z(4), Utilities.a(qzVar.f17856l.C) + "." + org.telegram.messenger.ic.B(qzVar.f17856l.C, "jpg"));
                            b40Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                K = org.telegram.messenger.ic.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                b40Var.f24625w = qzVar.f17856l.C;
                                org.telegram.messenger.at.f(i10).b(b40Var, org.telegram.messenger.at.R1);
                                org.telegram.messenger.at.f(i10).b(b40Var, org.telegram.messenger.at.S1);
                                imageReceiver.o0(qzVar.f17856l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    kjVar = null;
                }
                kjVar = null;
                bitmap = K;
            }
            b40Var.r(z10, bitmap, kjVar);
        }
    }

    public final void b() {
        this.T = true;
        String str = this.f24625w;
        int i10 = this.d;
        if (str != null) {
            org.telegram.messenger.b8.G(i10).b(this.f24625w, false);
        }
        if (this.f24626x != null) {
            org.telegram.messenger.b8.G(i10).b(this.f24626x, false);
        }
        a40 a40Var = this.f24619b;
        if (a40Var != null) {
            a40Var.U();
        }
    }

    public final void c() {
        this.f24625w = null;
        this.f24626x = null;
        this.f24627y = null;
        this.D = null;
        if (this.F) {
            this.e.w0(null);
            this.f24618a = null;
            this.f24619b = null;
        }
    }

    public final void d() {
        this.T = false;
        if (this.f24625w == null && this.f24626x == null && this.D == null) {
            this.f24618a = null;
            this.f24619b = null;
        } else {
            this.F = true;
        }
        bi biVar = this.f24620c;
        if (biVar != null) {
            biVar.L();
            this.f24620c.i1();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a40 a40Var;
        org.telegram.ui.ActionBar.k2 k2Var;
        String str;
        int i12 = org.telegram.messenger.at.W1;
        int i13 = org.telegram.messenger.at.V1;
        int i14 = this.d;
        int i15 = org.telegram.messenger.at.U1;
        if (i10 != i15 && i10 != i13) {
            if (i10 == i12) {
                String str2 = (String) objArr[0];
                if (this.D != null) {
                    str = this.f24626x;
                } else {
                    str = this.f24625w;
                }
                if (this.f24619b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    a40 a40Var2 = this.f24619b;
                    this.W = min;
                    a40Var2.I(min);
                    return;
                }
                return;
            }
            int i16 = org.telegram.messenger.at.S1;
            int i17 = org.telegram.messenger.at.R1;
            int i18 = org.telegram.messenger.at.Z1;
            int i19 = org.telegram.messenger.at.Y1;
            if (i10 != i19 && i10 != i18 && i10 != i17 && i10 != i16) {
                int i20 = org.telegram.messenger.at.f14688c2;
                int i21 = org.telegram.messenger.at.f14682b2;
                int i22 = org.telegram.messenger.at.a2;
                if (i10 == i20) {
                    if (((org.telegram.messenger.kj) objArr[0]) == this.D && this.f24618a != null) {
                        org.telegram.messenger.at.f(i14).n(this, i22);
                        org.telegram.messenger.at.f(i14).n(this, i20);
                        org.telegram.messenger.at.f(i14).n(this, i21);
                        c();
                        return;
                    }
                    return;
                } else if (i10 == i21) {
                    if (((org.telegram.messenger.kj) objArr[0]) == this.D && this.f24618a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f24618a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap s10 = org.telegram.messenger.rz.s(str3, (long) (this.P * 1000.0d), null, true);
                            if (s10 != null) {
                                org.telegram.messenger.b8.G(i14);
                                File K = org.telegram.messenger.b8.K(this.f24622n, null, true, true);
                                if (K != null) {
                                    if (org.telegram.messenger.v2.f18578a) {
                                        org.telegram.messenger.f8.d("delete file " + K);
                                    }
                                    K.delete();
                                }
                                org.telegram.messenger.b8.G(i14);
                                File K2 = org.telegram.messenger.b8.K(this.h, null, true, true);
                                if (K2 != null) {
                                    if (org.telegram.messenger.v2.f18578a) {
                                        org.telegram.messenger.f8.d("delete file " + K2);
                                    }
                                    K2.delete();
                                }
                                this.h = org.telegram.messenger.ic.Y(s10, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize Y = org.telegram.messenger.ic.Y(s10, 150.0f, 150.0f, 80, 150, 150);
                                this.f24622n = Y;
                                if (Y != null) {
                                    try {
                                        org.telegram.messenger.b8.G(i14);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.b8.K(this.f24622n, null, true, true).getAbsolutePath());
                                        org.telegram.messenger.ic.D().O(new BitmapDrawable(decodeFile), this.f24622n.location.volume_id + "_" + this.f24622n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            org.telegram.messenger.at.f(i14).n(this, i22);
                            org.telegram.messenger.at.f(i14).n(this, i20);
                            org.telegram.messenger.at.f(i14).n(this, i21);
                            this.f24627y = str3;
                            this.f24626x = str3;
                            this.D = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i10 == i22 && ((org.telegram.messenger.kj) objArr[0]) == this.D && (k2Var = this.f24618a) != null) {
                    this.f24626x = (String) objArr[1];
                    k2Var.getFileLoader().h0(this.f24626x, false, false, (int) this.D.f16709p0.f19541q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.W = 1.0f;
            if (((String) objArr[0]).equals(this.f24625w)) {
                org.telegram.messenger.at.f(i14).n(this, i19);
                org.telegram.messenger.at.f(i14).n(this, i18);
                org.telegram.messenger.at.f(i14).n(this, i17);
                org.telegram.messenger.at.f(i14).n(this, i16);
                this.f24625w = null;
                if (i10 != i19 && i10 != i17) {
                    this.e.w0(null);
                    a40 a40Var3 = this.f24619b;
                    if (a40Var3 != null) {
                        a40Var3.U();
                        return;
                    }
                    return;
                }
                r(false, org.telegram.messenger.ic.K(this.E, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.f24625w)) {
            this.f24625w = null;
            if (i10 == i15) {
                this.M = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f24626x)) {
            this.f24626x = null;
            if (i10 == i15) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.f24625w == null && this.f24626x == null && this.D == null) {
            org.telegram.messenger.at.f(i14).n(this, i15);
            org.telegram.messenger.at.f(i14).n(this, i12);
            org.telegram.messenger.at.f(i14).n(this, i13);
            if (i10 == i15 && (a40Var = this.f24619b) != null) {
                a40Var.V(this.M, this.N, this.P, this.f24627y, this.h, this.f24622n, this.f24624s, this.O);
            }
            c();
        }
    }

    public final void e() {
        int i10;
        ct ctVar;
        boolean z10;
        org.telegram.ui.ActionBar.k2 k2Var = this.f24618a;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            if (this.f24620c == null) {
                bi biVar = new bi(this.f24618a.getParentActivity(), this.f24618a, this.R, this.S);
                this.f24620c = biVar;
                if (this.Q) {
                    i10 = 2;
                } else {
                    i10 = 1;
                }
                a40 a40Var = this.f24619b;
                if (a40Var != null && a40Var.y()) {
                    a40 a40Var2 = this.f24619b;
                    Objects.requireNonNull(a40Var2);
                    ctVar = new ct(a40Var2, 1);
                } else {
                    ctVar = null;
                }
                biVar.K2 = i10;
                biVar.L2 = ctVar;
                biVar.M2 = false;
                uh uhVar = biVar.f24812s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.a2;
                if (uhVar == null || uhVar == chatAttachAlertPhotoLayout) {
                    biVar.f24809r3.setVisibility(8);
                }
                int i11 = biVar.K2;
                TextView textView = biVar.f24759d3;
                if (i11 == 2) {
                    textView.setText(org.telegram.messenger.dd.L0(2131752121, null));
                } else {
                    textView.setText(org.telegram.messenger.dd.L0(2131752123, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    bi biVar2 = chatAttachAlertPhotoLayout.f30964b;
                    if (biVar2.K2 != 0 && !biVar2.f24827w1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f23864g1 = z10;
                }
                bi biVar3 = this.f24620c;
                biVar3.T3 = new x30(this);
                biVar3.L1 = this;
            }
            int i12 = this.U;
            if (i12 == 1) {
                this.f24620c.f24759d3.setText(org.telegram.messenger.dd.a0("SetPhotoFor", null, 2131745535, this.L.first_name));
            } else if (i12 == 2) {
                this.f24620c.f24759d3.setText(org.telegram.messenger.dd.a0("SuggestPhotoFor", null, 2131744432, this.L.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        bi biVar = this.f24620c;
        if (biVar == null || dialog != biVar) {
            return false;
        }
        biVar.a2.b0(false);
        this.f24620c.L();
        this.f24620c.a2.e0(true);
        return true;
    }

    public final boolean g() {
        if (this.f24625w == null && this.f24626x == null && this.D == null) {
            return false;
        }
        return true;
    }

    public final void h(int i10, int i11, Intent intent) {
        if (i11 == -1) {
            if (i10 != 0 && i10 != 2) {
                if (i10 == 13) {
                    this.f24618a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.v1().N2(null, this.f24618a, null);
                    o(this.f24621f, null, org.telegram.messenger.i0.N0(this.f24621f), false);
                    org.telegram.messenger.i0.e(this.f24621f);
                    this.f24621f = null;
                    return;
                } else if (i10 == 14) {
                    if (intent != null && intent.getData() != null) {
                        org.telegram.messenger.i0.g3(new at(14, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i10 == 15) {
                    p(this.f24621f, null, true);
                    org.telegram.messenger.i0.e(this.f24621f);
                    this.f24621f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            bi biVar = this.f24620c;
            if (biVar != null) {
                biVar.a2.h0(i10, intent, this.f24621f);
            }
            this.f24621f = null;
        }
    }

    public final void i() {
        bi biVar = this.f24620c;
        if (biVar != null) {
            biVar.k1();
        }
    }

    public final void j(int i10, String[] strArr, int[] iArr) {
        bi biVar = this.f24620c;
        if (biVar != null) {
            if (i10 == 17) {
                biVar.a2.V(false);
                this.f24620c.a2.Z();
            } else if (i10 == 4) {
                biVar.a2.Z();
            }
        }
    }

    public final void k() {
        bi biVar = this.f24620c;
        if (biVar != null) {
            biVar.l1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.k2 k2Var = this.f24618a;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (this.f24618a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f24618a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.i0.q0(null, false);
                if (q02 != null) {
                    if (i10 >= 24) {
                        Activity parentActivity = this.f24618a.getParentActivity();
                        org.telegram.messenger.w0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f24621f = q02.getAbsolutePath();
                }
                this.f24618a.startActivityForResult(intent, 13);
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
        }
    }

    public final void m() {
        int i10;
        org.telegram.ui.ActionBar.k2 k2Var = this.f24618a;
        if (k2Var == null) {
            return;
        }
        Activity parentActivity = k2Var.getParentActivity();
        if (Build.VERSION.SDK_INT >= 33 && parentActivity != null) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
                return;
            }
        } else if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
            return;
        }
        if (this.Q) {
            i10 = 3;
        } else {
            i10 = 1;
        }
        org.telegram.ui.wn0 wn0Var = new org.telegram.ui.wn0(i10, false, false, null);
        wn0Var.f43140y = this.J;
        wn0Var.V = new l2.f(this, 16);
        this.f24618a.presentFragment(wn0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i10) {
        org.telegram.ui.ActionBar.s2 s2Var;
        org.telegram.ui.ActionBar.k2 k2Var = this.f24618a;
        if (k2Var != null && k2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i10;
            if (this.G) {
                org.telegram.ui.ActionBar.k2 k2Var2 = this.f24618a;
                if (k2Var2 != null && k2Var2.getParentActivity() != null) {
                    e();
                    bi biVar = this.f24620c;
                    biVar.O3 = this.H;
                    biVar.x1(1, false);
                    this.f24620c.a2.g0();
                    this.f24620c.d1();
                    bi biVar2 = this.f24620c;
                    biVar2.H0 = onDismissListener;
                    int i11 = this.U;
                    if (i11 != 0) {
                        biVar2.H1 = new z30(i11, this.L);
                    }
                    this.f24618a.showDialog(biVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.z2 h = org.telegram.messenger.a30.h(this.f24618a.getParentActivity(), false, 1, null);
            if (i10 == 1) {
                h.O = org.telegram.messenger.dd.a0("SetPhotoFor", null, 2131745535, this.L.first_name);
                h.P = true;
            } else if (i10 == 2) {
                h.O = org.telegram.messenger.dd.a0("SuggestPhotoFor", null, 2131744432, this.L.first_name);
                h.P = true;
            } else {
                h.O = org.telegram.messenger.dd.L0(2131752123, null);
                h.P = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.f1.t(null, 2131752113, arrayList, 2131232085, arrayList2);
            arrayList3.add(0);
            if (this.Q) {
                org.telegram.ui.Cells.f1.t(null, 2131752120, arrayList, 2131232417, arrayList2);
                arrayList3.add(4);
            }
            org.telegram.ui.Cells.f1.t(null, 2131752128, arrayList, 2131232291, arrayList2);
            arrayList3.add(1);
            if (this.J) {
                org.telegram.ui.Cells.f1.t(null, 2131752126, arrayList, 2131232353, arrayList2);
                arrayList3.add(2);
            }
            if (z10) {
                org.telegram.ui.Cells.f1.t(null, 2131751515, arrayList, 2131232107, arrayList2);
                arrayList3.add(3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                iArr[i12] = ((Integer) arrayList2.get(i12)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i13) {
                    org.telegram.ui.ActionBar.k2 k2Var3;
                    int intValue = ((Integer) arrayList3.get(i13)).intValue();
                    b40 b40Var = b40.this;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (k2Var3 = b40Var.f24618a) != null && k2Var3.getParentActivity() != null) {
                                        try {
                                            int i14 = Build.VERSION.SDK_INT;
                                            if (b40Var.f24618a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                b40Var.f24618a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File s02 = org.telegram.messenger.i0.s0(false);
                                            if (s02 != null) {
                                                if (i14 >= 24) {
                                                    Activity parentActivity = b40Var.f24618a.getParentActivity();
                                                    org.telegram.messenger.w0.d();
                                                    intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", s02));
                                                    intent.addFlags(2);
                                                    intent.addFlags(1);
                                                } else {
                                                    intent.putExtra("output", Uri.fromFile(s02));
                                                }
                                                intent.putExtra("android.intent.extras.CAMERA_FACING", 1);
                                                intent.putExtra("android.intent.extras.LENS_FACING_FRONT", 1);
                                                intent.putExtra("android.intent.extra.USE_FRONT_CAMERA", true);
                                                intent.putExtra("android.intent.extra.durationLimit", 10);
                                                b40Var.f24621f = s02.getAbsolutePath();
                                            }
                                            b40Var.f24618a.startActivityForResult(intent, 15);
                                            return;
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, true);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                runnable.run();
                                return;
                            }
                            b40Var.q();
                            return;
                        }
                        b40Var.m();
                        return;
                    }
                    b40Var.l();
                }
            };
            h.L = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            h.M = iArr;
            h.K = onClickListener;
            h.H0 = onDismissListener;
            this.f24618a.showDialog(h);
            if (z10) {
                int i13 = org.telegram.ui.ActionBar.t6.f21171q7;
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, i13, false);
                int i14 = org.telegram.ui.ActionBar.t6.f21154p7;
                h.C0(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.t6.x0(null, i14, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < h.f21620w0.size() && (s2Var = (org.telegram.ui.ActionBar.s2) h.f21620w0.get(size2)) != null && s2Var.getTextView() != null && s2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.a7.V(s2Var.getTextView(), i13, null);
                    org.telegram.ui.ActionBar.a7.t(s2Var.getImageView(), i14, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        ffVar.k(pair);
        ffVar.f14603b = z10;
        ffVar.f14604c = str2;
        arrayList.add(ffVar);
        PhotoViewer.v1().N2(null, this.f24618a, null);
        PhotoViewer.v1().j2(arrayList, 0, 1, false, new y30(this, arrayList), null);
        PhotoViewer.v1().P = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f24618a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.jo0 jo0Var = new org.telegram.ui.jo0(0, null, hashMap, arrayList, 1, false, null, this.R);
        ?? obj = new Object();
        obj.d = this;
        obj.f363b = hashMap;
        obj.f364c = arrayList;
        jo0Var.f38506s0 = obj;
        jo0Var.k0(1, false);
        jo0Var.f38501p0 = this.f24619b.getInitialSearchString();
        if (this.S) {
            this.f24618a.showAsSheet(jo0Var);
        } else {
            this.f24618a.presentFragment(jo0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.kj kjVar) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.D = null;
            this.f24627y = null;
            if (kjVar == null) {
                videoSize = null;
            } else {
                videoSize = kjVar.f16720s;
            }
            this.O = videoSize;
            this.h = org.telegram.messenger.ic.Y(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize Y = org.telegram.messenger.ic.Y(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.f24622n = Y;
            int i10 = this.d;
            if (Y != null) {
                try {
                    org.telegram.messenger.b8.G(i10);
                    Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.b8.K(this.f24622n, null, true, true).getAbsolutePath());
                    this.f24623r = decodeFile;
                    org.telegram.messenger.ic.D().O(new BitmapDrawable(decodeFile), this.f24622n.location.volume_id + "_" + this.f24622n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                org.telegram.messenger.e20.i(i10).v(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.b8.z(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.f24625w = a1.g.p(sb2, this.h.location.local_id, ".jpg");
                if (this.K) {
                    if (kjVar != null && kjVar.f16709p0 != null) {
                        if (this.I && !org.telegram.messenger.wp.r1(i10).f19271v7) {
                            a40 a40Var = this.f24619b;
                            if (a40Var != null) {
                                a40Var.P(z10, true);
                            }
                            a40 a40Var2 = this.f24619b;
                            if (a40Var2 != null) {
                                a40Var2.V(null, null, 0.0d, null, this.h, this.f24622n, this.f24624s, null);
                                this.f24619b.V(null, null, this.P, this.f24627y, this.h, this.f24622n, this.f24624s, this.O);
                                c();
                                return;
                            }
                            return;
                        }
                        this.D = kjVar;
                        org.telegram.messenger.y20 y20Var = kjVar.f16709p0;
                        long j10 = y20Var.f19526a;
                        if (j10 < 0) {
                            j10 = 0;
                        }
                        this.P = (y20Var.f19530c - j10) / 1000000.0d;
                        y20Var.Z = false;
                        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.a2);
                        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.f14688c2);
                        org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.f14682b2);
                        MediaController.B().h0(kjVar, true, true, false);
                        this.f24625w = null;
                        a40 a40Var3 = this.f24619b;
                        if (a40Var3 != null) {
                            a40Var3.P(z10, true);
                        }
                        this.f24624s = true;
                    } else {
                        a40 a40Var4 = this.f24619b;
                        if (a40Var4 != null) {
                            a40Var4.P(z10, false);
                        }
                        this.f24624s = false;
                    }
                    org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.U1);
                    org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.W1);
                    org.telegram.messenger.at.f(i10).b(this, org.telegram.messenger.at.V1);
                    if (this.f24625w != null) {
                        org.telegram.messenger.b8.G(i10).i0(false, 16777216, this.f24625w, true);
                    }
                }
                a40 a40Var5 = this.f24619b;
                if (a40Var5 != null) {
                    a40Var5.V(null, null, 0.0d, null, this.h, this.f24622n, this.f24624s, null);
                }
            }
        }
    }

    public final void s(org.telegram.messenger.ff ffVar) {
        Bitmap K;
        String str = ffVar.h;
        if (str == null) {
            str = ffVar.I;
        }
        org.telegram.messenger.kj kjVar = null;
        if ((ffVar.f14603b || ffVar.f14617s != null) && !ffVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f19815id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.kj kjVar2 = new org.telegram.messenger.kj(org.telegram.messenger.e20.f15506s0, tL_message, false, false);
            TLRPC.Message message = kjVar2.f16690k;
            File z10 = org.telegram.messenger.b8.z(4);
            message.attachPath = new File(z10, org.telegram.messenger.uz.p() + "_avatar.mp4").getAbsolutePath();
            kjVar2.f16709p0 = ffVar.f14617s;
            kjVar2.f16720s = ffVar.S;
            K = org.telegram.messenger.ic.K(ffVar.f14604c, null, 800.0f, 800.0f, true);
            kjVar = kjVar2;
        } else {
            K = org.telegram.messenger.ic.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, kjVar);
    }
}
