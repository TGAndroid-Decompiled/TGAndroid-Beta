package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.CountDownLatch;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class c50 extends org.telegram.ui.ActionBar.e2 implements org.telegram.messenger.is, org.telegram.ui.Components.l30 {
    public TLRPC.FileLocation E;
    public TLRPC.FileLocation F;
    public TLRPC.InputFile G;
    public TLRPC.InputFile H;
    public TLRPC.VideoSize I;
    public String J;
    public double K;
    public ArrayList L;
    public boolean M;
    public boolean N;
    public org.telegram.ui.Components.m30 O;
    public String P;
    public final int Q;
    public final boolean R;
    public org.telegram.ui.Components.ch0 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public org.telegram.ui.Components.qy Y;
    public b50 Z;
    public a50 f46017a;
    public org.telegram.ui.Components.uj0 f46018b;
    public org.telegram.ui.Components.rt f46019c;
    public fi.v3 d;
    public hi.n5 f46020e;
    public xc f46021f;
    public AnimatorSet h;
    public yc f46022n;
    public final org.telegram.ui.Components.t8 f46023r;
    public FrameLayout f46024s;
    public org.telegram.ui.Components.t00 f46025w;
    public org.telegram.ui.ActionBar.g1 f46026x;
    public Drawable f46027y;

    public c50(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.f46023r = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    public static void Z(c50 c50Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.vr.a0(c50Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void I(float f10) {
        yc ycVar = this.f46022n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        yc ycVar = this.f46022n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new li.j(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29241y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29031n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29147t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29186v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28849d6));
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c50.createView(android.content.Context):android.view.View");
    }

    public final String d0(int i7) {
        return getMessagesController().a2((Long) this.L.get(i7)).first_name;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.f25559r) {
            if (this.f46018b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i11 = org.telegram.messenger.np.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.f46018b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f46018b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ns.S) {
            this.W = 0;
            this.N = false;
            org.telegram.ui.Components.t00 t00Var = this.f46025w;
            if (t00Var != null) {
                t00Var.f(false, true);
            }
            org.telegram.ui.Components.rt rtVar = this.f46019c;
            if (rtVar != null) {
                rtVar.setEnabled(true);
            }
        } else if (i7 == org.telegram.messenger.ns.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            b50 b50Var = this.Z;
            if (b50Var != null) {
                b50Var.c(this, longValue);
            } else {
                org.telegram.messenger.ns.f(this.currentAccount).k(org.telegram.messenger.ns.f25572t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new an(bundle), true);
            }
            if (this.G != null || this.H != null || this.I != null) {
                getMessagesController().B(longValue, null, this.G, this.H, this.I, this.K, this.J, this.E, this.F, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.O.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.O.f37042c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f46021f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z11) {
            this.h = new AnimatorSet();
            if (z10) {
                this.f46022n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                xc xcVar = this.f46021f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 0.0f), ObjectAnimator.ofFloat(this.f46022n, property, 1.0f));
            } else {
                this.f46021f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                xc xcVar2 = this.f46021f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f46022n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new z20(1, this, z10));
            this.h.start();
        } else if (z10) {
            this.f46021f.setAlpha(1.0f);
            this.f46021f.setVisibility(4);
            this.f46022n.setAlpha(1.0f);
            this.f46022n.setVisibility(0);
        } else {
            this.f46021f.setAlpha(1.0f);
            this.f46021f.setVisibility(0);
            this.f46022n.setAlpha(0.0f);
            this.f46022n.setVisibility(4);
        }
    }

    @Override
    public final uq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f46019c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46018b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28997l7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46018b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29015m7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46018b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f29032n7));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46019c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46019c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46019c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28978k6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46019c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28996l6));
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.f46018b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Ri));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.O.h(i7, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.rt rtVar = this.f46019c;
        if (rtVar != null && rtVar.f39059e) {
            if (z10) {
                rtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        c50 c50Var;
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.f25559r);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.R);
        org.telegram.messenger.ns.f(this.currentAccount).c(this, org.telegram.messenger.ns.S);
        org.telegram.ui.Components.m30 m30Var = new org.telegram.ui.Components.m30(2, true, true);
        this.O = m30Var;
        m30Var.f37040a = this;
        m30Var.f37041b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.L = new ArrayList(longArray.length);
            int i7 = 0;
            while (i7 < longArray.length) {
                i7 = com.google.android.gms.internal.vision.e2.g(i7, 1, longArray[i7], this.L);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.L.size(); i10++) {
            Long l10 = (Long) this.L.get(i10);
            if (getMessagesController().a2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            c50Var = this;
            org.telegram.messenger.vr.a0(this.currentAccount).f27220a.c(new org.telegram.ui.Components.ma0(c50Var, arrayList2, arrayList, countDownLatch, 13));
            try {
                countDownLatch.await();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList2.get(i11);
                i11++;
                getMessagesController().X3((TLRPC.User) obj, true, false);
            }
        } else {
            c50Var = this;
        }
        c50Var.X = getUserConfig().f24957q0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.f25559r);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.R);
        org.telegram.messenger.ns.f(this.currentAccount).n(this, org.telegram.messenger.ns.S);
        this.O.d();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        org.telegram.ui.Components.rt rtVar = this.f46019c;
        if (rtVar != null) {
            rtVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.rt rtVar = this.f46019c;
        if (rtVar != null) {
            rtVar.r();
        }
        this.O.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.O.j(i7, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.rt rtVar = this.f46019c;
        if (rtVar != null) {
            rtVar.s();
        }
        a50 a50Var = this.f46017a;
        if (a50Var != null) {
            a50Var.f();
        }
        this.O.k();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.t00 t00Var = this.f46025w;
            if (t00Var != null) {
                t00Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.uj0 uj0Var = this.f46018b;
            if (uj0Var != null) {
                uj0Var.x1();
                if (this.f46018b.getFastScroll() != null) {
                    this.f46018b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.rt rtVar = this.f46019c;
            if (rtVar != null && rtVar.getEditText() != null) {
                this.f46019c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                this.f46019c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.j6.f28978k6), getThemedColor(org.telegram.ui.ActionBar.j6.f28996l6), getThemedColor(org.telegram.ui.ActionBar.j6.f29070p7));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.mt mtVar = this.f46019c.f39056a;
            mtVar.requestFocus();
            org.telegram.messenger.g0.J3(mtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.m30 m30Var = this.O;
        if (m30Var != null) {
            m30Var.f37044f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.rt rtVar = this.f46019c;
            if (rtVar != null) {
                rtVar.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.m30 m30Var = this.O;
        if (m30Var != null && (str = m30Var.f37044f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.rt rtVar = this.f46019c;
        if (rtVar != null) {
            String obj = rtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean x() {
        return false;
    }

    @Override
    public final void U() {
    }
}
