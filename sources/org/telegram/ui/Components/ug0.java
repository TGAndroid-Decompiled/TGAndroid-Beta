package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public class ug0 extends np implements org.telegram.messenger.us {
    public boolean A0;
    public boolean B0;
    public final tk0 C0;
    public final tg0 D0;
    public long E0;
    public TLRPC.ChatFull F0;
    public final qg0 G0;
    public boolean H0;
    public boolean I0;
    public final boolean J0;
    public org.telegram.messenger.ic K0;
    public final int L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public org.telegram.messenger.ic P0;
    public org.telegram.messenger.ic Q0;
    public g61 R0;
    public org.telegram.messenger.dp S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList f30926a1;
    public final ArrayList f30927b1;
    public int f30928c1;
    public final SparseArray f30929d1;
    public boolean f30930e1;
    public boolean f30931f1;
    public boolean f30932g1;
    public org.telegram.ui.qs0 f30933h1;
    public boolean f30934i1;
    public int f30935j1;
    public int f30936k1;
    public int l1;
    public int f30937m1;
    public int f30938n1;
    public int f30939o1;
    public mg0 f30940p1;
    public org.telegram.messenger.ic f30941q1;
    public org.telegram.messenger.ic f30942r1;
    public final PointF f30943x0;
    public final int f30944y0;
    public final org.telegram.ui.ActionBar.l f30945z0;

    public ug0(Context context, org.telegram.ui.ActionBar.l lVar, tk0 tk0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.f30943x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.L0 = i10;
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f30926a1 = new ArrayList();
        this.f30927b1 = new ArrayList();
        this.f30929d1 = new SparseArray();
        this.f30930e1 = true;
        this.f30935j1 = -1;
        this.f30936k1 = -1;
        setOffscreenPageLimit(2);
        this.f30940p1 = null;
        this.J0 = false;
        this.C0 = tk0Var;
        ConnectionsManager.generateClassGuid();
        this.f30945z0 = lVar;
        this.f30944y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = q4Var;
        b(new ng0(this));
        tg0 tg0Var = new tg0(this, getContext(), null);
        this.D0 = tg0Var;
        setAdapter((mp) tg0Var);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19584b0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.X1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19590c0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19605e3);
        this.S0 = null;
    }

    public final void A(org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2) {
        this.P0 = icVar;
        this.U0.add(0, null);
        this.T0.add(0, null);
        this.X0.add(0, icVar);
        this.Y0.add(0, icVar2);
        this.Z0.add(0, null);
        this.W0.add(0, null);
        this.V0.add(0, null);
        this.f30926a1.add(0, -1);
        this.f30927b1.add(0, Float.valueOf(0.0f));
        this.D0.g();
        L();
        this.f30941q1 = icVar;
        this.f30942r1 = icVar2;
    }

    public final void B(float f7, int i10) {
        float f10;
        int i11 = this.f30935j1;
        float f11 = 0.0f;
        if (i11 >= 0 || this.f30936k1 >= 0) {
            if (i11 < 0) {
                i11 = this.f30936k1;
            }
            int k10 = this.D0.k(i10);
            if (this.f30934i1) {
                k10--;
            }
            if (k10 == i11) {
                f10 = 1.0f - f7;
            } else if (getRealCount() > 0 && (k10 - 1) % getRealCount() == i11) {
                f10 = (1.0f - f7) - 1.0f;
            } else if (getRealCount() > 0 && (k10 + 1) % getRealCount() == i11) {
                f10 = (1.0f - f7) + 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (f10 > 1.0f) {
                f10 = 2.0f - f10;
            }
            f11 = Utilities.i(f10, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f11);
    }

    public final org.telegram.messenger.ic C(org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2) {
        ArrayList arrayList;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (icVar == null) {
            return null;
        }
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                arrayList = this.Y0;
            } else {
                arrayList = this.X0;
            }
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.ic icVar3 = (org.telegram.messenger.ic) arrayList.get(i11);
                if (icVar3 != null && (tL_fileLocationToBeDeprecated = icVar3.f16100f) != null) {
                    int i12 = icVar3.f16097a;
                    if (i12 == icVar.f16097a) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = icVar.f16100f;
                        if (i13 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (org.telegram.messenger.ic) this.W0.get(i11);
                        }
                    }
                    if (i12 == icVar2.f16097a) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = icVar2.f16100f;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (org.telegram.messenger.ic) this.W0.get(i11);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final org.telegram.messenger.ic D(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X0;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.ic icVar = (org.telegram.messenger.ic) this.W0.get(i10);
                if (icVar != null) {
                    return icVar;
                }
                return (org.telegram.messenger.ic) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final View E(int i10) {
        tg0 tg0Var = this.D0;
        if (tg0Var != null) {
            ArrayList arrayList = tg0Var.f30573c;
            if (arrayList.size() > i10 && i10 >= 0) {
                rg0 rg0Var = (rg0) arrayList.get(i10);
                sg0 sg0Var = rg0Var.f29910b;
                if (sg0Var == null) {
                    return rg0Var.f29911c;
                }
                return sg0Var;
            }
            return null;
        }
        return null;
    }

    public final TLRPC.Photo F(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.V0;
            if (i10 < arrayList.size()) {
                return (TLRPC.Photo) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final org.telegram.messenger.ic G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X0;
            if (i10 < arrayList.size()) {
                return (org.telegram.messenger.ic) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final boolean H(g61 g61Var, org.telegram.messenger.ic icVar, org.telegram.messenger.ic icVar2, boolean z10) {
        org.telegram.messenger.dp dpVar;
        int i10;
        org.telegram.messenger.dp dpVar2;
        int i11 = 0;
        if (icVar != null && icVar2 != null && this.f30928c1 == 0) {
            org.telegram.messenger.ic icVar3 = this.P0;
            ArrayList arrayList = this.X0;
            if (icVar3 == null || icVar3.f16100f.local_id != icVar.f16100f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                tg0 tg0Var = this.D0;
                if (!isEmpty) {
                    this.P0 = icVar;
                    if (z10 && (dpVar2 = this.S0) != null) {
                        dpVar2.e();
                        org.telegram.messenger.dp dpVar3 = this.S0;
                        int currentItem = getCurrentItem();
                        if (tg0Var != null) {
                            i11 = tg0Var.j();
                        }
                        dpVar3.b(currentItem - i11, true);
                    }
                    return true;
                } else if (z10 && (dpVar = this.S0) != null) {
                    dpVar.e();
                    org.telegram.messenger.dp dpVar4 = this.S0;
                    int currentItem2 = getCurrentItem();
                    if (tg0Var != null) {
                        i10 = tg0Var.j();
                    } else {
                        i10 = 0;
                    }
                    dpVar4.b(currentItem2 - i10, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.P0 = icVar;
                this.Q0 = icVar2;
                this.R0 = g61Var;
                this.U0.add(null);
                this.T0.add(null);
                arrayList.add(icVar);
                this.Y0.add(icVar2);
                this.Z0.add(g61Var);
                this.W0.add(null);
                this.V0.add(null);
                this.f30926a1.add(-1);
                this.f30927b1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f30934i1) {
            if (realPosition != 0) {
                realPosition--;
            } else {
                return false;
            }
        }
        if (realPosition >= 0) {
            ArrayList arrayList = this.W0;
            if (realPosition < arrayList.size() && arrayList.get(realPosition) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        int realPosition;
        g9 currentItemView;
        if (this.f30934i1) {
            realPosition = getRealPosition() - 1;
        } else {
            realPosition = getRealPosition();
        }
        if (this.W0.get(realPosition) != null && (currentItemView = getCurrentItemView()) != null) {
            s5 m10 = currentItemView.getImageReceiver().m();
            if (m10 == null || !m10.s()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        this.f30940p1 = null;
        int i10 = this.L0;
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19584b0);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(i10);
        int i11 = org.telegram.messenger.zs.X1;
        f7.n(this, i11);
        org.telegram.messenger.zs.f(i10).n(this, i11);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19590c0);
        org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.f19605e3);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt instanceof g9) {
                g9 g9Var = (g9) childAt;
                if (g9Var.getImageReceiver().m0 != null) {
                    Drawable t10 = g9Var.getImageReceiver().t();
                    if (t10 instanceof s5) {
                        ((s5) t10).w(g9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.D0.j(), false);
    }

    public final void M(long j10, boolean z10) {
        if (this.E0 == j10 && !z10) {
            L();
            return;
        }
        this.f30931f1 = true;
        this.T0.clear();
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.f30926a1.clear();
        this.f30927b1.clear();
        this.D0.g();
        x(0, false);
        this.f30939o1 = 0;
        this.K0 = null;
        this.P0 = null;
        this.E0 = j10;
        org.telegram.messenger.dp T0 = org.telegram.messenger.vp.r1(this.L0).T0(j10);
        this.S0 = T0;
        T0.h.getMessagesStorage().f15938a.c(new org.telegram.messenger.bp(T0, 0));
    }

    public final void N(int i10, int i11) {
        this.f30937m1 = i10;
        this.f30938n1 = i11;
        tg0 tg0Var = this.D0;
        if (tg0Var != null) {
            for (int i12 = 0; i12 < tg0Var.f30573c.size(); i12++) {
                if (((rg0) tg0Var.f30573c.get(i12)).f29911c != null) {
                    pg0 pg0Var = ((rg0) tg0Var.f30573c.get(i12)).f29911c;
                    int i13 = this.f30937m1;
                    int i14 = this.f30938n1;
                    pg0Var.t(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(org.telegram.messenger.ic icVar, float f7) {
        if (icVar != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.X0;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i10) == icVar) {
                    this.f30927b1.set(i10, Float.valueOf(f7));
                    SparseArray sparseArray = this.f30929d1;
                    if (sparseArray.get(i10) != null) {
                        ((RadialProgress2) sparseArray.get(i10)).p(true, f7);
                    }
                } else {
                    i10++;
                }
            }
            for (int i11 = 0; i11 < getChildCount(); i11++) {
                getChildAt(i11).invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        org.telegram.messenger.dp dpVar;
        int i12;
        TLRPC.User user;
        ArrayList arrayList;
        org.telegram.messenger.ic icVar;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.ic icVar2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        TLRPC.PhotoSize photoSize;
        boolean z12;
        boolean z13;
        TLRPC.User user2;
        boolean z14;
        boolean z15;
        int i16;
        boolean z16;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i17 = org.telegram.messenger.zs.f19605e3;
        ArrayList arrayList5 = this.U0;
        ArrayList arrayList6 = this.T0;
        if (i10 == i17) {
            org.telegram.messenger.dp dpVar2 = (org.telegram.messenger.dp) objArr[0];
            if (this.S0 == dpVar2) {
                ArrayList arrayList7 = new ArrayList(dpVar2.f15288b);
                if (!arrayList7.isEmpty() || !dpVar2.f15289c) {
                    this.f30935j1 = -1;
                    this.f30936k1 = -1;
                    int i18 = this.L0;
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(i18).Z1(Long.valueOf(this.E0));
                    TLRPC.UserFull a2 = org.telegram.messenger.vp.r1(i18).a2(this.E0);
                    if (a2 != null && (photo = a2.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        this.f30935j1 = 0;
                    }
                    if (Z1 != null && Z1.self && org.telegram.messenger.h20.q(a2)) {
                        arrayList7.add(a2.fallback_photo);
                        this.f30936k1 = arrayList7.size() - 1;
                    }
                    arrayList5.clear();
                    arrayList6.clear();
                    ArrayList arrayList8 = this.X0;
                    arrayList8.clear();
                    ArrayList arrayList9 = this.W0;
                    arrayList9.clear();
                    ArrayList arrayList10 = this.Y0;
                    arrayList10.clear();
                    ArrayList arrayList11 = this.Z0;
                    arrayList11.clear();
                    ArrayList arrayList12 = this.V0;
                    arrayList12.clear();
                    ArrayList arrayList13 = this.f30926a1;
                    arrayList13.clear();
                    ArrayList arrayList14 = this.f30927b1;
                    arrayList14.clear();
                    if (org.telegram.messenger.o5.z(this.E0)) {
                        TLRPC.Chat L0 = org.telegram.messenger.vp.r1(i18).L0(Long.valueOf(-this.E0));
                        icVar = org.telegram.messenger.ic.m(i18, 0, L0);
                        arrayList = arrayList8;
                        if (icVar != null) {
                            arrayList.add(icVar);
                            user = Z1;
                            arrayList10.add(org.telegram.messenger.ic.m(i18, 1, L0));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = this.F0;
                            if (chatFull != null && org.telegram.messenger.b8.V(icVar.f16100f, chatFull.chat_photo)) {
                                arrayList12.add(this.F0.chat_photo);
                                if (!this.F0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, this.F0.chat_photo.video_sizes);
                                    arrayList9.add(org.telegram.messenger.ic.j(x10, this.F0.chat_photo));
                                    z16 = false;
                                    arrayList6.add(org.telegram.messenger.b8.r(null, x10));
                                } else {
                                    z16 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                }
                            } else {
                                z16 = false;
                                arrayList12.add(null);
                                arrayList6.add(null);
                                arrayList9.add(null);
                            }
                            arrayList13.add(num2);
                            arrayList14.add(z16);
                        } else {
                            user = Z1;
                        }
                    } else {
                        user = Z1;
                        arrayList = arrayList8;
                        icVar = null;
                    }
                    int i19 = 0;
                    while (true) {
                        int size = arrayList7.size();
                        i13 = i18;
                        z10 = this.J0;
                        if (i19 >= size) {
                            break;
                        }
                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i19);
                        if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                            i15 = i19;
                            arrayList2 = arrayList7;
                            arrayList3 = arrayList14;
                            icVar2 = icVar;
                            num = num2;
                            arrayList12.add(null);
                            arrayList.add(null);
                            arrayList10.add(null);
                            arrayList11.add(null);
                            arrayList5.add(null);
                            arrayList9.add(null);
                            arrayList6.add(null);
                            arrayList13.add(num);
                            arrayList3.add(null);
                        } else {
                            i15 = i19;
                            arrayList2 = arrayList7;
                            ArrayList arrayList15 = arrayList14;
                            TLRPC.PhotoSize w9 = org.telegram.messenger.b8.w(arrayList4, 50, false, null, false);
                            int size2 = photo2.sizes.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 >= size2) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i20);
                                TLRPC.PhotoSize photoSize3 = w9;
                                if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                    w9 = photoSize2;
                                    break;
                                } else {
                                    i20++;
                                    w9 = photoSize3;
                                }
                            }
                            if (icVar != null) {
                                int size3 = photo2.sizes.size();
                                int i21 = 0;
                                while (i21 < size3) {
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i21).location;
                                    int i22 = size3;
                                    if (fileLocation != null) {
                                        int i23 = fileLocation.local_id;
                                        i16 = i21;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = icVar.f16100f;
                                        icVar2 = icVar;
                                        if (i23 == tL_fileLocationToBeDeprecated.local_id) {
                                            num = num2;
                                            if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                                arrayList12.set(0, photo2);
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    arrayList9.set(0, org.telegram.messenger.ic.j(org.telegram.messenger.b8.x(1000, photo2.video_sizes), photo2));
                                                }
                                                arrayList3 = arrayList15;
                                            } else {
                                                i21 = i16 + 1;
                                                num2 = num;
                                                size3 = i22;
                                                icVar = icVar2;
                                            }
                                        }
                                    } else {
                                        i16 = i21;
                                        icVar2 = icVar;
                                    }
                                    num = num2;
                                    i21 = i16 + 1;
                                    num2 = num;
                                    size3 = i22;
                                    icVar = icVar2;
                                }
                            }
                            icVar2 = icVar;
                            num = num2;
                            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo2.sizes, 640, false, null, false);
                            if (w10 != null) {
                                int i24 = photo2.dc_id;
                                if (i24 != 0) {
                                    TLRPC.FileLocation fileLocation2 = w10.location;
                                    fileLocation2.dc_id = i24;
                                    fileLocation2.file_reference = photo2.file_reference;
                                }
                                org.telegram.messenger.ic i25 = org.telegram.messenger.ic.i(w10, photo2);
                                if (i25 != null) {
                                    org.telegram.messenger.ic icVar3 = this.P0;
                                    if (icVar3 != null && icVar3.f16112s == i25.f16112s && !z10 && this.E0 != org.telegram.messenger.d20.i(i13).e()) {
                                        arrayList5.add(null);
                                        arrayList.add(this.P0);
                                        org.telegram.messenger.ic icVar4 = this.Q0;
                                        if (icVar4 == null) {
                                            icVar4 = org.telegram.messenger.ic.i(w9, photo2);
                                        }
                                        arrayList10.add(icVar4);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x11 = org.telegram.messenger.b8.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize S = org.telegram.messenger.b8.S(photo2);
                                            if (S != null) {
                                                user2 = user;
                                                if (user != null && user2.premium) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                arrayList11.add(new g61(S, z15, 2));
                                                z14 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user2 = user;
                                                z14 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.ic.j(x11, photo2));
                                                arrayList6.add(org.telegram.messenger.b8.r(null, x11));
                                            }
                                        } else {
                                            user2 = user;
                                            z14 = false;
                                            arrayList11.add(this.R0);
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                        }
                                        arrayList12.add(z14);
                                        arrayList13.add(num);
                                        arrayList3 = arrayList15;
                                        arrayList3.add(z14);
                                        user = user2;
                                    } else {
                                        TLRPC.User user3 = user;
                                        arrayList.add(i25);
                                        if (w9 instanceof TLRPC.TL_photoStrippedSize) {
                                            photoSize = w10;
                                        } else {
                                            photoSize = w9;
                                        }
                                        arrayList5.add(org.telegram.messenger.b8.r(null, photoSize));
                                        arrayList10.add(org.telegram.messenger.ic.i(w9, photo2));
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x12 = org.telegram.messenger.b8.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize S2 = org.telegram.messenger.b8.S(photo2);
                                            if (S2 != null) {
                                                if (user3 != null && user3.premium) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                user = user3;
                                                arrayList11.add(new g61(S2, z13, 2));
                                                z12 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user = user3;
                                                z12 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.ic.j(x12, photo2));
                                                arrayList6.add(org.telegram.messenger.b8.r(null, x12));
                                            }
                                        } else {
                                            user = user3;
                                            z12 = false;
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                            arrayList11.add(null);
                                        }
                                        arrayList12.add(photo2);
                                        arrayList13.add(Integer.valueOf(w10.size));
                                        arrayList3 = arrayList15;
                                        arrayList3.add(z12);
                                    }
                                }
                            }
                            arrayList3 = arrayList15;
                        }
                        i19 = i15 + 1;
                        arrayList14 = arrayList3;
                        num2 = num;
                        i18 = i13;
                        arrayList7 = arrayList2;
                        icVar = icVar2;
                    }
                    int size4 = arrayList10.size();
                    if (size4 > 1) {
                        int i26 = 0;
                        while (true) {
                            if (size4 > 2) {
                                i14 = 2;
                            } else {
                                i14 = 1;
                            }
                            if (i26 >= i14) {
                                break;
                            }
                            org.telegram.messenger.b8.G(i13).W((org.telegram.messenger.ic) arrayList10.get(i26 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                            i26++;
                        }
                    }
                    getAdapter().g();
                    if (z10) {
                        if (!this.H0 || this.f30931f1) {
                            L();
                        }
                    } else if (!this.H0 || this.f30931f1) {
                        L();
                        getAdapter().g();
                        B(0.0f, getRealPosition());
                    }
                    if (this.f30936k1 < 0 && this.f30935j1 < 0) {
                        z11 = false;
                        B(0.0f, 0);
                    } else {
                        z11 = false;
                    }
                    this.f30931f1 = z11;
                    qg0 qg0Var = this.G0;
                    if (qg0Var != null) {
                        qg0Var.c();
                    }
                    org.telegram.messenger.ic icVar5 = this.f30941q1;
                    if (icVar5 != null) {
                        A(icVar5, this.f30942r1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i27 = org.telegram.messenger.zs.Y1;
        SparseArray sparseArray = this.f30929d1;
        if (i10 == i27) {
            String str = (String) objArr[0];
            for (int i28 = 0; i28 < arrayList5.size(); i28++) {
                String str2 = (String) arrayList6.get(i28);
                if (str2 == null) {
                    str2 = (String) arrayList5.get(i28);
                }
                if (str2 != null && TextUtils.equals(str, str2)) {
                    RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i28);
                    if (radialProgress2 != null) {
                        radialProgress2.p(true, 1.0f);
                    }
                    invalidate();
                }
            }
        } else if (i10 == org.telegram.messenger.zs.X1) {
            String str3 = (String) objArr[0];
            for (int i29 = 0; i29 < arrayList5.size(); i29++) {
                String str4 = (String) arrayList6.get(i29);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i29);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i29);
                    if (radialProgress22 != null) {
                        radialProgress22.p(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
                    }
                    invalidate();
                }
            }
        } else if (i10 == org.telegram.messenger.zs.f19590c0 && this.f30928c1 == 0 && (dpVar = this.S0) != null) {
            dpVar.e();
            org.telegram.messenger.dp dpVar3 = this.S0;
            int currentItem = getCurrentItem();
            tg0 tg0Var = this.D0;
            if (tg0Var != null) {
                i12 = tg0Var.j();
            } else {
                i12 = 0;
            }
            dpVar3.b(currentItem - i12, true);
        }
    }

    public mg0 getBlurDrawer() {
        return this.f30940p1;
    }

    public float getCurrentItemProgress() {
        s5 m10;
        g9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m10 = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m10.n();
    }

    public g9 getCurrentItemView() {
        tg0 tg0Var = this.D0;
        if (tg0Var != null && !tg0Var.f30573c.isEmpty()) {
            return ((rg0) tg0Var.f30573c.get(getCurrentItem())).f29911c;
        }
        return null;
    }

    public long getDialogId() {
        return this.E0;
    }

    public int getRealCount() {
        int size = this.V0.size();
        if (this.f30934i1) {
            return size + 1;
        }
        return size;
    }

    public int getRealPosition() {
        return this.D0.k(getCurrentItem());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.C0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        mg0 mg0Var = this.f30940p1;
        if (mg0Var != null) {
            mg0Var.setTranslationY(getHeight() - this.f30940p1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        mg0 mg0Var = this.f30940p1;
        if (mg0Var != null) {
            mg0Var.G = true;
            mg0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ug0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        mg0 mg0Var = this.f30940p1;
        if (mg0Var != null) {
            mg0Var.setAlpha(f7);
        }
    }

    public void setAnimatedFileMaybe(s5 s5Var) {
        tg0 tg0Var;
        if (s5Var != null && (tg0Var = this.D0) != null) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if ((childAt instanceof g9) && tg0Var.k(tg0Var.d.indexOf(childAt)) == 0) {
                    g9 g9Var = (g9) childAt;
                    s5 m10 = g9Var.getImageReceiver().m();
                    if (m10 != s5Var) {
                        if (m10 != null) {
                            m10.w(g9Var);
                        }
                        g9Var.setImageDrawable(s5Var);
                        s5Var.f(this);
                        s5Var.R = true;
                    }
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.F0 = chatFull;
        ArrayList arrayList = this.V0;
        if (!arrayList.isEmpty() && arrayList.get(0) == null && this.F0 != null) {
            ArrayList arrayList2 = this.X0;
            if (arrayList2.get(0) != null && org.telegram.messenger.b8.V(((org.telegram.messenger.ic) arrayList2.get(0)).f16100f, this.F0.chat_photo)) {
                arrayList.set(0, this.F0.chat_photo);
                boolean isEmpty = this.F0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.T0;
                ArrayList arrayList4 = this.W0;
                if (!isEmpty) {
                    TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, this.F0.chat_photo.video_sizes);
                    arrayList4.set(0, org.telegram.messenger.ic.j(x10, this.F0.chat_photo));
                    arrayList3.set(0, org.telegram.messenger.b8.r(null, x10));
                    qg0 qg0Var = this.G0;
                    if (qg0Var != null) {
                        qg0Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.f30927b1.set(0, null);
                this.D0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.f30930e1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.f30934i1 = z10;
    }

    public void setImagesLayerNum(int i10) {
        this.l1 = i10;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.f30932g1 = z10;
    }

    public void setParentAvatarImage(g9 g9Var) {
        tg0 tg0Var = this.D0;
        if (tg0Var != null) {
            tg0Var.f30575g = g9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.qs0 qs0Var) {
        this.f30933h1 = qs0Var;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        mg0 mg0Var = this.f30940p1;
        if (mg0Var != null) {
            mg0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f7) {
    }

    public ug0(Context context, long j10, org.telegram.ui.ActionBar.l lVar, tk0 tk0Var, org.telegram.ui.jx0 jx0Var, qg0 qg0Var, mg0 mg0Var) {
        super(context);
        this.f30943x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = org.telegram.messenger.d20.f15147s0;
        this.L0 = i10;
        this.M0 = new Path();
        this.N0 = new RectF();
        this.O0 = new float[8];
        this.T0 = new ArrayList();
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f30926a1 = new ArrayList();
        this.f30927b1 = new ArrayList();
        this.f30929d1 = new SparseArray();
        this.f30930e1 = true;
        this.f30935j1 = -1;
        this.f30936k1 = -1;
        this.f30940p1 = mg0Var;
        setPadding(0, 0, 0, mg0Var == null ? 0 : mg0Var.f28440n);
        if (mg0Var != null) {
            mg0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.J0 = true;
        this.E0 = j10;
        this.C0 = tk0Var;
        this.f30945z0 = lVar;
        tg0 tg0Var = new tg0(this, getContext(), jx0Var);
        this.D0 = tg0Var;
        setAdapter((mp) tg0Var);
        this.f30944y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = qg0Var;
        b(new og0((org.telegram.ui.kw0) this));
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19584b0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.Y1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.X1);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19590c0);
        org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.f19605e3);
        org.telegram.messenger.dp T0 = org.telegram.messenger.vp.r1(i10).T0(j10);
        this.S0 = T0;
        T0.h.getMessagesStorage().f15938a.c(new org.telegram.messenger.bp(T0, 0));
    }
}
