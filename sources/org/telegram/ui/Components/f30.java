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
public final class f30 implements org.telegram.messenger.cs, org.telegram.ui.jm0 {
    public org.telegram.messenger.zi E;
    public String F;
    public boolean G;
    public boolean I;
    public final boolean J;
    public TLRPC.User M;
    public TLRPC.InputFile N;
    public TLRPC.InputFile O;
    public TLRPC.VideoSize P;
    public double Q;
    public final boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public int V;
    public final int W;
    public float X;
    public org.telegram.ui.ActionBar.d2 f33681a;
    public e30 f33682b;
    public bi f33683c;
    public String f33685f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f33686n;
    public Bitmap f33687r;
    public boolean f33688s;
    public String f33689w;
    public String f33690x;
    public String f33691y;
    public final int d = org.telegram.messenger.h10.f22829t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver f33684e = new ImageReceiver(null);

    public f30(int i3, boolean z10, boolean z11) {
        this.R = z10;
        this.J = z11;
        this.W = i3;
    }

    public static void a(f30 f30Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.zi ziVar;
        Bitmap K;
        ImageReceiver imageReceiver = f30Var.f33684e;
        int i3 = f30Var.d;
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) arrayList.get(0);
            Bitmap bitmap = null;
            if ((xyVar.f26487o || xyVar.f26483k != null) && !xyVar.f26488p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f27022id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                ziVar = new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message, false, false);
                ziVar.f26868k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.az.p() + "_avatar.mp4").getAbsolutePath();
                ziVar.f26886p0 = xyVar.f26483k;
                ziVar.f26897s = xyVar.v;
                bitmap = org.telegram.messenger.zb.K(xyVar.f26478e, null, 800.0f, 800.0f, true);
            } else {
                String str = xyVar.f26477c;
                if (str != null) {
                    K = org.telegram.messenger.zb.K(str, null, 800.0f, 800.0f, true);
                } else {
                    org.telegram.messenger.bf bfVar = xyVar.f26484l;
                    if (bfVar != null) {
                        TLRPC.Photo photo = bfVar.K;
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                            if (w10 != null) {
                                org.telegram.messenger.w7.G(i3);
                                File K2 = org.telegram.messenger.w7.K(w10, null, true, true);
                                f30Var.F = K2.getAbsolutePath();
                                if (!K2.exists()) {
                                    org.telegram.messenger.w7.G(i3);
                                    K2 = org.telegram.messenger.w7.K(w10, null, false, true);
                                    if (!K2.exists()) {
                                        K2 = null;
                                    }
                                }
                                if (K2 != null) {
                                    K = org.telegram.messenger.zb.K(K2.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.Y1);
                                    org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.Z1);
                                    f30Var.f33689w = org.telegram.messenger.w7.r(null, w10.location);
                                    imageReceiver.q0(org.telegram.messenger.ac.i(w10, xyVar.f26484l.K), null, null, "jpg", null, 1);
                                }
                            }
                            K = null;
                        } else if (bfVar.C != null) {
                            File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(xyVar.f26484l.C) + "." + org.telegram.messenger.zb.B(xyVar.f26484l.C, "jpg"));
                            f30Var.F = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                K = org.telegram.messenger.zb.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                f30Var.f33689w = xyVar.f26484l.C;
                                org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.R1);
                                org.telegram.messenger.hs.f(i3).b(f30Var, org.telegram.messenger.hs.S1);
                                imageReceiver.o0(xyVar.f26484l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    ziVar = null;
                }
                ziVar = null;
                bitmap = K;
            }
            f30Var.r(z10, bitmap, ziVar);
        }
    }

    public final void b() {
        this.U = true;
        String str = this.f33689w;
        int i3 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i3).b(this.f33689w, false);
        }
        if (this.f33690x != null) {
            org.telegram.messenger.w7.G(i3).b(this.f33690x, false);
        }
        e30 e30Var = this.f33682b;
        if (e30Var != null) {
            e30Var.T();
        }
    }

    public final void c() {
        this.f33689w = null;
        this.f33690x = null;
        this.f33691y = null;
        this.E = null;
        if (this.G) {
            this.f33684e.w0(null);
            this.f33681a = null;
            this.f33682b = null;
        }
    }

    public final void d() {
        this.U = false;
        if (this.f33689w == null && this.f33690x == null && this.E == null) {
            this.f33681a = null;
            this.f33682b = null;
        } else {
            this.G = true;
        }
        bi biVar = this.f33683c;
        if (biVar != null) {
            biVar.K();
            this.f33683c.j1();
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        e30 e30Var;
        org.telegram.ui.ActionBar.d2 d2Var;
        String str;
        int i11 = org.telegram.messenger.hs.W1;
        int i12 = org.telegram.messenger.hs.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.hs.U1;
        if (i3 != i14 && i3 != i12) {
            if (i3 == i11) {
                String str2 = (String) objArr[0];
                if (this.E != null) {
                    str = this.f33690x;
                } else {
                    str = this.f33689w;
                }
                if (this.f33682b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    e30 e30Var2 = this.f33682b;
                    this.X = min;
                    e30Var2.H(min);
                    return;
                }
                return;
            }
            int i15 = org.telegram.messenger.hs.S1;
            int i16 = org.telegram.messenger.hs.R1;
            int i17 = org.telegram.messenger.hs.Z1;
            int i18 = org.telegram.messenger.hs.Y1;
            if (i3 != i18 && i3 != i17 && i3 != i16 && i3 != i15) {
                int i19 = org.telegram.messenger.hs.c2;
                int i20 = org.telegram.messenger.hs.f23204b2;
                int i21 = org.telegram.messenger.hs.f23198a2;
                if (i3 == i19) {
                    if (((org.telegram.messenger.zi) objArr[0]) == this.E && this.f33681a != null) {
                        org.telegram.messenger.hs.f(i13).n(this, i21);
                        org.telegram.messenger.hs.f(i13).n(this, i19);
                        org.telegram.messenger.hs.f(i13).n(this, i20);
                        c();
                        return;
                    }
                    return;
                } else if (i3 == i20) {
                    if (((org.telegram.messenger.zi) objArr[0]) == this.E && this.f33681a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f33681a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.Q > longValue3) {
                                this.Q = longValue3;
                            }
                            Bitmap s6 = org.telegram.messenger.yy.s(str3, (long) (this.Q * 1000.0d), null, true);
                            if (s6 != null) {
                                org.telegram.messenger.w7.G(i13);
                                File K = org.telegram.messenger.w7.K(this.f33686n, null, true, true);
                                if (K != null) {
                                    if (org.telegram.messenger.r2.f25040a) {
                                        org.telegram.messenger.a8.d("delete file " + K);
                                    }
                                    K.delete();
                                }
                                org.telegram.messenger.w7.G(i13);
                                File K2 = org.telegram.messenger.w7.K(this.h, null, true, true);
                                if (K2 != null) {
                                    if (org.telegram.messenger.r2.f25040a) {
                                        org.telegram.messenger.a8.d("delete file " + K2);
                                    }
                                    K2.delete();
                                }
                                this.h = org.telegram.messenger.zb.Y(s6, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize Y = org.telegram.messenger.zb.Y(s6, 150.0f, 150.0f, 80, 150, 150);
                                this.f33686n = Y;
                                if (Y != null) {
                                    try {
                                        org.telegram.messenger.w7.G(i13);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.K(this.f33686n, null, true, true).getAbsolutePath());
                                        org.telegram.messenger.zb.D().O(new BitmapDrawable(decodeFile), this.f33686n.location.volume_id + "_" + this.f33686n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            org.telegram.messenger.hs.f(i13).n(this, i21);
                            org.telegram.messenger.hs.f(i13).n(this, i19);
                            org.telegram.messenger.hs.f(i13).n(this, i20);
                            this.f33691y = str3;
                            this.f33690x = str3;
                            this.E = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i3 == i21 && ((org.telegram.messenger.zi) objArr[0]) == this.E && (d2Var = this.f33681a) != null) {
                    this.f33690x = (String) objArr[1];
                    d2Var.getFileLoader().h0(this.f33690x, false, false, (int) this.E.f26886p0.f21724q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.X = 1.0f;
            if (((String) objArr[0]).equals(this.f33689w)) {
                org.telegram.messenger.hs.f(i13).n(this, i18);
                org.telegram.messenger.hs.f(i13).n(this, i17);
                org.telegram.messenger.hs.f(i13).n(this, i16);
                org.telegram.messenger.hs.f(i13).n(this, i15);
                this.f33689w = null;
                if (i3 != i18 && i3 != i16) {
                    this.f33684e.w0(null);
                    e30 e30Var3 = this.f33682b;
                    if (e30Var3 != null) {
                        e30Var3.T();
                        return;
                    }
                    return;
                }
                r(false, org.telegram.messenger.zb.K(this.F, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.f33689w)) {
            this.f33689w = null;
            if (i3 == i14) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f33690x)) {
            this.f33690x = null;
            if (i3 == i14) {
                this.O = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.f33689w == null && this.f33690x == null && this.E == null) {
            org.telegram.messenger.hs.f(i13).n(this, i14);
            org.telegram.messenger.hs.f(i13).n(this, i11);
            org.telegram.messenger.hs.f(i13).n(this, i12);
            if (i3 == i14 && (e30Var = this.f33682b) != null) {
                e30Var.U(this.N, this.O, this.Q, this.f33691y, this.h, this.f33686n, this.f33688s, this.P);
            }
            c();
        }
    }

    public final void e() {
        int i3;
        qs qsVar;
        boolean z10;
        org.telegram.ui.ActionBar.d2 d2Var = this.f33681a;
        if (d2Var != null && d2Var.getParentActivity() != null) {
            if (this.f33683c == null) {
                bi biVar = new bi(this.f33681a.getParentActivity(), this.f33681a, this.S, this.T);
                this.f33683c = biVar;
                if (this.R) {
                    i3 = 2;
                } else {
                    i3 = 1;
                }
                e30 e30Var = this.f33682b;
                if (e30Var != null && e30Var.x()) {
                    e30 e30Var2 = this.f33682b;
                    Objects.requireNonNull(e30Var2);
                    qsVar = new qs(e30Var2, 1);
                } else {
                    qsVar = null;
                }
                biVar.L2 = i3;
                biVar.M2 = qsVar;
                biVar.N2 = false;
                th thVar = biVar.f32275t2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar.f32215b2;
                if (thVar == null || thVar == chatAttachAlertPhotoLayout) {
                    biVar.f32272s3.setVisibility(8);
                }
                int i10 = biVar.L2;
                TextView textView = biVar.f32224e3;
                if (i10 == 2) {
                    textView.setText(org.telegram.messenger.bd.M0(2131752121, null));
                } else {
                    textView.setText(org.telegram.messenger.bd.M0(2131752123, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    bi biVar2 = chatAttachAlertPhotoLayout.f38416b;
                    if (biVar2.L2 != 0 && !biVar2.f32290x1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f31278h1 = z10;
                }
                bi biVar3 = this.f33683c;
                biVar3.U3 = new b30(this);
                biVar3.M1 = this;
            }
            int i11 = this.V;
            if (i11 == 1) {
                this.f33683c.f32224e3.setText(org.telegram.messenger.bd.a0("SetPhotoFor", null, 2131745528, this.M.first_name));
            } else if (i11 == 2) {
                this.f33683c.f32224e3.setText(org.telegram.messenger.bd.a0("SuggestPhotoFor", null, 2131744416, this.M.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        bi biVar = this.f33683c;
        if (biVar == null || dialog != biVar) {
            return false;
        }
        biVar.f32215b2.d0(false);
        this.f33683c.K();
        this.f33683c.f32215b2.g0(true);
        return true;
    }

    public final boolean g() {
        if (this.f33689w == null && this.f33690x == null && this.E == null) {
            return false;
        }
        return true;
    }

    public final void h(int i3, int i10, Intent intent) {
        if (i10 == -1) {
            if (i3 != 0 && i3 != 2) {
                if (i3 == 13) {
                    this.f33681a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.v1().N2(null, this.f33681a, null);
                    o(this.f33685f, null, org.telegram.messenger.g0.N0(this.f33685f), false);
                    org.telegram.messenger.g0.e(this.f33685f);
                    this.f33685f = null;
                    return;
                } else if (i3 == 14) {
                    if (intent != null && intent.getData() != null) {
                        org.telegram.messenger.g0.h3(new cl(25, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i3 == 15) {
                    p(this.f33685f, null, true);
                    org.telegram.messenger.g0.e(this.f33685f);
                    this.f33685f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            bi biVar = this.f33683c;
            if (biVar != null) {
                biVar.f32215b2.j0(i3, intent, this.f33685f);
            }
            this.f33685f = null;
        }
    }

    public final void i() {
        bi biVar = this.f33683c;
        if (biVar != null) {
            biVar.l1();
        }
    }

    public final void j(int i3, String[] strArr, int[] iArr) {
        bi biVar = this.f33683c;
        if (biVar != null) {
            if (i3 == 17) {
                biVar.f32215b2.W(false);
                this.f33683c.f32215b2.b0();
            } else if (i3 == 4) {
                biVar.f32215b2.b0();
            }
        }
    }

    public final void k() {
        bi biVar = this.f33683c;
        if (biVar != null) {
            biVar.m1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.d2 d2Var = this.f33681a;
        if (d2Var != null && d2Var.getParentActivity() != null) {
            try {
                int i3 = Build.VERSION.SDK_INT;
                if (this.f33681a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f33681a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i3 >= 24) {
                        Activity parentActivity = this.f33681a.getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f33685f = q02.getAbsolutePath();
                }
                this.f33681a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        int i3;
        org.telegram.ui.ActionBar.d2 d2Var = this.f33681a;
        if (d2Var == null) {
            return;
        }
        Activity parentActivity = d2Var.getParentActivity();
        if (Build.VERSION.SDK_INT >= 33 && parentActivity != null) {
            if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0 || parentActivity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 151);
                return;
            }
        } else if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            parentActivity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 151);
            return;
        }
        if (this.R) {
            i3 = 3;
        } else {
            i3 = 1;
        }
        org.telegram.ui.hm0 hm0Var = new org.telegram.ui.hm0(i3, false, false, null);
        hm0Var.f45945y = this.K;
        hm0Var.W = new nh(this, 2);
        this.f33681a.presentFragment(hm0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i3) {
        org.telegram.ui.ActionBar.m2 m2Var;
        org.telegram.ui.ActionBar.d2 d2Var = this.f33681a;
        if (d2Var != null && d2Var.getParentActivity() != null) {
            this.U = false;
            this.V = i3;
            if (this.H) {
                org.telegram.ui.ActionBar.d2 d2Var2 = this.f33681a;
                if (d2Var2 != null && d2Var2.getParentActivity() != null) {
                    e();
                    bi biVar = this.f33683c;
                    biVar.P3 = this.I;
                    biVar.y1(1, false);
                    this.f33683c.f32215b2.i0();
                    this.f33683c.e1();
                    bi biVar2 = this.f33683c;
                    biVar2.I0 = onDismissListener;
                    int i10 = this.V;
                    if (i10 != 0) {
                        biVar2.I1 = new d30(i10, this.M);
                    }
                    this.f33681a.showDialog(biVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.t2 h = org.telegram.messenger.camera.q.h(this.f33681a.getParentActivity(), false, 1, null);
            if (i3 == 1) {
                h.P = org.telegram.messenger.bd.a0("SetPhotoFor", null, 2131745528, this.M.first_name);
                h.Q = true;
            } else if (i3 == 2) {
                h.P = org.telegram.messenger.bd.a0("SuggestPhotoFor", null, 2131744416, this.M.first_name);
                h.Q = true;
            } else {
                h.P = org.telegram.messenger.bd.M0(2131752123, null);
                h.Q = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.f1.x(null, 2131752113, arrayList, 2131232086, arrayList2);
            arrayList3.add(0);
            if (this.R) {
                org.telegram.ui.Cells.f1.x(null, 2131752120, arrayList, 2131232418, arrayList2);
                arrayList3.add(4);
            }
            org.telegram.ui.Cells.f1.x(null, 2131752128, arrayList, 2131232292, arrayList2);
            arrayList3.add(1);
            if (this.K) {
                org.telegram.ui.Cells.f1.x(null, 2131752126, arrayList, 2131232354, arrayList2);
                arrayList3.add(2);
            }
            if (z10) {
                org.telegram.ui.Cells.f1.x(null, 2131751515, arrayList, 2131232108, arrayList2);
                arrayList3.add(3);
            }
            int[] iArr = new int[arrayList2.size()];
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = ((Integer) arrayList2.get(i11)).intValue();
            }
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    org.telegram.ui.ActionBar.d2 d2Var3;
                    int intValue = ((Integer) arrayList3.get(i12)).intValue();
                    f30 f30Var = f30.this;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (d2Var3 = f30Var.f33681a) != null && d2Var3.getParentActivity() != null) {
                                        try {
                                            int i13 = Build.VERSION.SDK_INT;
                                            if (f30Var.f33681a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                f30Var.f33681a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File s02 = org.telegram.messenger.g0.s0(false);
                                            if (s02 != null) {
                                                if (i13 >= 24) {
                                                    Activity parentActivity = f30Var.f33681a.getParentActivity();
                                                    org.telegram.messenger.t0.d();
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
                                                f30Var.f33685f = s02.getAbsolutePath();
                                            }
                                            f30Var.f33681a.startActivityForResult(intent, 15);
                                            return;
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, true);
                                            return;
                                        }
                                    }
                                    return;
                                }
                                runnable.run();
                                return;
                            }
                            f30Var.q();
                            return;
                        }
                        f30Var.m();
                        return;
                    }
                    f30Var.l();
                }
            };
            h.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            h.N = iArr;
            h.L = onClickListener;
            h.I0 = onDismissListener;
            this.f33681a.showDialog(h);
            if (z10) {
                int i12 = org.telegram.ui.ActionBar.k6.f28122q7;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                int i13 = org.telegram.ui.ActionBar.k6.f28102p7;
                h.C0(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < h.f28623x0.size() && (m2Var = (org.telegram.ui.ActionBar.m2) h.f28623x0.get(size2)) != null && m2Var.getTextView() != null && m2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.r6.V(m2Var.getTextView(), i12, null);
                    org.telegram.ui.ActionBar.r6.t(m2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        yeVar.n(pair);
        yeVar.f25310b = z10;
        yeVar.f25311c = str2;
        arrayList.add(yeVar);
        PhotoViewer.v1().N2(null, this.f33681a, null);
        PhotoViewer.v1().j2(arrayList, 0, 1, false, new c30(this, arrayList), null);
        PhotoViewer.v1().Q = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f33681a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.sm0 sm0Var = new org.telegram.ui.sm0(0, null, hashMap, arrayList, 1, false, null, this.S);
        ?? obj = new Object();
        obj.d = this;
        obj.f2378b = hashMap;
        obj.f2379c = arrayList;
        sm0Var.f49564t0 = obj;
        sm0Var.k0(1, false);
        sm0Var.f49559q0 = this.f33682b.getInitialSearchString();
        if (this.T) {
            this.f33681a.showAsSheet(sm0Var);
        } else {
            this.f33681a.presentFragment(sm0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.zi ziVar) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.O = null;
            this.N = null;
            this.E = null;
            this.f33691y = null;
            if (ziVar == null) {
                videoSize = null;
            } else {
                videoSize = ziVar.f26897s;
            }
            this.P = videoSize;
            this.h = org.telegram.messenger.zb.Y(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize Y = org.telegram.messenger.zb.Y(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.f33686n = Y;
            int i3 = this.d;
            if (Y != null) {
                try {
                    org.telegram.messenger.w7.G(i3);
                    Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.K(this.f33686n, null, true, true).getAbsolutePath());
                    this.f33687r = decodeFile;
                    org.telegram.messenger.zb.D().O(new BitmapDrawable(decodeFile), this.f33686n.location.volume_id + "_" + this.f33686n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                org.telegram.messenger.h10.i(i3).v(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.w7.z(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.f33689w = a1.g.o(this.h.location.local_id, ".jpg", sb2);
                if (this.L) {
                    if (ziVar != null && ziVar.f26886p0 != null) {
                        if (this.J && !org.telegram.messenger.hp.s1(i3).f23138u7) {
                            e30 e30Var = this.f33682b;
                            if (e30Var != null) {
                                e30Var.O(z10, true);
                            }
                            e30 e30Var2 = this.f33682b;
                            if (e30Var2 != null) {
                                e30Var2.U(null, null, 0.0d, null, this.h, this.f33686n, this.f33688s, null);
                                this.f33682b.U(null, null, this.Q, this.f33691y, this.h, this.f33686n, this.f33688s, this.P);
                                c();
                                return;
                            }
                            return;
                        }
                        this.E = ziVar;
                        org.telegram.messenger.b20 b20Var = ziVar.f26886p0;
                        long j10 = b20Var.f21708a;
                        if (j10 < 0) {
                            j10 = 0;
                        }
                        this.Q = (b20Var.f21712c - j10) / 1000000.0d;
                        b20Var.Z = false;
                        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.f23198a2);
                        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.c2);
                        org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.f23204b2);
                        MediaController.B().h0(ziVar, true, true, false);
                        this.f33689w = null;
                        e30 e30Var3 = this.f33682b;
                        if (e30Var3 != null) {
                            e30Var3.O(z10, true);
                        }
                        this.f33688s = true;
                    } else {
                        e30 e30Var4 = this.f33682b;
                        if (e30Var4 != null) {
                            e30Var4.O(z10, false);
                        }
                        this.f33688s = false;
                    }
                    org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.U1);
                    org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.W1);
                    org.telegram.messenger.hs.f(i3).b(this, org.telegram.messenger.hs.V1);
                    if (this.f33689w != null) {
                        org.telegram.messenger.w7.G(i3).i0(false, 16777216, this.f33689w, true);
                    }
                }
                e30 e30Var5 = this.f33682b;
                if (e30Var5 != null) {
                    e30Var5.U(null, null, 0.0d, null, this.h, this.f33686n, this.f33688s, null);
                }
            }
        }
    }

    public final void s(org.telegram.messenger.ye yeVar) {
        Bitmap K;
        String str = yeVar.h;
        if (str == null) {
            str = yeVar.I;
        }
        org.telegram.messenger.zi ziVar = null;
        if ((yeVar.f25310b || yeVar.f25325s != null) && !yeVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f27022id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(org.telegram.messenger.h10.f22829t0, tL_message, false, false);
            TLRPC.Message message = ziVar2.f26868k;
            File z10 = org.telegram.messenger.w7.z(4);
            message.attachPath = new File(z10, org.telegram.messenger.az.p() + "_avatar.mp4").getAbsolutePath();
            ziVar2.f26886p0 = yeVar.f25325s;
            ziVar2.f26897s = yeVar.S;
            K = org.telegram.messenger.zb.K(yeVar.f25311c, null, 800.0f, 800.0f, true);
            ziVar = ziVar2;
        } else {
            K = org.telegram.messenger.zb.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, ziVar);
    }
}
