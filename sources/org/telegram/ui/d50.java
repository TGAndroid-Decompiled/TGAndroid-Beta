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
public final class d50 extends org.telegram.ui.ActionBar.f2 implements org.telegram.messenger.ls, org.telegram.ui.Components.i30 {
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
    public org.telegram.ui.Components.j30 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.zg0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.my X;
    public c50 Y;
    public b50 f44951a;
    public org.telegram.ui.Components.pj0 f44952b;
    public org.telegram.ui.Components.lt f44953c;
    public di.c4 d;
    public fi.p5 f44954e;
    public yc f44955f;
    public AnimatorSet h;
    public zc f44956n;
    public final org.telegram.ui.Components.w8 f44957r;
    public FrameLayout f44958s;
    public org.telegram.ui.Components.q00 f44959w;
    public org.telegram.ui.ActionBar.g1 f44960x;
    public Drawable f44961y;

    public d50(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.f44957r = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static void Z(d50 d50Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(org.telegram.messenger.yr.a0(d50Var.currentAccount).l0(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void H(float f10) {
        zc zcVar = this.f44956n;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(f10);
    }

    @Override
    public final void O(boolean z9, boolean z10) {
        zc zcVar = this.f44956n;
        if (zcVar == null) {
            return;
        }
        zcVar.setProgress(0.0f);
    }

    @Override
    public final void U(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z9, TLRPC.VideoSize videoSize) {
        org.telegram.messenger.g0.h3(new ii.l(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.H6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28244y6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28034n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.L6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28150t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28189v8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28132s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27852d6));
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.d50.createView(android.content.Context):android.view.View");
    }

    public final String d0(int i7) {
        return getMessagesController().a2((Long) this.K.get(i7)).first_name;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.qs.f25063r) {
            if (this.f44952b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i11 = org.telegram.messenger.qp.C8;
                if ((intValue & 2) != 0 || (intValue & 1) != 0 || (intValue & 4) != 0) {
                    int childCount = this.f44952b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f44952b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.h4) {
                            ((org.telegram.ui.Cells.h4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i7 == org.telegram.messenger.qs.S) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.q00 q00Var = this.f44959w;
            if (q00Var != null) {
                q00Var.f(false, true);
            }
            org.telegram.ui.Components.lt ltVar = this.f44953c;
            if (ltVar != null) {
                ltVar.setEnabled(true);
            }
        } else if (i7 == org.telegram.messenger.qs.R) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            c50 c50Var = this.Y;
            if (c50Var != null) {
                c50Var.e(this, longValue);
            } else {
                org.telegram.messenger.qs.f(this.currentAccount).k(org.telegram.messenger.qs.f25076t, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new an(bundle), true);
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
        if (dialog != this.N.f34881c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    public final void e0(boolean z9, boolean z10) {
        if (this.f44955f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z10) {
            this.h = new AnimatorSet();
            if (z9) {
                this.f44956n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                yc ycVar = this.f44955f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(ycVar, property, 0.0f), ObjectAnimator.ofFloat(this.f44956n, property, 1.0f));
            } else {
                this.f44955f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                yc ycVar2 = this.f44955f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(ycVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f44956n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new z40(0, this, z9));
            this.h.start();
        } else if (z9) {
            this.f44955f.setAlpha(1.0f);
            this.f44955f.setVisibility(4);
            this.f44956n.setAlpha(1.0f);
            this.f44956n.setVisibility(0);
        } else {
            this.f44955f.setAlpha(1.0f);
            this.f44955f.setVisibility(0);
            this.f44956n.setAlpha(0.0f);
            this.f44956n.setVisibility(4);
        }
    }

    @Override
    public final wq0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f44953c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44952b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28000l7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44952b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28018m7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44952b, 33554432, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28035n7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44953c, 8388608, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Li));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44953c, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44953c, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27981k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44953c, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27999l6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f44952b, 4, new Class[]{org.telegram.ui.Cells.h4.class}, new String[]{"textView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oi));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i7, int i10, Intent intent) {
        this.N.h(i7, i10, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z9) {
        org.telegram.ui.Components.lt ltVar = this.f44953c;
        if (ltVar != null && ltVar.f35780e) {
            if (z9) {
                ltVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z9);
    }

    @Override
    public final boolean onFragmentCreate() {
        d50 d50Var;
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).c(this, org.telegram.messenger.qs.S);
        org.telegram.ui.Components.j30 j30Var = new org.telegram.ui.Components.j30(2, true, true);
        this.N = j30Var;
        j30Var.f34879a = this;
        j30Var.f34880b = this;
        long[] longArray = getArguments().getLongArray("result");
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i7 = 0;
            while (i7 < longArray.length) {
                i7 = com.google.android.recaptcha.internal.a.g(i7, 1, longArray[i7], this.K);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < this.K.size(); i10++) {
            Long l10 = (Long) this.K.get(i10);
            if (getMessagesController().a2(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            d50Var = this;
            org.telegram.messenger.yr.a0(this.currentAccount).f26719a.c(new org.telegram.ui.Components.kn0(d50Var, arrayList2, arrayList, countDownLatch, 10));
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
            d50Var = this;
        }
        d50Var.W = getUserConfig().f24492p0 * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.f25063r);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.R);
        org.telegram.messenger.qs.f(this.currentAccount).n(this, org.telegram.messenger.qs.S);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.lt ltVar = this.f44953c;
        if (ltVar != null) {
            ltVar.o();
        }
        org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.lt ltVar = this.f44953c;
        if (ltVar != null) {
            ltVar.r();
        }
        this.N.i();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i7, String[] strArr, int[] iArr) {
        this.N.j(i7, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.lt ltVar = this.f44953c;
        if (ltVar != null) {
            ltVar.s();
        }
        b50 b50Var = this.f44951a;
        if (b50Var != null) {
            b50Var.f();
        }
        this.N.k();
        org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onThemeColorsChanged() {
        try {
            super.onThemeColorsChanged();
            org.telegram.ui.Components.q00 q00Var = this.f44959w;
            if (q00Var != null) {
                q00Var.updateColors();
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        try {
            org.telegram.ui.Components.pj0 pj0Var = this.f44952b;
            if (pj0Var != null) {
                pj0Var.x1();
                if (this.f44952b.getFastScroll() != null) {
                    this.f44952b.getFastScroll().invalidate();
                }
            }
            org.telegram.ui.Components.lt ltVar = this.f44953c;
            if (ltVar != null && ltVar.getEditText() != null) {
                this.f44953c.getEditText().setCursorColor(getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                this.f44953c.getEditText().u(getThemedColor(org.telegram.ui.ActionBar.k6.f27981k6), getThemedColor(org.telegram.ui.ActionBar.k6.f27999l6), getThemedColor(org.telegram.ui.ActionBar.k6.f28073p7));
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z9, boolean z10) {
        if (z9) {
            org.telegram.ui.Components.ft ftVar = this.f44953c.f35777a;
            ftVar.requestFocus();
            org.telegram.messenger.g0.K3(ftVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.j30 j30Var = this.N;
        if (j30Var != null) {
            j30Var.f34883f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.lt ltVar = this.f44953c;
            if (ltVar != null) {
                ltVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.j30 j30Var = this.N;
        if (j30Var != null && (str = j30Var.f34883f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.lt ltVar = this.f44953c;
        if (ltVar != null) {
            String obj = ltVar.getText().toString();
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
