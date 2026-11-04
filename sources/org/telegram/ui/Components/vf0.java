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
public class vf0 extends fp implements org.telegram.messenger.cs {
    public final org.telegram.ui.ActionBar.k A0;
    public boolean B0;
    public boolean C0;
    public final tj0 D0;
    public final uf0 E0;
    public long F0;
    public TLRPC.ChatFull G0;
    public final rf0 H0;
    public boolean I0;
    public boolean J0;
    public final boolean K0;
    public org.telegram.messenger.ac L0;
    public final int M0;
    public final Path N0;
    public final RectF O0;
    public final float[] P0;
    public org.telegram.messenger.ac Q0;
    public org.telegram.messenger.ac R0;
    public x41 S0;
    public org.telegram.messenger.po T0;
    public final ArrayList U0;
    public final ArrayList V0;
    public final ArrayList W0;
    public final ArrayList X0;
    public final ArrayList Y0;
    public final ArrayList Z0;
    public final ArrayList f39092a1;
    public final ArrayList f39093b1;
    public final ArrayList f39094c1;
    public int f39095d1;
    public final SparseArray f39096e1;
    public boolean f39097f1;
    public boolean f39098g1;
    public boolean f39099h1;
    public org.telegram.ui.vq0 f39100i1;
    public boolean f39101j1;
    public int k1;
    public int f39102l1;
    public int m1;
    public int f39103n1;
    public int f39104o1;
    public int f39105p1;
    public nf0 f39106q1;
    public org.telegram.messenger.ac f39107r1;
    public org.telegram.messenger.ac f39108s1;
    public final PointF f39109y0;
    public final int f39110z0;

