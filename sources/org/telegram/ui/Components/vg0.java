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
public class vg0 extends np implements org.telegram.messenger.vs {
    public boolean A0;
    public boolean B0;
    public final uk0 C0;
    public final ug0 D0;
    public long E0;
    public TLRPC.ChatFull F0;
    public final rg0 G0;
    public boolean H0;
    public boolean I0;
    public final boolean J0;
    public org.telegram.messenger.jc K0;
    public final int L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public org.telegram.messenger.jc P0;
    public org.telegram.messenger.jc Q0;
    public h61 R0;
    public org.telegram.messenger.ep S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList f31285a1;
    public final ArrayList f31286b1;
    public int f31287c1;
    public final SparseArray f31288d1;
    public boolean f31289e1;
    public boolean f31290f1;
    public boolean f31291g1;
    public org.telegram.ui.ps0 f31292h1;
    public boolean f31293i1;
    public int f31294j1;
    public int f31295k1;
    public int l1;
    public int f31296m1;
    public int f31297n1;
    public int f31298o1;
    public ng0 f31299p1;
    public org.telegram.messenger.jc f31300q1;
    public org.telegram.messenger.jc f31301r1;
    public final PointF f31302x0;
    public final int f31303y0;
    public final org.telegram.ui.ActionBar.l f31304z0;

