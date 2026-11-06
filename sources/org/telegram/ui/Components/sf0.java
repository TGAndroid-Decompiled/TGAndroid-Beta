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
public class sf0 extends fp implements org.telegram.messenger.ls {
    public boolean A0;
    public boolean B0;
    public final pj0 C0;
    public final rf0 D0;
    public long E0;
    public TLRPC.ChatFull F0;
    public final of0 G0;
    public boolean H0;
    public boolean I0;
    public final boolean J0;
    public org.telegram.messenger.hc K0;
    public final int L0;
    public final Path M0;
    public final RectF N0;
    public final float[] O0;
    public org.telegram.messenger.hc P0;
    public org.telegram.messenger.hc Q0;
    public y41 R0;
    public org.telegram.messenger.yo S0;
    public final ArrayList T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList f38068a1;
    public final ArrayList f38069b1;
    public int f38070c1;
    public final SparseArray f38071d1;
    public boolean f38072e1;
    public boolean f38073f1;
    public boolean f38074g1;
    public org.telegram.ui.er0 f38075h1;
    public boolean f38076i1;
    public int f38077j1;
    public int f38078k1;
    public int l1;
    public int f38079m1;
    public int n1;
    public int f38080o1;
    public kf0 f38081p1;
    public org.telegram.messenger.hc f38082q1;
    public org.telegram.messenger.hc f38083r1;
    public final PointF f38084x0;
    public final int f38085y0;
    public final org.telegram.ui.ActionBar.k f38086z0;

