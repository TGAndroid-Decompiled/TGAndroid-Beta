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
public final class c60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, org.telegram.ui.Components.a40 {
    public TLRPC.FileLocation D;
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.b40 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.bi0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.az X;
    public b60 Y;
    public a60 f36391a;
    public org.telegram.ui.Components.tk0 f36392b;
    public org.telegram.ui.Components.wt f36393c;
    public ag.d2 d;
    public kg.f0 e;
    public hd f36394f;
    public AnimatorSet h;
    public id f36395n;
    public final org.telegram.ui.Components.r8 f36396r;
    public FrameLayout f36397s;
    public org.telegram.ui.Components.f10 f36398w;
    public org.telegram.ui.ActionBar.k1 f36399x;
    public Drawable f36400y;

    public c60(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.f36396r = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static void Y(c60 c60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.hs.a0(c60Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void H(float f7) {
        id idVar = this.f36395n;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(f7);
    }

    @Override
    public final void O(boolean z10, boolean z11) {
        id idVar = this.f36395n;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.i0.g3(new ed(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21311y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21115n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20892b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21020i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20929d6));
    }

    public final String c0(int i10) {
        return getMessagesController().Z1((Long) this.K.get(i10)).first_name;
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.c60.createView(android.content.Context):android.view.View");
    }

    public final void d0(boolean z10, boolean z11) {
        if (this.f36394f == null) {
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
                this.f36395n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                hd hdVar = this.f36394f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(hdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f36395n, property, 1.0f));
            } else {
                this.f36394f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                hd hdVar2 = this.f36394f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(hdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f36395n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new org.telegram.ui.Components.ha0(16, this, z10));
            this.h.start();
        } else if (z10) {
            this.f36394f.setAlpha(1.0f);
            this.f36394f.setVisibility(4);
            this.f36395n.setAlpha(1.0f);
            this.f36395n.setVisibility(0);
        } else {
            this.f36394f.setAlpha(1.0f);
            this.f36394f.setVisibility(0);
            this.f36395n.setAlpha(0.0f);
            this.f36395n.setVisibility(4);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.f19676r) {
            if (this.f36392b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i12 = org.telegram.messenger.vp.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.f36392b.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = this.f36392b.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.j4) {
                            ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.zs.S) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.f10 f10Var = this.f36398w;
            if (f10Var != null) {
                f10Var.f(false, true);
            }
            org.telegram.ui.Components.wt wtVar = this.f36393c;
            if (wtVar != null) {
                wtVar.setEnabled(true);
            }
        } else if (i10 == org.telegram.messenger.zs.R) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            b60 b60Var = this.Y;
            if (b60Var != null) {
                b60Var.f(this, longValue);
            } else {
                org.telegram.messenger.zs.f(this.currentAccount).k(org.telegram.messenger.zs.f19690t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new un(bundle), true);
            }
            if (this.F != null || this.G != null || this.H != null) {
                getMessagesController().B(longValue, null, this.F, this.G, this.H, this.J, this.I, this.D, this.E, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.N.f(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.N.f24525c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final gs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f36393c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36392b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36392b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21096m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36392b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21116n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36393c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36393c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Mi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36393c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36393c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21076l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f36392b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.h(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.wt wtVar = this.f36393c;
        if (wtVar != null && wtVar.e) {
            if (z10) {
                wtVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        c60 c60Var;
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.f19676r);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.R);
        org.telegram.messenger.zs.f(this.currentAccount).c(this, org.telegram.messenger.zs.S);
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(2, true, true);
        this.N = b40Var;
        b40Var.f24523a = this;
        b40Var.f24524b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i10 = 0;
            while (i10 < longArray.length) {
                i10 = c3.i0.k(i10, 1, longArray[i10], this.K);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < this.K.size(); i11++) {
            Long l4 = (Long) this.K.get(i11);
            if (getMessagesController().Z1(l4) == null) {
                arrayList.add(l4);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            c60Var = this;
            org.telegram.messenger.hs.a0(this.currentAccount).f15938a.c(new w50(c60Var, arrayList2, arrayList, countDownLatch, 0));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            int i12 = 0;
            while (i12 < size) {
                Object obj = arrayList2.get(i12);
                i12++;
                getMessagesController().U3((TLRPC.User) obj, true, false);
            }
        } else {
            c60Var = this;
        }
        c60Var.W = getUserConfig().f15168p0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.f19676r);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.R);
        org.telegram.messenger.zs.f(this.currentAccount).n(this, org.telegram.messenger.zs.S);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.wt wtVar = this.f36393c;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wt wtVar = this.f36393c;
        if (wtVar != null) {
            wtVar.r();
        }
        this.N.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.N.j(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.wt wtVar = this.f36393c;
        if (wtVar != null) {
            wtVar.s();
        }
        a60 a60Var = this.f36391a;
        if (a60Var != null) {
            a60Var.f();
        }
        this.N.k();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.f10 f10Var = this.f36398w;
            if (f10Var != null) {
                f10Var.updateColors();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.Components.tk0 tk0Var = this.f36392b;
            if (tk0Var != null) {
                tk0Var.x1();
                if (this.f36392b.getFastScroll() != null) {
                    this.f36392b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.wt wtVar = this.f36393c;
            if (wtVar != null && wtVar.getEditText() != null) {
                this.f36393c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.G6));
                this.f36393c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.t6.f21058k6), getThemedColor(org.telegram.ui.ActionBar.t6.f21076l6), getThemedColor(org.telegram.ui.ActionBar.t6.f21153p7));
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.rt rtVar = this.f36393c.f32239a;
            rtVar.requestFocus();
            org.telegram.messenger.i0.J3(rtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.N;
        if (b40Var != null) {
            b40Var.f24526f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.wt wtVar = this.f36393c;
            if (wtVar != null) {
                wtVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.b40 b40Var = this.N;
        if (b40Var != null && (str = b40Var.f24526f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.wt wtVar = this.f36393c;
        if (wtVar != null) {
            String obj = wtVar.getText().toString();
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
    public final void T() {
    }
}