    public vf0(Context context, org.telegram.ui.ActionBar.k kVar, tj0 tj0Var, org.telegram.ui.s4 s4Var) {
        super(context);
        this.f39109y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.M0 = i3;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f39092a1 = new ArrayList();
        this.f39093b1 = new ArrayList();
        this.f39094c1 = new ArrayList();
        this.f39096e1 = new SparseArray();
        this.f39097f1 = true;
        this.k1 = -1;
        this.f39102l1 = -1;
        setOffscreenPageLimit(2);
        this.f39106q1 = null;
        this.K0 = false;
        this.D0 = tj0Var;
        ConnectionsManager.generateClassGuid();
        this.A0 = kVar;
        this.f39110z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = s4Var;
        b(new of0(this));
        uf0 uf0Var = new uf0(this, getContext(), null);
        this.E0 = uf0Var;
        setAdapter((ep) uf0Var);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23202b0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.X1);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23208c0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23222e3);
        this.T0 = null;
    }

    public final void A(org.telegram.messenger.ac acVar, org.telegram.messenger.ac acVar2) {
        this.Q0 = acVar;
        this.V0.add(0, null);
        this.U0.add(0, null);
        this.Y0.add(0, acVar);
        this.Z0.add(0, acVar2);
        this.f39092a1.add(0, null);
        this.X0.add(0, null);
        this.W0.add(0, null);
        this.f39093b1.add(0, -1);
        this.f39094c1.add(0, Float.valueOf(0.0f));
        this.E0.g();
        L();
        this.f39107r1 = acVar;
        this.f39108s1 = acVar2;
    }

    public final void B(float f10, int i3) {
        float f11;
        int i10 = this.k1;
        float f12 = 0.0f;
        if (i10 >= 0 || this.f39102l1 >= 0) {
            if (i10 < 0) {
                i10 = this.f39102l1;
            }
            int k10 = this.E0.k(i3);
            if (this.f39101j1) {
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

    public final org.telegram.messenger.ac C(org.telegram.messenger.ac acVar, org.telegram.messenger.ac acVar2) {
        ArrayList arrayList;
        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated;
        if (acVar == null) {
            return null;
        }
        for (int i3 = 0; i3 < 2; i3++) {
            if (i3 == 0) {
                arrayList = this.Z0;
            } else {
                arrayList = this.Y0;
            }
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.ac acVar3 = (org.telegram.messenger.ac) arrayList.get(i10);
                if (acVar3 != null && (tL_fileLocationToBeDeprecated = acVar3.f21488f) != null) {
                    int i11 = acVar3.f21484a;
                    if (i11 == acVar.f21484a) {
                        int i12 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated2 = acVar.f21488f;
                        if (i12 == tL_fileLocationToBeDeprecated2.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated2.volume_id) {
                            return (org.telegram.messenger.ac) this.X0.get(i10);
                        }
                    }
                    if (i11 == acVar2.f21484a) {
                        int i13 = tL_fileLocationToBeDeprecated.local_id;
                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated3 = acVar2.f21488f;
                        if (i13 == tL_fileLocationToBeDeprecated3.local_id && tL_fileLocationToBeDeprecated.volume_id == tL_fileLocationToBeDeprecated3.volume_id) {
                            return (org.telegram.messenger.ac) this.X0.get(i10);
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    public final org.telegram.messenger.ac D(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Y0;
            if (i3 < arrayList.size()) {
                org.telegram.messenger.ac acVar = (org.telegram.messenger.ac) this.X0.get(i3);
                if (acVar != null) {
                    return acVar;
                }
                return (org.telegram.messenger.ac) arrayList.get(i3);
            }
            return null;
        }
        return null;
    }

    public final View E(int i3) {
        uf0 uf0Var = this.E0;
        if (uf0Var != null) {
            ArrayList arrayList = uf0Var.f38733c;
            if (arrayList.size() > i3 && i3 >= 0) {
                sf0 sf0Var = (sf0) arrayList.get(i3);
                tf0 tf0Var = sf0Var.f38008b;
                if (tf0Var == null) {
                    return sf0Var.f38009c;
                }
                return tf0Var;
            }
            return null;
        }
        return null;
    }

    public final TLRPC.Photo F(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.W0;
            if (i3 < arrayList.size()) {
                return (TLRPC.Photo) arrayList.get(i3);
            }
            return null;
        }
        return null;
    }

    public final org.telegram.messenger.ac G(int i3) {
        if (i3 >= 0) {
            ArrayList arrayList = this.Y0;
            if (i3 < arrayList.size()) {
                return (org.telegram.messenger.ac) arrayList.get(i3);
            }
            return null;
        }
        return null;
    }

    public final boolean H(x41 x41Var, org.telegram.messenger.ac acVar, org.telegram.messenger.ac acVar2, boolean z10) {
        org.telegram.messenger.po poVar;
        int i3;
        org.telegram.messenger.po poVar2;
        int i10 = 0;
        if (acVar != null && acVar2 != null && this.f39095d1 == 0) {
            org.telegram.messenger.ac acVar3 = this.Q0;
            ArrayList arrayList = this.Y0;
            if (acVar3 == null || acVar3.f21488f.local_id != acVar.f21488f.local_id) {
                boolean isEmpty = arrayList.isEmpty();
                uf0 uf0Var = this.E0;
                if (!isEmpty) {
                    this.Q0 = acVar;
                    if (z10 && (poVar2 = this.T0) != null) {
                        poVar2.f();
                        org.telegram.messenger.po poVar3 = this.T0;
                        int currentItem = getCurrentItem();
                        if (uf0Var != null) {
                            i10 = uf0Var.j();
                        }
                        poVar3.b(currentItem - i10, true);
                    }
                    return true;
                } else if (z10 && (poVar = this.T0) != null) {
                    poVar.f();
                    org.telegram.messenger.po poVar4 = this.T0;
                    int currentItem2 = getCurrentItem();
                    if (uf0Var != null) {
                        i3 = uf0Var.j();
                    } else {
                        i3 = 0;
                    }
                    poVar4.b(currentItem2 - i3, true);
                }
            }
            if (arrayList.isEmpty()) {
                this.Q0 = acVar;
                this.R0 = acVar2;
                this.S0 = x41Var;
                this.V0.add(null);
                this.U0.add(null);
                arrayList.add(acVar);
                this.Z0.add(acVar2);
                this.f39092a1.add(x41Var);
                this.X0.add(null);
                this.W0.add(null);
                this.f39093b1.add(-1);
                this.f39094c1.add(null);
                getAdapter().g();
                L();
                return true;
            }
        }
        return false;
    }

    public final boolean I() {
        int realPosition = getRealPosition();
        if (this.f39101j1) {
            if (realPosition != 0) {
                realPosition--;
            } else {
                return false;
            }
        }
        if (realPosition >= 0) {
            ArrayList arrayList = this.X0;
            if (realPosition < arrayList.size() && arrayList.get(realPosition) != null) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean J() {
        int realPosition;
        k9 currentItemView;
        if (this.f39101j1) {
            realPosition = getRealPosition() - 1;
        } else {
            realPosition = getRealPosition();
        }
        if (this.X0.get(realPosition) != null && (currentItemView = getCurrentItemView()) != null) {
            t5 m10 = currentItemView.getImageReceiver().m();
            if (m10 == null || !m10.s()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K() {
        this.f39106q1 = null;
        int i3 = this.M0;
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23202b0);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(i3);
        int i10 = org.telegram.messenger.hs.X1;
        f10.n(this, i10);
        org.telegram.messenger.hs.f(i3).n(this, i10);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23208c0);
        org.telegram.messenger.hs.f(i3).n(this, org.telegram.messenger.hs.f23222e3);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt instanceof k9) {
                k9 k9Var = (k9) childAt;
                if (k9Var.getImageReceiver().f21256n0 != null) {
                    Drawable t10 = k9Var.getImageReceiver().t();
                    if (t10 instanceof t5) {
                        ((t5) t10).w(k9Var);
                    }
                }
            }
        }
    }

    public final void L() {
        x(this.E0.j(), false);
    }

    public final void M(long j10, boolean z10) {
        if (this.F0 == j10 && !z10) {
            L();
            return;
        }
        this.f39098g1 = true;
        this.U0.clear();
        this.V0.clear();
        this.W0.clear();
        this.X0.clear();
        this.Y0.clear();
        this.Z0.clear();
        this.f39093b1.clear();
        this.f39094c1.clear();
        this.E0.g();
        x(0, false);
        this.f39105p1 = 0;
        this.L0 = null;
        this.Q0 = null;
        this.F0 = j10;
        org.telegram.messenger.po U0 = org.telegram.messenger.hp.s1(this.M0).U0(j10);
        this.T0 = U0;
        U0.h.getMessagesStorage().f24934a.c(new org.telegram.messenger.no(U0, 0));
    }

    public final void N(int i3, int i10) {
        this.f39103n1 = i3;
        this.f39104o1 = i10;
        uf0 uf0Var = this.E0;
        if (uf0Var != null) {
            for (int i11 = 0; i11 < uf0Var.f38733c.size(); i11++) {
                if (((sf0) uf0Var.f38733c.get(i11)).f38009c != null) {
                    qf0 qf0Var = ((sf0) uf0Var.f38733c.get(i11)).f38009c;
                    int i12 = this.f39103n1;
                    int i13 = this.f39104o1;
                    qf0Var.t(i12, i12, i13, i13);
                }
            }
        }
    }

    public final void O(org.telegram.messenger.ac acVar, float f10) {
        if (acVar != null) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.Y0;
                if (i3 >= arrayList.size()) {
                    break;
                } else if (arrayList.get(i3) == acVar) {
                    this.f39094c1.set(i3, Float.valueOf(f10));
                    SparseArray sparseArray = this.f39096e1;
                    if (sparseArray.get(i3) != null) {
                        ((RadialProgress2) sparseArray.get(i3)).p(true, f10);
                    }
                } else {
                    i3++;
                }
            }
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                getChildAt(i10).invalidate();
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        org.telegram.messenger.po poVar;
        int i11;
        TLRPC.User user;
        ArrayList arrayList;
        org.telegram.messenger.ac acVar;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        ArrayList arrayList2;
        ArrayList arrayList3;
        org.telegram.messenger.ac acVar2;
        Integer num;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        TLRPC.PhotoSize photoSize;
        boolean z12;
        boolean z13;
        TLRPC.User user2;
        boolean z14;
        boolean z15;
        int i15;
        boolean z16;
        TLRPC.Photo photo;
        Integer num2 = -1;
        int i16 = org.telegram.messenger.hs.f23222e3;
        ArrayList arrayList5 = this.V0;
        ArrayList arrayList6 = this.U0;
        if (i3 == i16) {
            org.telegram.messenger.po poVar2 = (org.telegram.messenger.po) objArr[0];
            if (this.T0 == poVar2) {
                ArrayList arrayList7 = new ArrayList(poVar2.f24786b);
                if (!arrayList7.isEmpty() || !poVar2.f24787c) {
                    this.k1 = -1;
                    this.f39102l1 = -1;
                    int i17 = this.M0;
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(i17).a2(Long.valueOf(this.F0));
                    TLRPC.UserFull b22 = org.telegram.messenger.hp.s1(i17).b2(this.F0);
                    if (b22 != null && (photo = b22.personal_photo) != null) {
                        arrayList7.add(0, photo);
                        this.k1 = 0;
                    }
                    if (a22 != null && a22.self && org.telegram.messenger.l10.q(b22)) {
                        arrayList7.add(b22.fallback_photo);
                        this.f39102l1 = arrayList7.size() - 1;
                    }
                    arrayList5.clear();
                    arrayList6.clear();
                    ArrayList arrayList8 = this.Y0;
                    arrayList8.clear();
                    ArrayList arrayList9 = this.X0;
                    arrayList9.clear();
                    ArrayList arrayList10 = this.Z0;
                    arrayList10.clear();
                    ArrayList arrayList11 = this.f39092a1;
                    arrayList11.clear();
                    ArrayList arrayList12 = this.W0;
                    arrayList12.clear();
                    ArrayList arrayList13 = this.f39093b1;
                    arrayList13.clear();
                    ArrayList arrayList14 = this.f39094c1;
                    arrayList14.clear();
                    if (org.telegram.messenger.m5.z(this.F0)) {
                        TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i17).M0(Long.valueOf(-this.F0));
                        acVar = org.telegram.messenger.ac.m(i17, 0, M0);
                        arrayList = arrayList8;
                        if (acVar != null) {
                            arrayList.add(acVar);
                            user = a22;
                            arrayList10.add(org.telegram.messenger.ac.m(i17, 1, M0));
                            arrayList11.add(null);
                            arrayList5.add(null);
                            TLRPC.ChatFull chatFull = this.G0;
                            if (chatFull != null && org.telegram.messenger.w7.V(acVar.f21488f, chatFull.chat_photo)) {
                                arrayList12.add(this.G0.chat_photo);
                                if (!this.G0.chat_photo.video_sizes.isEmpty()) {
                                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.G0.chat_photo.video_sizes);
                                    arrayList9.add(org.telegram.messenger.ac.j(x10, this.G0.chat_photo));
                                    z16 = false;
                                    arrayList6.add(org.telegram.messenger.w7.r(null, x10));
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
                            user = a22;
                        }
                    } else {
                        user = a22;
                        arrayList = arrayList8;
                        acVar = null;
                    }
                    int i18 = 0;
                    while (true) {
                        int size = arrayList7.size();
                        i12 = i17;
                        z10 = this.K0;
                        if (i18 >= size) {
                            break;
                        }
                        TLRPC.Photo photo2 = (TLRPC.Photo) arrayList7.get(i18);
                        if (photo2 == null || (photo2 instanceof TLRPC.TL_photoEmpty) || (arrayList4 = photo2.sizes) == null) {
                            i14 = i18;
                            arrayList2 = arrayList7;
                            arrayList3 = arrayList14;
                            acVar2 = acVar;
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
                            if (acVar != null) {
                                int size3 = photo2.sizes.size();
                                int i20 = 0;
                                while (i20 < size3) {
                                    TLRPC.FileLocation fileLocation = photo2.sizes.get(i20).location;
                                    int i21 = size3;
                                    if (fileLocation != null) {
                                        int i22 = fileLocation.local_id;
                                        i15 = i20;
                                        TLRPC.TL_fileLocationToBeDeprecated tL_fileLocationToBeDeprecated = acVar.f21488f;
                                        acVar2 = acVar;
                                        if (i22 == tL_fileLocationToBeDeprecated.local_id) {
                                            num = num2;
                                            if (fileLocation.volume_id == tL_fileLocationToBeDeprecated.volume_id) {
                                                arrayList12.set(0, photo2);
                                                if (!photo2.video_sizes.isEmpty()) {
                                                    arrayList9.set(0, org.telegram.messenger.ac.j(org.telegram.messenger.w7.x(1000, photo2.video_sizes), photo2));
                                                }
                                                arrayList3 = arrayList15;
                                            } else {
                                                i20 = i15 + 1;
                                                num2 = num;
                                                size3 = i21;
                                                acVar = acVar2;
                                            }
                                        }
                                    } else {
                                        i15 = i20;
                                        acVar2 = acVar;
                                    }
                                    num = num2;
                                    i20 = i15 + 1;
                                    num2 = num;
                                    size3 = i21;
                                    acVar = acVar2;
                                }
                            }
                            acVar2 = acVar;
                            num = num2;
                            TLRPC.PhotoSize w11 = org.telegram.messenger.w7.w(photo2.sizes, 640, false, null, false);
                            if (w11 != null) {
                                int i23 = photo2.dc_id;
                                if (i23 != 0) {
                                    TLRPC.FileLocation fileLocation2 = w11.location;
                                    fileLocation2.dc_id = i23;
                                    fileLocation2.file_reference = photo2.file_reference;
                                }
                                org.telegram.messenger.ac i24 = org.telegram.messenger.ac.i(w11, photo2);
                                if (i24 != null) {
                                    org.telegram.messenger.ac acVar3 = this.Q0;
                                    if (acVar3 != null && acVar3.f21500s == i24.f21500s && !z10 && this.F0 != org.telegram.messenger.h10.i(i12).e()) {
                                        arrayList5.add(null);
                                        arrayList.add(this.Q0);
                                        org.telegram.messenger.ac acVar4 = this.R0;
                                        if (acVar4 == null) {
                                            acVar4 = org.telegram.messenger.ac.i(w10, photo2);
                                        }
                                        arrayList10.add(acVar4);
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x11 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize S = org.telegram.messenger.w7.S(photo2);
                                            if (S != null) {
                                                user2 = user;
                                                if (user != null && user2.premium) {
                                                    z15 = true;
                                                } else {
                                                    z15 = false;
                                                }
                                                arrayList11.add(new x41(S, z15, 2));
                                                z14 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user2 = user;
                                                z14 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.ac.j(x11, photo2));
                                                arrayList6.add(org.telegram.messenger.w7.r(null, x11));
                                            }
                                        } else {
                                            user2 = user;
                                            z14 = false;
                                            arrayList11.add(this.S0);
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
                                        arrayList.add(i24);
                                        if (w10 instanceof TLRPC.TL_photoStrippedSize) {
                                            photoSize = w11;
                                        } else {
                                            photoSize = w10;
                                        }
                                        arrayList5.add(org.telegram.messenger.w7.r(null, photoSize));
                                        arrayList10.add(org.telegram.messenger.ac.i(w10, photo2));
                                        if (!photo2.video_sizes.isEmpty()) {
                                            TLRPC.VideoSize x12 = org.telegram.messenger.w7.x(1000, photo2.video_sizes);
                                            TLRPC.VideoSize S2 = org.telegram.messenger.w7.S(photo2);
                                            if (S2 != null) {
                                                if (user3 != null && user3.premium) {
                                                    z13 = true;
                                                } else {
                                                    z13 = false;
                                                }
                                                user = user3;
                                                arrayList11.add(new x41(S2, z13, 2));
                                                z12 = false;
                                                arrayList9.add(null);
                                                arrayList6.add(null);
                                            } else {
                                                user = user3;
                                                z12 = false;
                                                arrayList11.add(null);
                                                arrayList9.add(org.telegram.messenger.ac.j(x12, photo2));
                                                arrayList6.add(org.telegram.messenger.w7.r(null, x12));
                                            }
                                        } else {
                                            user = user3;
                                            z12 = false;
                                            arrayList9.add(null);
                                            arrayList6.add(null);
                                            arrayList11.add(null);
                                        }
                                        arrayList12.add(photo2);
                                        arrayList13.add(Integer.valueOf(w11.size));
                                        arrayList3 = arrayList15;
                                        arrayList3.add(z12);
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
                        acVar = acVar2;
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
                            org.telegram.messenger.w7.G(i12).W((org.telegram.messenger.ac) arrayList10.get(i25 == 0 ? 1 : size4 - 1), null, null, 0, 1);
                            i25++;
                        }
                    }
                    getAdapter().g();
                    if (z10) {
                        if (!this.I0 || this.f39098g1) {
                            L();
                        }
                    } else if (!this.I0 || this.f39098g1) {
                        L();
                        getAdapter().g();
                        B(0.0f, getRealPosition());
                    }
                    if (this.f39102l1 < 0 && this.k1 < 0) {
                        z11 = false;
                        B(0.0f, 0);
                    } else {
                        z11 = false;
                    }
                    this.f39098g1 = z11;
                    rf0 rf0Var = this.H0;
                    if (rf0Var != null) {
                        rf0Var.c();
                    }
                    org.telegram.messenger.ac acVar5 = this.f39107r1;
                    if (acVar5 != null) {
                        A(acVar5, this.f39108s1);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        int i26 = org.telegram.messenger.hs.Y1;
        SparseArray sparseArray = this.f39096e1;
        if (i3 == i26) {
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
        } else if (i3 == org.telegram.messenger.hs.X1) {
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
        } else if (i3 == org.telegram.messenger.hs.f23208c0 && this.f39095d1 == 0 && (poVar = this.T0) != null) {
            poVar.f();
            org.telegram.messenger.po poVar3 = this.T0;
            int currentItem = getCurrentItem();
            uf0 uf0Var = this.E0;
            if (uf0Var != null) {
                i11 = uf0Var.j();
            } else {
                i11 = 0;
            }
            poVar3.b(currentItem - i11, true);
        }
    }

    public nf0 getBlurDrawer() {
        return this.f39106q1;
    }

    public float getCurrentItemProgress() {
        t5 m10;
        k9 currentItemView = getCurrentItemView();
        if (currentItemView == null || (m10 = currentItemView.getImageReceiver().m()) == null) {
            return 0.0f;
        }
        return m10.n();
    }

    public k9 getCurrentItemView() {
        uf0 uf0Var = this.E0;
        if (uf0Var != null && !uf0Var.f38733c.isEmpty()) {
            return ((sf0) uf0Var.f38733c.get(getCurrentItem())).f38009c;
        }
        return null;
    }

    public long getDialogId() {
        return this.F0;
    }

    public int getRealCount() {
        int size = this.W0.size();
        if (this.f39101j1) {
            return size + 1;
        }
        return size;
    }

    public int getRealPosition() {
        return this.E0.k(getCurrentItem());
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.D0.getScrollState() != 0) {
            return false;
        }
        if (getParent() != null && getParent().getParent() != null) {
            getParent().getParent().requestDisallowInterceptTouchEvent(canScrollHorizontally(-1));
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        nf0 nf0Var = this.f39106q1;
        if (nf0Var != null) {
            nf0Var.setTranslationY(getHeight() - this.f39106q1.getMeasuredHeight());
        }
    }

    @Override
    public final void onSizeChanged(int i3, int i10, int i11, int i12) {
        super.onSizeChanged(i3, i10, i11, i12);
        nf0 nf0Var = this.f39106q1;
        if (nf0Var != null) {
            nf0Var.H = true;
            nf0Var.postInvalidateOnAnimation();
        }
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.vf0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override
    public void setAlpha(float f10) {
        super.setAlpha(f10);
        nf0 nf0Var = this.f39106q1;
        if (nf0Var != null) {
            nf0Var.setAlpha(f10);
        }
    }

    public void setAnimatedFileMaybe(t5 t5Var) {
        uf0 uf0Var;
        if (t5Var != null && (uf0Var = this.E0) != null) {
            int childCount = getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = getChildAt(i3);
                if ((childAt instanceof k9) && uf0Var.k(uf0Var.d.indexOf(childAt)) == 0) {
                    k9 k9Var = (k9) childAt;
                    t5 m10 = k9Var.getImageReceiver().m();
                    if (m10 != t5Var) {
                        if (m10 != null) {
                            m10.w(k9Var);
                        }
                        k9Var.setImageDrawable(t5Var);
                        t5Var.f(this);
                        t5Var.S = true;
                    }
                }
            }
        }
    }

    public void setChatInfo(TLRPC.ChatFull chatFull) {
        this.G0 = chatFull;
        ArrayList arrayList = this.W0;
        if (!arrayList.isEmpty() && arrayList.get(0) == null && this.G0 != null) {
            ArrayList arrayList2 = this.Y0;
            if (arrayList2.get(0) != null && org.telegram.messenger.w7.V(((org.telegram.messenger.ac) arrayList2.get(0)).f21488f, this.G0.chat_photo)) {
                arrayList.set(0, this.G0.chat_photo);
                boolean isEmpty = this.G0.chat_photo.video_sizes.isEmpty();
                ArrayList arrayList3 = this.U0;
                ArrayList arrayList4 = this.X0;
                if (!isEmpty) {
                    TLRPC.VideoSize x10 = org.telegram.messenger.w7.x(1000, this.G0.chat_photo.video_sizes);
                    arrayList4.set(0, org.telegram.messenger.ac.j(x10, this.G0.chat_photo));
                    arrayList3.set(0, org.telegram.messenger.w7.r(null, x10));
                    rf0 rf0Var = this.H0;
                    if (rf0Var != null) {
                        rf0Var.c();
                    }
                } else {
                    arrayList4.set(0, null);
                    arrayList3.add(0, null);
                }
                this.f39094c1.set(0, null);
                this.E0.g();
            }
        }
    }

    public void setCreateThumbFromParent(boolean z10) {
        this.f39097f1 = z10;
    }

    public void setData(long j10) {
        M(j10, false);
    }

    public void setHasActiveVideo(boolean z10) {
        this.f39101j1 = z10;
    }

    public void setImagesLayerNum(int i3) {
        this.m1 = i3;
    }

    public void setInvalidateWithParent(boolean z10) {
        this.f39099h1 = z10;
    }

    public void setParentAvatarImage(k9 k9Var) {
        uf0 uf0Var = this.E0;
        if (uf0Var != null) {
            uf0Var.f38736g = k9Var;
        }
    }

    public void setPinchToZoomHelper(org.telegram.ui.vq0 vq0Var) {
        this.f39100i1 = vq0Var;
    }

    @Override
    public void setVisibility(int i3) {
        super.setVisibility(i3);
        nf0 nf0Var = this.f39106q1;
        if (nf0Var != null) {
            nf0Var.setVisibility(i3);
        }
    }

    public void setCustomAvatarProgress(float f10) {
    }

    public vf0(Context context, long j10, org.telegram.ui.ActionBar.k kVar, tj0 tj0Var, org.telegram.ui.nv0 nv0Var, rf0 rf0Var, nf0 nf0Var) {
        super(context);
        this.f39109y0 = new PointF();
        this.B0 = true;
        this.C0 = true;
        int i3 = org.telegram.messenger.h10.f22829t0;
        this.M0 = i3;
        this.N0 = new Path();
        this.O0 = new RectF();
        this.P0 = new float[8];
        this.U0 = new ArrayList();
        this.V0 = new ArrayList();
        this.W0 = new ArrayList();
        this.X0 = new ArrayList();
        this.Y0 = new ArrayList();
        this.Z0 = new ArrayList();
        this.f39092a1 = new ArrayList();
        this.f39093b1 = new ArrayList();
        this.f39094c1 = new ArrayList();
        this.f39096e1 = new SparseArray();
        this.f39097f1 = true;
        this.k1 = -1;
        this.f39102l1 = -1;
        this.f39106q1 = nf0Var;
        setPadding(0, 0, 0, nf0Var == null ? 0 : nf0Var.f36503n);
        if (nf0Var != null) {
            nf0Var.setView(this);
        }
        setVisibility(8);
        setOverScrollMode(2);
        setOffscreenPageLimit(2);
        this.K0 = true;
        this.F0 = j10;
        this.D0 = tj0Var;
        this.A0 = kVar;
        uf0 uf0Var = new uf0(this, getContext(), nv0Var);
        this.E0 = uf0Var;
        setAdapter((ep) uf0Var);
        this.f39110z0 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.H0 = rf0Var;
        b(new pf0((org.telegram.ui.ru0) this));
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23202b0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.Y1);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.X1);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23208c0);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.f23222e3);
        org.telegram.messenger.po U0 = org.telegram.messenger.hp.s1(i3).U0(j10);
        this.T0 = U0;
        U0.h.getMessagesStorage().f24934a.c(new org.telegram.messenger.no(U0, 0));
    }
}
