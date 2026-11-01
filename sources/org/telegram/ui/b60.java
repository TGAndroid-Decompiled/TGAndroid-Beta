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
public final class b60 extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.vs, org.telegram.ui.Components.a40 {
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
    public org.telegram.ui.Components.ci0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.az X;
    public a60 Y;
    public z50 f35953a;
    public org.telegram.ui.Components.uk0 f35954b;
    public org.telegram.ui.Components.wt f35955c;
    public ag.d2 d;
    public kg.f0 e;
    public hd f35956f;
    public AnimatorSet h;
    public id f35957n;
    public final org.telegram.ui.Components.r8 f35958r;
    public FrameLayout f35959s;
    public org.telegram.ui.Components.f10 f35960w;
    public org.telegram.ui.ActionBar.k1 f35961x;
    public Drawable f35962y;

    public b60(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.f35958r = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static void Z(b60 b60Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.is.a0(b60Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void I(float f7) {
        id idVar = this.f35957n;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(f7);
    }

    @Override
    public final void P(boolean z10, boolean z11) {
        id idVar = this.f35957n;
        if (idVar == null) {
            return;
        }
        idVar.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21312y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21116n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20893b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20931d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21021i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21226t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21207s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20930d6));
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.b60.createView(android.content.Context):android.view.View");
    }

    public final String d0(int i10) {
        return getMessagesController().Z1((Long) this.K.get(i10)).first_name;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.f14772r) {
            if (this.f35954b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i12 = org.telegram.messenger.wp.D8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.f35954b.getChildCount();
                    for (int i13 = 0; i13 < childCount; i13++) {
                        View childAt = this.f35954b.getChildAt(i13);
                        if (childAt instanceof org.telegram.ui.Cells.j4) {
                            ((org.telegram.ui.Cells.j4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == org.telegram.messenger.at.S) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.f10 f10Var = this.f35960w;
            if (f10Var != null) {
                f10Var.f(false, true);
            }
            org.telegram.ui.Components.wt wtVar = this.f35955c;
            if (wtVar != null) {
                wtVar.setEnabled(true);
            }
        } else if (i10 == org.telegram.messenger.at.R) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            a60 a60Var = this.Y;
            if (a60Var != null) {
                a60Var.f(this, longValue);
            } else {
                org.telegram.messenger.at.f(this.currentAccount).k(org.telegram.messenger.at.f14786t, new Object[0]);
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
        if (dialog != this.N.f24620c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f35956f == null) {
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
                this.f35957n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                hd hdVar = this.f35956f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(hdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f35957n, property, 1.0f));
            } else {
                this.f35956f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                hd hdVar2 = this.f35956f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(hdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f35957n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new org.telegram.ui.Components.ha0(16, this, z10));
            this.h.start();
        } else if (z10) {
            this.f35956f.setAlpha(1.0f);
            this.f35956f.setVisibility(4);
            this.f35957n.setAlpha(1.0f);
            this.f35957n.setVisibility(0);
        } else {
            this.f35956f.setAlpha(1.0f);
            this.f35956f.setVisibility(0);
            this.f35957n.setAlpha(0.0f);
            this.f35957n.setVisibility(4);
        }
    }

    @Override
    public final fs0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f35955c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35954b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21078l7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35954b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21097m7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35954b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21117n7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35955c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35955c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Mi));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35955c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21059k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35955c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21077l6));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f35954b, 4, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oi));
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
        org.telegram.ui.Components.wt wtVar = this.f35955c;
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
        b60 b60Var;
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.R);
        org.telegram.messenger.at.f(this.currentAccount).c(this, org.telegram.messenger.at.S);
        org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(2, true, true);
        this.N = b40Var;
        b40Var.f24618a = this;
        b40Var.f24619b = this;
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
            b60Var = this;
            org.telegram.messenger.is.a0(this.currentAccount).f16331a.c(new v50(b60Var, arrayList2, arrayList, countDownLatch, 0));
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
            b60Var = this;
        }
        b60Var.W = getUserConfig().f15527p0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.f14772r);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.R);
        org.telegram.messenger.at.f(this.currentAccount).n(this, org.telegram.messenger.at.S);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.wt wtVar = this.f35955c;
        if (wtVar != null) {
            wtVar.o();
        }
        org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.wt wtVar = this.f35955c;
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
        org.telegram.ui.Components.wt wtVar = this.f35955c;
        if (wtVar != null) {
            wtVar.s();
        }
        z50 z50Var = this.f35953a;
        if (z50Var != null) {
            z50Var.f();
        }
        this.N.k();
        org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.f10 f10Var = this.f35960w;
            if (f10Var != null) {
                f10Var.updateColors();
            }
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        try {
            org.telegram.ui.Components.uk0 uk0Var = this.f35954b;
            if (uk0Var != null) {
                uk0Var.x1();
                if (this.f35954b.getFastScroll() != null) {
                    this.f35954b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.wt wtVar = this.f35955c;
            if (wtVar != null && wtVar.getEditText() != null) {
                this.f35955c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.t6.G6));
                this.f35955c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.t6.f21059k6), getThemedColor(org.telegram.ui.ActionBar.t6.f21077l6), getThemedColor(org.telegram.ui.ActionBar.t6.f21154p7));
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.rt rtVar = this.f35955c.f32308a;
            rtVar.requestFocus();
            org.telegram.messenger.i0.J3(rtVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.b40 b40Var = this.N;
        if (b40Var != null) {
            b40Var.f24621f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.wt wtVar = this.f35955c;
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
        if (b40Var != null && (str = b40Var.f24621f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.wt wtVar = this.f35955c;
        if (wtVar != null) {
            String obj = wtVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean y() {
        return false;
    }

    @Override
    public final void U() {
    }
}
