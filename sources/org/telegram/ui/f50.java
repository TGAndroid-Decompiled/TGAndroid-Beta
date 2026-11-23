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
public final class f50 extends org.telegram.ui.ActionBar.g2 implements org.telegram.messenger.gs, org.telegram.ui.Components.w30 {
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
    public org.telegram.ui.Components.x30 O;
    public String P;
    public final int Q;
    public final boolean R;
    public org.telegram.ui.Components.oh0 S;
    public final boolean T;
    public String U;
    public final Location V;
    public int W;
    public int X;
    public org.telegram.ui.Components.yy Y;
    public e50 Z;
    public d50 f47555a;
    public org.telegram.ui.Components.ek0 f47556b;
    public org.telegram.ui.Components.yt f47557c;
    public fi.t3 d;
    public hi.m5 f47558e;
    public xc f47559f;
    public AnimatorSet h;
    public yc f47560n;
    public final org.telegram.ui.Components.b9 f47561r;
    public FrameLayout f47562s;
    public org.telegram.ui.Components.c10 f47563w;
    public org.telegram.ui.ActionBar.g1 f47564x;
    public Drawable f47565y;

    public f50(Bundle bundle) {
        super(bundle);
        this.Q = bundle.getInt("chatType", 0);
        this.f47561r = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.U = bundle.getString("address");
        this.V = (Location) bundle.getParcelable("location");
        this.T = bundle.getBoolean("forImport", false);
        this.P = bundle.getString("title", null);
        this.R = bundle.getBoolean("canToggleTopics", true);
    }

    public static void Z(f50 f50Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.ur.a0(f50Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void I(float f10) {
        yc ycVar = this.f47560n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(f10);
    }

    @Override
    public final void Q(boolean z10, boolean z11) {
        yc ycVar = this.f47560n;
        if (ycVar == null) {
            return;
        }
        ycVar.setProgress(0.0f);
    }

    @Override
    public final void V(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.g3(new li.l(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29739y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29529n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29311b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29348d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29439i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29645t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29684v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29627s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29347d6));
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f50.createView(android.content.Context):android.view.View");
    }

    public final String d0(int i7) {
        return getMessagesController().c2((Long) this.L.get(i7)).first_name;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ls.f25335r) {
            if (this.f47556b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i11 = org.telegram.messenger.np.I8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.f47556b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f47556b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.i4) {
                            ((org.telegram.ui.Cells.i4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.ls.S) {
            this.W = 0;
            this.N = false;
            org.telegram.ui.Components.c10 c10Var = this.f47563w;
            if (c10Var != null) {
                c10Var.f(false, true);
            }
            org.telegram.ui.Components.yt ytVar = this.f47557c;
            if (ytVar != null) {
                ytVar.setEnabled(true);
            }
        } else if (i7 == org.telegram.messenger.ls.R) {
            this.W = 0;
            long longValue = ((Long) objArr[0]).longValue();
            e50 e50Var = this.Z;
            if (e50Var != null) {
                e50Var.c(this, longValue);
            } else {
                org.telegram.messenger.ls.f(this.currentAccount).k(org.telegram.messenger.ls.f25348t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new bn(bundle), true);
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
        if (dialog != this.O.f41917c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z10, boolean z11) {
        if (this.f47559f == null) {
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
                this.f47560n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                xc xcVar = this.f47559f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(xcVar, property, 0.0f), ObjectAnimator.ofFloat(this.f47560n, property, 1.0f));
            } else {
                this.f47559f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                xc xcVar2 = this.f47559f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(xcVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f47560n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new c30(1, this, z10));
            this.h.start();
        } else if (z10) {
            this.f47559f.setAlpha(1.0f);
            this.f47559f.setVisibility(4);
            this.f47560n.setAlpha(1.0f);
            this.f47560n.setVisibility(0);
        } else {
            this.f47559f.setAlpha(1.0f);
            this.f47559f.setVisibility(0);
            this.f47560n.setAlpha(0.0f);
            this.f47560n.setVisibility(4);
        }
    }

    @Override
    public final xq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f47557c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47556b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29495l7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47556b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29513m7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47556b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29530n7));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47557c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Oi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47557c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Pi));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47557c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29476k6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47557c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.f29494l6));
        arrayList.add(new org.telegram.ui.ActionBar.v6(this.f47556b, 4, new Class[]{org.telegram.ui.Cells.i4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.u6) null, org.telegram.ui.ActionBar.m6.Ri));
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
        org.telegram.ui.Components.yt ytVar = this.f47557c;
        if (ytVar != null && ytVar.f42498e) {
            if (z10) {
                ytVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        f50 f50Var;
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.f25335r);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.R);
        org.telegram.messenger.ls.f(this.currentAccount).c(this, org.telegram.messenger.ls.S);
        org.telegram.ui.Components.x30 x30Var = new org.telegram.ui.Components.x30(2, true, true);
        this.O = x30Var;
        x30Var.f41915a = this;
        x30Var.f41916b = this;
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
            if (getMessagesController().c2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            f50Var = this;
            org.telegram.messenger.ur.a0(this.currentAccount).f27214a.c(new org.telegram.ui.Components.q20(f50Var, arrayList2, arrayList, countDownLatch, 17));
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
                getMessagesController().e4((TLRPC.User) obj, true, false);
            }
        } else {
            f50Var = this;
        }
        f50Var.X = getUserConfig().f24955q0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.f25335r);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.R);
        org.telegram.messenger.ls.f(this.currentAccount).n(this, org.telegram.messenger.ls.S);
        this.O.d();
        if (this.W != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.W, true);
        }
        org.telegram.ui.Components.yt ytVar = this.f47557c;
        if (ytVar != null) {
            ytVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.yt ytVar = this.f47557c;
        if (ytVar != null) {
            ytVar.r();
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
        org.telegram.ui.Components.yt ytVar = this.f47557c;
        if (ytVar != null) {
            ytVar.s();
        }
        d50 d50Var = this.f47555a;
        if (d50Var != null) {
            d50Var.f();
        }
        this.O.k();
        org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.c10 c10Var = this.f47563w;
            if (c10Var != null) {
                c10Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.ek0 ek0Var = this.f47556b;
            if (ek0Var != null) {
                ek0Var.x1();
                if (this.f47556b.getFastScroll() != null) {
                    this.f47556b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.yt ytVar = this.f47557c;
            if (ytVar != null && ytVar.getEditText() != null) {
                this.f47557c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.m6.G6));
                this.f47557c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.m6.f29476k6), getThemedColor(org.telegram.ui.ActionBar.m6.f29494l6), getThemedColor(org.telegram.ui.ActionBar.m6.f29568p7));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.tt ttVar = this.f47557c.f42495a;
            ttVar.requestFocus();
            org.telegram.messenger.g0.I3(ttVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.x30 x30Var = this.O;
        if (x30Var != null) {
            x30Var.f41919f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.yt ytVar = this.f47557c;
            if (ytVar != null) {
                ytVar.setText(string);
            } else {
                this.P = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.x30 x30Var = this.O;
        if (x30Var != null && (str = x30Var.f41919f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.yt ytVar = this.f47557c;
        if (ytVar != null) {
            String obj = ytVar.getText().toString();
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
