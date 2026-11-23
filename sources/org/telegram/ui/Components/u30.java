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
public final class u30 implements org.telegram.messenger.fs, org.telegram.ui.qm0 {
    public org.telegram.messenger.fj E;
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
    public org.telegram.ui.ActionBar.g2 f40250a;
    public t30 f40251b;
    public ti f40252c;
    public String f40254f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f40255n;
    public Bitmap f40256r;
    public boolean f40257s;
    public String f40258w;
    public String f40259x;
    public String f40260y;
    public final int d = org.telegram.messenger.i10.f24637t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver f40253e = new ImageReceiver(null);

    public u30(int i7, boolean z10, boolean z11) {
        this.R = z10;
        this.J = z11;
        this.W = i7;
    }

    public static void a(u30 u30Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.fj fjVar;
        Bitmap K;
        ImageReceiver imageReceiver = u30Var.f40253e;
        int i7 = u30Var.d;
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.yy yyVar = (org.telegram.messenger.yy) arrayList.get(0);
            Bitmap bitmap = null;
            if ((yyVar.f28321o || yyVar.f28317k != null) && !yyVar.f28322p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f28513id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                fjVar = new org.telegram.messenger.fj(org.telegram.messenger.i10.f24637t0, tL_message, false, false);
                fjVar.f24073k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.bz.p() + "_avatar.mp4").getAbsolutePath();
                fjVar.f24101r0 = yyVar.f28317k;
                fjVar.f24104s = yyVar.v;
                bitmap = org.telegram.messenger.ec.K(yyVar.f28312e, null, 800.0f, 800.0f, true);
            } else {
                String str = yyVar.f28311c;
                if (str != null) {
                    K = org.telegram.messenger.ec.K(str, null, 800.0f, 800.0f, true);
                } else {
                    org.telegram.messenger.hf hfVar = yyVar.f28318l;
                    if (hfVar != null) {
                        TLRPC.Photo photo = hfVar.K;
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                            if (w10 != null) {
                                org.telegram.messenger.w7.G(i7);
                                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                                u30Var.F = J.getAbsolutePath();
                                if (!J.exists()) {
                                    org.telegram.messenger.w7.G(i7);
                                    J = org.telegram.messenger.w7.J(w10, null, false, true);
                                    if (!J.exists()) {
                                        J = null;
                                    }
                                }
                                if (J != null) {
                                    K = org.telegram.messenger.ec.K(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.Y1);
                                    org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.Z1);
                                    u30Var.f40258w = org.telegram.messenger.w7.r(null, w10.location);
                                    imageReceiver.r0(org.telegram.messenger.fc.i(w10, yyVar.f28318l.K), null, null, "jpg", null, 1);
                                }
                            }
                            K = null;
                        } else if (hfVar.C != null) {
                            File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(yyVar.f28318l.C) + "." + org.telegram.messenger.ec.B(yyVar.f28318l.C, "jpg"));
                            u30Var.F = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                K = org.telegram.messenger.ec.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                u30Var.f40258w = yyVar.f28318l.C;
                                org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.R1);
                                org.telegram.messenger.ks.f(i7).b(u30Var, org.telegram.messenger.ks.S1);
                                imageReceiver.p0(yyVar.f28318l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    fjVar = null;
                }
                fjVar = null;
                bitmap = K;
            }
            u30Var.r(z10, bitmap, fjVar);
        }
    }

    public final void b() {
        this.U = true;
        String str = this.f40258w;
        int i7 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i7).b(this.f40258w, false);
        }
        if (this.f40259x != null) {
            org.telegram.messenger.w7.G(i7).b(this.f40259x, false);
        }
        t30 t30Var = this.f40251b;
        if (t30Var != null) {
            t30Var.U();
        }
    }

    public final void c() {
        this.f40258w = null;
        this.f40259x = null;
        this.f40260y = null;
        this.E = null;
        if (this.G) {
            this.f40253e.x0(null);
            this.f40250a = null;
            this.f40251b = null;
        }
    }

    public final void d() {
        this.U = false;
        if (this.f40258w == null && this.f40259x == null && this.E == null) {
            this.f40250a = null;
            this.f40251b = null;
        } else {
            this.G = true;
        }
        ti tiVar = this.f40252c;
        if (tiVar != null) {
            tiVar.L();
            this.f40252c.k1();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        t30 t30Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        String str;
        int i11 = org.telegram.messenger.ks.W1;
        int i12 = org.telegram.messenger.ks.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.ks.U1;
        if (i7 != i14 && i7 != i12) {
            if (i7 == i11) {
                String str2 = (String) objArr[0];
                if (this.E != null) {
                    str = this.f40259x;
                } else {
                    str = this.f40258w;
                }
                if (this.f40251b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    t30 t30Var2 = this.f40251b;
                    this.X = min;
                    t30Var2.H(min);
                    return;
                }
                return;
            }
            int i15 = org.telegram.messenger.ks.S1;
            int i16 = org.telegram.messenger.ks.R1;
            int i17 = org.telegram.messenger.ks.Z1;
            int i18 = org.telegram.messenger.ks.Y1;
            if (i7 != i18 && i7 != i17 && i7 != i16 && i7 != i15) {
                int i19 = org.telegram.messenger.ks.f25194c2;
                int i20 = org.telegram.messenger.ks.f25188b2;
                int i21 = org.telegram.messenger.ks.f25181a2;
                if (i7 == i19) {
                    if (((org.telegram.messenger.fj) objArr[0]) == this.E && this.f40250a != null) {
                        org.telegram.messenger.ks.f(i13).n(this, i21);
                        org.telegram.messenger.ks.f(i13).n(this, i19);
                        org.telegram.messenger.ks.f(i13).n(this, i20);
                        c();
                        return;
                    }
                    return;
                } else if (i7 == i20) {
                    if (((org.telegram.messenger.fj) objArr[0]) == this.E && this.f40250a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f40250a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.Q > longValue3) {
                                this.Q = longValue3;
                            }
                            Bitmap s5 = org.telegram.messenger.zy.s(str3, (long) (this.Q * 1000.0d), null, true);
                            if (s5 != null) {
                                org.telegram.messenger.w7.G(i13);
                                File J = org.telegram.messenger.w7.J(this.f40255n, null, true, true);
                                if (J != null) {
                                    if (org.telegram.messenger.s2.f26829a) {
                                        org.telegram.messenger.a8.d("delete file " + J);
                                    }
                                    J.delete();
                                }
                                org.telegram.messenger.w7.G(i13);
                                File J2 = org.telegram.messenger.w7.J(this.h, null, true, true);
                                if (J2 != null) {
                                    if (org.telegram.messenger.s2.f26829a) {
                                        org.telegram.messenger.a8.d("delete file " + J2);
                                    }
                                    J2.delete();
                                }
                                this.h = org.telegram.messenger.ec.Y(s5, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize Y = org.telegram.messenger.ec.Y(s5, 150.0f, 150.0f, 80, 150, 150);
                                this.f40255n = Y;
                                if (Y != null) {
                                    try {
                                        org.telegram.messenger.w7.G(i13);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f40255n, null, true, true).getAbsolutePath());
                                        org.telegram.messenger.ec.D().O(new BitmapDrawable(decodeFile), this.f40255n.location.volume_id + "_" + this.f40255n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            org.telegram.messenger.ks.f(i13).n(this, i21);
                            org.telegram.messenger.ks.f(i13).n(this, i19);
                            org.telegram.messenger.ks.f(i13).n(this, i20);
                            this.f40260y = str3;
                            this.f40259x = str3;
                            this.E = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == i21 && ((org.telegram.messenger.fj) objArr[0]) == this.E && (g2Var = this.f40250a) != null) {
                    this.f40259x = (String) objArr[1];
                    g2Var.getFileLoader().g0(this.f40259x, false, false, (int) this.E.f24101r0.f23603q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.X = 1.0f;
            if (((String) objArr[0]).equals(this.f40258w)) {
                org.telegram.messenger.ks.f(i13).n(this, i18);
                org.telegram.messenger.ks.f(i13).n(this, i17);
                org.telegram.messenger.ks.f(i13).n(this, i16);
                org.telegram.messenger.ks.f(i13).n(this, i15);
                this.f40258w = null;
                if (i7 != i18 && i7 != i16) {
                    this.f40253e.x0(null);
                    t30 t30Var3 = this.f40251b;
                    if (t30Var3 != null) {
                        t30Var3.U();
                        return;
                    }
                    return;
                }
                r(false, org.telegram.messenger.ec.K(this.F, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.f40258w)) {
            this.f40258w = null;
            if (i7 == i14) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f40259x)) {
            this.f40259x = null;
            if (i7 == i14) {
                this.O = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.f40258w == null && this.f40259x == null && this.E == null) {
            org.telegram.messenger.ks.f(i13).n(this, i14);
            org.telegram.messenger.ks.f(i13).n(this, i11);
            org.telegram.messenger.ks.f(i13).n(this, i12);
            if (i7 == i14 && (t30Var = this.f40251b) != null) {
                t30Var.V(this.N, this.O, this.Q, this.f40260y, this.h, this.f40255n, this.f40257s, this.P);
            }
            c();
        }
    }

    public final void e() {
        int i7;
        dt dtVar;
        boolean z10;
        org.telegram.ui.ActionBar.g2 g2Var = this.f40250a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            if (this.f40252c == null) {
                ti tiVar = new ti(this.f40250a.getParentActivity(), this.f40250a, this.S, this.T);
                this.f40252c = tiVar;
                if (this.R) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                t30 t30Var = this.f40251b;
                if (t30Var != null && t30Var.x()) {
                    t30 t30Var2 = this.f40251b;
                    Objects.requireNonNull(t30Var2);
                    dtVar = new dt(t30Var2, 1);
                } else {
                    dtVar = null;
                }
                tiVar.O2 = i7;
                tiVar.P2 = dtVar;
                tiVar.Q2 = false;
                li liVar = tiVar.f40029w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = tiVar.f39967e2;
                if (liVar == null || liVar == chatAttachAlertPhotoLayout) {
                    tiVar.f40026v3.setVisibility(8);
                }
                int i10 = tiVar.O2;
                TextView textView = tiVar.f39977h3;
                if (i10 == 2) {
                    textView.setText(org.telegram.messenger.gd.N0(2131752109, null));
                } else {
                    textView.setText(org.telegram.messenger.gd.N0(2131752111, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ti tiVar2 = chatAttachAlertPhotoLayout.f37135b;
                    if (tiVar2.O2 != 0 && !tiVar2.A1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f32882h1 = z10;
                }
                ti tiVar3 = this.f40252c;
                tiVar3.X3 = new q30(this);
                tiVar3.P1 = this;
            }
            int i11 = this.V;
            if (i11 == 1) {
                this.f40252c.f39977h3.setText(org.telegram.messenger.gd.a0("SetPhotoFor", null, 2131745322, this.M.first_name));
            } else if (i11 == 2) {
                this.f40252c.f39977h3.setText(org.telegram.messenger.gd.a0("SuggestPhotoFor", null, 2131744161, this.M.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        ti tiVar = this.f40252c;
        if (tiVar == null || dialog != tiVar) {
            return false;
        }
        tiVar.f39967e2.d0(false);
        this.f40252c.L();
        this.f40252c.f39967e2.g0(true);
        return true;
    }

    public final boolean g() {
        if (this.f40258w == null && this.f40259x == null && this.E == null) {
            return false;
        }
        return true;
    }

    public final void h(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 != 0 && i7 != 2) {
                if (i7 == 13) {
                    this.f40250a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.p1().J2(null, this.f40250a, null);
                    o(this.f40254f, null, org.telegram.messenger.g0.N0(this.f40254f), false);
                    org.telegram.messenger.g0.e(this.f40254f);
                    this.f40254f = null;
                    return;
                } else if (i7 == 14) {
                    if (intent != null && intent.getData() != null) {
                        org.telegram.messenger.g0.g3(new bt(14, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    p(this.f40254f, null, true);
                    org.telegram.messenger.g0.e(this.f40254f);
                    this.f40254f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            ti tiVar = this.f40252c;
            if (tiVar != null) {
                tiVar.f39967e2.j0(i7, intent, this.f40254f);
            }
            this.f40254f = null;
        }
    }

    public final void i() {
        ti tiVar = this.f40252c;
        if (tiVar != null) {
            tiVar.m1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        ti tiVar = this.f40252c;
        if (tiVar != null) {
            if (i7 == 17) {
                tiVar.f39967e2.X(false);
                this.f40252c.f39967e2.b0();
            } else if (i7 == 4) {
                tiVar.f39967e2.b0();
            }
        }
    }

    public final void k() {
        ti tiVar = this.f40252c;
        if (tiVar != null) {
            tiVar.n1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f40250a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            try {
                int i7 = Build.VERSION.SDK_INT;
                if (this.f40250a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f40250a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i7 >= 24) {
                        Activity parentActivity = this.f40250a.getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f40254f = q02.getAbsolutePath();
                }
                this.f40250a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        int i7;
        org.telegram.ui.ActionBar.g2 g2Var = this.f40250a;
        if (g2Var == null) {
            return;
        }
        Activity parentActivity = g2Var.getParentActivity();
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
            i7 = 3;
        } else {
            i7 = 1;
        }
        org.telegram.ui.om0 om0Var = new org.telegram.ui.om0(i7, false, false, null);
        om0Var.f50727y = this.K;
        om0Var.W = new org.telegram.ui.ActionBar.i5(this);
        this.f40250a.presentFragment(om0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.g2 g2Var = this.f40250a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            this.U = false;
            this.V = i7;
            if (this.H) {
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f40250a;
                if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                    e();
                    ti tiVar = this.f40252c;
                    tiVar.S3 = this.I;
                    tiVar.z1(1, false);
                    this.f40252c.f39967e2.i0();
                    this.f40252c.f1();
                    ti tiVar2 = this.f40252c;
                    tiVar2.I0 = onDismissListener;
                    int i10 = this.V;
                    if (i10 != 0) {
                        tiVar2.L1 = new s30(i10, this.M);
                    }
                    this.f40250a.showDialog(tiVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.m10.j(this.f40250a.getParentActivity(), false, 1, null);
            if (i7 == 1) {
                j3.P = org.telegram.messenger.gd.a0("SetPhotoFor", null, 2131745322, this.M.first_name);
                j3.Q = true;
            } else if (i7 == 2) {
                j3.P = org.telegram.messenger.gd.a0("SuggestPhotoFor", null, 2131744161, this.M.first_name);
                j3.Q = true;
            } else {
                j3.P = org.telegram.messenger.gd.N0(2131752111, null);
                j3.Q = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.c0.v(null, 2131752101, arrayList, 2131232091, arrayList2);
            arrayList3.add(0);
            if (this.R) {
                org.telegram.ui.Cells.c0.v(null, 2131752108, arrayList, 2131232423, arrayList2);
                arrayList3.add(4);
            }
            org.telegram.ui.Cells.c0.v(null, 2131752116, arrayList, 2131232297, arrayList2);
            arrayList3.add(1);
            if (this.K) {
                org.telegram.ui.Cells.c0.v(null, 2131752114, arrayList, 2131232359, arrayList2);
                arrayList3.add(2);
            }
            if (z10) {
                org.telegram.ui.Cells.c0.v(null, 2131751502, arrayList, 2131232113, arrayList2);
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
                    org.telegram.ui.ActionBar.g2 g2Var3;
                    int intValue = ((Integer) arrayList3.get(i12)).intValue();
                    u30 u30Var = u30.this;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (g2Var3 = u30Var.f40250a) != null && g2Var3.getParentActivity() != null) {
                                        try {
                                            int i13 = Build.VERSION.SDK_INT;
                                            if (u30Var.f40250a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                u30Var.f40250a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File s02 = org.telegram.messenger.g0.s0(false);
                                            if (s02 != null) {
                                                if (i13 >= 24) {
                                                    Activity parentActivity = u30Var.f40250a.getParentActivity();
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
                                                u30Var.f40254f = s02.getAbsolutePath();
                                            }
                                            u30Var.f40250a.startActivityForResult(intent, 15);
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
                            u30Var.q();
                            return;
                        }
                        u30Var.m();
                        return;
                    }
                    u30Var.l();
                }
            };
            j3.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            j3.N = iArr;
            j3.L = onClickListener;
            j3.I0 = onDismissListener;
            this.f40250a.showDialog(j3);
            if (z10) {
                int i12 = org.telegram.ui.ActionBar.n6.f29692q7;
                int x02 = org.telegram.ui.ActionBar.n6.x0(null, i12, false);
                int i13 = org.telegram.ui.ActionBar.n6.f29672p7;
                j3.C0(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.n6.x0(null, i13, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < j3.f30266x0.size() && (p2Var = (org.telegram.ui.ActionBar.p2) j3.f30266x0.get(size2)) != null && p2Var.getTextView() != null && p2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.u6.U(p2Var.getTextView(), i12, null);
                    org.telegram.ui.ActionBar.u6.s(p2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        efVar.n(pair);
        efVar.f27963b = z10;
        efVar.f27964c = str2;
        arrayList.add(efVar);
        PhotoViewer.p1().J2(null, this.f40250a, null);
        PhotoViewer.p1().g2(arrayList, 0, 1, false, new r30(this, arrayList), null);
        PhotoViewer.p1().Q = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f40250a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.an0 an0Var = new org.telegram.ui.an0(0, null, hashMap, arrayList, 1, false, null, this.S);
        ?? obj = new Object();
        obj.d = this;
        obj.f988b = hashMap;
        obj.f989c = arrayList;
        an0Var.f45769t0 = obj;
        an0Var.k0(1, false);
        an0Var.f45764q0 = this.f40251b.getInitialSearchString();
        if (this.T) {
            this.f40250a.showAsSheet(an0Var);
        } else {
            this.f40250a.presentFragment(an0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.fj fjVar) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.O = null;
            this.N = null;
            this.E = null;
            this.f40260y = null;
            if (fjVar == null) {
                videoSize = null;
            } else {
                videoSize = fjVar.f24104s;
            }
            this.P = videoSize;
            this.h = org.telegram.messenger.ec.Y(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize Y = org.telegram.messenger.ec.Y(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.f40255n = Y;
            int i7 = this.d;
            if (Y != null) {
                try {
                    org.telegram.messenger.w7.G(i7);
                    Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f40255n, null, true, true).getAbsolutePath());
                    this.f40256r = decodeFile;
                    org.telegram.messenger.ec.D().O(new BitmapDrawable(decodeFile), this.f40255n.location.volume_id + "_" + this.f40255n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                org.telegram.messenger.i10.i(i7).v(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.w7.z(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.f40258w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
                if (this.L) {
                    if (fjVar != null && fjVar.f24101r0 != null) {
                        if (this.J && !org.telegram.messenger.mp.u1(i7).f25902x7) {
                            t30 t30Var = this.f40251b;
                            if (t30Var != null) {
                                t30Var.P(z10, true);
                            }
                            t30 t30Var2 = this.f40251b;
                            if (t30Var2 != null) {
                                t30Var2.V(null, null, 0.0d, null, this.h, this.f40255n, this.f40257s, null);
                                this.f40251b.V(null, null, this.Q, this.f40260y, this.h, this.f40255n, this.f40257s, this.P);
                                c();
                                return;
                            }
                            return;
                        }
                        this.E = fjVar;
                        org.telegram.messenger.d20 d20Var = fjVar.f24101r0;
                        long j3 = d20Var.f23587a;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        this.Q = (d20Var.f23591c - j3) / 1000000.0d;
                        d20Var.Z = false;
                        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.f25181a2);
                        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.f25194c2);
                        org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.f25188b2);
                        MediaController.B().h0(fjVar, true, true, false);
                        this.f40258w = null;
                        t30 t30Var3 = this.f40251b;
                        if (t30Var3 != null) {
                            t30Var3.P(z10, true);
                        }
                        this.f40257s = true;
                    } else {
                        t30 t30Var4 = this.f40251b;
                        if (t30Var4 != null) {
                            t30Var4.P(z10, false);
                        }
                        this.f40257s = false;
                    }
                    org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.U1);
                    org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.W1);
                    org.telegram.messenger.ks.f(i7).b(this, org.telegram.messenger.ks.V1);
                    if (this.f40258w != null) {
                        org.telegram.messenger.w7.G(i7).h0(false, 16777216, this.f40258w, true);
                    }
                }
                t30 t30Var5 = this.f40251b;
                if (t30Var5 != null) {
                    t30Var5.V(null, null, 0.0d, null, this.h, this.f40255n, this.f40257s, null);
                }
            }
        }
    }

    public final void s(org.telegram.messenger.ef efVar) {
        Bitmap K;
        String str = efVar.h;
        if (str == null) {
            str = efVar.I;
        }
        org.telegram.messenger.fj fjVar = null;
        if ((efVar.f27963b || efVar.f27978s != null) && !efVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28513id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.fj fjVar2 = new org.telegram.messenger.fj(org.telegram.messenger.i10.f24637t0, tL_message, false, false);
            TLRPC.Message message = fjVar2.f24073k;
            File z10 = org.telegram.messenger.w7.z(4);
            message.attachPath = new File(z10, org.telegram.messenger.bz.p() + "_avatar.mp4").getAbsolutePath();
            fjVar2.f24101r0 = efVar.f27978s;
            fjVar2.f24104s = efVar.S;
            K = org.telegram.messenger.ec.K(efVar.f27964c, null, 800.0f, 800.0f, true);
            fjVar = fjVar2;
        } else {
            K = org.telegram.messenger.ec.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, fjVar);
    }
}