    public vg0(Context context, org.telegram.ui.ActionBar.l lVar, uk0 uk0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.f31302x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = org.telegram.messenger.e20.f15506s0;
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
        this.f31285a1 = new ArrayList();
        this.f31286b1 = new ArrayList();
        this.f31288d1 = new SparseArray();
        this.f31289e1 = true;
        this.f31294j1 = -1;
        this.f31295k1 = -1;
        setOffscreenPageLimit(2);
        this.f31299p1 = null;
        this.J0 = false;
        this.C0 = uk0Var;
        ConnectionsManager.generateClassGuid();
        this.f31304z0 = lVar;
        this.f31303y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = q4Var;
        b(new og0(this));
        ug0 ug0Var = new ug0(this, getContext(), null);
        this.D0 = ug0Var;
        setAdapter((mp) ug0Var);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14680b0);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.X1);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14686c0);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14701e3);
        this.S0 = null;
    }

    public final void A(org.telegram.messenger.jc jcVar, org.telegram.messenger.jc jcVar2) {
        this.P0 = jcVar;
        this.U0.add(0, null);
        this.T0.add(0, null);
        this.X0.add(0, jcVar);
        this.Y0.add(0, jcVar2);
        this.Z0.add(0, null);
        this.W0.add(0, null);
        this.V0.add(0, null);
        this.f31285a1.add(0, -1);
        this.f31286b1.add(0, Float.valueOf(0.0f));
        this.D0.g();
        L();
        this.f31300q1 = jcVar;
        this.f31301r1 = jcVar2;
    }

    public final void B(float f7, int i10) {
        float f10;
        int i11 = this.f31294j1;
        float f11 = 0.0f;
        if (i11 >= 0 || this.f31295k1 >= 0) {
            if (i11 < 0) {
                i11 = this.f31295k1;
            }
            int k10 = this.D0.k(i10);
            if (this.f31293i1) {
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

    public final org.telegram.messenger.jc C(org.telegram.messenger.jc jcVar, org.telegram.messenger.jc jcVar2) {
        ArrayList arrayList;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (jcVar == null) {
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
                org.telegram.messenger.jc jcVar3 = (org.telegram.messenger.jc) arrayList.get(i11);
                if (jcVar3 != null && (tL_fileLocationToBeDeprecated = jcVar3.f16435f) != null) {
                    int i12 = jcVar3.f16432a;
                    if (i12 == jcVar.f16432a) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = jcVar.f16435f;
                        if (i13 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (org.telegram.messenger.jc) this.W0.get(i11);
                        }
                    }
                    if (i12 == jcVar2.f16432a) {
                        int i14 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = jcVar2.f16435f;
                        if (i14 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (org.telegram.messenger.jc) this.W0.get(i11);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final org.telegram.messenger.jc D(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X0;
            if (i10 < arrayList.size()) {
                org.telegram.messenger.jc jcVar = (org.telegram.messenger.jc) this.W0.get(i10);
                if (jcVar != null) {
                    return jcVar;
                }
                return (org.telegram.messenger.jc) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final View E(int i10) {
        ug0 ug0Var = this.D0;
        if (ug0Var != null) {
            ArrayList arrayList = ug0Var.f30960c;
            if (arrayList.size() > i10 && i10 >= 0) {
                sg0 sg0Var = (sg0) arrayList.get(i10);
                tg0 tg0Var = sg0Var.f30286b;
                if (tg0Var == null) {
                    return sg0Var.f30287c;
                }
                return tg0Var;
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

    public final org.telegram.messenger.jc G(int i10) {
        if (i10 >= 0) {
            ArrayList arrayList = this.X0;
            if (i10 < arrayList.size()) {
                return (org.telegram.messenger.jc) arrayList.get(i10);
            }
            return null;
        }
        return null;
    }

    public final boolean H(h61 h61Var, org.telegram.messenger.jc jcVar, org.telegram.messenger.jc jcVar2, boolean z10) {
        org.telegram.messenger.ep epVar;
        int i10;
        org.telegram.messenger.ep epVar2;
        int i11 = 0;
        if (jcVar != null && jcVar2 != null && this.f31287c1 == 0) {
            org.telegram.messenger.jc jcVar3 = this.P0;
            ArrayList arrayList = this.X0;
            if (jcVar3 == null || jcVar3.f16435f.local_id != jcVar.f16435f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                ug0 ug0Var = this.D0;
                if (!isEmpty) {
                    this.P0 = jcVar;
                    if (z10 && (epVar2 = this.S0) != null) {
                        epVar2.e();
                        org.telegram.messenger.ep epVar3 = this.S0;
                        int currentItem = getCurrentItem();
                        if (ug0Var != null) {
                            i11 = ug0Var.j();
                        }
                        epVar3.b(currentItem - i11, true);
                    }
                    return true;
                } else if (z10 && (epVar = this.S0) != null) {
                    epVar.e();
                    org.telegram.messenger.ep epVar4 = this.S0;
                    int currentItem2 = getCurrentItem();
                    if (ug0Var != null) {
                        i10 = ug0Var.j();
                    } else {
                        i10 = 0;
                    }
                    epVar4.b(currentItem2 - i10, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.P0 = jcVar;
                this.Q0 = jcVar2;
                this.R0 = h61Var;
                this.U0.add(null);
                this.T0.add(null);
                arrayList.add(jcVar);
                this.Y0.add(jcVar2);
                this.Z0.add(h61Var);
                this.W0.add(null);
                this.V0.add(null);
                this.f31285a1.add(-1);
                this.f31286b1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f31293i1) {
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
        if (this.f31293i1) {
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
        this.f31299p1 = null;
        int i10 = this.L0;
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14680b0);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at f7 = org.telegram.messenger.at.f(i10);
        int i11 = org.telegram.messenger.at.X1;
        f7.n(this, i11);
        org.telegram.messenger.at.f(i10).n(this, i11);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14686c0);
        org.telegram.messenger.at.f(i10).n(this, org.telegram.messenger.at.f14701e3);
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
        this.f31290f1 = true;
        this.T0.clear();
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.f31285a1.clear();
        this.f31286b1.clear();
        this.D0.g();
        x(0, false);
        this.f31298o1 = 0;
        this.K0 = null;
        this.P0 = null;
        this.E0 = j10;
        org.telegram.messenger.ep T0 = org.telegram.messenger.wp.r1(this.L0).T0(j10);
        this.S0 = T0;
        T0.h.getMessagesStorage().f16331a.c(new org.telegram.messenger.cp(T0, 0));
    }

    public final void N(int i10, int i11) {
        this.f31296m1 = i10;
        this.f31297n1 = i11;
        ug0 ug0Var = this.D0;
        if (ug0Var != null) {
            for (int i12 = 0; i12 < ug0Var.f30960c.size(); i12++) {
                if (((sg0) ug0Var.f30960c.get(i12)).f30287c != null) {
                    qg0 qg0Var = ((sg0) ug0Var.f30960c.get(i12)).f30287c;
                    int i13 = this.f31296m1;
                    int i14 = this.f31297n1;
                    qg0Var.t(i13, i13, i14, i14);
                }
            }
        }
    }

    public final void O(org.telegram.messenger.jc jcVar, float f7) {
        if (jcVar != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.X0;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i10) == jcVar) {
                    this.f31286b1.set(i10, Float.valueOf(f7));
                    SparseArray sparseArray = this.f31288d1;
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
        org.telegram.messenger.ep epVar;
        int i12;
        TLRPC.User user;
        ArrayList arrayList;
        org.telegram.messenger.jc jcVar;
        int i13;
        boolean z10;
        boolean z11;
        int i14;
        int i15;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.jc jcVar2;
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
        int i17 = org.telegram.messenger.at.f14701e3;
        ArrayList arrayList5 = this.U0;
        ArrayList arrayList6 = this.T0;
        if (i10 == i17) {
            org.telegram.messenger.ep epVar2 = (org.telegram.messenger.ep) objArr[0];
            if (this.S0 == epVar2) {
                ArrayList arrayList7 = new ArrayList(epVar2.f15623b);
                if (!arrayList7.isEmpty() || !epVar2.f15624c) {
                    this.f31294j1 = -1;
                    this.f31295k1 = -1;
                    int i18 = this.L0;
                    TLRPC.User Z1 = org.telegram.messenger.wp.r1(i18).Z1(Long.valueOf(this.E0));
                    TLRPC.UserFull a2 = org.telegram.messenger.wp.r1(i18).a2(this.E0);
                    if (a2 != null && (photo = a2.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        this.f31294j1 = 0;
                    }
                    if (Z1 != null && Z1.self && org.telegram.messenger.i20.q(a2)) {
                        arrayList7.add(a2.fallback_photo);
                        this.f31295k1 = arrayList7.size() - 1;
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
                    ArrayList arrayList13 = this.f31285a1;
                    arrayList13.clear();
                    ArrayList arrayList14 = this.f31286b1;
                    arrayList14.clear();
                    if (org.telegram.messenger.o5.z(this.E0)) {
                        TLRPC.Chat L0 = org.telegram.messenger.wp.r1(i18).L0(Long.valueOf(-this.E0));
                        jcVar = org.telegram.messenger.jc.m(i18, 0, L0);
                        arrayList = arrayList8;
                        if (jcVar != null) {
                            arrayList.add(jcVar);
                            user = Z1;
                            arrayList10.add(org.telegram.messenger.jc.m(i18, 1, L0));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = this.F0;
                            if (chatFull != null && org.telegram.messenger.b8.V(jcVar.f16435f, chatFull.chat_photo)) {
                                arrayList12.add(this.F0.chat_photo);
                                if (!this.F0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, this.F0.chat_photo.video_sizes);
                                    arrayList9.add(org.telegram.messenger.jc.j(x10, this.F0.chat_photo));
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
                        jcVar = null;
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
                            jcVar2 = jcVar;
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
                            if (jcVar != null) {
                                int size3 = photo2.sizes.size();
                                int i21 = 0;
                                while (i21 < size3) {
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i21).location;
                                    int i22 = size3;
                                    if (fileLocation != null) {
                                        int i23 = fileLocation.local_id;
                                        i16 = i21;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = jcVar.f16435f;
                                        jcVar2 = jcVar;
                                        if (i23 == tL_fileLocationToBeDeprecated.local_id) {
                                            num = num2;
                                            if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                                arrayList12.set(0, photo2);
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    arrayList9.set(0, org.telegram.messenger.jc.j(org.telegram.messenger.b8.x(1000, photo2.video_sizes), photo2));
                                                }
                                                arrayList3 = arrayList15;
                                            } else {
                                                i21 = i16 + 1;
                                                num2 = num;
                                                size3 = i22;
                                                jcVar = jcVar2;
                                            }
                                        }
                                    } else {
                                        i16 = i21;
                                        jcVar2 = jcVar;
                                    }
                                    num = num2;
                                    i21 = i16 + 1;
                                    num2 = num;
                                    size3 = i22;
                                    jcVar = jcVar2;
                                }
                            }
                            jcVar2 = jcVar;
                            num = num2;
                            TLRPC.PhotoSize w10 = org.telegram.messenger.b8.w(photo2.sizes, 640, false, null, false);
                            if (w10 != null) {
                                int i24 = photo2.dc_id;
                                if (i24 != 0) {
                                    TLRPC.FileLocation fileLocation2 = w10.location;
                                    fileLocation2.dc_id = i24;
                                    fileLocation2.file_reference = photo2.file_reference;
                                }
                                org.telegram.messenger.jc i25 = org.telegram.messenger.jc.i(w10, photo2);
                                if (i25 != null) {
                                    org.telegram.messenger.jc jcVar3 = this.P0;
                                    if (jcVar3 != null && jcVar3.f16447s == i25.f16447s && !z10 && this.E0 != org.telegram.messenger.e20.i(i13).e()) {
                                        arrayList5.add(null);
                                        arrayList.add(this.P0);
                                        org.telegram.messenger.jc jcVar4 = this.Q0;
                                        if (jcVar4 == null) {
                                            jcVar4 = org.telegram.messenger.jc.i(w9, photo2);
                                        }
                                        arrayList10.add(jcVar4);
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
                                                arrayList11.add(new h61(S, z15, 2));
                                                z14 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user2 = user;
                                                z14 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.jc.j(x11, photo2));
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
                                        arrayList10.add(org.telegram.messenger.jc.i(w9, photo2));
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
                                                arrayList11.add(new h61(S2, z13, 2));
                                                z12 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user = user3;
                                                z12 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.jc.j(x12, photo2));
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
                        jcVar = jcVar2;
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
                            org.telegram.messenger.b8.G(i13).W((org.telegram.messenger.jc) arrayList10.get(i26 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                            i26++;
                        }
                    }
                    getAdapter().g();
                    if (z10) {
                        if (!this.H0 || this.f31290f1) {
                            L();
                        }
                    } else if (!this.H0 || this.f31290f1) {
                        L();
                        getAdapter().g();
                        B(0.0f, getRealPosition());
                    }
                    if (this.f31295k1 < 0 && this.f31294j1 < 0) {
                        z11 = false;
                        B(0.0f, 0);
                    } else {
                        z11 = false;
                    }
                    this.f31290f1 = z11;
                    rg0 rg0Var = this.G0;
                    if (rg0Var != null) {
                        rg0Var.c();
                    }
                    org.telegram.messenger.jc jcVar5 = this.f31300q1;
                    if (jcVar5 != null) {
                        A(jcVar5, this.f31301r1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i27 = org.telegram.messenger.at.Y1;
        SparseArray sparseArray = this.f31288d1;
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
        } else if (i10 == org.telegram.messenger.at.X1) {
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
        } else if (i10 == org.telegram.messenger.at.f14686c0 && this.f31287c1 == 0 && (epVar = this.S0) != null) {
            epVar.e();
            org.telegram.messenger.ep epVar3 = this.S0;
            int currentItem = getCurrentItem();
            ug0 ug0Var = this.D0;
            if (ug0Var != null) {
                i12 = ug0Var.j();
            } else {
                i12 = 0;
            }
            epVar3.b(currentItem - i12, true);
        }
    }

    public ng0 getBlurDrawer() {
        return this.f31299p1;
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
        ug0 ug0Var = this.D0;
        if (ug0Var != null && !ug0Var.f30960c.isEmpty()) {
            return ((sg0) ug0Var.f30960c.get(getCurrentItem())).f30287c;
        }
        return null;
    }

    public long getDialogId() {
        return this.E0;
    }

    public int getRealCount() {
        int size = this.V0.size();
        if (this.f31293i1) {
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
        ng0 ng0Var = this.f31299p1;
        if (ng0Var != null) {
            ng0Var.setTranslationY(getHeight() - this.f31299p1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        ng0 ng0Var = this.f31299p1;
        if (ng0Var != null) {
            ng0Var.G = true;
            ng0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vg0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f7) {
        super.setAlpha(f7);
        ng0 ng0Var = this.f31299p1;
        if (ng0Var != null) {
            ng0Var.setAlpha(f7);
        }
    }

    public void setAnimatedFileMaybe(s5 s5Var) {
        ug0 ug0Var;
        if (s5Var != null && (ug0Var = this.D0) != null) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = getChildAt(i10);
                if ((childAt instanceof g9) && ug0Var.k(ug0Var.d.indexOf(childAt)) == 0) {
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
            if (arrayList2.get(0) != null && org.telegram.messenger.b8.V(((org.telegram.messenger.jc) arrayList2.get(0)).f16435f, this.F0.chat_photo)) {
                arrayList.set(0, this.F0.chat_photo);
                boolean isEmpty = this.F0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.T0;
                ArrayList arrayList4 = this.W0;
                if (!isEmpty) {
                    TLRPC.VideoSize x10 = org.telegram.messenger.b8.x(1000, this.F0.chat_photo.video_sizes);
                    arrayList4.set(0, org.telegram.messenger.jc.j(x10, this.F0.chat_photo));
                    arrayList3.set(0, org.telegram.messenger.b8.r(null, x10));
                    rg0 rg0Var = this.G0;
                    if (rg0Var != null) {
                        rg0Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.f31286b1.set(0, null);
                this.D0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.f31289e1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.f31293i1 = z10;
    }

    public void setImagesLayerNum(int i10) {
        this.l1 = i10;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.f31291g1 = z10;
    }

    public void setParentAvatarImage(g9 g9Var) {
        ug0 ug0Var = this.D0;
        if (ug0Var != null) {
            ug0Var.f30962g = g9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.ps0 ps0Var) {
        this.f31292h1 = ps0Var;
    }

    @Override
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        ng0 ng0Var = this.f31299p1;
        if (ng0Var != null) {
            ng0Var.setVisibility(i10);
        }
    }

    public void setCustomAvatarProgress(float f7) {
    }

    public vg0(Context context, long j10, org.telegram.ui.ActionBar.l lVar, uk0 uk0Var, org.telegram.ui.ix0 ix0Var, rg0 rg0Var, ng0 ng0Var) {
        super(context);
        this.f31302x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i10 = org.telegram.messenger.e20.f15506s0;
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
        this.f31285a1 = new ArrayList();
        this.f31286b1 = new ArrayList();
        this.f31288d1 = new SparseArray();
        this.f31289e1 = true;
        this.f31294j1 = -1;
        this.f31295k1 = -1;
        this.f31299p1 = ng0Var;
        setPadding(0, 0, 0, ng0Var == null ? 0 : ng0Var.f28820n);
        if (ng0Var != null) {
            ng0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.J0 = true;
        this.E0 = j10;
        this.C0 = uk0Var;
        this.f31304z0 = lVar;
        ug0 ug0Var = new ug0(this, getContext(), ix0Var);
        this.D0 = ug0Var;
        setAdapter((mp) ug0Var);
        this.f31303y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = rg0Var;
        b(new pg0((org.telegram.ui.jw0) this));
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14680b0);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.Y1);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.X1);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14686c0);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.f14701e3);
        org.telegram.messenger.ep T0 = org.telegram.messenger.wp.r1(i10).T0(j10);
        this.S0 = T0;
        T0.h.getMessagesStorage().f16331a.c(new org.telegram.messenger.cp(T0, 0));
    }
}
