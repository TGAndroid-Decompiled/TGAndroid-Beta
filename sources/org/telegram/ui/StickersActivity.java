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
public class StickersActivity extends org.telegram.ui.ActionBar.e implements fn7 {
    public q9c a;
    private int archivedRow;
    public of2 b;
    public o5c c;
    public ArrayList d;
    private int dynamicPackOrder;
    public ArrayList e;
    public final ArrayList f;
    private int featuredRow;
    public sla h;
    private int largeEmojiRow;
    public int n;
    public boolean r;
    public final byte s;
    private int suggestRow;
    public ArrayList w;
    public final HashSet x;
    public final x3b y;

    public StickersActivity(int i, ArrayList arrayList) {
        super(null);
        this.f = new ArrayList();
        this.x = new HashSet();
        this.y = new x3b(this, (byte) 0);
        this.s = i;
        this.w = arrayList;
    }

    public static int a0(StickersActivity stickersActivity) {
        return stickersActivity.currentAccount;
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(aob.Li));
        hashSet.add(Integer.valueOf(aob.Mi));
        hashSet.add(Integer.valueOf(aob.z6));
        hashSet.add(Integer.valueOf(aob.G6));
        hashSet.add(Integer.valueOf(aob.I6));
        hashSet.add(Integer.valueOf(aob.J6));
        hashSet.add(Integer.valueOf(aob.B6));
        hashSet.add(Integer.valueOf(aob.d7));
        hashSet.add(Integer.valueOf(aob.i6));
        hashSet.add(Integer.valueOf(aob.z8));
        hashSet.add(Integer.valueOf(aob.y8));
        hashSet.add(Integer.valueOf(aob.t8));
        hashSet.add(Integer.valueOf(aob.A8));
        hashSet.add(Integer.valueOf(aob.v8));
        hashSet.add(Integer.valueOf(aob.s8));
    }

    public final CharSequence b0(String str) {
        int indexOf = str.indexOf("@stickers");
        if (indexOf != -1) {
            try {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
                spannableStringBuilder.setSpan(new vi(this, (byte) 3), indexOf, indexOf + 9, 18);
                return spannableStringBuilder;
            } catch (Exception e) {
                cc4.g(e, true);
            }
        }
        return str;
    }

    public final void c0() {
        HashSet hashSet = this.x;
        int size = hashSet.size();
        boolean z = this.simpleActionBar.z();
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
            this.simpleActionBar.H(size, z);
            if (!z) {
                this.simpleActionBar.L();
                this.a.A1(true);
                if (!xea.Q && this.s != 5) {
                    xea.Q = true;
                    SharedPreferences.Editor edit = uc7.e1().edit();
                    edit.putBoolean("stickersReorderingHintUsed", xea.Q);
                    edit.apply();
                    v21.g(this, new ua9(getParentActivity(), ob6.M0(2131744507, null)), 3250).j();
                }
            }
        } else if (z) {
            this.simpleActionBar.y();
            this.a.A1(false);
            o0();
        }
    }

    @Override
    public final View createView(Context context) {
        ArrayList arrayList;
        setHasOwnBackground(true);
        this.simpleActionBar.setBackButtonDrawable(new gd0(false));
        byte b = this.s;
        if (b == 0) {
            this.simpleActionBar.setTitle(ob6.M0(2131744514, null));
        } else if (b == 1) {
            this.simpleActionBar.setTitle(ob6.M0(2131748433, null));
        } else if (b == 5) {
            this.simpleActionBar.setTitle(ob6.M0(2131751161, null));
        }
        this.simpleActionBar.setActionBarMenuOnItemClick(new rn8(this, (byte) 18));
        rla r = this.simpleActionBar.r();
        r.b(2, 2131232368, null, null, hl.L(54.0f), null);
        r.b(0, 2131232056, null, null, hl.L(54.0f), null);
        this.h = r.b(1, 2131232113, null, null, hl.L(54.0f), null);
        if (b == 5 && (arrayList = this.w) != null) {
            this.d = arrayList;
        } else {
            this.d = new ArrayList(uc7.s1(this.currentAccount).w0(ls6.d0(this.currentAccount).t0(b)));
        }
        this.e = f0();
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        q9c q9cVar = new q9c(this, new icc(this) {
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
                        stickersActivity.e0((ArrayList) obj, (l9c) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        return;
                }
            }
        }, new b4b(this), new b4b(this));
        this.a = q9cVar;
        q9cVar.s1();
        this.a.setFocusable(true);
        this.a.setSectionsDrawBackground(true);
        this.a.setTag(7);
        this.a.F1(new icc(this) {
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
                        stickersActivity.e0((ArrayList) obj, (l9c) obj2);
                        return;
                    default:
                        ((Integer) obj).getClass();
                        stickersActivity.r0((ArrayList) obj2);
                        return;
                }
            }
        }, false);
        of2 of2Var = new of2((byte) 6, this, false);
        this.b = of2Var;
        of2Var.i1(1);
        this.a.setLayoutManager(this.b);
        frameLayout.addView(this.a, tre.c(-1.0f, -1));
        return this.fragmentView;
    }

    public final void d0() {
        this.x.clear();
        this.a.g3.O(true);
        c0();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.x0;
        byte b = this.s;
        if (i == i3) {
            if (((Integer) objArr[0]).intValue() == b) {
                this.f.clear();
            }
            this.a.g3.O(true);
        } else if (i != jn7.z0 && i != jn7.A0) {
            if (i == jn7.Z0 && ((Integer) objArr[0]).intValue() == b) {
                this.a.g3.O(true);
            }
        } else {
            this.a.g3.O(true);
        }
    }

    public final void e0(java.util.ArrayList r19, defpackage.l9c r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.StickersActivity.e0(java.util.ArrayList, l9c):void");
    }

    public final ArrayList f0() {
        ls6 d0 = ls6.d0(this.currentAccount);
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
        sb.append(uc7.s1(this.currentAccount).N2);
        sb.append("/");
        if (tL_messages_stickerSet.set.emojis) {
            str = "addemoji";
        } else {
            str = "addstickers";
        }
        return String.format(locale, c00.k(sb, str, "/%s"), tL_messages_stickerSet.set.short_name);
    }

    @Override
    public final d79 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        int i = aob.d6;
        arrayList.add(new apb(this.a, 16, new Class[]{p3b.class, qmb.class, wkb.class}, (Paint) null, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.M6));
        arrayList.add(new apb(this.a, 0, new Class[]{wkb.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.N6));
        arrayList.add(new apb(this.a, 8192, new Class[]{p3b.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, i));
        arrayList.add(new apb(this.a, 16384, new Class[]{p3b.class}, new String[]{"checkBox"}, (Drawable[]) null, (zob) null, aob.k7));
        o5c o5cVar = this.c;
        if (o5cVar != null) {
            arrayList.addAll(o5cVar.S());
        }
        return arrayList;
    }

    public final void h0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        ls6.d0(this.currentAccount).h2(getParentActivity(), tL_messages_stickerSet, 0, this, true, true);
    }

    public final void i0(TLRPC.TL_messages_stickerSet tL_messages_stickerSet) {
        int i;
        ls6 d0 = ls6.d0(this.currentAccount);
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
        final ls6 d0 = ls6.d0(this.currentAccount);
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
        long s = ls6.s(arrayListArr3[b]);
        jArr[b] = s;
        d0.M1(b, d0.Z[b], s, arrayListArr3[b]);
        jn7 notificationCenter = d0.getNotificationCenter();
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(b);
        objArr[z4 ? 1 : 0] = Boolean.TRUE;
        notificationCenter.k(jn7.x0, objArr);
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
                final ls6 ls6Var = ls6.this;
                boolean z5 = i6;
                final StickersActivity stickersActivity = this;
                final byte b3 = b;
                final int i7 = z5 ? 1 : 0;
                hl.c3(new Runnable() {
                    @Override
                    public final void run() {
                        ls6 ls6Var2 = ls6.this;
                        boolean z6 = i7;
                        byte b4 = b3;
                        if (z6) {
                            TLObject tLObject2 = tLObject;
                            if (tLObject2 instanceof TLRPC.TL_messages_stickerSetInstallResultArchive) {
                                ls6Var2.C1(stickersActivity, true, b4, (TLRPC.TL_messages_stickerSetInstallResultArchive) tLObject2);
                            }
                            ls6Var2.c1(b4, false, false, true, null);
                            return;
                        }
                        ls6Var2.b1(b4, false, true);
                    }
                });
            }
        });
    }

    public final void k0(b8c b8cVar, View view) {
        boolean z;
        boolean z2;
        Object obj = b8cVar.H;
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
                        showDialog(new ly3(this, getParentActivity(), getResourceProvider(), arrayList2));
                        return;
                    }
                    showDialog(new s4b(getParentActivity(), this, null, tL_messages_stickerSet, null, null));
                    return;
                }
                return;
            }
            q0((p3b) view);
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
                showDialog(new ly3(this, getParentActivity(), getResourceProvider(), arrayList3));
                return;
            }
            showDialog(new s4b(getParentActivity(), this, tL_inputStickerSetID2, null, null, null));
            return;
        }
        switch (b8cVar.d) {
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
                    ls6.d0(this.currentAccount).e1(true, true);
                    showDialog(new ly3(this, getParentActivity(), getResourceProvider(), arrayList4));
                    return;
                }
                o5c o5cVar = new o5c(getParentActivity(), this, new d6c(getParentActivity(), new c4b(this), new TLRPC.StickerSetCovered[10], new LongSparseArray(), new LongSparseArray(), null, null), null);
                this.c = o5cVar;
                o5cVar.show();
                return;
            case 2:
                presentFragment(new is(b));
                return;
            case 3:
                presentFragment(new StickersActivity(5, null));
                return;
            case 4:
                presentFragment(new n49());
                return;
            case 5:
                fu5 I = fu5.I(this, view);
                if (xea.D == 0) {
                    z = true;
                } else {
                    z = false;
                }
                I.h(new vc(view, (byte) 8), ob6.M0(2131744054, null), z);
                if (xea.D == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                I.h(new vc(view, (byte) 9), ob6.M0(2131744053, null), z2);
                if (xea.D != 2) {
                    z4 = false;
                }
                I.h(new vc(view, (byte) 10), ob6.M0(2131744052, null), z4);
                I.a0();
                return;
            case 6:
                xea.P0 = !xea.P0;
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("allowBigEmoji", xea.P0);
                edit.apply();
                ((wkb) view).setChecked(xea.P0);
                return;
            case 7:
                xea.N();
                ((wkb) view).setChecked(xea.W);
                return;
            case 9:
                xea.E = !xea.E;
                SharedPreferences.Editor edit2 = uc7.e1().edit();
                edit2.putBoolean("suggestAnimatedEmoji", xea.E);
                edit2.apply();
                ((wkb) view).setChecked(xea.E);
                return;
            default:
                return;
        }
    }

    public final void l0(View view) {
        d94 d94Var = (d94) view.getParent();
        TLRPC.StickerSetCovered stickerSet = d94Var.getStickerSet();
        Long valueOf = Long.valueOf(stickerSet.set.id);
        ArrayList arrayList = this.f;
        if (arrayList.contains(valueOf)) {
            return;
        }
        arrayList.add(Long.valueOf(stickerSet.set.id));
        d94Var.f.a(true, true);
        boolean z = d94Var.w;
        int i = this.currentAccount;
        if (z) {
            ls6.d0(i).h2(getParentActivity(), stickerSet, 0, this, false, false);
        } else {
            ls6.d0(i).h2(getParentActivity(), stickerSet, 2, this, false, false);
        }
    }

    public final void m0(View view) {
        p3b p3bVar;
        TLRPC.TL_messages_stickerSet stickersSet;
        TLRPC.StickerSetCovered stickerSetCovered;
        TLRPC.StickerSetCovered stickerSetCovered2;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if ((viewGroup.getParent() instanceof p3b) && (stickersSet = (p3bVar = (p3b) viewGroup.getParent()).getStickersSet()) != null && stickersSet.set != null) {
                int i = 0;
                if (p3bVar.E == view) {
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
                    ls6 d0 = ls6.d0(this.currentAccount);
                    Activity parentActivity = getParentActivity();
                    if (stickerSetCovered == null) {
                        stickerSetCovered2 = stickersSet;
                    } else {
                        stickerSetCovered2 = stickerSetCovered;
                    }
                    d0.h2(parentActivity, stickerSetCovered2, 2, this, false, false);
                } else if (p3bVar.F == view) {
                    ls6.d0(this.currentAccount).h2(getParentActivity(), stickersSet, 0, this, false, true);
                } else if (p3bVar.G == view) {
                    showDialog(new xk8((org.telegram.ui.ActionBar.e) this, 11, false));
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
            kea H0 = kea.H0(this.fragmentView.getContext(), null, sb2, false, sb2);
            H0.n2 = new ve9(this, (byte) 13);
            H0.show();
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
                        alertDialog$Builder.a.S = ob6.a0(null, null, 2131751459, ob6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = ob6.a0(null, null, 2131751458, Integer.valueOf(size3));
                        M0 = ob6.M0(2131751563, null);
                    } else {
                        alertDialog$Builder.a.S = ob6.a0(null, null, 2131754135, ob6.G(size3, "StickerSets", new Object[0]));
                        alertDialog$Builder.a.U = ob6.a0(null, null, 2131754134, Integer.valueOf(size3));
                        M0 = ob6.M0(2131754165, null);
                    }
                    alertDialog$Builder.j(M0, new bf(this, arrayList, i, (byte) 17));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    id idVar = alertDialog$Builder.a;
                    showDialog(idVar);
                    if (i == 1 && (textView = (TextView) idVar.c(-1)) != null) {
                        yob.X(textView, aob.q7, null);
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
                                ls6 d0 = ls6.d0(this.currentAccount);
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
                                    ls6.d0(stickersActivity.currentAccount).h2(stickersActivity.getParentActivity(), tL_messages_stickerSet3, 0, stickersActivity, true, true);
                                } else if (i == 2) {
                                    try {
                                        Intent intent = new Intent("android.intent.action.SEND");
                                        intent.setType("text/plain");
                                        intent.putExtra("android.intent.extra.TEXT", stickersActivity.g0(tL_messages_stickerSet3));
                                        stickersActivity.getParentActivity().startActivityForResult(Intent.createChooser(intent, ob6.M0(2131744503, null)), 500);
                                    } catch (Exception e) {
                                        cc4.g(e, true);
                                    }
                                } else if (i == 3) {
                                    try {
                                        ((ClipboardManager) org.telegram.messenger.a.b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", stickersActivity.g0(tL_messages_stickerSet3)));
                                        d31.j(stickersActivity).j();
                                    } catch (Exception e2) {
                                        cc4.g(e2, true);
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
            ls6 d0 = ls6.d0(this.currentAccount);
            long[] jArr = d0.Y;
            ArrayList[] arrayListArr = d0.H;
            byte b = this.s;
            jArr[b] = ls6.s(arrayListArr[b]);
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
                i = dze.c(i, 1, ((TLRPC.TL_messages_stickerSet) this.d.get(i)).set.id, tL_messages_reorderStickerSets.order);
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_reorderStickerSets, new yp9(this, (byte) 6));
            jn7.f(this.currentAccount).k(jn7.x0, Integer.valueOf(b), Boolean.TRUE);
            if (xea.W) {
                xea.N();
                d31.b0(this).I(2131624018, ob6.M0(2131751302, null), ob6.M0(2131751301, null)).j();
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
        ls6 d0 = ls6.d0(this.currentAccount);
        byte b = this.s;
        d0.D(b);
        if (b == 0) {
            ls6.d0(this.currentAccount).z();
            ls6.d0(this.currentAccount).D(1);
            ls6.d0(this.currentAccount).D(5);
        } else if (b == 6) {
            ls6.d0(this.currentAccount).y();
            jn7.f(this.currentAccount).b(this, jn7.A0);
        }
        jn7.f(this.currentAccount).b(this, jn7.x0);
        jn7.f(this.currentAccount).b(this, jn7.Z0);
        jn7.f(this.currentAccount).b(this, jn7.z0);
        jn7.f(this.currentAccount).b(this, jn7.i5);
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.s == 6) {
            jn7.f(this.currentAccount).n(this, jn7.A0);
        }
        jn7.f(this.currentAccount).n(this, jn7.x0);
        jn7.f(this.currentAccount).n(this, jn7.Z0);
        jn7.f(this.currentAccount).n(this, jn7.z0);
        jn7.f(this.currentAccount).n(this, jn7.i5);
    }

    @Override
    public final void onResume() {
        super.onResume();
        q9c q9cVar = this.a;
        if (q9cVar != null) {
            q9cVar.g3.O(true);
        }
    }

    public final void p0(View view) {
        if (view instanceof qmb) {
            qmb qmbVar = (qmb) view;
            String S = ls6.d0(this.currentAccount).S();
            if (S != null) {
                if (S.startsWith("animated_")) {
                    try {
                        wl m = wl.m(this.currentAccount, Long.parseLong(S.substring(9)), null, 2);
                        m.b(qmbVar.getValueBackupImageView());
                        qmbVar.getValueBackupImageView().setImageDrawable(m);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) ls6.d0(this.currentAccount).r.get(S);
                if (tL_availableReaction != null) {
                    qmbVar.getValueBackupImageView().getImageReceiver().d0(jn5.b(tL_availableReaction.center_icon), "100_100_lastreactframe", lp3.d(tL_availableReaction.static_icon.thumbs, aob.a7, 1.0f, false), "webp", tL_availableReaction, 1);
                }
            }
        }
    }

    public final void q0(p3b p3bVar) {
        TLRPC.TL_messages_stickerSet stickersSet = p3bVar.getStickersSet();
        if (stickersSet == null) {
            return;
        }
        Long valueOf = Long.valueOf(stickersSet.set.id);
        HashSet hashSet = this.x;
        if (hashSet.contains(valueOf)) {
            hashSet.remove(Long.valueOf(stickersSet.set.id));
            p3bVar.b(false, true);
        } else {
            hashSet.add(Long.valueOf(stickersSet.set.id));
            p3bVar.b(true, true);
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
            Object obj2 = ((b8c) obj).H;
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList2.add((TLRPC.TL_messages_stickerSet) obj2);
            }
        }
        this.d = arrayList2;
        this.r = true;
        Collections.sort(ls6.d0(this.currentAccount).t0(this.s), new jz0(this, (byte) 7));
        x3b x3bVar = this.y;
        hl.r(x3bVar);
        hl.d3(x3bVar, 1000L);
    }

    @Override
    public final boolean useSimpleActionBar() {
        return true;
    }
}
