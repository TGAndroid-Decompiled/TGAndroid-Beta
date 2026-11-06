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
public final class j30 implements org.telegram.messenger.ls, org.telegram.ui.om0 {
    public org.telegram.messenger.ij D;
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
    public org.telegram.ui.ActionBar.f2 f34864a;
    public i30 f34865b;
    public di f34866c;
    public String f34868f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f34869n;
    public Bitmap f34870r;
    public boolean f34871s;
    public String f34872w;
    public String f34873x;
    public String f34874y;
    public final int d = org.telegram.messenger.p10.f24459s0;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver f34867e = new ImageReceiver(null);

    public j30(int i7, boolean z9, boolean z10) {
        this.Q = z9;
        this.I = z10;
        this.V = i7;
    }

    public static void a(j30 j30Var, boolean z9, ArrayList arrayList) {
        org.telegram.messenger.ij ijVar;
        Bitmap K;
        ImageReceiver imageReceiver = j30Var.f34867e;
        int i7 = j30Var.d;
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList.get(0);
            Bitmap bitmap = null;
            if ((fzVar.f22496o || fzVar.f22492k != null) && !fzVar.f22497p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f26973id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                ijVar = new org.telegram.messenger.ij(org.telegram.messenger.p10.f24459s0, tL_message, false, false);
                ijVar.f23237k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.iz.p() + "_avatar.mp4").getAbsolutePath();
                ijVar.f23255p0 = fzVar.f22492k;
                ijVar.f23266s = fzVar.v;
                bitmap = org.telegram.messenger.gc.K(fzVar.f22487e, null, 800.0f, 800.0f, true);
            } else {
                String str = fzVar.f22486c;
                if (str != null) {
                    K = org.telegram.messenger.gc.K(str, null, 800.0f, 800.0f, true);
                } else {
                    org.telegram.messenger.kf kfVar = fzVar.f22493l;
                    if (kfVar != null) {
                        TLRPC.Photo photo = kfVar.K;
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                            if (w10 != null) {
                                org.telegram.messenger.w7.G(i7);
                                File K2 = org.telegram.messenger.w7.K(w10, null, true, true);
                                j30Var.E = K2.getAbsolutePath();
                                if (!K2.exists()) {
                                    org.telegram.messenger.w7.G(i7);
                                    K2 = org.telegram.messenger.w7.K(w10, null, false, true);
                                    if (!K2.exists()) {
                                        K2 = null;
                                    }
                                }
                                if (K2 != null) {
                                    K = org.telegram.messenger.gc.K(K2.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.Y1);
                                    org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.Z1);
                                    j30Var.f34872w = org.telegram.messenger.w7.r(null, w10.location);
                                    imageReceiver.q0(org.telegram.messenger.hc.i(w10, fzVar.f22493l.K), null, null, "jpg", null, 1);
                                }
                            }
                            K = null;
                        } else if (kfVar.C != null) {
                            File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(fzVar.f22493l.C) + "." + org.telegram.messenger.gc.B(fzVar.f22493l.C, "jpg"));
                            j30Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                K = org.telegram.messenger.gc.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                j30Var.f34872w = fzVar.f22493l.C;
                                org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.R1);
                                org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.S1);
                                imageReceiver.o0(fzVar.f22493l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    ijVar = null;
                }
                ijVar = null;
                bitmap = K;
            }
            j30Var.r(z9, bitmap, ijVar);
        }
    }

    public final void b() {
        this.T = true;
        String str = this.f34872w;
        int i7 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i7).b(this.f34872w, false);
        }
        if (this.f34873x != null) {
            org.telegram.messenger.w7.G(i7).b(this.f34873x, false);
        }
        i30 i30Var = this.f34865b;
        if (i30Var != null) {
            i30Var.T();
        }
    }

    public final void c() {
        this.f34872w = null;
        this.f34873x = null;
        this.f34874y = null;
        this.D = null;
        if (this.F) {
            this.f34867e.w0(null);
            this.f34864a = null;
            this.f34865b = null;
        }
    }

    public final void d() {
        this.T = false;
        if (this.f34872w == null && this.f34873x == null && this.D == null) {
            this.f34864a = null;
            this.f34865b = null;
        } else {
            this.F = true;
        }
        di diVar = this.f34866c;
        if (diVar != null) {
            diVar.K();
            this.f34866c.j1();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        i30 i30Var;
        org.telegram.ui.ActionBar.f2 f2Var;
        String str;
        int i11 = org.telegram.messenger.qs.W1;
        int i12 = org.telegram.messenger.qs.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.qs.U1;
        if (i7 != i14 && i7 != i12) {
            if (i7 == i11) {
                String str2 = (String) objArr[0];
                if (this.D != null) {
                    str = this.f34873x;
                } else {
                    str = this.f34872w;
                }
                if (this.f34865b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    i30 i30Var2 = this.f34865b;
                    this.W = min;
                    i30Var2.H(min);
                    return;
                }
                return;
            }
            int i15 = org.telegram.messenger.qs.S1;
            int i16 = org.telegram.messenger.qs.R1;
            int i17 = org.telegram.messenger.qs.Z1;
            int i18 = org.telegram.messenger.qs.Y1;
            if (i7 != i18 && i7 != i17 && i7 != i16 && i7 != i15) {
                int i19 = org.telegram.messenger.qs.f24964c2;
                int i20 = org.telegram.messenger.qs.f24958b2;
                int i21 = org.telegram.messenger.qs.f24952a2;
                if (i7 == i19) {
                    if (((org.telegram.messenger.ij) objArr[0]) == this.D && this.f34864a != null) {
                        org.telegram.messenger.qs.f(i13).n(this, i21);
                        org.telegram.messenger.qs.f(i13).n(this, i19);
                        org.telegram.messenger.qs.f(i13).n(this, i20);
                        c();
                        return;
                    }
                    return;
                } else if (i7 == i20) {
                    if (((org.telegram.messenger.ij) objArr[0]) == this.D && this.f34864a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f34864a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap s5 = org.telegram.messenger.gz.s(str3, (long) (this.P * 1000.0d), null, true);
                            if (s5 != null) {
                                org.telegram.messenger.w7.G(i13);
                                File K = org.telegram.messenger.w7.K(this.f34869n, null, true, true);
                                if (K != null) {
                                    if (org.telegram.messenger.r2.f25191a) {
                                        org.telegram.messenger.a8.d("delete file " + K);
                                    }
                                    K.delete();
                                }
                                org.telegram.messenger.w7.G(i13);
                                File K2 = org.telegram.messenger.w7.K(this.h, null, true, true);
                                if (K2 != null) {
                                    if (org.telegram.messenger.r2.f25191a) {
                                        org.telegram.messenger.a8.d("delete file " + K2);
                                    }
                                    K2.delete();
                                }
                                this.h = org.telegram.messenger.gc.Y(s5, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize Y = org.telegram.messenger.gc.Y(s5, 150.0f, 150.0f, 80, 150, 150);
                                this.f34869n = Y;
                                if (Y != null) {
                                    try {
                                        org.telegram.messenger.w7.G(i13);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.K(this.f34869n, null, true, true).getAbsolutePath());
                                        org.telegram.messenger.gc.D().O(new BitmapDrawable(decodeFile), this.f34869n.location.volume_id + "_" + this.f34869n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            org.telegram.messenger.qs.f(i13).n(this, i21);
                            org.telegram.messenger.qs.f(i13).n(this, i19);
                            org.telegram.messenger.qs.f(i13).n(this, i20);
                            this.f34874y = str3;
                            this.f34873x = str3;
                            this.D = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == i21 && ((org.telegram.messenger.ij) objArr[0]) == this.D && (f2Var = this.f34864a) != null) {
                    this.f34873x = (String) objArr[1];
                    f2Var.getFileLoader().h0(this.f34873x, false, false, (int) this.D.f23255p0.f23459q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.W = 1.0f;
            if (((String) objArr[0]).equals(this.f34872w)) {
                org.telegram.messenger.qs.f(i13).n(this, i18);
                org.telegram.messenger.qs.f(i13).n(this, i17);
                org.telegram.messenger.qs.f(i13).n(this, i16);
                org.telegram.messenger.qs.f(i13).n(this, i15);
                this.f34872w = null;
                if (i7 != i18 && i7 != i16) {
                    this.f34867e.w0(null);
                    i30 i30Var3 = this.f34865b;
                    if (i30Var3 != null) {
                        i30Var3.T();
                        return;
                    }
                    return;
                }
                r(false, org.telegram.messenger.gc.K(this.E, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.f34872w)) {
            this.f34872w = null;
            if (i7 == i14) {
                this.M = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f34873x)) {
            this.f34873x = null;
            if (i7 == i14) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.f34872w == null && this.f34873x == null && this.D == null) {
            org.telegram.messenger.qs.f(i13).n(this, i14);
            org.telegram.messenger.qs.f(i13).n(this, i11);
            org.telegram.messenger.qs.f(i13).n(this, i12);
            if (i7 == i14 && (i30Var = this.f34865b) != null) {
                i30Var.U(this.M, this.N, this.P, this.f34874y, this.h, this.f34869n, this.f34871s, this.O);
            }
            c();
        }
    }

    public final void e() {
        int i7;
        qs qsVar;
        boolean z9;
        org.telegram.ui.ActionBar.f2 f2Var = this.f34864a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            if (this.f34866c == null) {
                di diVar = new di(this.f34864a.getParentActivity(), this.f34864a, this.R, this.S);
                this.f34866c = diVar;
                if (this.Q) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                i30 i30Var = this.f34865b;
                if (i30Var != null && i30Var.x()) {
                    i30 i30Var2 = this.f34865b;
                    Objects.requireNonNull(i30Var2);
                    qsVar = new qs(i30Var2, 1);
                } else {
                    qsVar = null;
                }
                diVar.K2 = i7;
                diVar.L2 = qsVar;
                diVar.M2 = false;
                vh vhVar = diVar.f32942s2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar.f32882a2;
                if (vhVar == null || vhVar == chatAttachAlertPhotoLayout) {
                    diVar.f32939r3.setVisibility(8);
                }
                int i10 = diVar.K2;
                TextView textView = diVar.f32891d3;
                if (i10 == 2) {
                    textView.setText(org.telegram.messenger.hd.M0(2131752121, null));
                } else {
                    textView.setText(org.telegram.messenger.hd.M0(2131752123, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    di diVar2 = chatAttachAlertPhotoLayout.f38951b;
                    if (diVar2.K2 != 0 && !diVar2.f32957w1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    chatAttachAlertPhotoLayout.f31201g1 = z9;
                }
                di diVar3 = this.f34866c;
                diVar3.T3 = new f30(this);
                diVar3.L1 = this;
            }
            int i11 = this.U;
            if (i11 == 1) {
                this.f34866c.f32891d3.setText(org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745519, this.L.first_name));
            } else if (i11 == 2) {
                this.f34866c.f32891d3.setText(org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744407, this.L.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        di diVar = this.f34866c;
        if (diVar == null || dialog != diVar) {
            return false;
        }
        diVar.f32882a2.d0(false);
        this.f34866c.K();
        this.f34866c.f32882a2.g0(true);
        return true;
    }

    public final boolean g() {
        if (this.f34872w == null && this.f34873x == null && this.D == null) {
            return false;
        }
        return true;
    }

    public final void h(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 != 0 && i7 != 2) {
                if (i7 == 13) {
                    this.f34864a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.p1().H2(null, this.f34864a, null);
                    o(this.f34868f, null, org.telegram.messenger.g0.N0(this.f34868f), false);
                    org.telegram.messenger.g0.e(this.f34868f);
                    this.f34868f = null;
                    return;
                } else if (i7 == 14) {
                    if (intent != null && intent.getData() != null) {
                        org.telegram.messenger.g0.h3(new fq(20, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    p(this.f34868f, null, true);
                    org.telegram.messenger.g0.e(this.f34868f);
                    this.f34868f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            di diVar = this.f34866c;
            if (diVar != null) {
                diVar.f32882a2.j0(i7, intent, this.f34868f);
            }
            this.f34868f = null;
        }
    }

    public final void i() {
        di diVar = this.f34866c;
        if (diVar != null) {
            diVar.l1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        di diVar = this.f34866c;
        if (diVar != null) {
            if (i7 == 17) {
                diVar.f32882a2.W(false);
                this.f34866c.f32882a2.b0();
            } else if (i7 == 4) {
                diVar.f32882a2.b0();
            }
        }
    }

    public final void k() {
        di diVar = this.f34866c;
        if (diVar != null) {
            diVar.m1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f34864a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            try {
                int i7 = Build.VERSION.SDK_INT;
                if (this.f34864a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f34864a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i7 >= 24) {
                        Activity parentActivity = this.f34864a.getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f34868f = q02.getAbsolutePath();
                }
                this.f34864a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        int i7;
        org.telegram.ui.ActionBar.f2 f2Var = this.f34864a;
        if (f2Var == null) {
            return;
        }
        Activity parentActivity = f2Var.getParentActivity();
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
            i7 = 3;
        } else {
            i7 = 1;
        }
        org.telegram.ui.mm0 mm0Var = new org.telegram.ui.mm0(i7, false, false, null);
        mm0Var.f47818y = this.J;
        mm0Var.V = new n(this);
        this.f34864a.presentFragment(mm0Var);
    }

    public final void n(boolean z9, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.f2 f2Var = this.f34864a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i7;
            if (this.G) {
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f34864a;
                if (f2Var2 != null && f2Var2.getParentActivity() != null) {
                    e();
                    di diVar = this.f34866c;
                    diVar.O3 = this.H;
                    diVar.y1(1, false);
                    this.f34866c.f32882a2.i0();
                    this.f34866c.e1();
                    di diVar2 = this.f34866c;
                    diVar2.H0 = onDismissListener;
                    int i10 = this.U;
                    if (i10 != 0) {
                        diVar2.H1 = new h30(i10, this.L);
                    }
                    this.f34864a.showDialog(diVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.v2 h = org.telegram.messenger.camera.q.h(this.f34864a.getParentActivity(), false, 1, null);
            if (i7 == 1) {
                h.O = org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745519, this.L.first_name);
                h.P = true;
            } else if (i7 == 2) {
                h.O = org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744407, this.L.first_name);
                h.P = true;
            } else {
                h.O = org.telegram.messenger.hd.M0(2131752123, null);
                h.P = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.f1.t(null, 2131752113, arrayList, 2131232086, arrayList2);
            arrayList3.add(0);
            if (this.Q) {
                org.telegram.ui.Cells.f1.t(null, 2131752120, arrayList, 2131232418, arrayList2);
                arrayList3.add(4);
            }
            org.telegram.ui.Cells.f1.t(null, 2131752128, arrayList, 2131232292, arrayList2);
            arrayList3.add(1);
            if (this.J) {
                org.telegram.ui.Cells.f1.t(null, 2131752126, arrayList, 2131232354, arrayList2);
                arrayList3.add(2);
            }
            if (z9) {
                org.telegram.ui.Cells.f1.t(null, 2131751515, arrayList, 2131232108, arrayList2);
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
                    org.telegram.ui.ActionBar.f2 f2Var3;
                    int intValue = ((Integer) arrayList3.get(i12)).intValue();
                    j30 j30Var = j30.this;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (f2Var3 = j30Var.f34864a) != null && f2Var3.getParentActivity() != null) {
                                        try {
                                            int i13 = Build.VERSION.SDK_INT;
                                            if (j30Var.f34864a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                j30Var.f34864a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File s02 = org.telegram.messenger.g0.s0(false);
                                            if (s02 != null) {
                                                if (i13 >= 24) {
                                                    Activity parentActivity = j30Var.f34864a.getParentActivity();
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
                                                j30Var.f34868f = s02.getAbsolutePath();
                                            }
                                            j30Var.f34864a.startActivityForResult(intent, 15);
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
                            j30Var.q();
                            return;
                        }
                        j30Var.m();
                        return;
                    }
                    j30Var.l();
                }
            };
            h.L = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            h.M = iArr;
            h.K = onClickListener;
            h.H0 = onDismissListener;
            this.f34864a.showDialog(h);
            if (z9) {
                int i12 = org.telegram.ui.ActionBar.k6.f28089q7;
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, i12, false);
                int i13 = org.telegram.ui.ActionBar.k6.f28069p7;
                h.C0(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.k6.x0(null, i13, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < h.f28649w0.size() && (o2Var = (org.telegram.ui.ActionBar.o2) h.f28649w0.get(size2)) != null && o2Var.getTextView() != null && o2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.r6.V(o2Var.getTextView(), i12, null);
                    org.telegram.ui.ActionBar.r6.t(o2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z9) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        gfVar.n(pair);
        gfVar.f26824b = z9;
        gfVar.f26825c = str2;
        arrayList.add(gfVar);
        PhotoViewer.p1().H2(null, this.f34864a, null);
        PhotoViewer.p1().e2(arrayList, 0, 1, false, new g30(this, arrayList), null);
        PhotoViewer.p1().P = true;
    }

    public final void p(String str, String str2, boolean z9) {
        o(str, str2, new Pair(0, 0), z9);
    }

    public final void q() {
        if (this.f34864a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.xm0 xm0Var = new org.telegram.ui.xm0(0, null, hashMap, arrayList, 1, false, null, this.R);
        ?? obj = new Object();
        obj.d = this;
        obj.f990b = hashMap;
        obj.f991c = arrayList;
        xm0Var.f51920s0 = obj;
        xm0Var.k0(1, false);
        xm0Var.f51915p0 = this.f34865b.getInitialSearchString();
        if (this.S) {
            this.f34864a.showAsSheet(xm0Var);
        } else {
            this.f34864a.presentFragment(xm0Var);
        }
    }

    public final void r(boolean z9, Bitmap bitmap, org.telegram.messenger.ij ijVar) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.D = null;
            this.f34874y = null;
            if (ijVar == null) {
                videoSize = null;
            } else {
                videoSize = ijVar.f23266s;
            }
            this.O = videoSize;
            this.h = org.telegram.messenger.gc.Y(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize Y = org.telegram.messenger.gc.Y(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.f34869n = Y;
            int i7 = this.d;
            if (Y != null) {
                try {
                    org.telegram.messenger.w7.G(i7);
                    Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.K(this.f34869n, null, true, true).getAbsolutePath());
                    this.f34870r = decodeFile;
                    org.telegram.messenger.gc.D().O(new BitmapDrawable(decodeFile), this.f34869n.location.volume_id + "_" + this.f34869n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                org.telegram.messenger.p10.i(i7).v(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.w7.z(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.f34872w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
                if (this.K) {
                    if (ijVar != null && ijVar.f23255p0 != null) {
                        if (this.I && !org.telegram.messenger.qp.s1(i7).f24898u7) {
                            i30 i30Var = this.f34865b;
                            if (i30Var != null) {
                                i30Var.O(z9, true);
                            }
                            i30 i30Var2 = this.f34865b;
                            if (i30Var2 != null) {
                                i30Var2.U(null, null, 0.0d, null, this.h, this.f34869n, this.f34871s, null);
                                this.f34865b.U(null, null, this.P, this.f34874y, this.h, this.f34869n, this.f34871s, this.O);
                                c();
                                return;
                            }
                            return;
                        }
                        this.D = ijVar;
                        org.telegram.messenger.j20 j20Var = ijVar.f23255p0;
                        long j3 = j20Var.f23443a;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        this.P = (j20Var.f23447c - j3) / 1000000.0d;
                        j20Var.Z = false;
                        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24952a2);
                        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24964c2);
                        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24958b2);
                        MediaController.B().h0(ijVar, true, true, false);
                        this.f34872w = null;
                        i30 i30Var3 = this.f34865b;
                        if (i30Var3 != null) {
                            i30Var3.O(z9, true);
                        }
                        this.f34871s = true;
                    } else {
                        i30 i30Var4 = this.f34865b;
                        if (i30Var4 != null) {
                            i30Var4.O(z9, false);
                        }
                        this.f34871s = false;
                    }
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.W1);
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.V1);
                    if (this.f34872w != null) {
                        org.telegram.messenger.w7.G(i7).i0(false, 16777216, this.f34872w, true);
                    }
                }
                i30 i30Var5 = this.f34865b;
                if (i30Var5 != null) {
                    i30Var5.U(null, null, 0.0d, null, this.h, this.f34869n, this.f34871s, null);
                }
            }
        }
    }

    public final void s(org.telegram.messenger.gf gfVar) {
        Bitmap K;
        String str = gfVar.h;
        if (str == null) {
            str = gfVar.I;
        }
        org.telegram.messenger.ij ijVar = null;
        if ((gfVar.f26824b || gfVar.f26839s != null) && !gfVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f26973id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(org.telegram.messenger.p10.f24459s0, tL_message, false, false);
            TLRPC.Message message = ijVar2.f23237k;
            File z9 = org.telegram.messenger.w7.z(4);
            message.attachPath = new File(z9, org.telegram.messenger.iz.p() + "_avatar.mp4").getAbsolutePath();
            ijVar2.f23255p0 = gfVar.f26839s;
            ijVar2.f23266s = gfVar.S;
            K = org.telegram.messenger.gc.K(gfVar.f26825c, null, 800.0f, 800.0f, true);
            ijVar = ijVar2;
        } else {
            K = org.telegram.messenger.gc.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, ijVar);
    }
}
