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
public final class j30 implements org.telegram.messenger.ls, org.telegram.ui.rm0 {
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
    public org.telegram.ui.ActionBar.f2 f34825a;
    public i30 f34826b;
    public ci f34827c;
    public String f34829f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f34830n;
    public Bitmap f34831r;
    public boolean f34832s;
    public String f34833w;
    public String f34834x;
    public String f34835y;
    public final int d = org.telegram.messenger.p10.f24474s0;
    public boolean G = true;
    public boolean J = true;
    public boolean K = true;
    public final ImageReceiver f34828e = new ImageReceiver(null);

    public j30(int i7, boolean z9, boolean z10) {
        this.Q = z9;
        this.I = z10;
        this.V = i7;
    }

    public static void a(j30 j30Var, boolean z9, ArrayList arrayList) {
        org.telegram.messenger.ij ijVar;
        Bitmap K;
        ImageReceiver imageReceiver = j30Var.f34828e;
        int i7 = j30Var.d;
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.fz fzVar = (org.telegram.messenger.fz) arrayList.get(0);
            Bitmap bitmap = null;
            if ((fzVar.f22526o || fzVar.f22522k != null) && !fzVar.f22527p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f26981id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                ijVar = new org.telegram.messenger.ij(org.telegram.messenger.p10.f24474s0, tL_message, false, false);
                ijVar.f23266k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.iz.p() + "_avatar.mp4").getAbsolutePath();
                ijVar.f23284p0 = fzVar.f22522k;
                ijVar.f23295s = fzVar.v;
                bitmap = org.telegram.messenger.gc.K(fzVar.f22517e, null, 800.0f, 800.0f, true);
            } else {
                String str = fzVar.f22516c;
                if (str != null) {
                    K = org.telegram.messenger.gc.K(str, null, 800.0f, 800.0f, true);
                } else {
                    org.telegram.messenger.kf kfVar = fzVar.f22523l;
                    if (kfVar != null) {
                        TLRPC.Photo photo = kfVar.K;
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                            if (w10 != null) {
                                org.telegram.messenger.w7.G(i7);
                                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                                j30Var.E = J.getAbsolutePath();
                                if (!J.exists()) {
                                    org.telegram.messenger.w7.G(i7);
                                    J = org.telegram.messenger.w7.J(w10, null, false, true);
                                    if (!J.exists()) {
                                        J = null;
                                    }
                                }
                                if (J != null) {
                                    K = org.telegram.messenger.gc.K(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.Y1);
                                    org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.Z1);
                                    j30Var.f34833w = org.telegram.messenger.w7.r(null, w10.location);
                                    imageReceiver.q0(org.telegram.messenger.hc.i(w10, fzVar.f22523l.K), null, null, "jpg", null, 1);
                                }
                            }
                            K = null;
                        } else if (kfVar.C != null) {
                            File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(fzVar.f22523l.C) + "." + org.telegram.messenger.gc.B(fzVar.f22523l.C, "jpg"));
                            j30Var.E = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                K = org.telegram.messenger.gc.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                j30Var.f34833w = fzVar.f22523l.C;
                                org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.R1);
                                org.telegram.messenger.qs.f(i7).b(j30Var, org.telegram.messenger.qs.S1);
                                imageReceiver.o0(fzVar.f22523l.C, null, null, "jpg", 1L);
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
        String str = this.f34833w;
        int i7 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i7).b(this.f34833w, false);
        }
        if (this.f34834x != null) {
            org.telegram.messenger.w7.G(i7).b(this.f34834x, false);
        }
        i30 i30Var = this.f34826b;
        if (i30Var != null) {
            i30Var.T();
        }
    }

    public final void c() {
        this.f34833w = null;
        this.f34834x = null;
        this.f34835y = null;
        this.D = null;
        if (this.F) {
            this.f34828e.w0(null);
            this.f34825a = null;
            this.f34826b = null;
        }
    }

    public final void d() {
        this.T = false;
        if (this.f34833w == null && this.f34834x == null && this.D == null) {
            this.f34825a = null;
            this.f34826b = null;
        } else {
            this.F = true;
        }
        ci ciVar = this.f34827c;
        if (ciVar != null) {
            ciVar.K();
            this.f34827c.j1();
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
                    str = this.f34834x;
                } else {
                    str = this.f34833w;
                }
                if (this.f34826b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    i30 i30Var2 = this.f34826b;
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
                int i19 = org.telegram.messenger.qs.f24985c2;
                int i20 = org.telegram.messenger.qs.f24979b2;
                int i21 = org.telegram.messenger.qs.f24973a2;
                if (i7 == i19) {
                    if (((org.telegram.messenger.ij) objArr[0]) == this.D && this.f34825a != null) {
                        org.telegram.messenger.qs.f(i13).n(this, i21);
                        org.telegram.messenger.qs.f(i13).n(this, i19);
                        org.telegram.messenger.qs.f(i13).n(this, i20);
                        c();
                        return;
                    }
                    return;
                } else if (i7 == i20) {
                    if (((org.telegram.messenger.ij) objArr[0]) == this.D && this.f34825a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f34825a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.P > longValue3) {
                                this.P = longValue3;
                            }
                            Bitmap s5 = org.telegram.messenger.gz.s(str3, (long) (this.P * 1000.0d), null, true);
                            if (s5 != null) {
                                org.telegram.messenger.w7.G(i13);
                                File J = org.telegram.messenger.w7.J(this.f34830n, null, true, true);
                                if (J != null) {
                                    if (org.telegram.messenger.r2.f25216a) {
                                        org.telegram.messenger.a8.d("delete file " + J);
                                    }
                                    J.delete();
                                }
                                org.telegram.messenger.w7.G(i13);
                                File J2 = org.telegram.messenger.w7.J(this.h, null, true, true);
                                if (J2 != null) {
                                    if (org.telegram.messenger.r2.f25216a) {
                                        org.telegram.messenger.a8.d("delete file " + J2);
                                    }
                                    J2.delete();
                                }
                                this.h = org.telegram.messenger.gc.Y(s5, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize Y = org.telegram.messenger.gc.Y(s5, 150.0f, 150.0f, 80, 150, 150);
                                this.f34830n = Y;
                                if (Y != null) {
                                    try {
                                        org.telegram.messenger.w7.G(i13);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f34830n, null, true, true).getAbsolutePath());
                                        org.telegram.messenger.gc.D().O(new BitmapDrawable(decodeFile), this.f34830n.location.volume_id + "_" + this.f34830n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            org.telegram.messenger.qs.f(i13).n(this, i21);
                            org.telegram.messenger.qs.f(i13).n(this, i19);
                            org.telegram.messenger.qs.f(i13).n(this, i20);
                            this.f34835y = str3;
                            this.f34834x = str3;
                            this.D = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == i21 && ((org.telegram.messenger.ij) objArr[0]) == this.D && (f2Var = this.f34825a) != null) {
                    this.f34834x = (String) objArr[1];
                    f2Var.getFileLoader().g0(this.f34834x, false, false, (int) this.D.f23284p0.f23491q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.W = 1.0f;
            if (((String) objArr[0]).equals(this.f34833w)) {
                org.telegram.messenger.qs.f(i13).n(this, i18);
                org.telegram.messenger.qs.f(i13).n(this, i17);
                org.telegram.messenger.qs.f(i13).n(this, i16);
                org.telegram.messenger.qs.f(i13).n(this, i15);
                this.f34833w = null;
                if (i7 != i18 && i7 != i16) {
                    this.f34828e.w0(null);
                    i30 i30Var3 = this.f34826b;
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
        if (str4.equals(this.f34833w)) {
            this.f34833w = null;
            if (i7 == i14) {
                this.M = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f34834x)) {
            this.f34834x = null;
            if (i7 == i14) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.f34833w == null && this.f34834x == null && this.D == null) {
            org.telegram.messenger.qs.f(i13).n(this, i14);
            org.telegram.messenger.qs.f(i13).n(this, i11);
            org.telegram.messenger.qs.f(i13).n(this, i12);
            if (i7 == i14 && (i30Var = this.f34826b) != null) {
                i30Var.U(this.M, this.N, this.P, this.f34835y, this.h, this.f34830n, this.f34832s, this.O);
            }
            c();
        }
    }

    public final void e() {
        int i7;
        ps psVar;
        boolean z9;
        org.telegram.ui.ActionBar.f2 f2Var = this.f34825a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            if (this.f34827c == null) {
                ci ciVar = new ci(this.f34825a.getParentActivity(), this.f34825a, this.R, this.S);
                this.f34827c = ciVar;
                if (this.Q) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                i30 i30Var = this.f34826b;
                if (i30Var != null && i30Var.x()) {
                    i30 i30Var2 = this.f34826b;
                    Objects.requireNonNull(i30Var2);
                    psVar = new ps(i30Var2, 1);
                } else {
                    psVar = null;
                }
                ciVar.N2 = i7;
                ciVar.O2 = psVar;
                ciVar.P2 = false;
                uh uhVar = ciVar.f32660v2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar.d2;
                if (uhVar == null || uhVar == chatAttachAlertPhotoLayout) {
                    ciVar.f32657u3.setVisibility(8);
                }
                int i10 = ciVar.N2;
                TextView textView = ciVar.f32609g3;
                if (i10 == 2) {
                    textView.setText(org.telegram.messenger.id.M0(2131752121, null));
                } else {
                    textView.setText(org.telegram.messenger.id.M0(2131752123, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ci ciVar2 = chatAttachAlertPhotoLayout.f38656b;
                    if (ciVar2.N2 != 0 && !ciVar2.f32675z1) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    chatAttachAlertPhotoLayout.f31222g1 = z9;
                }
                ci ciVar3 = this.f34827c;
                ciVar3.W3 = new f30(this);
                ciVar3.O1 = this;
            }
            int i11 = this.U;
            if (i11 == 1) {
                this.f34827c.f32609g3.setText(org.telegram.messenger.id.a0("SetPhotoFor", null, 2131745518, this.L.first_name));
            } else if (i11 == 2) {
                this.f34827c.f32609g3.setText(org.telegram.messenger.id.a0("SuggestPhotoFor", null, 2131744406, this.L.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        ci ciVar = this.f34827c;
        if (ciVar == null || dialog != ciVar) {
            return false;
        }
        ciVar.d2.d0(false);
        this.f34827c.K();
        this.f34827c.d2.g0(true);
        return true;
    }

    public final boolean g() {
        if (this.f34833w == null && this.f34834x == null && this.D == null) {
            return false;
        }
        return true;
    }

    public final void h(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 != 0 && i7 != 2) {
                if (i7 == 13) {
                    this.f34825a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.p1().H2(null, this.f34825a, null);
                    o(this.f34829f, null, org.telegram.messenger.g0.N0(this.f34829f), false);
                    org.telegram.messenger.g0.e(this.f34829f);
                    this.f34829f = null;
                    return;
                } else if (i7 == 14) {
                    if (intent != null && intent.getData() != null) {
                        org.telegram.messenger.g0.h3(new ro(21, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    p(this.f34829f, null, true);
                    org.telegram.messenger.g0.e(this.f34829f);
                    this.f34829f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            ci ciVar = this.f34827c;
            if (ciVar != null) {
                ciVar.d2.j0(i7, intent, this.f34829f);
            }
            this.f34829f = null;
        }
    }

    public final void i() {
        ci ciVar = this.f34827c;
        if (ciVar != null) {
            ciVar.l1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        ci ciVar = this.f34827c;
        if (ciVar != null) {
            if (i7 == 17) {
                ciVar.d2.W(false);
                this.f34827c.d2.b0();
            } else if (i7 == 4) {
                ciVar.d2.b0();
            }
        }
    }

    public final void k() {
        ci ciVar = this.f34827c;
        if (ciVar != null) {
            ciVar.m1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.f2 f2Var = this.f34825a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            try {
                int i7 = Build.VERSION.SDK_INT;
                if (this.f34825a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f34825a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i7 >= 24) {
                        Activity parentActivity = this.f34825a.getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f34829f = q02.getAbsolutePath();
                }
                this.f34825a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        int i7;
        org.telegram.ui.ActionBar.f2 f2Var = this.f34825a;
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
        org.telegram.ui.pm0 pm0Var = new org.telegram.ui.pm0(i7, false, false, null);
        pm0Var.f48803y = this.J;
        pm0Var.V = new m(this);
        this.f34825a.presentFragment(pm0Var);
    }

    public final void n(boolean z9, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.f2 f2Var = this.f34825a;
        if (f2Var != null && f2Var.getParentActivity() != null) {
            this.T = false;
            this.U = i7;
            if (this.G) {
                org.telegram.ui.ActionBar.f2 f2Var2 = this.f34825a;
                if (f2Var2 != null && f2Var2.getParentActivity() != null) {
                    e();
                    ci ciVar = this.f34827c;
                    ciVar.R3 = this.H;
                    ciVar.y1(1, false);
                    this.f34827c.d2.i0();
                    this.f34827c.e1();
                    ci ciVar2 = this.f34827c;
                    ciVar2.H0 = onDismissListener;
                    int i10 = this.U;
                    if (i10 != 0) {
                        ciVar2.K1 = new h30(i10, this.L);
                    }
                    this.f34825a.showDialog(ciVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.w2 h = org.telegram.messenger.camera.q.h(this.f34825a.getParentActivity(), false, 1, null);
            if (i7 == 1) {
                h.O = org.telegram.messenger.id.a0("SetPhotoFor", null, 2131745518, this.L.first_name);
                h.P = true;
            } else if (i7 == 2) {
                h.O = org.telegram.messenger.id.a0("SuggestPhotoFor", null, 2131744406, this.L.first_name);
                h.P = true;
            } else {
                h.O = org.telegram.messenger.id.M0(2131752123, null);
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
                org.telegram.ui.Cells.f1.t(null, 2131751514, arrayList, 2131232108, arrayList2);
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
                                    if (intValue == 4 && (f2Var3 = j30Var.f34825a) != null && f2Var3.getParentActivity() != null) {
                                        try {
                                            int i13 = Build.VERSION.SDK_INT;
                                            if (j30Var.f34825a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                j30Var.f34825a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File s02 = org.telegram.messenger.g0.s0(false);
                                            if (s02 != null) {
                                                if (i13 >= 24) {
                                                    Activity parentActivity = j30Var.f34825a.getParentActivity();
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
                                                j30Var.f34829f = s02.getAbsolutePath();
                                            }
                                            j30Var.f34825a.startActivityForResult(intent, 15);
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
            this.f34825a.showDialog(h);
            if (z9) {
                int i12 = org.telegram.ui.ActionBar.m6.f28131q7;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
                int i13 = org.telegram.ui.ActionBar.m6.f28111p7;
                h.C0(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.m6.x0(null, i13, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < h.f28709w0.size() && (p2Var = (org.telegram.ui.ActionBar.p2) h.f28709w0.get(size2)) != null && p2Var.getTextView() != null && p2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.t6.U(p2Var.getTextView(), i12, null);
                    org.telegram.ui.ActionBar.t6.s(p2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z9) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.gf gfVar = new org.telegram.messenger.gf(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        gfVar.n(pair);
        gfVar.f26849b = z9;
        gfVar.f26850c = str2;
        arrayList.add(gfVar);
        PhotoViewer.p1().H2(null, this.f34825a, null);
        PhotoViewer.p1().e2(arrayList, 0, 1, false, new g30(this, arrayList), null);
        PhotoViewer.p1().P = true;
    }

    public final void p(String str, String str2, boolean z9) {
        o(str, str2, new Pair(0, 0), z9);
    }

    public final void q() {
        if (this.f34825a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.an0 an0Var = new org.telegram.ui.an0(0, null, hashMap, arrayList, 1, false, null, this.R);
        ?? obj = new Object();
        obj.d = this;
        obj.f990b = hashMap;
        obj.f991c = arrayList;
        an0Var.f43773s0 = obj;
        an0Var.k0(1, false);
        an0Var.f43768p0 = this.f34826b.getInitialSearchString();
        if (this.S) {
            this.f34825a.showAsSheet(an0Var);
        } else {
            this.f34825a.presentFragment(an0Var);
        }
    }

    public final void r(boolean z9, Bitmap bitmap, org.telegram.messenger.ij ijVar) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.N = null;
            this.M = null;
            this.D = null;
            this.f34835y = null;
            if (ijVar == null) {
                videoSize = null;
            } else {
                videoSize = ijVar.f23295s;
            }
            this.O = videoSize;
            this.h = org.telegram.messenger.gc.Y(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize Y = org.telegram.messenger.gc.Y(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.f34830n = Y;
            int i7 = this.d;
            if (Y != null) {
                try {
                    org.telegram.messenger.w7.G(i7);
                    Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f34830n, null, true, true).getAbsolutePath());
                    this.f34831r = decodeFile;
                    org.telegram.messenger.gc.D().O(new BitmapDrawable(decodeFile), this.f34830n.location.volume_id + "_" + this.f34830n.location.local_id + "@50_50", true);
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
                this.f34833w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
                if (this.K) {
                    if (ijVar != null && ijVar.f23284p0 != null) {
                        if (this.I && !org.telegram.messenger.qp.s1(i7).f24917u7) {
                            i30 i30Var = this.f34826b;
                            if (i30Var != null) {
                                i30Var.O(z9, true);
                            }
                            i30 i30Var2 = this.f34826b;
                            if (i30Var2 != null) {
                                i30Var2.U(null, null, 0.0d, null, this.h, this.f34830n, this.f34832s, null);
                                this.f34826b.U(null, null, this.P, this.f34835y, this.h, this.f34830n, this.f34832s, this.O);
                                c();
                                return;
                            }
                            return;
                        }
                        this.D = ijVar;
                        org.telegram.messenger.j20 j20Var = ijVar.f23284p0;
                        long j3 = j20Var.f23475a;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        this.P = (j20Var.f23479c - j3) / 1000000.0d;
                        j20Var.Z = false;
                        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24973a2);
                        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24985c2);
                        org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.f24979b2);
                        MediaController.B().h0(ijVar, true, true, false);
                        this.f34833w = null;
                        i30 i30Var3 = this.f34826b;
                        if (i30Var3 != null) {
                            i30Var3.O(z9, true);
                        }
                        this.f34832s = true;
                    } else {
                        i30 i30Var4 = this.f34826b;
                        if (i30Var4 != null) {
                            i30Var4.O(z9, false);
                        }
                        this.f34832s = false;
                    }
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.U1);
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.W1);
                    org.telegram.messenger.qs.f(i7).b(this, org.telegram.messenger.qs.V1);
                    if (this.f34833w != null) {
                        org.telegram.messenger.w7.G(i7).h0(false, 16777216, this.f34833w, true);
                    }
                }
                i30 i30Var5 = this.f34826b;
                if (i30Var5 != null) {
                    i30Var5.U(null, null, 0.0d, null, this.h, this.f34830n, this.f34832s, null);
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
        if ((gfVar.f26849b || gfVar.f26864s != null) && !gfVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f26981id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.ij ijVar2 = new org.telegram.messenger.ij(org.telegram.messenger.p10.f24474s0, tL_message, false, false);
            TLRPC.Message message = ijVar2.f23266k;
            File z9 = org.telegram.messenger.w7.z(4);
            message.attachPath = new File(z9, org.telegram.messenger.iz.p() + "_avatar.mp4").getAbsolutePath();
            ijVar2.f23284p0 = gfVar.f26864s;
            ijVar2.f23295s = gfVar.S;
            K = org.telegram.messenger.gc.K(gfVar.f26850c, null, 800.0f, 800.0f, true);
            ijVar = ijVar2;
        } else {
            K = org.telegram.messenger.gc.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, ijVar);
    }
}
