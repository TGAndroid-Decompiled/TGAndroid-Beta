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
public class StickersActivity extends org.telegram.ui.ActionBar.d implements jm7 {
    public q7c a;
    private int archivedRow;
    public jg2 b;
    public p3c c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public zja h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final byte s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final b2b y;

    public StickersActivity(int i, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new b2b(this, (byte) 0);
        this.s = i;
        this.w = arrayList;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(cmb.Ki));
        hashSet.add(Integer.valueOf(cmb.Li));
        hashSet.add(Integer.valueOf(cmb.y6));
        hashSet.add(Integer.valueOf(cmb.F6));
        hashSet.add(Integer.valueOf(cmb.H6));
        hashSet.add(Integer.valueOf(cmb.I6));
        hashSet.add(Integer.valueOf(cmb.A6));
        hashSet.add(Integer.valueOf(cmb.c7));
        hashSet.add(Integer.valueOf(cmb.h6));
        hashSet.add(Integer.valueOf(cmb.y8));
        hashSet.add(Integer.valueOf(cmb.x8));
        hashSet.add(Integer.valueOf(cmb.s8));
        hashSet.add(Integer.valueOf(cmb.z8));
        hashSet.add(Integer.valueOf(cmb.u8));
        hashSet.add(Integer.valueOf(cmb.r8));
    }

    public final CharSequence c0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new uj(this, (byte) 3), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return str;
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new ee0(false));
        byte b = this.s;
        if (b == 0) {
            this.simpleActionBar.setTitle(jb6.M0(2131744546, null));
        } else if (b == 1) {
            this.simpleActionBar.setTitle(jb6.M0(2131748436, null));
        } else if (b == 5) {
            this.simpleActionBar.setTitle(jb6.M0(2131751133, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new im8(this, (byte) 17));
        yja q = this.simpleActionBar.q();
        q.b(2, 2131232369, null, null, gm.L(54.0f), null);
        q.b(0, 2131232057, null, null, gm.L(54.0f), null);
        this.h = q.b(1, 2131232114, null, null, gm.L(54.0f), null);
        if (b == 5 && (arrayList = this.w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(oc7.r1(this.currentAccount).u0(hs6.d0(this.currentAccount).t0(b)));
        }
        this.e = g0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        q7c q7cVar = new q7c(this, new jac(this) {
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
                        stickersActivity.f0((ArrayList) obj, (l7c) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.s0((ArrayList) obj2);
                        return;
                }
            }
        }, new e2b(this), new e2b(this));
        this.a = q7cVar;
        q7cVar.r1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        this.a.E1(new jac(this) {
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
                        stickersActivity.f0((ArrayList) obj, (l7c) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.s0((ArrayList) obj2);
                        return;
                }
            }
        }, false);
        jg2 jg2Var = new jg2((byte) 6, this, false);
        this.b = jg2Var;
        jg2Var.i1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, qoe.c(-1.0f, -1));
        return this.fragmentView;
    }

    public final void d0() {
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
                if (!gda.Q && this.s != 5) {
                    gda.Q = true;
                    SharedPreferences.Editor edit = oc7.d1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", gda.Q);
                    edit.apply();
                    u31.g(this, new j99(getParentActivity(), jb6.M0(2131744539, null)), 3250).j();
                }
            }
        } else if (x) {
            this.simpleActionBar.w();
            this.a.z1(false);
            p0();
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = nm7.x0;
        byte b = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == b) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i != nm7.z0 && i != nm7.A0) {
            if (i == nm7.Z0 && ((Integer) objArr[0]).intValue() == b) {
                this.a.g3.O(true);
            }
        } else {
            this.a.g3.O(true);
        }
    }

    public final void e0() {
        this.x.clear();
        this.a.g3.O(true);
        d0();
    }

    public final void f0(java.util.ArrayList r19, defpackage.l7c r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.StickersActivity.f0(java.util.ArrayList, l7c):void");
    }

    public final ArrayList g0() {
        hs6 d0 = hs6.d0(this.currentAccount);
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

    @Override
    public final r59 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = cmb.c6;
        arrayList.add(new cnb(this.a, 16, new Class[]{s1b.class, vkb.class, bjb.class}, (Paint) null, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.L6));
        arrayList.add(new cnb(this.a, 0, new Class[]{bjb.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.M6));
        arrayList.add(new cnb(this.a, 8192, new Class[]{s1b.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, i));
        arrayList.add(new cnb(this.a, 16384, new Class[]{s1b.class}, new String[]{"checkBox"}, (Drawable[]) null, (bnb) null, cmb.j7));
        p3c p3cVar = this.c;
        if (p3cVar != null) {
            arrayList.addAll(p3cVar.R());
        }
        return arrayList;
    }

    public final String h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        String str;
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder("https://");
        sb.append(oc7.r1(this.currentAccount).N2);
        sb.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, b10.j(sb, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        hs6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void j0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i;
        hs6 d0 = hs6.d0(this.currentAccount);
        Activity parentActivity = getParentActivity();
        if (!tL_messages_stickerSet.set.archived) {
            i = 1;
        } else {
            i = 2;
        }
        d0.h2(parentActivity, tL_messages_stickerSet, i, this, true, true);
    }

    public final void k0(int i, ArrayList arrayList) {
        int i2;
        final byte b;
        ArrayList[] arrayListArr;
        boolean z;
        int i3;
        boolean z2;
        e0();
        final hs6 d0 = hs6.d0(this.currentAccount);
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
        long s = hs6.s(arrayListArr3[b]);
        jArr[b] = s;
        d0.M1(b, d0.Z[b], s, arrayListArr3[b]);
        nm7 notificationCenter = d0.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(b);
        objArr[z4 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(nm7.x0, objArr);
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
                final hs6 hs6Var = hs6.this;
                boolean z5 = i6;
                final StickersActivity stickersActivity = this;
                final byte b3 = b;
                final int i7 = z5 ? 1 : 0;
                gm.c3(new Runnable() {
                    @Override
                    public final void run() {
                        hs6 hs6Var2 = hs6.this;
                        boolean z6 = i7;
                        byte b4 = b3;
                        if (z6) {
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                hs6Var2.C1(stickersActivity, true, b4, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                            }
                            hs6Var2.c1(b4, false, false, true, null);
                            return;
                        }
                        hs6Var2.b1(b4, false, true);
                    }
                });
            }
        });
    }

    public final void l0(c6c c6cVar, View view) {
        boolean z;
        boolean z2;
        Object obj = c6cVar.H;
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
                        showDialog(new az3(this, getParentActivity(), getResourceProvider(), arrayList2));
                        return;
                    }
                    showDialog(new x2b(getParentActivity(), this, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            r0((s1b) view);
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
                showDialog(new az3(this, getParentActivity(), getResourceProvider(), arrayList3));
                return;
            }
            showDialog(new x2b(getParentActivity(), this, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (c6cVar.d) {
            case 1:
            case 8:
                if (b == 5) {
                    ArrayList arrayList4 = new ArrayList();
                    ArrayList g0 = g0();
                    if (g0 != null) {
                        for (int i = 0; i < g0.size(); i++) {
                            TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) g0.get(i);
                            if (stickerSetCovered != null && stickerSetCovered.set != null) {
                                TLRPC.TL_inputStickerSetID tL_inputStickerSetID3 = new TLRPC.TL_inputStickerSetID();
                                TLRPC.StickerSet stickerSet4 = stickerSetCovered.set;
                                tL_inputStickerSetID3.id = stickerSet4.id;
                                tL_inputStickerSetID3.access_hash = stickerSet4.access_hash;
                                arrayList4.add(tL_inputStickerSetID3);
                            }
                        }
                    }
                    hs6.d0(this.currentAccount).e1(true, true);
                    showDialog(new az3(this, getParentActivity(), getResourceProvider(), arrayList4));
                    return;
                }
                p3c p3cVar = new p3c(getParentActivity(), this, new d4c(getParentActivity(), new f2b(this), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                this.c = p3cVar;
                p3cVar.show();
                return;
            case 2:
                presentFragment(new ht(b));
                return;
            case 3:
                presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                presentFragment(new a39());
                return;
            case 5:
                bu5 I = bu5.I(this, view);
                if (gda.D == 0) {
                    z = true;
                } else {
                    z = false;
                }
                I.h(new ud(view, (byte) 7), jb6.M0(2131744086, null), z);
                if (gda.D == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                I.h(new ud(view, (byte) 8), jb6.M0(2131744085, null), z2);
                if (gda.D != 2) {
                    z4 = false;
                }
                I.h(new ud(view, (byte) 9), jb6.M0(2131744084, null), z4);
                I.a0();
                return;
            case 6:
                gda.P0 = !gda.P0;
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putBoolean("allowBigEmoji", gda.P0);
                edit.apply();
                ((bjb) view).setChecked(gda.P0);
                return;
            case 7:
                gda.N();
                ((bjb) view).setChecked(gda.W);
                return;
            case 9:
                gda.E = !gda.E;
                SharedPreferences.Editor edit2 = oc7.d1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", gda.E);
                edit2.apply();
                ((bjb) view).setChecked(gda.E);
                return;
            default:
                return;
        }
    }

    public final void m0(View view) {
        r94 r94Var = (r94) view.getParent();
        TLRPC.StickerSetCovered stickerSet = r94Var.getStickerSet();
        Long valueOf = Long.valueOf(stickerSet.set.id);
        ArrayList arrayList = this.f;
        if (arrayList.contains(valueOf)) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        r94Var.f.a(true, true);
        boolean z = r94Var.w;
        int i = this.currentAccount;
        if (z) {
            hs6.d0(i).h2(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            hs6.d0(i).h2(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    public final void n0(View view) {
        s1b s1bVar;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof s1b) && (stickersSet = (s1bVar = (s1b) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i = 0;
                if (s1bVar.E == view) {
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
                    hs6 d0 = hs6.d0(this.currentAccount);
                    Activity parentActivity = getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    d0.h2(parentActivity, stickerSetCovered2, 2, this, false, false);
                } else if (s1bVar.F == view) {
                    hs6.d0(this.currentAccount).h2(getParentActivity(), stickersSet, 0, this, false, true);
                } else if (s1bVar.G == view) {
                    showDialog(new kj8((org.telegram.ui.ActionBar.d) this, 11, false));
                }
            }
        }
    }

    public final void o0(int i) {
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
                    sb.append(h0(tL_messages_stickerSet));
                }
            }
            String sb2 = sb.toString();
            tca G0 = tca.G0(this.fragmentView.getContext(), null, sb2, false, sb2);
            G0.n2 = new x59(this, (byte) 16);
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
                        alertDialog$Builder.a.S = jb6.a0(null, null, 2131751431, jb6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = jb6.a0(null, null, 2131751430, Integer.valueOf(size3));
                        M0 = jb6.M0(2131751535, null);
                    } else {
                        alertDialog$Builder.a.S = jb6.a0(null, null, 2131754107, jb6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = jb6.a0(null, null, 2131754106, Integer.valueOf(size3));
                        M0 = jb6.M0(2131754137, null);
                    }
                    alertDialog$Builder.j(M0, new yg(this, arrayList, i, (byte) 16));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    he heVar = alertDialog$Builder.a;
                    showDialog(heVar);
                    if (i == 1 && (textView = (TextView) heVar.c(-1)) != null) {
                        anb.X(textView, cmb.p7, null);
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
                                hs6 d0 = hs6.d0(this.currentAccount);
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
                                    hs6.d0(stickersActivity.currentAccount).h2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity, true, true);
                                } else if (i == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity.h0(tL_messages_stickerSet3));
                                        stickersActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, jb6.M0(2131744535, null)), 500);
                                    } catch (Exception e) {
                                        fc4.g(e, true);
                                    }
                                } else if (i == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity.h0(tL_messages_stickerSet3)));
                                        c41.j(stickersActivity).j();
                                    } catch (Exception e2) {
                                        fc4.g(e2, true);
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
                                    stickersActivity.d0();
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
                stickersActivity.e0();
            }
        }
    }

    @Override
    public final boolean onBackPressed(boolean z) {
        if (!this.x.isEmpty()) {
            if (z) {
                e0();
                return false;
            }
            return false;
        }
        return super.onBackPressed(z);
    }

    @Override
    public final boolean onFragmentCreate() {
        super.onFragmentCreate();
        hs6 d0 = hs6.d0(this.currentAccount);
        byte b = this.s;
        d0.D(b);
        if (b == 0) {
            hs6.d0(this.currentAccount).z();
            hs6.d0(this.currentAccount).D(1);
            hs6.d0(this.currentAccount).D(5);
        } else if (b == 6) {
            hs6.d0(this.currentAccount).y();
            nm7.f(this.currentAccount).b(this, nm7.A0);
        }
        nm7.f(this.currentAccount).b(this, nm7.x0);
        nm7.f(this.currentAccount).b(this, nm7.Z0);
        nm7.f(this.currentAccount).b(this, nm7.z0);
        nm7.f(this.currentAccount).b(this, nm7.j5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            nm7.f(this.currentAccount).n(this, nm7.A0);
        }
        nm7.f(this.currentAccount).n(this, nm7.x0);
        nm7.f(this.currentAccount).n(this, nm7.Z0);
        nm7.f(this.currentAccount).n(this, nm7.z0);
        nm7.f(this.currentAccount).n(this, nm7.j5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q7c q7cVar = this.a;
        if (q7cVar != null) {
            q7cVar.g3.O(true);
        }
    }

    public final void p0() {
        boolean z;
        boolean z2;
        if (this.r) {
            this.r = false;
            hs6 d0 = hs6.d0(this.currentAccount);
            long[] jArr = d0.Y;
            ArrayList[] arrayListArr = d0.H;
            byte b = this.s;
            jArr[b] = hs6.s(arrayListArr[b]);
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
                i = mle.c(i, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new go9(this, (byte) 6));
            nm7.f(this.currentAccount).k(nm7.x0, Integer.valueOf(b), Boolean.TRUE);
            if (gda.W) {
                gda.N();
                c41.b0(this).I(2131624018, jb6.M0(2131751274, null), jb6.M0(2131751273, null)).j();
                this.a.g3.O(true);
            }
        }
    }

    public final void q0(View view) {
        if (view instanceof vkb) {
            vkb vkbVar = (vkb) view;
            String S = hs6.d0(this.currentAccount).S();
            if (S != null) {
                if (S.startsWith("animated_")) {
                    try {
                        vm m = vm.m(this.currentAccount, Long.parseLong(S.substring(9)), null, 2);
                        m.b(vkbVar.getValueBackupImageView());
                        vkbVar.getValueBackupImageView().setImageDrawable(m);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) hs6.d0(this.currentAccount).r.get(S);
                if (tL_availableReaction != null) {
                    vkbVar.getValueBackupImageView().getImageReceiver().d0(gn5.b(tL_availableReaction.center_icon), "100_100_lastreactframe", eq3.d(tL_availableReaction.static_icon.thumbs, cmb.Z6, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public final void r0(s1b s1bVar) {
        TLRPC.TL_messages_stickerSet stickersSet = s1bVar.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            s1bVar.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            s1bVar.b(true, true);
        }
        this.a.g3.O(true);
        d0();
    }

    public final void s0(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            Object obj2 = ((c6c) obj).H;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.d = arrayList2;
        this.r = true;
        Collections.sort(hs6.d0(this.currentAccount).t0(this.s), new i01(this, (byte) 7));
        b2b b2bVar = this.y;
        gm.r(b2bVar);
        gm.d3(b2bVar, 1000L);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