    public sf0(Context context, org.telegram.ui.ActionBar.k kVar, pj0 pj0Var, org.telegram.ui.q4 q4Var) {
        super(context);
        this.f38084x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i7 = org.telegram.messenger.p10.f24459s0;
        this.L0 = i7;
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
        this.f38068a1 = new ArrayList();
        this.f38069b1 = new ArrayList();
        this.f38071d1 = new SparseArray();
        this.f38072e1 = true;
        this.f38077j1 = -1;
        this.f38078k1 = -1;
        setOffscreenPageLimit(2);
        this.f38081p1 = null;
        this.J0 = false;
        this.C0 = pj0Var;
        ConnectionsManager.generateClassGuid();
        this.f38086z0 = kVar;
        this.f38085y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = q4Var;
        b(new lf0(this));
        rf0 rf0Var = new rf0(this, getContext(), null);
        this.D0 = rf0Var;
        setAdapter((ep) rf0Var);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24956b0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24962c0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24976e3);
        this.S0 = null;
    }

    public final void A(org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2) {
        this.P0 = hcVar;
        this.U0.add(0, null);
        this.T0.add(0, null);
        this.X0.add(0, hcVar);
        this.Y0.add(0, hcVar2);
        this.Z0.add(0, null);
        this.W0.add(0, null);
        this.V0.add(0, null);
        this.f38068a1.add(0, -1);
        this.f38069b1.add(0, Float.valueOf(0.0f));
        this.D0.g();
        L();
        this.f38082q1 = hcVar;
        this.f38083r1 = hcVar2;
    }

    public final void B(float f10, int i7) {
        float f11;
        int i10 = this.f38077j1;
        float f12 = 0.0f;
        if (i10 >= 0 || this.f38078k1 >= 0) {
            if (i10 < 0) {
                i10 = this.f38078k1;
            }
            int k10 = this.D0.k(i7);
            if (this.f38076i1) {
                k10--;
            }
            if (k10 == i10) {
                f11 = 1.0f - f10;
            } else if (getRealCount() > 0 && (k10 - 1) % getRealCount() == i10) {
                f11 = (1.0f - f10) - 1.0f;
            } else if (getRealCount() > 0 && (k10 + 1) % getRealCount() == i10) {
                f11 = (1.0f - f10) + 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (f11 > 1.0f) {
                f11 = 2.0f - f11;
            }
            f12 = Utilities.i(f11, 1.0f, 0.0f);
        }
        setCustomAvatarProgress(f12);
    }

    public final org.telegram.messenger.hc C(org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2) {
        ArrayList arrayList;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (hcVar == null) {
            return null;
        }
        for (int i7 = 0; i7 < 2; i7++) {
            if (i7 == 0) {
                arrayList = this.Y0;
            } else {
                arrayList = this.X0;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.hc hcVar3 = (org.telegram.messenger.hc) arrayList.get(i10);
                if (hcVar3 != null && (tL_fileLocationToBeDeprecated = hcVar3.f22856f) != null) {
                    int i11 = hcVar3.f22852a;
                    if (i11 == hcVar.f22852a) {
                        int i12 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = hcVar.f22856f;
                        if (i12 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (org.telegram.messenger.hc) this.W0.get(i10);
                        }
                    }
                    if (i11 == hcVar2.f22852a) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = hcVar2.f22856f;
                        if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (org.telegram.messenger.hc) this.W0.get(i10);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final org.telegram.messenger.hc D(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.X0;
            if (i7 < arrayList.size()) {
                org.telegram.messenger.hc hcVar = (org.telegram.messenger.hc) this.W0.get(i7);
                if (hcVar != null) {
                    return hcVar;
                }
                return (org.telegram.messenger.hc) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    public final View E(int i7) {
        rf0 rf0Var = this.D0;
        if (rf0Var != null) {
            ArrayList arrayList = rf0Var.f37724c;
            if (arrayList.size() > i7 && i7 >= 0) {
                pf0 pf0Var = (pf0) arrayList.get(i7);
                qf0 qf0Var = pf0Var.f36997b;
                if (qf0Var == null) {
                    return pf0Var.f36998c;
                }
                return qf0Var;
            }
            return null;
        }
        return null;
    }

    public final TLRPC.Photo F(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.V0;
            if (i7 < arrayList.size()) {
                return (TLRPC.Photo) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    public final org.telegram.messenger.hc G(int i7) {
        if (i7 >= 0) {
            ArrayList arrayList = this.X0;
            if (i7 < arrayList.size()) {
                return (org.telegram.messenger.hc) arrayList.get(i7);
            }
            return null;
        }
        return null;
    }

    public final boolean H(y41 y41Var, org.telegram.messenger.hc hcVar, org.telegram.messenger.hc hcVar2, boolean z9) {
        org.telegram.messenger.yo yoVar;
        int i7;
        org.telegram.messenger.yo yoVar2;
        int i10 = 0;
        if (hcVar != null && hcVar2 != null && this.f38070c1 == 0) {
            org.telegram.messenger.hc hcVar3 = this.P0;
            ArrayList arrayList = this.X0;
            if (hcVar3 == null || hcVar3.f22856f.local_id != hcVar.f22856f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                rf0 rf0Var = this.D0;
                if (!isEmpty) {
                    this.P0 = hcVar;
                    if (z9 && (yoVar2 = this.S0) != null) {
                        yoVar2.f();
                        org.telegram.messenger.yo yoVar3 = this.S0;
                        int currentItem = getCurrentItem();
                        if (rf0Var != null) {
                            i10 = rf0Var.j();
                        }
                        yoVar3.b(currentItem - i10, true);
                    }
                    return true;
                } else if (z9 && (yoVar = this.S0) != null) {
                    yoVar.f();
                    org.telegram.messenger.yo yoVar4 = this.S0;
                    int currentItem2 = getCurrentItem();
                    if (rf0Var != null) {
                        i7 = rf0Var.j();
                    } else {
                        i7 = 0;
                    }
                    yoVar4.b(currentItem2 - i7, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.P0 = hcVar;
                this.Q0 = hcVar2;
                this.R0 = y41Var;
                this.U0.add(null);
                this.T0.add(null);
                arrayList.add(hcVar);
                this.Y0.add(hcVar2);
                this.Z0.add(y41Var);
                this.W0.add(null);
                this.V0.add(null);
                this.f38068a1.add(-1);
                this.f38069b1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f38076i1) {
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
        l9 currentItemView;
        if (this.f38076i1) {
            realPosition = getRealPosition() - 1;
        } else {
            realPosition = getRealPosition();
        }
        if (this.W0.get(realPosition) != null && (currentItemView = getCurrentItemView()) != null) {
            v5 m10 = currentItemView.getImageReceiver().m();
            if (m10 == null || !m10.s()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        this.f38081p1 = null;
        int i7 = this.L0;
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24956b0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs f10 = org.telegram.messenger.qs.f(i7);
        int i10 = org.telegram.messenger.qs.X1;
        f10.n(this, i10);
        org.telegram.messenger.qs.f(i7).n(this, i10);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24962c0);
        org.telegram.messenger.qs.f(i7).n(this, org.telegram.messenger.qs.f24976e3);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof l9) {
                l9 l9Var = (l9) childAt;
                if (l9Var.getImageReceiver().m0 != null) {
                    Drawable t6 = l9Var.getImageReceiver().t();
                    if (t6 instanceof v5) {
                        ((v5) t6).w(l9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.D0.j(), false);
    }

    public final void M(long j3, boolean z9) {
        if (this.E0 == j3 && !z9) {
            L();
            return;
        }
        this.f38073f1 = true;
        this.T0.clear();
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.f38068a1.clear();
        this.f38069b1.clear();
        this.D0.g();
        x(0, false);
        this.f38080o1 = 0;
        this.K0 = null;
        this.P0 = null;
        this.E0 = j3;
        org.telegram.messenger.yo U0 = org.telegram.messenger.qp.s1(this.L0).U0(j3);
        this.S0 = U0;
        U0.h.getMessagesStorage().f26688a.c(new org.telegram.messenger.wo(U0, 0));
    }

    public final void N(int i7, int i10) {
        this.f38079m1 = i7;
        this.n1 = i10;
        rf0 rf0Var = this.D0;
        if (rf0Var != null) {
            for (int i11 = 0; i11 < rf0Var.f37724c.size(); i11++) {
                if (((pf0) rf0Var.f37724c.get(i11)).f36998c != null) {
                    nf0 nf0Var = ((pf0) rf0Var.f37724c.get(i11)).f36998c;
                    int i12 = this.f38079m1;
                    int i13 = this.n1;
                    nf0Var.t(i12, i12, i13, i13);
                }
            }
        }
    }

    public final void O(org.telegram.messenger.hc hcVar, float f10) {
        if (hcVar != null) {
            int i7 = 0;
            while (true) {
                ArrayList arrayList = this.X0;
                if (i7 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i7) == hcVar) {
                    this.f38069b1.set(i7, Float.valueOf(f10));
                    SparseArray sparseArray = this.f38071d1;
                    if (sparseArray.get(i7) != null) {
                        ((RadialProgress2) sparseArray.get(i7)).p(true, f10);
                    }
                } else {
                    i7++;
                }
            }
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        org.telegram.messenger.yo yoVar;
        int i11;
        TLRPC.User user;
        ArrayList arrayList;
        org.telegram.messenger.hc hcVar;
        int i12;
        boolean z9;
        boolean z10;
        int i13;
        int i14;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.hc hcVar2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        TLRPC.PhotoSize photoSize;
        boolean z11;
        boolean z12;
        TLRPC.User user2;
        boolean z13;
        boolean z14;
        int i15;
        boolean z15;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i16 = org.telegram.messenger.qs.f24976e3;
        ArrayList arrayList5 = this.U0;
        ArrayList arrayList6 = this.T0;
        if (i7 == i16) {
            org.telegram.messenger.yo yoVar2 = (org.telegram.messenger.yo) objArr[0];
            if (this.S0 == yoVar2) {
                ArrayList arrayList7 = new ArrayList(yoVar2.f26674b);
                if (!arrayList7.isEmpty() || !yoVar2.f26675c) {
                    this.f38077j1 = -1;
                    this.f38078k1 = -1;
                    int i17 = this.L0;
                    TLRPC.User a22 = org.telegram.messenger.qp.s1(i17).a2(Long.valueOf(this.E0));
                    TLRPC.UserFull b22 = org.telegram.messenger.qp.s1(i17).b2(this.E0);
                    if (b22 != null && (photo = b22.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        this.f38077j1 = 0;
                    }
                    if (a22 != null && a22.self && org.telegram.messenger.t10.q(b22)) {
                        arrayList7.add(b22.fallback_photo);
                        this.f38078k1 = arrayList7.size() - 1;
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
                    ArrayList arrayList13 = this.f38068a1;
                    arrayList13.clear();
                    ArrayList arrayList14 = this.f38069b1;
                    arrayList14.clear();
                    if (org.telegram.messenger.m5.z(this.E0)) {
                        TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i17).M0(Long.valueOf(-this.E0));
                        hcVar = org.telegram.messenger.hc.m(i17, 0, M0);
                        arrayList = arrayList8;
                        if (hcVar != null) {
                            arrayList.add(hcVar);
                            user = a22;
                            arrayList10.add(org.telegram.messenger.hc.m(i17, 1, M0));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = this.F0;
                            if (chatFull != null && org.telegram.messenger.w7.V(hcVar.f22856f, chatFull.chat_photo)) {
                                arrayList12.add(this.F0.chat_photo);
                                if (!this.F0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.F0.chat_photo.video_sizes);
                                    arrayList9.add(org.telegram.messenger.hc.j(x10, this.F0.chat_photo));
                                    z15 = false;
                                    arrayList6.add(org.telegram.messenger.w7.r(null, x10));
                                } else {
                                    z15 = false;
                                    arrayList9.add(null);
                                    arrayList6.add(null);
                                }
                            } else {
                                z15 = false;
                                arrayList12.add(null);
                                arrayList6.add(null);
                                arrayList9.add(null);
                            }
                            arrayList13.add(num2);
                            arrayList14.add(z15);
                        } else {
                            user = a22;
                        }
                    } else {
                        user = a22;
                        arrayList = arrayList8;
                        hcVar = null;
                    }
                    int i18 = 0;
                    while (true) {
                        int size = arrayList7.size();
                        i12 = i17;
                        z9 = this.J0;
                        if (i18 >= size) {
                            break;
                        }
                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i18);
                        if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                            i14 = i18;
                            arrayList2 = arrayList7;
                            arrayList3 = arrayList14;
                            hcVar2 = hcVar;
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
                            i14 = i18;
                            arrayList2 = arrayList7;
                            ArrayList arrayList15 = arrayList14;
                            TLRPC.PhotoSize w10 = org.telegram.messenger.w7.w(arrayList4, 50, false, null, false);
                            int size2 = photo2.sizes.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size2) {
                                    break;
                                }
                                TLRPC.PhotoSize photoSize2 = photo2.sizes.get(i19);
                                TLRPC.PhotoSize photoSize3 = w10;
                                if (photoSize2 instanceof TLRPC.TL_photoStrippedSize) {
                                    w10 = photoSize2;
                                    break;
                                } else {
                                    i19++;
                                    w10 = photoSize3;
                                }
                            }
                            if (hcVar != null) {
                                int size3 = photo2.sizes.size();
                                int i20 = 0;
                                while (i20 < size3) {
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i20).location;
                                    int i21 = size3;
                                    if (fileLocation != null) {
                                        int i22 = fileLocation.local_id;
                                        i15 = i20;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = hcVar.f22856f;
                                        hcVar2 = hcVar;
                                        if (i22 == tL_fileLocationToBeDeprecated.local_id) {
                                            num = num2;
                                            if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                                arrayList12.set(0, photo2);
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    arrayList9.set(0, org.telegram.messenger.hc.j(org.telegram.messenger.w7.x(1000, photo2.video_sizes), photo2));
                                                }
                                                arrayList3 = arrayList15;
                                            } else {
                                                i20 = i15 + 1;
                                                num2 = num;
                                                size3 = i21;
                                                hcVar = hcVar2;
                                            }
                                        }
                                    } else {
                                        i15 = i20;
                                        hcVar2 = hcVar;
                                    }
                                    num = num2;
                                    i20 = i15 + 1;
                                    num2 = num;
                                    size3 = i21;
                                    hcVar = hcVar2;
                                }
                            }
                            hcVar2 = hcVar;
                            num = num2;
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo2.sizes, 640, false, null, false);
                            if (w11 != null) {
                                int i23 = photo2.dc_id;
                                if (i23 != 0) {
                                    TLRPC.FileLocation fileLocation2 = w11.location;
                                    fileLocation2.dc_id = i23;
                                    fileLocation2.file_reference = photo2.file_reference;
                                }
                                org.telegram.messenger.hc i24 = org.telegram.messenger.hc.i(w11, photo2);
                                if (i24 != null) {
                                    org.telegram.messenger.hc hcVar3 = this.P0;
                                    if (hcVar3 != null && hcVar3.f22868s == i24.f22868s && !z9 && this.E0 != org.telegram.messenger.p10.i(i12).e()) {
                                        arrayList5.add(null);
                                        arrayList.add(this.P0);
                                        org.telegram.messenger.hc hcVar4 = this.Q0;
                                        if (hcVar4 == null) {
                                            hcVar4 = org.telegram.messenger.hc.i(w10, photo2);
                                        }
                                        arrayList10.add(hcVar4);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x11 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize S = org.telegram.messenger.w7.S(photo2);
                                            if (S != null) {
                                                user2 = user;
                                                if (user != null && user2.premium) {
                                                    z14 = true;
                                                } else {
                                                    z14 = false;
                                                }
                                                arrayList11.add(new y41(S, z14, 2));
                                                z13 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user2 = user;
                                                z13 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.hc.j(x11, photo2));
                                                arrayList6.add(org.telegram.messenger.w7.r(null, x11));
                                            }
                                        } else {
                                            user2 = user;
                                            z13 = false;
                                            arrayList11.add(this.R0);
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                        }
                                        arrayList12.add(z13);
                                        arrayList13.add(num);
                                        arrayList3 = arrayList15;
                                        arrayList3.add(z13);
                                        user = user2;
                                    } else {
                                        TLRPC.User user3 = user;
                                        arrayList.add(i24);
                                        if (w10 instanceof TLRPC.TL_photoStrippedSize) {
                                            photoSize = w11;
                                        } else {
                                            photoSize = w10;
                                        }
                                        arrayList5.add(org.telegram.messenger.w7.r(null, photoSize));
                                        arrayList10.add(org.telegram.messenger.hc.i(w10, photo2));
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x12 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize S2 = org.telegram.messenger.w7.S(photo2);
                                            if (S2 != null) {
                                                if (user3 != null && user3.premium) {
                                                    z12 = true;
                                                } else {
                                                    z12 = false;
                                                }
                                                user = user3;
                                                arrayList11.add(new y41(S2, z12, 2));
                                                z11 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user = user3;
                                                z11 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.hc.j(x12, photo2));
                                                arrayList6.add(org.telegram.messenger.w7.r(null, x12));
                                            }
                                        } else {
                                            user = user3;
                                            z11 = false;
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                            arrayList11.add(null);
                                        }
                                        arrayList12.add(photo2);
                                        arrayList13.add(Integer.valueOf(w11.size));
                                        arrayList3 = arrayList15;
                                        arrayList3.add(z11);
                                    }
                                }
                            }
                            arrayList3 = arrayList15;
                        }
                        i18 = i14 + 1;
                        arrayList14 = arrayList3;
                        num2 = num;
                        i17 = i12;
                        arrayList7 = arrayList2;
                        hcVar = hcVar2;
                    }
                    int size4 = arrayList10.size();
                    if (size4 > 1) {
                        int i25 = 0;
                        while (true) {
                            if (size4 > 2) {
                                i13 = 2;
                            } else {
                                i13 = 1;
                            }
                            if (i25 >= i13) {
                                break;
                            }
                            org.telegram.messenger.w7.G(i12).W((org.telegram.messenger.hc) arrayList10.get(i25 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                            i25++;
                        }
                    }
                    getAdapter().g();
                    if (z9) {
                        if (!this.H0 || this.f38073f1) {
                            L();
                        }
                    } else if (!this.H0 || this.f38073f1) {
                        L();
                        getAdapter().g();
                        B(0.0f, getRealPosition());
                    }
                    if (this.f38078k1 < 0 && this.f38077j1 < 0) {
                        z10 = false;
                        B(0.0f, 0);
                    } else {
                        z10 = false;
                    }
                    this.f38073f1 = z10;
                    of0 of0Var = this.G0;
                    if (of0Var != null) {
                        of0Var.c();
                    }
                    org.telegram.messenger.hc hcVar5 = this.f38082q1;
                    if (hcVar5 != null) {
                        A(hcVar5, this.f38083r1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i26 = org.telegram.messenger.qs.Y1;
        SparseArray sparseArray = this.f38071d1;
        if (i7 == i26) {
            String str = (String) objArr[0];
            for (int i27 = 0; i27 < arrayList5.size(); i27++) {
                String str2 = (String) arrayList6.get(i27);
                if (str2 == null) {
                    str2 = (String) arrayList5.get(i27);
                }
                if (str2 != null && TextUtils.equals(str, str2)) {
                    RadialProgress2 radialProgress2 = (RadialProgress2) sparseArray.get(i27);
                    if (radialProgress2 != null) {
                        radialProgress2.p(true, 1.0f);
                    }
                    invalidate();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.X1) {
            String str3 = (String) objArr[0];
            for (int i28 = 0; i28 < arrayList5.size(); i28++) {
                String str4 = (String) arrayList6.get(i28);
                if (str4 == null) {
                    str4 = (String) arrayList5.get(i28);
                }
                if (str4 != null && TextUtils.equals(str3, str4)) {
                    RadialProgress2 radialProgress22 = (RadialProgress2) sparseArray.get(i28);
                    if (radialProgress22 != null) {
                        radialProgress22.p(true, Math.min(1.0f, ((float) ((Long) objArr[1]).longValue()) / ((float) ((Long) objArr[2]).longValue())));
                    }
                    invalidate();
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f24962c0 && this.f38070c1 == 0 && (yoVar = this.S0) != null) {
            yoVar.f();
            org.telegram.messenger.yo yoVar3 = this.S0;
            int currentItem = getCurrentItem();
            rf0 rf0Var = this.D0;
            if (rf0Var != null) {
                i11 = rf0Var.j();
            } else {
                i11 = 0;
            }
            yoVar3.b(currentItem - i11, true);
        }
    }

    public kf0 getBlurDrawer() {
        return this.f38081p1;
    }

    public float getCurrentItemProgress() {
        v5 m10;
        l9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m10 = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m10.n();
    }

    public l9 getCurrentItemView() {
        rf0 rf0Var = this.D0;
        if (rf0Var != null && !rf0Var.f37724c.isEmpty()) {
            return ((pf0) rf0Var.f37724c.get(getCurrentItem())).f36998c;
        }
        return null;
    }

    public long getDialogId() {
        return this.E0;
    }

    public int getRealCount() {
        int size = this.V0.size();
        if (this.f38076i1) {
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
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        kf0 kf0Var = this.f38081p1;
        if (kf0Var != null) {
            kf0Var.setTranslationY(getHeight() - this.f38081p1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i7, int i10, int i11, int i12) {
        super.onSizeChanged(i7, i10, i11, i12);
        kf0 kf0Var = this.f38081p1;
        if (kf0Var != null) {
            kf0Var.G = true;
            kf0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        kf0 kf0Var = this.f38081p1;
        if (kf0Var != null) {
            kf0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(v5 v5Var) {
        rf0 rf0Var;
        if (v5Var != null && (rf0Var = this.D0) != null) {
            int childCount = getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                if ((childAt instanceof l9) && rf0Var.k(rf0Var.d.indexOf(childAt)) == 0) {
                    l9 l9Var = (l9) childAt;
                    v5 m10 = l9Var.getImageReceiver().m();
                    if (m10 != v5Var) {
                        if (m10 != null) {
                            m10.w(l9Var);
                        }
                        l9Var.setImageDrawable(v5Var);
                        v5Var.f(this);
                        v5Var.R = true;
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
            if (arrayList2.get(0) != null && org.telegram.messenger.w7.V(((org.telegram.messenger.hc) arrayList2.get(0)).f22856f, this.F0.chat_photo)) {
                arrayList.set(0, this.F0.chat_photo);
                boolean isEmpty = this.F0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.T0;
                ArrayList arrayList4 = this.W0;
                if (!isEmpty) {
                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.F0.chat_photo.video_sizes);
                    arrayList4.set(0, org.telegram.messenger.hc.j(x10, this.F0.chat_photo));
                    arrayList3.set(0, org.telegram.messenger.w7.r(null, x10));
                    of0 of0Var = this.G0;
                    if (of0Var != null) {
                        of0Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.f38069b1.set(0, null);
                this.D0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z9) {
        this.f38072e1 = z9;
    }

    public void setData(long j3) {
        M(j3, false);
    }

    public void setHasActiveVideo(boolean z9) {
        this.f38076i1 = z9;
    }

    public void setImagesLayerNum(int i7) {
        this.l1 = i7;
    }

    public void setInvalidateWithParent(boolean z9) {
        this.f38074g1 = z9;
    }

    public void setParentAvatarImage(l9 l9Var) {
        rf0 rf0Var = this.D0;
        if (rf0Var != null) {
            rf0Var.f37727g = l9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.er0 er0Var) {
        this.f38075h1 = er0Var;
    }

    @Override
    public void setVisibility(int i7) {
        super.setVisibility(i7);
        kf0 kf0Var = this.f38081p1;
        if (kf0Var != null) {
            kf0Var.setVisibility(i7);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public sf0(Context context, long j3, org.telegram.ui.ActionBar.k kVar, pj0 pj0Var, org.telegram.ui.wv0 wv0Var, of0 of0Var, kf0 kf0Var) {
        super(context);
        this.f38084x0 = new PointF();
        this.A0 = true;
        this.B0 = true;
        int i7 = org.telegram.messenger.p10.f24459s0;
        this.L0 = i7;
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
        this.f38068a1 = new ArrayList();
        this.f38069b1 = new ArrayList();
        this.f38071d1 = new SparseArray();
        this.f38072e1 = true;
        this.f38077j1 = -1;
        this.f38078k1 = -1;
        this.f38081p1 = kf0Var;
        setPadding(0, 0, 0, kf0Var == null ? 0 : kf0Var.f35279n);
        if (kf0Var != null) {
            kf0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.J0 = true;
        this.E0 = j3;
        this.C0 = pj0Var;
        this.f38086z0 = kVar;
        rf0 rf0Var = new rf0(this, getContext(), wv0Var);
        this.D0 = rf0Var;
        setAdapter((ep) rf0Var);
        this.f38085y0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.G0 = of0Var;
        b(new mf0((org.telegram.ui.zu0) this));
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24956b0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.Y1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.X1);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24962c0);
        org.telegram.messenger.qs.f(i7).c(this, org.telegram.messenger.qs.f24976e3);
        org.telegram.messenger.yo U0 = org.telegram.messenger.qp.s1(i7).U0(j3);
        this.S0 = U0;
        U0.h.getMessagesStorage().f26688a.c(new org.telegram.messenger.wo(U0, 0));
    }
}
