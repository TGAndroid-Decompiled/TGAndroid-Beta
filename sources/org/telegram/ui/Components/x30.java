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
public final class x30 implements org.telegram.messenger.gs, org.telegram.ui.sm0 {
    public org.telegram.messenger.gj E;
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
    public org.telegram.ui.ActionBar.g2 f41959a;
    public w30 f41960b;
    public ui f41961c;
    public String f41963f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f41964n;
    public Bitmap f41965r;
    public boolean f41966s;
    public String f41967w;
    public String f41968x;
    public String f41969y;
    public final int d = org.telegram.messenger.k10.f24968t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver f41962e = new ImageReceiver(null);

    public x30(int i7, boolean z10, boolean z11) {
        this.R = z10;
        this.J = z11;
        this.W = i7;
    }

    public static void a(x30 x30Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.gj gjVar;
        Bitmap K;
        ImageReceiver imageReceiver = x30Var.f41962e;
        int i7 = x30Var.d;
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.zy zyVar = (org.telegram.messenger.zy) arrayList.get(0);
            Bitmap bitmap = null;
            if ((zyVar.f28417o || zyVar.f28413k != null) && !zyVar.f28418p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f28455id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                gjVar = new org.telegram.messenger.gj(org.telegram.messenger.k10.f24968t0, tL_message, false, false);
                gjVar.f24213k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.cz.p() + "_avatar.mp4").getAbsolutePath();
                gjVar.f24241r0 = zyVar.f28413k;
                gjVar.f24244s = zyVar.v;
                bitmap = org.telegram.messenger.fc.K(zyVar.f28408e, null, 800.0f, 800.0f, true);
            } else {
                String str = zyVar.f28407c;
                if (str != null) {
                    K = org.telegram.messenger.fc.K(str, null, 800.0f, 800.0f, true);
                } else {
                    org.telegram.messenger.jf jfVar = zyVar.f28414l;
                    if (jfVar != null) {
                        TLRPC.Photo photo = jfVar.K;
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                            if (w10 != null) {
                                org.telegram.messenger.w7.G(i7);
                                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                                x30Var.F = J.getAbsolutePath();
                                if (!J.exists()) {
                                    org.telegram.messenger.w7.G(i7);
                                    J = org.telegram.messenger.w7.J(w10, null, false, true);
                                    if (!J.exists()) {
                                        J = null;
                                    }
                                }
                                if (J != null) {
                                    K = org.telegram.messenger.fc.K(J.getAbsolutePath(), null, 800.0f, 800.0f, true);
                                } else {
                                    org.telegram.messenger.ls.f(i7).b(x30Var, org.telegram.messenger.ls.Y1);
                                    org.telegram.messenger.ls.f(i7).b(x30Var, org.telegram.messenger.ls.Z1);
                                    x30Var.f41967w = org.telegram.messenger.w7.r(null, w10.location);
                                    imageReceiver.q0(org.telegram.messenger.gc.i(w10, zyVar.f28414l.K), null, null, "jpg", null, 1);
                                }
                            }
                            K = null;
                        } else if (jfVar.C != null) {
                            File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(zyVar.f28414l.C) + "." + org.telegram.messenger.fc.B(zyVar.f28414l.C, "jpg"));
                            x30Var.F = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                K = org.telegram.messenger.fc.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                x30Var.f41967w = zyVar.f28414l.C;
                                org.telegram.messenger.ls.f(i7).b(x30Var, org.telegram.messenger.ls.R1);
                                org.telegram.messenger.ls.f(i7).b(x30Var, org.telegram.messenger.ls.S1);
                                imageReceiver.o0(zyVar.f28414l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    gjVar = null;
                }
                gjVar = null;
                bitmap = K;
            }
            x30Var.r(z10, bitmap, gjVar);
        }
    }

    public final void b() {
        this.U = true;
        String str = this.f41967w;
        int i7 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i7).b(this.f41967w, false);
        }
        if (this.f41968x != null) {
            org.telegram.messenger.w7.G(i7).b(this.f41968x, false);
        }
        w30 w30Var = this.f41960b;
        if (w30Var != null) {
            w30Var.U();
        }
    }

    public final void c() {
        this.f41967w = null;
        this.f41968x = null;
        this.f41969y = null;
        this.E = null;
        if (this.G) {
            this.f41962e.w0(null);
            this.f41959a = null;
            this.f41960b = null;
        }
    }

    public final void d() {
        this.U = false;
        if (this.f41967w == null && this.f41968x == null && this.E == null) {
            this.f41959a = null;
            this.f41960b = null;
        } else {
            this.G = true;
        }
        ui uiVar = this.f41961c;
        if (uiVar != null) {
            uiVar.L();
            this.f41961c.k1();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        w30 w30Var;
        org.telegram.ui.ActionBar.g2 g2Var;
        String str;
        int i11 = org.telegram.messenger.ls.W1;
        int i12 = org.telegram.messenger.ls.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.ls.U1;
        if (i7 != i14 && i7 != i12) {
            if (i7 == i11) {
                String str2 = (String) objArr[0];
                if (this.E != null) {
                    str = this.f41968x;
                } else {
                    str = this.f41967w;
                }
                if (this.f41960b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    w30 w30Var2 = this.f41960b;
                    this.X = min;
                    w30Var2.I(min);
                    return;
                }
                return;
            }
            int i15 = org.telegram.messenger.ls.S1;
            int i16 = org.telegram.messenger.ls.R1;
            int i17 = org.telegram.messenger.ls.Z1;
            int i18 = org.telegram.messenger.ls.Y1;
            if (i7 != i18 && i7 != i17 && i7 != i16 && i7 != i15) {
                int i19 = org.telegram.messenger.ls.f25289c2;
                int i20 = org.telegram.messenger.ls.f25283b2;
                int i21 = org.telegram.messenger.ls.f25276a2;
                if (i7 == i19) {
                    if (((org.telegram.messenger.gj) objArr[0]) == this.E && this.f41959a != null) {
                        org.telegram.messenger.ls.f(i13).n(this, i21);
                        org.telegram.messenger.ls.f(i13).n(this, i19);
                        org.telegram.messenger.ls.f(i13).n(this, i20);
                        c();
                        return;
                    }
                    return;
                } else if (i7 == i20) {
                    if (((org.telegram.messenger.gj) objArr[0]) == this.E && this.f41959a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f41959a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.Q > longValue3) {
                                this.Q = longValue3;
                            }
                            Bitmap s5 = org.telegram.messenger.az.s(str3, (long) (this.Q * 1000.0d), null, true);
                            if (s5 != null) {
                                org.telegram.messenger.w7.G(i13);
                                File J = org.telegram.messenger.w7.J(this.f41964n, null, true, true);
                                if (J != null) {
                                    if (org.telegram.messenger.s2.f26730a) {
                                        org.telegram.messenger.a8.d("delete file " + J);
                                    }
                                    J.delete();
                                }
                                org.telegram.messenger.w7.G(i13);
                                File J2 = org.telegram.messenger.w7.J(this.h, null, true, true);
                                if (J2 != null) {
                                    if (org.telegram.messenger.s2.f26730a) {
                                        org.telegram.messenger.a8.d("delete file " + J2);
                                    }
                                    J2.delete();
                                }
                                this.h = org.telegram.messenger.fc.Y(s5, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize Y = org.telegram.messenger.fc.Y(s5, 150.0f, 150.0f, 80, 150, 150);
                                this.f41964n = Y;
                                if (Y != null) {
                                    try {
                                        org.telegram.messenger.w7.G(i13);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f41964n, null, true, true).getAbsolutePath());
                                        org.telegram.messenger.fc.D().O(new BitmapDrawable(decodeFile), this.f41964n.location.volume_id + "_" + this.f41964n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            org.telegram.messenger.ls.f(i13).n(this, i21);
                            org.telegram.messenger.ls.f(i13).n(this, i19);
                            org.telegram.messenger.ls.f(i13).n(this, i20);
                            this.f41969y = str3;
                            this.f41968x = str3;
                            this.E = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == i21 && ((org.telegram.messenger.gj) objArr[0]) == this.E && (g2Var = this.f41959a) != null) {
                    this.f41968x = (String) objArr[1];
                    g2Var.getFileLoader().g0(this.f41968x, false, false, (int) this.E.f24241r0.f23842q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.X = 1.0f;
            if (((String) objArr[0]).equals(this.f41967w)) {
                org.telegram.messenger.ls.f(i13).n(this, i18);
                org.telegram.messenger.ls.f(i13).n(this, i17);
                org.telegram.messenger.ls.f(i13).n(this, i16);
                org.telegram.messenger.ls.f(i13).n(this, i15);
                this.f41967w = null;
                if (i7 != i18 && i7 != i16) {
                    this.f41962e.w0(null);
                    w30 w30Var3 = this.f41960b;
                    if (w30Var3 != null) {
                        w30Var3.U();
                        return;
                    }
                    return;
                }
                r(false, org.telegram.messenger.fc.K(this.F, null, 800.0f, 800.0f, true), null);
                return;
            }
            return;
        }
        String str4 = (String) objArr[0];
        if (str4.equals(this.f41967w)) {
            this.f41967w = null;
            if (i7 == i14) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f41968x)) {
            this.f41968x = null;
            if (i7 == i14) {
                this.O = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.f41967w == null && this.f41968x == null && this.E == null) {
            org.telegram.messenger.ls.f(i13).n(this, i14);
            org.telegram.messenger.ls.f(i13).n(this, i11);
            org.telegram.messenger.ls.f(i13).n(this, i12);
            if (i7 == i14 && (w30Var = this.f41960b) != null) {
                w30Var.V(this.N, this.O, this.Q, this.f41969y, this.h, this.f41964n, this.f41966s, this.P);
            }
            c();
        }
    }

    public final void e() {
        int i7;
        ft ftVar;
        boolean z10;
        org.telegram.ui.ActionBar.g2 g2Var = this.f41959a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            if (this.f41961c == null) {
                ui uiVar = new ui(this.f41959a.getParentActivity(), this.f41959a, this.S, this.T);
                this.f41961c = uiVar;
                if (this.R) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                w30 w30Var = this.f41960b;
                if (w30Var != null && w30Var.x()) {
                    w30 w30Var2 = this.f41960b;
                    Objects.requireNonNull(w30Var2);
                    ftVar = new ft(w30Var2, 1);
                } else {
                    ftVar = null;
                }
                uiVar.O2 = i7;
                uiVar.P2 = ftVar;
                uiVar.Q2 = false;
                mi miVar = uiVar.f40441w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar.f40379e2;
                if (miVar == null || miVar == chatAttachAlertPhotoLayout) {
                    uiVar.f40438v3.setVisibility(8);
                }
                int i10 = uiVar.O2;
                TextView textView = uiVar.f40389h3;
                if (i10 == 2) {
                    textView.setText(org.telegram.messenger.hd.N0(2131752109, null));
                } else {
                    textView.setText(org.telegram.messenger.hd.N0(2131752111, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ui uiVar2 = chatAttachAlertPhotoLayout.f37520b;
                    if (uiVar2.O2 != 0 && !uiVar2.A1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f32818h1 = z10;
                }
                ui uiVar3 = this.f41961c;
                uiVar3.X3 = new t30(this);
                uiVar3.P1 = this;
            }
            int i11 = this.V;
            if (i11 == 1) {
                this.f41961c.f40389h3.setText(org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745322, this.M.first_name));
            } else if (i11 == 2) {
                this.f41961c.f40389h3.setText(org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744163, this.M.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        ui uiVar = this.f41961c;
        if (uiVar == null || dialog != uiVar) {
            return false;
        }
        uiVar.f40379e2.d0(false);
        this.f41961c.L();
        this.f41961c.f40379e2.g0(true);
        return true;
    }

    public final boolean g() {
        if (this.f41967w == null && this.f41968x == null && this.E == null) {
            return false;
        }
        return true;
    }

    public final void h(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 != 0 && i7 != 2) {
                if (i7 == 13) {
                    this.f41959a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.p1().I2(null, this.f41959a, null);
                    o(this.f41963f, null, org.telegram.messenger.g0.N0(this.f41963f), false);
                    org.telegram.messenger.g0.e(this.f41963f);
                    this.f41963f = null;
                    return;
                } else if (i7 == 14) {
                    if (intent != null && intent.getData() != null) {
                        org.telegram.messenger.g0.g3(new ou(12, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    p(this.f41963f, null, true);
                    org.telegram.messenger.g0.e(this.f41963f);
                    this.f41963f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            ui uiVar = this.f41961c;
            if (uiVar != null) {
                uiVar.f40379e2.j0(i7, intent, this.f41963f);
            }
            this.f41963f = null;
        }
    }

    public final void i() {
        ui uiVar = this.f41961c;
        if (uiVar != null) {
            uiVar.m1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        ui uiVar = this.f41961c;
        if (uiVar != null) {
            if (i7 == 17) {
                uiVar.f40379e2.X(false);
                this.f41961c.f40379e2.b0();
            } else if (i7 == 4) {
                uiVar.f40379e2.b0();
            }
        }
    }

    public final void k() {
        ui uiVar = this.f41961c;
        if (uiVar != null) {
            uiVar.n1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.g2 g2Var = this.f41959a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            try {
                int i7 = Build.VERSION.SDK_INT;
                if (this.f41959a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f41959a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i7 >= 24) {
                        Activity parentActivity = this.f41959a.getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f41963f = q02.getAbsolutePath();
                }
                this.f41959a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        int i7;
        org.telegram.ui.ActionBar.g2 g2Var = this.f41959a;
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
        org.telegram.ui.qm0 qm0Var = new org.telegram.ui.qm0(i7, false, false, null);
        qm0Var.f51313y = this.K;
        qm0Var.W = new org.telegram.ui.Cells.c5(this);
        this.f41959a.presentFragment(qm0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.g2 g2Var = this.f41959a;
        if (g2Var != null && g2Var.getParentActivity() != null) {
            this.U = false;
            this.V = i7;
            if (this.H) {
                org.telegram.ui.ActionBar.g2 g2Var2 = this.f41959a;
                if (g2Var2 != null && g2Var2.getParentActivity() != null) {
                    e();
                    ui uiVar = this.f41961c;
                    uiVar.S3 = this.I;
                    uiVar.z1(1, false);
                    this.f41961c.f40379e2.i0();
                    this.f41961c.f1();
                    ui uiVar2 = this.f41961c;
                    uiVar2.I0 = onDismissListener;
                    int i10 = this.V;
                    if (i10 != 0) {
                        uiVar2.L1 = new v30(i10, this.M);
                    }
                    this.f41959a.showDialog(uiVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.w2 j3 = org.telegram.messenger.o10.j(this.f41959a.getParentActivity(), false, 1, null);
            if (i7 == 1) {
                j3.P = org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745322, this.M.first_name);
                j3.Q = true;
            } else if (i7 == 2) {
                j3.P = org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744163, this.M.first_name);
                j3.Q = true;
            } else {
                j3.P = org.telegram.messenger.hd.N0(2131752111, null);
                j3.Q = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.c0.v(null, 2131752101, arrayList, 2131232088, arrayList2);
            arrayList3.add(0);
            if (this.R) {
                org.telegram.ui.Cells.c0.v(null, 2131752108, arrayList, 2131232420, arrayList2);
                arrayList3.add(4);
            }
            org.telegram.ui.Cells.c0.v(null, 2131752116, arrayList, 2131232294, arrayList2);
            arrayList3.add(1);
            if (this.K) {
                org.telegram.ui.Cells.c0.v(null, 2131752114, arrayList, 2131232356, arrayList2);
                arrayList3.add(2);
            }
            if (z10) {
                org.telegram.ui.Cells.c0.v(null, 2131751502, arrayList, 2131232110, arrayList2);
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
                    x30 x30Var = x30.this;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (g2Var3 = x30Var.f41959a) != null && g2Var3.getParentActivity() != null) {
                                        try {
                                            int i13 = Build.VERSION.SDK_INT;
                                            if (x30Var.f41959a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                x30Var.f41959a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File s02 = org.telegram.messenger.g0.s0(false);
                                            if (s02 != null) {
                                                if (i13 >= 24) {
                                                    Activity parentActivity = x30Var.f41959a.getParentActivity();
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
                                                x30Var.f41963f = s02.getAbsolutePath();
                                            }
                                            x30Var.f41959a.startActivityForResult(intent, 15);
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
                            x30Var.q();
                            return;
                        }
                        x30Var.m();
                        return;
                    }
                    x30Var.l();
                }
            };
            j3.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            j3.N = iArr;
            j3.L = onClickListener;
            j3.I0 = onDismissListener;
            this.f41959a.showDialog(j3);
            if (z10) {
                int i12 = org.telegram.ui.ActionBar.m6.f29622q7;
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, i12, false);
                int i13 = org.telegram.ui.ActionBar.m6.f29602p7;
                j3.C0(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.m6.x0(null, i13, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < j3.f30216x0.size() && (p2Var = (org.telegram.ui.ActionBar.p2) j3.f30216x0.get(size2)) != null && p2Var.getTextView() != null && p2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.t6.U(p2Var.getTextView(), i12, null);
                    org.telegram.ui.ActionBar.t6.s(p2Var.getImageView(), i13, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        ffVar.n(pair);
        ffVar.f28059b = z10;
        ffVar.f28060c = str2;
        arrayList.add(ffVar);
        PhotoViewer.p1().I2(null, this.f41959a, null);
        PhotoViewer.p1().f2(arrayList, 0, 1, false, new u30(this, arrayList), null);
        PhotoViewer.p1().Q = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f41959a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.cn0 cn0Var = new org.telegram.ui.cn0(0, null, hashMap, arrayList, 1, false, null, this.S);
        ?? obj = new Object();
        obj.d = this;
        obj.f988b = hashMap;
        obj.f989c = arrayList;
        cn0Var.f46622t0 = obj;
        cn0Var.k0(1, false);
        cn0Var.f46617q0 = this.f41960b.getInitialSearchString();
        if (this.T) {
            this.f41959a.showAsSheet(cn0Var);
        } else {
            this.f41959a.presentFragment(cn0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.gj gjVar) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.O = null;
            this.N = null;
            this.E = null;
            this.f41969y = null;
            if (gjVar == null) {
                videoSize = null;
            } else {
                videoSize = gjVar.f24244s;
            }
            this.P = videoSize;
            this.h = org.telegram.messenger.fc.Y(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize Y = org.telegram.messenger.fc.Y(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.f41964n = Y;
            int i7 = this.d;
            if (Y != null) {
                try {
                    org.telegram.messenger.w7.G(i7);
                    Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f41964n, null, true, true).getAbsolutePath());
                    this.f41965r = decodeFile;
                    org.telegram.messenger.fc.D().O(new BitmapDrawable(decodeFile), this.f41964n.location.volume_id + "_" + this.f41964n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                org.telegram.messenger.k10.i(i7).v(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.w7.z(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.f41967w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
                if (this.L) {
                    if (gjVar != null && gjVar.f24241r0 != null) {
                        if (this.J && !org.telegram.messenger.np.u1(i7).f26006x7) {
                            w30 w30Var = this.f41960b;
                            if (w30Var != null) {
                                w30Var.Q(z10, true);
                            }
                            w30 w30Var2 = this.f41960b;
                            if (w30Var2 != null) {
                                w30Var2.V(null, null, 0.0d, null, this.h, this.f41964n, this.f41966s, null);
                                this.f41960b.V(null, null, this.Q, this.f41969y, this.h, this.f41964n, this.f41966s, this.P);
                                c();
                                return;
                            }
                            return;
                        }
                        this.E = gjVar;
                        org.telegram.messenger.f20 f20Var = gjVar.f24241r0;
                        long j3 = f20Var.f23826a;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        this.Q = (f20Var.f23830c - j3) / 1000000.0d;
                        f20Var.Z = false;
                        org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.f25276a2);
                        org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.f25289c2);
                        org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.f25283b2);
                        MediaController.B().h0(gjVar, true, true, false);
                        this.f41967w = null;
                        w30 w30Var3 = this.f41960b;
                        if (w30Var3 != null) {
                            w30Var3.Q(z10, true);
                        }
                        this.f41966s = true;
                    } else {
                        w30 w30Var4 = this.f41960b;
                        if (w30Var4 != null) {
                            w30Var4.Q(z10, false);
                        }
                        this.f41966s = false;
                    }
                    org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.U1);
                    org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.W1);
                    org.telegram.messenger.ls.f(i7).b(this, org.telegram.messenger.ls.V1);
                    if (this.f41967w != null) {
                        org.telegram.messenger.w7.G(i7).h0(false, 16777216, this.f41967w, true);
                    }
                }
                w30 w30Var5 = this.f41960b;
                if (w30Var5 != null) {
                    w30Var5.V(null, null, 0.0d, null, this.h, this.f41964n, this.f41966s, null);
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
        org.telegram.messenger.gj gjVar = null;
        if ((ffVar.f28059b || ffVar.f28074s != null) && !ffVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28455id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(org.telegram.messenger.k10.f24968t0, tL_message, false, false);
            TLRPC.Message message = gjVar2.f24213k;
            File z10 = org.telegram.messenger.w7.z(4);
            message.attachPath = new File(z10, org.telegram.messenger.cz.p() + "_avatar.mp4").getAbsolutePath();
            gjVar2.f24241r0 = ffVar.f28074s;
            gjVar2.f24244s = ffVar.S;
            K = org.telegram.messenger.fc.K(ffVar.f28060c, null, 800.0f, 800.0f, true);
            gjVar = gjVar2;
        } else {
            K = org.telegram.messenger.fc.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, gjVar);
    }
}
