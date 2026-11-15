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
public final class m30 implements org.telegram.messenger.is, org.telegram.ui.qm0 {
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
    public org.telegram.ui.ActionBar.e2 f37040a;
    public l30 f37041b;
    public ki f37042c;
    public String f37044f;
    public TLRPC.PhotoSize h;
    public TLRPC.PhotoSize f37045n;
    public Bitmap f37046r;
    public boolean f37047s;
    public String f37048w;
    public String f37049x;
    public String f37050y;
    public final int d = org.telegram.messenger.m10.f24940t0;
    public boolean H = true;
    public boolean K = true;
    public boolean L = true;
    public final ImageReceiver f37043e = new ImageReceiver(null);

    public m30(int i7, boolean z10, boolean z11) {
        this.R = z10;
        this.J = z11;
        this.W = i7;
    }

    public static void a(m30 m30Var, boolean z10, ArrayList arrayList) {
        org.telegram.messenger.gj gjVar;
        Bitmap K;
        ImageReceiver imageReceiver = m30Var.f37043e;
        int i7 = m30Var.d;
        if (!arrayList.isEmpty()) {
            org.telegram.messenger.dz dzVar = (org.telegram.messenger.dz) arrayList.get(0);
            Bitmap bitmap = null;
            if ((dzVar.f23206o || dzVar.f23202k != null) && !dzVar.f23207p) {
                TLRPC.TL_message tL_message = new TLRPC.TL_message();
                tL_message.f28072id = 0;
                tL_message.message = "";
                tL_message.media = new TLRPC.TL_messageMediaEmpty();
                tL_message.action = new TLRPC.TL_messageActionEmpty();
                tL_message.dialog_id = 0L;
                gjVar = new org.telegram.messenger.gj(org.telegram.messenger.m10.f24940t0, tL_message, false, false);
                gjVar.f23819k.attachPath = new File(org.telegram.messenger.w7.z(4), org.telegram.messenger.gz.p() + "_avatar.mp4").getAbsolutePath();
                gjVar.f23847r0 = dzVar.f23202k;
                gjVar.f23850s = dzVar.v;
                bitmap = org.telegram.messenger.fc.K(dzVar.f23197e, null, 800.0f, 800.0f, true);
            } else {
                String str = dzVar.f23196c;
                if (str != null) {
                    K = org.telegram.messenger.fc.K(str, null, 800.0f, 800.0f, true);
                } else {
                    org.telegram.messenger.jf jfVar = dzVar.f23203l;
                    if (jfVar != null) {
                        TLRPC.Photo photo = jfVar.K;
                        if (photo != null) {
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(photo.sizes, org.telegram.messenger.g0.Z0(false), false, null, false);
                            if (w10 != null) {
                                org.telegram.messenger.w7.G(i7);
                                File J = org.telegram.messenger.w7.J(w10, null, true, true);
                                m30Var.F = J.getAbsolutePath();
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
                                    org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.Y1);
                                    org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.Z1);
                                    m30Var.f37048w = org.telegram.messenger.w7.r(null, w10.location);
                                    imageReceiver.q0(org.telegram.messenger.gc.i(w10, dzVar.f23203l.K), null, null, "jpg", null, 1);
                                }
                            }
                            K = null;
                        } else if (jfVar.C != null) {
                            File file = new File(org.telegram.messenger.w7.z(4), Utilities.a(dzVar.f23203l.C) + "." + org.telegram.messenger.fc.B(dzVar.f23203l.C, "jpg"));
                            m30Var.F = file.getAbsolutePath();
                            if (file.exists() && file.length() != 0) {
                                K = org.telegram.messenger.fc.K(file.getAbsolutePath(), null, 800.0f, 800.0f, true);
                            } else {
                                m30Var.f37048w = dzVar.f23203l.C;
                                org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.R1);
                                org.telegram.messenger.ns.f(i7).b(m30Var, org.telegram.messenger.ns.S1);
                                imageReceiver.o0(dzVar.f23203l.C, null, null, "jpg", 1L);
                            }
                        }
                    }
                    gjVar = null;
                }
                gjVar = null;
                bitmap = K;
            }
            m30Var.r(z10, bitmap, gjVar);
        }
    }

    public final void b() {
        this.U = true;
        String str = this.f37048w;
        int i7 = this.d;
        if (str != null) {
            org.telegram.messenger.w7.G(i7).b(this.f37048w, false);
        }
        if (this.f37049x != null) {
            org.telegram.messenger.w7.G(i7).b(this.f37049x, false);
        }
        l30 l30Var = this.f37041b;
        if (l30Var != null) {
            l30Var.U();
        }
    }

    public final void c() {
        this.f37048w = null;
        this.f37049x = null;
        this.f37050y = null;
        this.E = null;
        if (this.G) {
            this.f37043e.w0(null);
            this.f37040a = null;
            this.f37041b = null;
        }
    }

    public final void d() {
        this.U = false;
        if (this.f37048w == null && this.f37049x == null && this.E == null) {
            this.f37040a = null;
            this.f37041b = null;
        } else {
            this.G = true;
        }
        ki kiVar = this.f37042c;
        if (kiVar != null) {
            kiVar.L();
            this.f37042c.j1();
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        l30 l30Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        String str;
        int i11 = org.telegram.messenger.ns.W1;
        int i12 = org.telegram.messenger.ns.V1;
        int i13 = this.d;
        int i14 = org.telegram.messenger.ns.U1;
        if (i7 != i14 && i7 != i12) {
            if (i7 == i11) {
                String str2 = (String) objArr[0];
                if (this.E != null) {
                    str = this.f37049x;
                } else {
                    str = this.f37048w;
                }
                if (this.f37041b != null && str2.equals(str)) {
                    float min = Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue()));
                    l30 l30Var2 = this.f37041b;
                    this.X = min;
                    l30Var2.I(min);
                    return;
                }
                return;
            }
            int i15 = org.telegram.messenger.ns.S1;
            int i16 = org.telegram.messenger.ns.R1;
            int i17 = org.telegram.messenger.ns.Z1;
            int i18 = org.telegram.messenger.ns.Y1;
            if (i7 != i18 && i7 != i17 && i7 != i16 && i7 != i15) {
                int i19 = org.telegram.messenger.ns.f25478c2;
                int i20 = org.telegram.messenger.ns.f25472b2;
                int i21 = org.telegram.messenger.ns.f25466a2;
                if (i7 == i19) {
                    if (((org.telegram.messenger.gj) objArr[0]) == this.E && this.f37040a != null) {
                        org.telegram.messenger.ns.f(i13).n(this, i21);
                        org.telegram.messenger.ns.f(i13).n(this, i19);
                        org.telegram.messenger.ns.f(i13).n(this, i20);
                        c();
                        return;
                    }
                    return;
                } else if (i7 == i20) {
                    if (((org.telegram.messenger.gj) objArr[0]) == this.E && this.f37040a != null) {
                        String str3 = (String) objArr[1];
                        long longValue = ((Long) objArr[2]).longValue();
                        long longValue2 = ((Long) objArr[3]).longValue();
                        this.f37040a.getFileLoader().n(str3, false, longValue, longValue2, null);
                        if (longValue2 != 0) {
                            double longValue3 = ((Long) objArr[5]).longValue() / 1000000.0d;
                            if (this.Q > longValue3) {
                                this.Q = longValue3;
                            }
                            Bitmap s5 = org.telegram.messenger.ez.s(str3, (long) (this.Q * 1000.0d), null, true);
                            if (s5 != null) {
                                org.telegram.messenger.w7.G(i13);
                                File J = org.telegram.messenger.w7.J(this.f37045n, null, true, true);
                                if (J != null) {
                                    if (org.telegram.messenger.r2.f26206a) {
                                        org.telegram.messenger.a8.d("delete file " + J);
                                    }
                                    J.delete();
                                }
                                org.telegram.messenger.w7.G(i13);
                                File J2 = org.telegram.messenger.w7.J(this.h, null, true, true);
                                if (J2 != null) {
                                    if (org.telegram.messenger.r2.f26206a) {
                                        org.telegram.messenger.a8.d("delete file " + J2);
                                    }
                                    J2.delete();
                                }
                                this.h = org.telegram.messenger.fc.Y(s5, 800.0f, 800.0f, 80, 320, 320);
                                TLRPC.PhotoSize Y = org.telegram.messenger.fc.Y(s5, 150.0f, 150.0f, 80, 150, 150);
                                this.f37045n = Y;
                                if (Y != null) {
                                    try {
                                        org.telegram.messenger.w7.G(i13);
                                        Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f37045n, null, true, true).getAbsolutePath());
                                        org.telegram.messenger.fc.D().O(new BitmapDrawable(decodeFile), this.f37045n.location.volume_id + "_" + this.f37045n.location.local_id + "@50_50", true);
                                    } catch (Throwable unused) {
                                    }
                                }
                            }
                            org.telegram.messenger.ns.f(i13).n(this, i21);
                            org.telegram.messenger.ns.f(i13).n(this, i19);
                            org.telegram.messenger.ns.f(i13).n(this, i20);
                            this.f37050y = str3;
                            this.f37049x = str3;
                            this.E = null;
                            return;
                        }
                        return;
                    }
                    return;
                } else if (i7 == i21 && ((org.telegram.messenger.gj) objArr[0]) == this.E && (e2Var = this.f37040a) != null) {
                    this.f37049x = (String) objArr[1];
                    e2Var.getFileLoader().g0(this.f37049x, false, false, (int) this.E.f23847r0.f23650q, 33554432, false);
                    return;
                } else {
                    return;
                }
            }
            this.X = 1.0f;
            if (((String) objArr[0]).equals(this.f37048w)) {
                org.telegram.messenger.ns.f(i13).n(this, i18);
                org.telegram.messenger.ns.f(i13).n(this, i17);
                org.telegram.messenger.ns.f(i13).n(this, i16);
                org.telegram.messenger.ns.f(i13).n(this, i15);
                this.f37048w = null;
                if (i7 != i18 && i7 != i16) {
                    this.f37043e.w0(null);
                    l30 l30Var3 = this.f37041b;
                    if (l30Var3 != null) {
                        l30Var3.U();
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
        if (str4.equals(this.f37048w)) {
            this.f37048w = null;
            if (i7 == i14) {
                this.N = (TLRPC.InputFile) objArr[1];
            }
        } else if (str4.equals(this.f37049x)) {
            this.f37049x = null;
            if (i7 == i14) {
                this.O = (TLRPC.InputFile) objArr[1];
            }
        } else {
            return;
        }
        if (this.f37048w == null && this.f37049x == null && this.E == null) {
            org.telegram.messenger.ns.f(i13).n(this, i14);
            org.telegram.messenger.ns.f(i13).n(this, i11);
            org.telegram.messenger.ns.f(i13).n(this, i12);
            if (i7 == i14 && (l30Var = this.f37041b) != null) {
                l30Var.V(this.N, this.O, this.Q, this.f37050y, this.h, this.f37045n, this.f37047s, this.P);
            }
            c();
        }
    }

    public final void e() {
        int i7;
        xs xsVar;
        boolean z10;
        org.telegram.ui.ActionBar.e2 e2Var = this.f37040a;
        if (e2Var != null && e2Var.getParentActivity() != null) {
            if (this.f37042c == null) {
                ki kiVar = new ki(this.f37040a.getParentActivity(), this.f37040a, this.S, this.T);
                this.f37042c = kiVar;
                if (this.R) {
                    i7 = 2;
                } else {
                    i7 = 1;
                }
                l30 l30Var = this.f37041b;
                if (l30Var != null && l30Var.x()) {
                    l30 l30Var2 = this.f37041b;
                    Objects.requireNonNull(l30Var2);
                    xsVar = new xs(l30Var2, 1);
                } else {
                    xsVar = null;
                }
                kiVar.O2 = i7;
                kiVar.P2 = xsVar;
                kiVar.Q2 = false;
                ci ciVar = kiVar.f36497w2;
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = kiVar.f36435e2;
                if (ciVar == null || ciVar == chatAttachAlertPhotoLayout) {
                    kiVar.f36494v3.setVisibility(8);
                }
                int i10 = kiVar.O2;
                TextView textView = kiVar.f36445h3;
                if (i10 == 2) {
                    textView.setText(org.telegram.messenger.hd.M0(2131752121, null));
                } else {
                    textView.setText(org.telegram.messenger.hd.M0(2131752123, null));
                }
                if (chatAttachAlertPhotoLayout != null) {
                    ki kiVar2 = chatAttachAlertPhotoLayout.f33609b;
                    if (kiVar2.O2 != 0 && !kiVar2.A1) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    chatAttachAlertPhotoLayout.f32385h1 = z10;
                }
                ki kiVar3 = this.f37042c;
                kiVar3.X3 = new i30(this);
                kiVar3.P1 = this;
            }
            int i11 = this.V;
            if (i11 == 1) {
                this.f37042c.f36445h3.setText(org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745518, this.M.first_name));
            } else if (i11 == 2) {
                this.f37042c.f36445h3.setText(org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744406, this.M.first_name));
            }
        }
    }

    public final boolean f(Dialog dialog) {
        ki kiVar = this.f37042c;
        if (kiVar == null || dialog != kiVar) {
            return false;
        }
        kiVar.f36435e2.d0(false);
        this.f37042c.L();
        this.f37042c.f36435e2.g0(true);
        return true;
    }

    public final boolean g() {
        if (this.f37048w == null && this.f37049x == null && this.E == null) {
            return false;
        }
        return true;
    }

    public final void h(int i7, int i10, Intent intent) {
        if (i10 == -1) {
            if (i7 != 0 && i7 != 2) {
                if (i7 == 13) {
                    this.f37040a.getParentActivity().overridePendingTransition(2130771980, 2130771981);
                    PhotoViewer.p1().I2(null, this.f37040a, null);
                    o(this.f37044f, null, org.telegram.messenger.g0.N0(this.f37044f), false);
                    org.telegram.messenger.g0.e(this.f37044f);
                    this.f37044f = null;
                    return;
                } else if (i7 == 14) {
                    if (intent != null && intent.getData() != null) {
                        org.telegram.messenger.g0.h3(new vs(14, this, intent.getData()));
                        return;
                    }
                    return;
                } else if (i7 == 15) {
                    p(this.f37044f, null, true);
                    org.telegram.messenger.g0.e(this.f37044f);
                    this.f37044f = null;
                    return;
                } else {
                    return;
                }
            }
            e();
            ki kiVar = this.f37042c;
            if (kiVar != null) {
                kiVar.f36435e2.j0(i7, intent, this.f37044f);
            }
            this.f37044f = null;
        }
    }

    public final void i() {
        ki kiVar = this.f37042c;
        if (kiVar != null) {
            kiVar.l1();
        }
    }

    public final void j(int i7, String[] strArr, int[] iArr) {
        ki kiVar = this.f37042c;
        if (kiVar != null) {
            if (i7 == 17) {
                kiVar.f36435e2.X(false);
                this.f37042c.f36435e2.b0();
            } else if (i7 == 4) {
                kiVar.f36435e2.b0();
            }
        }
    }

    public final void k() {
        ki kiVar = this.f37042c;
        if (kiVar != null) {
            kiVar.m1();
        }
    }

    public final void l() {
        org.telegram.ui.ActionBar.e2 e2Var = this.f37040a;
        if (e2Var != null && e2Var.getParentActivity() != null) {
            try {
                int i7 = Build.VERSION.SDK_INT;
                if (this.f37040a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    this.f37040a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i7 >= 24) {
                        Activity parentActivity = this.f37040a.getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f37044f = q02.getAbsolutePath();
                }
                this.f37040a.startActivityForResult(intent, 13);
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public final void m() {
        int i7;
        org.telegram.ui.ActionBar.e2 e2Var = this.f37040a;
        if (e2Var == null) {
            return;
        }
        Activity parentActivity = e2Var.getParentActivity();
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
        om0Var.f50004y = this.K;
        om0Var.W = new cf(this);
        this.f37040a.presentFragment(om0Var);
    }

    public final void n(boolean z10, final Runnable runnable, DialogInterface.OnDismissListener onDismissListener, int i7) {
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.e2 e2Var = this.f37040a;
        if (e2Var != null && e2Var.getParentActivity() != null) {
            this.U = false;
            this.V = i7;
            if (this.H) {
                org.telegram.ui.ActionBar.e2 e2Var2 = this.f37040a;
                if (e2Var2 != null && e2Var2.getParentActivity() != null) {
                    e();
                    ki kiVar = this.f37042c;
                    kiVar.S3 = this.I;
                    kiVar.y1(1, false);
                    this.f37042c.f36435e2.i0();
                    this.f37042c.e1();
                    ki kiVar2 = this.f37042c;
                    kiVar2.I0 = onDismissListener;
                    int i10 = this.V;
                    if (i10 != 0) {
                        kiVar2.L1 = new k30(i10, this.M);
                    }
                    this.f37040a.showDialog(kiVar2);
                    return;
                }
                return;
            }
            org.telegram.ui.ActionBar.u2 i11 = org.telegram.messenger.i20.i(this.f37040a.getParentActivity(), false, 1, null);
            if (i7 == 1) {
                i11.P = org.telegram.messenger.hd.a0("SetPhotoFor", null, 2131745518, this.M.first_name);
                i11.Q = true;
            } else if (i7 == 2) {
                i11.P = org.telegram.messenger.hd.a0("SuggestPhotoFor", null, 2131744406, this.M.first_name);
                i11.Q = true;
            } else {
                i11.P = org.telegram.messenger.hd.M0(2131752123, null);
                i11.Q = true;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            final ArrayList arrayList3 = new ArrayList();
            org.telegram.ui.Cells.y0.s(null, 2131752113, arrayList, 2131232087, arrayList2);
            arrayList3.add(0);
            if (this.R) {
                org.telegram.ui.Cells.y0.s(null, 2131752120, arrayList, 2131232419, arrayList2);
                arrayList3.add(4);
            }
            org.telegram.ui.Cells.y0.s(null, 2131752128, arrayList, 2131232293, arrayList2);
            arrayList3.add(1);
            if (this.K) {
                org.telegram.ui.Cells.y0.s(null, 2131752126, arrayList, 2131232355, arrayList2);
                arrayList3.add(2);
            }
            if (z10) {
                org.telegram.ui.Cells.y0.s(null, 2131751514, arrayList, 2131232109, arrayList2);
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
                    org.telegram.ui.ActionBar.e2 e2Var3;
                    int intValue = ((Integer) arrayList3.get(i13)).intValue();
                    m30 m30Var = m30.this;
                    if (intValue != 0) {
                        if (intValue != 1) {
                            if (intValue != 2) {
                                if (intValue != 3) {
                                    if (intValue == 4 && (e2Var3 = m30Var.f37040a) != null && e2Var3.getParentActivity() != null) {
                                        try {
                                            int i14 = Build.VERSION.SDK_INT;
                                            if (m30Var.f37040a.getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                                                m30Var.f37040a.getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                                                return;
                                            }
                                            Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
                                            File s02 = org.telegram.messenger.g0.s0(false);
                                            if (s02 != null) {
                                                if (i14 >= 24) {
                                                    Activity parentActivity = m30Var.f37040a.getParentActivity();
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
                                                m30Var.f37044f = s02.getAbsolutePath();
                                            }
                                            m30Var.f37040a.startActivityForResult(intent, 15);
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
                            m30Var.q();
                            return;
                        }
                        m30Var.m();
                        return;
                    }
                    m30Var.l();
                }
            };
            i11.M = (CharSequence[]) arrayList.toArray(new CharSequence[0]);
            i11.N = iArr;
            i11.L = onClickListener;
            i11.I0 = onDismissListener;
            this.f37040a.showDialog(i11);
            if (z10) {
                int i13 = org.telegram.ui.ActionBar.j6.f29090q7;
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, i13, false);
                int i14 = org.telegram.ui.ActionBar.j6.f29070p7;
                i11.C0(arrayList.size() - 1, x02, org.telegram.ui.ActionBar.j6.x0(null, i14, false));
                int size2 = arrayList.size() - 1;
                if (size2 >= 0 && size2 < i11.f29722x0.size() && (n2Var = (org.telegram.ui.ActionBar.n2) i11.f29722x0.get(size2)) != null && n2Var.getTextView() != null && n2Var.getImageView() != null) {
                    org.telegram.ui.ActionBar.q6.U(n2Var.getTextView(), i13, null);
                    org.telegram.ui.ActionBar.q6.s(n2Var.getImageView(), i14, null, PorterDuff.Mode.MULTIPLY);
                }
            }
        }
    }

    public final void o(String str, String str2, Pair pair, boolean z10) {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.ff ffVar = new org.telegram.messenger.ff(0, str, ((Integer) pair.first).intValue(), false, 0, 0);
        ffVar.n(pair);
        ffVar.f27710b = z10;
        ffVar.f27711c = str2;
        arrayList.add(ffVar);
        PhotoViewer.p1().I2(null, this.f37040a, null);
        PhotoViewer.p1().f2(arrayList, 0, 1, false, new j30(this, arrayList), null);
        PhotoViewer.p1().Q = true;
    }

    public final void p(String str, String str2, boolean z10) {
        o(str, str2, new Pair(0, 0), z10);
    }

    public final void q() {
        if (this.f37040a == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        org.telegram.ui.zm0 zm0Var = new org.telegram.ui.zm0(0, null, hashMap, arrayList, 1, false, null, this.S);
        ?? obj = new Object();
        obj.d = this;
        obj.f989b = hashMap;
        obj.f990c = arrayList;
        zm0Var.f53981t0 = obj;
        zm0Var.k0(1, false);
        zm0Var.f53976q0 = this.f37041b.getInitialSearchString();
        if (this.T) {
            this.f37040a.showAsSheet(zm0Var);
        } else {
            this.f37040a.presentFragment(zm0Var);
        }
    }

    public final void r(boolean z10, Bitmap bitmap, org.telegram.messenger.gj gjVar) {
        TLRPC.VideoSize videoSize;
        if (bitmap != null) {
            this.O = null;
            this.N = null;
            this.E = null;
            this.f37050y = null;
            if (gjVar == null) {
                videoSize = null;
            } else {
                videoSize = gjVar.f23850s;
            }
            this.P = videoSize;
            this.h = org.telegram.messenger.fc.Y(bitmap, 800.0f, 800.0f, 80, 320, 320);
            TLRPC.PhotoSize Y = org.telegram.messenger.fc.Y(bitmap, 150.0f, 150.0f, 80, 150, 150);
            this.f37045n = Y;
            int i7 = this.d;
            if (Y != null) {
                try {
                    org.telegram.messenger.w7.G(i7);
                    Bitmap decodeFile = BitmapFactory.decodeFile(org.telegram.messenger.w7.J(this.f37045n, null, true, true).getAbsolutePath());
                    this.f37046r = decodeFile;
                    org.telegram.messenger.fc.D().O(new BitmapDrawable(decodeFile), this.f37045n.location.volume_id + "_" + this.f37045n.location.local_id + "@50_50", true);
                } catch (Throwable unused) {
                }
            }
            bitmap.recycle();
            if (this.h != null) {
                org.telegram.messenger.m10.i(i7).v(false);
                StringBuilder sb2 = new StringBuilder();
                sb2.append(org.telegram.messenger.w7.z(4));
                sb2.append("/");
                sb2.append(this.h.location.volume_id);
                sb2.append("_");
                this.f37048w = a8.p0.n(this.h.location.local_id, ".jpg", sb2);
                if (this.L) {
                    if (gjVar != null && gjVar.f23847r0 != null) {
                        if (this.J && !org.telegram.messenger.np.s1(i7).f25421v7) {
                            l30 l30Var = this.f37041b;
                            if (l30Var != null) {
                                l30Var.O(z10, true);
                            }
                            l30 l30Var2 = this.f37041b;
                            if (l30Var2 != null) {
                                l30Var2.V(null, null, 0.0d, null, this.h, this.f37045n, this.f37047s, null);
                                this.f37041b.V(null, null, this.Q, this.f37050y, this.h, this.f37045n, this.f37047s, this.P);
                                c();
                                return;
                            }
                            return;
                        }
                        this.E = gjVar;
                        org.telegram.messenger.g20 g20Var = gjVar.f23847r0;
                        long j3 = g20Var.f23634a;
                        if (j3 < 0) {
                            j3 = 0;
                        }
                        this.Q = (g20Var.f23638c - j3) / 1000000.0d;
                        g20Var.Z = false;
                        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.f25466a2);
                        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.f25478c2);
                        org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.f25472b2);
                        MediaController.B().h0(gjVar, true, true, false);
                        this.f37048w = null;
                        l30 l30Var3 = this.f37041b;
                        if (l30Var3 != null) {
                            l30Var3.O(z10, true);
                        }
                        this.f37047s = true;
                    } else {
                        l30 l30Var4 = this.f37041b;
                        if (l30Var4 != null) {
                            l30Var4.O(z10, false);
                        }
                        this.f37047s = false;
                    }
                    org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.U1);
                    org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.W1);
                    org.telegram.messenger.ns.f(i7).b(this, org.telegram.messenger.ns.V1);
                    if (this.f37048w != null) {
                        org.telegram.messenger.w7.G(i7).h0(false, 16777216, this.f37048w, true);
                    }
                }
                l30 l30Var5 = this.f37041b;
                if (l30Var5 != null) {
                    l30Var5.V(null, null, 0.0d, null, this.h, this.f37045n, this.f37047s, null);
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
        if ((ffVar.f27710b || ffVar.f27725s != null) && !ffVar.d()) {
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.f28072id = 0;
            tL_message.message = "";
            tL_message.media = new TLRPC.TL_messageMediaEmpty();
            tL_message.action = new TLRPC.TL_messageActionEmpty();
            tL_message.dialog_id = 0L;
            org.telegram.messenger.gj gjVar2 = new org.telegram.messenger.gj(org.telegram.messenger.m10.f24940t0, tL_message, false, false);
            TLRPC.Message message = gjVar2.f23819k;
            File z10 = org.telegram.messenger.w7.z(4);
            message.attachPath = new File(z10, org.telegram.messenger.gz.p() + "_avatar.mp4").getAbsolutePath();
            gjVar2.f23847r0 = ffVar.f27725s;
            gjVar2.f23850s = ffVar.S;
            K = org.telegram.messenger.fc.K(ffVar.f27711c, null, 800.0f, 800.0f, true);
            gjVar = gjVar2;
        } else {
            K = org.telegram.messenger.fc.K(str, null, 800.0f, 800.0f, true);
        }
        r(false, K, gjVar);
    }
}
