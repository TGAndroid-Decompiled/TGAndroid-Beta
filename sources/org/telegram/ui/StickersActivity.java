package org.telegram.ui;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.util.LongSparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.StickersActivity;
public class StickersActivity extends org.telegram.ui.ActionBar.d implements gk7 {
    public q5c a;
    private int archivedRow;
    public xe2 b;
    public p1c c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public xha h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final byte s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final a0b y;

    public StickersActivity(int i, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new a0b(this, (byte) 0);
        this.s = i;
        this.w = arrayList;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(bkb.Ki));
        hashSet.add(Integer.valueOf(bkb.Li));
        hashSet.add(Integer.valueOf(bkb.y6));
        hashSet.add(Integer.valueOf(bkb.F6));
        hashSet.add(Integer.valueOf(bkb.H6));
        hashSet.add(Integer.valueOf(bkb.I6));
        hashSet.add(Integer.valueOf(bkb.A6));
        hashSet.add(Integer.valueOf(bkb.c7));
        hashSet.add(Integer.valueOf(bkb.h6));
        hashSet.add(Integer.valueOf(bkb.y8));
        hashSet.add(Integer.valueOf(bkb.x8));
        hashSet.add(Integer.valueOf(bkb.s8));
        hashSet.add(Integer.valueOf(bkb.z8));
        hashSet.add(Integer.valueOf(bkb.u8));
        hashSet.add(Integer.valueOf(bkb.r8));
    }

    public final CharSequence b0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new ui(this, (byte) 3), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                fa4.g(e, true);
            }
        }
        return str;
    }

    public final void c0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean x = this.simpleActionBar.x();
        int i = 0;
        if (size > 0) {
            if (hashSet.size() > 0) {
                ArrayList arrayList = this.d;
                int size2 = arrayList.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size2) {
                        break;
                    }
                    Object obj = arrayList.get(i2);
                    i2++;
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (hashSet.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet.official && !stickerSet.emojis) {
                            i = 8;
                            break;
                        }
                    }
                }
                if (this.h.getVisibility() != i) {
                    this.h.setVisibility(i);
                }
            }
            this.simpleActionBar.F(size, x);
            if (!x) {
                this.simpleActionBar.J();
                this.a.z1(true);
                if (!gba.Q && this.s != 5) {
                    gba.Q = true;
                    SharedPreferences.Editor edit = na7.c1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", gba.Q);
                    edit.apply();
                    m21.g(this, new h79(getParentActivity(), k96.M0(2131744613, null)), 3250).j();
                }
            }
        } else if (x) {
            this.simpleActionBar.w();
            this.a.z1(false);
            o0();
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ed0(false));
        byte b = this.s;
        if (b == 0) {
            this.simpleActionBar.setTitle(k96.M0(2131744620, null));
        } else if (b == 1) {
            this.simpleActionBar.setTitle(k96.M0(2131748487, null));
        } else if (b == 5) {
            this.simpleActionBar.setTitle(k96.M0(2131751184, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new kk8(this, (byte) 16));
        wha q = this.simpleActionBar.q();
        q.b(2, 2131232368, null, null, gl.L(54.0f), null);
        q.b(0, 2131232056, null, null, gl.L(54.0f), null);
        this.h = q.b(1, 2131232113, null, null, gl.L(54.0f), null);
        if (b == 5 && (arrayList = this.w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(na7.q1(this.currentAccount).u0(hq6.d0(this.currentAccount).t0(b)));
        }
        this.e = f0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        q5c q5cVar = new q5c(this, new i8c(this) {
            public final StickersActivity b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b2 = r2;
                StickersActivity stickersActivity = this.b;
                switch (b2) {
                    case 0:
                        stickersActivity.e0((ArrayList) obj, (l5c) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        return;
                }
            }
        }, new d0b(this), new d0b(this));
        this.a = q5cVar;
        q5cVar.r1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        this.a.E1(new i8c(this) {
            public final StickersActivity b;

            {
                this.b = this;
            }

            @Override
            public final void a(Object obj, Object obj2) {
                byte b2 = r2;
                StickersActivity stickersActivity = this.b;
                switch (b2) {
                    case 0:
                        stickersActivity.e0((ArrayList) obj, (l5c) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        return;
                }
            }
        }, false);
        xe2 xe2Var = new xe2((byte) 6, this, false);
        this.b = xe2Var;
        xe2Var.i1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, nme.c(-1.0f, -1));
        return this.fragmentView;
    }

    public final void d0() {
        this.x.clear();
        this.a.g3.O(true);
        c0();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = kk7.w0;
        byte b = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == b) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i != kk7.y0 && i != kk7.z0) {
            if (i == kk7.Y0 && ((Integer) objArr[0]).intValue() == b) {
                this.a.g3.O(true);
            }
        } else {
            this.a.g3.O(true);
        }
    }

    public final void e0(java.util.ArrayList r19, defpackage.l5c r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.StickersActivity.e0(java.util.ArrayList, l5c):void");
    }

    public final ArrayList f0() {
        hq6 d0 = hq6.d0(this.currentAccount);
        ArrayList[] arrayListArr = d0.t0;
        if (this.s == 5) {
            ArrayList arrayList = new ArrayList(arrayListArr[1]);
            int i = 0;
            while (i < arrayList.size()) {
                if (arrayList.get(i) == null || d0.D0(((TLRPC.StickerSetCovered) arrayList.get(i)).set.id, false)) {
                    arrayList.remove(i);
                    i--;
                }
                i++;
            }
            return arrayList;
        }
        return arrayListArr[0];
    }

    public final String g0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String str;
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(na7.q1(this.currentAccount).N2);
        sb.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, b00.j(sb, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    @Override
    public final o39 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = bkb.c6;
        arrayList.add(new blb(this.a, 16, new Class[]{rza.class, uib.class, ahb.class}, (Paint) null, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.L6));
        arrayList.add(new blb(this.a, 0, new Class[]{ahb.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.M6));
        arrayList.add(new blb(this.a, 8192, new Class[]{rza.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, i));
        arrayList.add(new blb(this.a, 16384, new Class[]{rza.class}, new String[]{"checkBox"}, (Drawable[]) null, (alb) null, bkb.j7));
        p1c p1cVar = this.c;
        if (p1cVar != null) {
            arrayList.addAll(p1cVar.S());
        }
        return arrayList;
    }

    public final void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        hq6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i;
        hq6 d0 = hq6.d0(this.currentAccount);
        Activity parentActivity = getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i = 1;
        } else {
            i = 2;
        }
        d0.h2(parentActivity, tL_messages_stickerSet, i, this, true, true);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(int i, ArrayList arrayList) {
        int i2;
        final byte b;
        ArrayList[] arrayListArr;
        boolean z;
        int i3;
        boolean z2;
        d0();
        final hq6 d0 = hq6.d0(this.currentAccount);
        boolean z3 = true;
        if (i == 1) {
            i2 = 0;
        } else {
            i2 = 1;
        }
        long[] jArr = d0.Y;
        ArrayList[] arrayListArr2 = d0.H;
        int size = arrayList.size();
        ArrayList<TLRPC.InputStickerSet> arrayList2 = new ArrayList<>(size);
        int i4 = 0;
        while (true) {
            b = this.s;
            if (i4 >= size) {
                break;
            }
            TLRPC.StickerSet stickerSet = (TLRPC.StickerSet) arrayList.get(i4);
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
            tL_inputStickerSetID.access_hash = stickerSet.access_hash;
            tL_inputStickerSetID.id = stickerSet.id;
            arrayList2.add(tL_inputStickerSetID);
            if (i2 != 0) {
                if (i2 == z3) {
                    z2 = z3;
                } else {
                    z2 = false;
                }
                stickerSet.archived = z2;
            }
            int size2 = arrayListArr2[b].size();
            int i5 = 0;
            while (true) {
                if (i5 < size2) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayListArr2[b].get(i5);
                    z = z3;
                    i3 = i2;
                    byte b2 = b;
                    arrayListArr = arrayListArr2;
                    if (tL_messages_stickerSet.set.id == tL_inputStickerSetID.id) {
                        arrayListArr[b2].remove(i5);
                        d0.J.l(tL_messages_stickerSet.set.id);
                        d0.K.l(tL_messages_stickerSet.set.id);
                        d0.O.remove(tL_messages_stickerSet.set.short_name);
                        break;
                    }
                    i5++;
                    i2 = i3;
                    arrayListArr2 = arrayListArr;
                    z3 = z;
                    b = b2;
                } else {
                    arrayListArr = arrayListArr2;
                    z = z3;
                    i3 = i2;
                    break;
                }
            }
            i4++;
            i2 = i3;
            arrayListArr2 = arrayListArr;
            z3 = z;
        }
        ArrayList[] arrayListArr3 = arrayListArr2;
        boolean z4 = z3;
        final int i6 = i2;
        long s = hq6.s(arrayListArr3[b]);
        jArr[b] = s;
        d0.M1(b, d0.Z[b], s, arrayListArr3[b]);
        kk7 notificationCenter = d0.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(b);
        objArr[z4 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(kk7.w0, objArr);
        TLRPC.TL_messages_toggleStickerSets tL_messages_toggleStickerSets = new TLRPC.TL_messages_toggleStickerSets();
        tL_messages_toggleStickerSets.stickersets = arrayList2;
        if (i6 != 0) {
            if (i6 == z4) {
                tL_messages_toggleStickerSets.archive = z4;
            }
        } else {
            tL_messages_toggleStickerSets.uninstall = z4;
        }
        d0.getConnectionsManager().sendRequest(tL_messages_toggleStickerSets, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final hq6 hq6Var = hq6.this;
                boolean z5 = i6;
                final StickersActivity stickersActivity = this;
                final byte b3 = b;
                final int i7 = z5 ? 1 : 0;
                gl.d3(new Runnable() {
                    @Override
                    public final void run() {
                        hq6 hq6Var2 = hq6.this;
                        boolean z6 = i7;
                        byte b4 = b3;
                        if (z6) {
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                hq6Var2.C1(stickersActivity, true, b4, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                            }
                            hq6Var2.c1(b4, false, false, true, null);
                            return;
                        }
                        hq6Var2.b1(b4, false, true);
                    }
                });
            }
        });
    }

    public final void k0(c4c c4cVar, View view) {
        boolean z;
        boolean z2;
        Object obj = c4cVar.H;
        if (obj instanceof TLRPC.TL_messages_stickerSet) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
            if (this.x.isEmpty()) {
                ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                if (arrayList != null && !arrayList.isEmpty()) {
                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                    if (stickerSet != null && stickerSet.emojis) {
                        ArrayList arrayList2 = new ArrayList();
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                        tL_inputStickerSetID.id = stickerSet2.id;
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        arrayList2.add(tL_inputStickerSetID);
                        showDialog(new qx3(this, getParentActivity(), getResourceProvider(), arrayList2));
                        return;
                    }
                    showDialog(new u0b(getParentActivity(), this, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            q0((rza) view);
            return;
        }
        boolean z3 = obj instanceof TLRPC.StickerSetCovered;
        byte b = this.s;
        boolean z4 = true;
        if (z3) {
            TLRPC.TL_inputStickerSetID tL_inputStickerSetID2 = new TLRPC.TL_inputStickerSetID();
            TLRPC.StickerSet stickerSet3 = ((TLRPC.StickerSetCovered) obj).set;
            tL_inputStickerSetID2.id = stickerSet3.id;
            tL_inputStickerSetID2.access_hash = stickerSet3.access_hash;
            if (b == 5) {
                ArrayList arrayList3 = new ArrayList(1);
                arrayList3.add(tL_inputStickerSetID2);
                showDialog(new qx3(this, getParentActivity(), getResourceProvider(), arrayList3));
                return;
            }
            showDialog(new u0b(getParentActivity(), this, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (c4cVar.d) {
            case 1:
            case 8:
                if (b == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList f0 = f0();
                    if (f0 != null) {
                        for (int i = 0; i < f0.size(); i++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) f0.get(i);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    hq6.d0(this.currentAccount).e1(true, true);
                    showDialog(new qx3(this, getParentActivity(), getResourceProvider(), arrayList4));
                    return;
                }
                p1c p1cVar = new p1c(getParentActivity(), this, new d2c(getParentActivity(), new e0b(this), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                this.c = p1cVar;
                p1cVar.show();
                return;
            case 2:
                presentFragment(new hs(b));
                return;
            case 3:
                presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                presentFragment(new y09());
                return;
            case 5:
                cs5 I = cs5.I(this, view);
                if (gba.D == 0) {
                    z = true;
                } else {
                    z = false;
                }
                I.h(new uc(view, (byte) 7), k96.M0(2131744160, null), z);
                if (gba.D == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                I.h(new uc(view, (byte) 8), k96.M0(2131744159, null), z2);
                if (gba.D != 2) {
                    z4 = false;
                }
                I.h(new uc(view, (byte) 9), k96.M0(2131744158, null), z4);
                I.a0();
                return;
            case 6:
                gba.Q0 = !gba.Q0;
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putBoolean("allowBigEmoji", gba.Q0);
                edit.apply();
                ((ahb) view).setChecked(gba.Q0);
                return;
            case 7:
                gba.N();
                ((ahb) view).setChecked(gba.W);
                return;
            case 9:
                gba.E = !gba.E;
                SharedPreferences.Editor edit2 = na7.c1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", gba.E);
                edit2.apply();
                ((ahb) view).setChecked(gba.E);
                return;
            default:
                return;
        }
    }

    public final void l0(View view) {
        i84 i84Var = (i84) view.getParent();
        TLRPC.StickerSetCovered stickerSet = i84Var.getStickerSet();
        Long valueOf = Long.valueOf(stickerSet.set.id);
        ArrayList arrayList = this.f;
        if (arrayList.contains(valueOf)) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        i84Var.f.a(true, true);
        boolean z = i84Var.w;
        int i = this.currentAccount;
        if (z) {
            hq6.d0(i).h2(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            hq6.d0(i).h2(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    public final void m0(View view) {
        rza rzaVar;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof rza) && (stickersSet = (rzaVar = (rza) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i = 0;
                if (rzaVar.E == view) {
                    ArrayList arrayList = getMediaDataController().t0[1];
                    while (true) {
                        if (i < arrayList.size()) {
                            if (stickersSet.set.id == ((TLRPC.StickerSetCovered) arrayList.get(i)).set.id) {
                                stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i);
                                break;
                            }
                            i++;
                        } else {
                            stickerSetCovered = null;
                            break;
                        }
                    }
                    if (stickerSetCovered != null) {
                        Long valueOf = Long.valueOf(stickerSetCovered.set.id);
                        ArrayList arrayList2 = this.f;
                        if (!arrayList2.contains(valueOf)) {
                            arrayList2.add(Long.valueOf(stickerSetCovered.set.id));
                        } else {
                            return;
                        }
                    }
                    hq6 d0 = hq6.d0(this.currentAccount);
                    Activity parentActivity = getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    d0.h2(parentActivity, stickerSetCovered2, 2, this, false, false);
                } else if (rzaVar.F == view) {
                    hq6.d0(this.currentAccount).h2(getParentActivity(), stickersSet, 0, this, false, true);
                } else if (rzaVar.G == view) {
                    showDialog(new jh8((org.telegram.ui.ActionBar.d) this, 11, false));
                }
            }
        }
    }

    public final void n0(int i) {
        StickersActivity stickersActivity;
        int i2;
        String M0;
        TextView textView;
        int i3 = 0;
        if (i == 2) {
            StringBuilder sb = new StringBuilder();
            int size = this.d.size();
            for (int i4 = 0; i4 < size; i4++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) this.d.get(i4);
                if (this.x.contains(Long.valueOf(tL_messages_stickerSet.set.id))) {
                    if (sb.length() != 0) {
                        sb.append("\n");
                    }
                    sb.append(g0(tL_messages_stickerSet));
                }
            }
            String sb2 = sb.toString();
            taa G0 = taa.G0(this.fragmentView.getContext(), null, sb2, false, sb2);
            G0.n2 = new u39(this, (byte) 16);
            G0.show();
        } else if (i == 0 || i == 1) {
            ArrayList arrayList = new ArrayList(this.x.size());
            int size2 = this.d.size();
            for (int i5 = 0; i5 < size2; i5++) {
                TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = (TLRPC.TL_messages_stickerSet) this.d.get(i5);
                if (this.x.contains(Long.valueOf(tL_messages_stickerSet2.set.id))) {
                    arrayList.add(tL_messages_stickerSet2.set);
                }
            }
            int size3 = arrayList.size();
            if (size3 != 0) {
                if (size3 != 1) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
                    if (i == 1) {
                        alertDialog$Builder.a.S = k96.a0(null, null, 2131751482, k96.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = k96.a0(null, null, 2131751481, Integer.valueOf(size3));
                        M0 = k96.M0(2131751586, null);
                    } else {
                        alertDialog$Builder.a.S = k96.a0(null, null, 2131754139, k96.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = k96.a0(null, null, 2131754138, Integer.valueOf(size3));
                        M0 = k96.M0(2131754169, null);
                    }
                    alertDialog$Builder.j(M0, new zf(this, arrayList, i, (byte) 15));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    hd hdVar = alertDialog$Builder.a;
                    showDialog(hdVar);
                    if (i == 1 && (textView = (TextView) hdVar.c(-1)) != null) {
                        zkb.X(textView, bkb.p7, null);
                        return;
                    }
                    return;
                }
                int size4 = this.d.size();
                while (true) {
                    if (i3 < size4) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet3 = (TLRPC.TL_messages_stickerSet) this.d.get(i3);
                        if (this.x.contains(Long.valueOf(tL_messages_stickerSet3.set.id))) {
                            if (i == 0) {
                                hq6 d0 = hq6.d0(this.currentAccount);
                                Activity parentActivity = getParentActivity();
                                if (!tL_messages_stickerSet3.set.archived) {
                                    i2 = 1;
                                } else {
                                    i2 = 2;
                                }
                                stickersActivity = this;
                                d0.h2(parentActivity, tL_messages_stickerSet3, i2, stickersActivity, true, true);
                            } else {
                                stickersActivity = this;
                                if (i == 1) {
                                    hq6.d0(stickersActivity.currentAccount).h2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity, true, true);
                                } else if (i == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity.g0(tL_messages_stickerSet3));
                                        stickersActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, k96.M0(2131744609, null)), 500);
                                    } catch (Exception e) {
                                        fa4.g(e, true);
                                    }
                                } else if (i == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity.g0(tL_messages_stickerSet3)));
                                        u21.j(stickersActivity).j();
                                    } catch (Exception e2) {
                                        fa4.g(e2, true);
                                    }
                                } else if (i == 4) {
                                    HashSet hashSet = stickersActivity.x;
                                    boolean contains = hashSet.contains(Long.valueOf(tL_messages_stickerSet3.set.id));
                                    TLRPC.StickerSet stickerSet = tL_messages_stickerSet3.set;
                                    if (contains) {
                                        hashSet.remove(Long.valueOf(stickerSet.id));
                                    } else {
                                        hashSet.add(Long.valueOf(stickerSet.id));
                                    }
                                    stickersActivity.a.g3.O(true);
                                    stickersActivity.c0();
                                }
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        stickersActivity = this;
                        break;
                    }
                }
                stickersActivity.d0();
            }
        }
    }

    public final void o0() {
        boolean z;
        boolean z2;
        if (this.r) {
            this.r = false;
            hq6 d0 = hq6.d0(this.currentAccount);
            long[] jArr = d0.Y;
            ArrayList[] arrayListArr = d0.H;
            byte b = this.s;
            jArr[b] = hq6.s(arrayListArr[b]);
            this.n++;
            TLRPC.TL_messages_reorderStickerSets tL_messages_reorderStickerSets = new TLRPC.TL_messages_reorderStickerSets();
            if (b == 1) {
                z = true;
            } else {
                z = false;
            }
            tL_messages_reorderStickerSets.masks = z;
            if (b == 5) {
                z2 = true;
            } else {
                z2 = false;
            }
            tL_messages_reorderStickerSets.emojis = z2;
            int i = 0;
            while (i < this.d.size()) {
                i = mue.c(i, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new wx9(this, (byte) 5));
            kk7.f(this.currentAccount).k(kk7.w0, Integer.valueOf(b), Boolean.TRUE);
            if (gba.W) {
                gba.N();
                u21.b0(this).I(2131624018, k96.M0(2131751325, null), k96.M0(2131751324, null)).j();
                this.a.g3.O(true);
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.x.isEmpty()) {
            if (z) {
                d0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        hq6 d0 = hq6.d0(this.currentAccount);
        byte b = this.s;
        d0.D(b);
        if (b == 0) {
            hq6.d0(this.currentAccount).z();
            hq6.d0(this.currentAccount).D(1);
            hq6.d0(this.currentAccount).D(5);
        } else if (b == 6) {
            hq6.d0(this.currentAccount).y();
            kk7.f(this.currentAccount).b(this, kk7.z0);
        }
        kk7.f(this.currentAccount).b(this, kk7.w0);
        kk7.f(this.currentAccount).b(this, kk7.Y0);
        kk7.f(this.currentAccount).b(this, kk7.y0);
        kk7.f(this.currentAccount).b(this, kk7.h5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            kk7.f(this.currentAccount).n(this, kk7.z0);
        }
        kk7.f(this.currentAccount).n(this, kk7.w0);
        kk7.f(this.currentAccount).n(this, kk7.Y0);
        kk7.f(this.currentAccount).n(this, kk7.y0);
        kk7.f(this.currentAccount).n(this, kk7.h5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q5c q5cVar = this.a;
        if (q5cVar != null) {
            q5cVar.g3.O(true);
        }
    }

    public final void p0(View view) {
        if (view instanceof uib) {
            uib uibVar = (uib) view;
            String S = hq6.d0(this.currentAccount).S();
            if (S != null) {
                if (S.startsWith("animated_")) {
                    try {
                        vl m = vl.m(this.currentAccount, Long.parseLong(S.substring(9)), null, 2);
                        m.b(uibVar.getValueBackupImageView());
                        uibVar.getValueBackupImageView().setImageDrawable(m);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hq6.d0(this.currentAccount).r.get(S);
                if (tL_availableReaction != null) {
                    uibVar.getValueBackupImageView().getImageReceiver().d0(gl5.b(tL_availableReaction.center_icon), "100_100_lastreactframe", uo3.d(tL_availableReaction.static_icon.thumbs, bkb.Z6, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public final void q0(rza rzaVar) {
        TLRPC.TL_messages_stickerSet stickersSet = rzaVar.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            rzaVar.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            rzaVar.b(true, true);
        }
        this.a.g3.O(true);
        c0();
    }

    public final void r0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = ((c4c) obj).H;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.d = arrayList2;
        this.r = true;
        Collections.sort(hq6.d0(this.currentAccount).t0(this.s), new bz0(this, (byte) 6));
        a0b a0bVar = this.y;
        gl.r(a0bVar);
        gl.e3(a0bVar, 1000L);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
