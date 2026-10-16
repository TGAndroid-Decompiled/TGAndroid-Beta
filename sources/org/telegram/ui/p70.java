package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
public final class p70 extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.h50 {
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.i50 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.yj0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.b00 X;
    public o70 Y;
    public n70 f38824a;
    public org.telegram.ui.Components.mm0 f38825b;
    public org.telegram.ui.Components.vu f38826c;
    public bi.k5 d;
    public di.p6 e;
    public pd f38827f;
    public AnimatorSet h;
    public qd f38828n;
    public final org.telegram.ui.Components.k9 f38829r;
    public FrameLayout f38830s;
    public org.telegram.ui.Components.l20 v;
    public org.telegram.ui.ActionBar.m1 f38831w;
    public Drawable f38832x;
    public TLRPC.FileLocation f38833y;

    public p70(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.f38829r = new org.telegram.ui.Components.k9((org.telegram.ui.ActionBar.c6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static void U(p70 p70Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(p70Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void E(float f7) {
        qd qdVar = this.f38828n;
        if (qdVar == null) {
            return;
        }
        qdVar.setProgress(f7);
    }

    @Override
    public final void K(boolean z10, boolean z11) {
        qd qdVar = this.f38828n;
        if (qdVar == null) {
            return;
        }
        qdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.K.get(i10)).first_name;
    }

    public final void Z(boolean z10, boolean z11) {
        if (this.f38827f == null) {
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
                this.f38828n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                pd pdVar = this.f38827f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(pdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f38828n, property, 1.0f));
            } else {
                this.f38827f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                pd pdVar2 = this.f38827f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(pdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f38828n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new i50(1, this, z10));
            this.h.start();
        } else if (z10) {
            this.f38827f.setAlpha(1.0f);
            this.f38827f.setVisibility(4);
            this.f38828n.setAlpha(1.0f);
            this.f38828n.setVisibility(0);
        } else {
            this.f38827f.setAlpha(1.0f);
            this.f38827f.setVisibility(0);
            this.f38828n.setAlpha(0.0f);
            this.f38828n.setVisibility(4);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.p70.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f38825b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    int childCount = this.f38825b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f38825b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidFailCreate) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.l20 l20Var = this.v;
            if (l20Var != null) {
                l20Var.f(false, true);
            }
            org.telegram.ui.Components.vu vuVar = this.f38826c;
            if (vuVar != null) {
                vuVar.setEnabled(true);
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            o70 o70Var = this.Y;
            if (o70Var != null) {
                o70Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new fo(bundle), true);
            }
            if (this.F != null || this.G != null || this.H != null) {
                getMessagesController().changeChatAvatar(longValue, null, this.F, this.G, this.H, this.J, this.I, this.f38833y, this.E, null);
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
        if (dialog != this.N.f25500c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final jv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f38826c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19601d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.g6.f19543a7;
        arrayList.add(new org.telegram.ui.ActionBar.i6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f19880s8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f19935v8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f19899t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19746l7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19765m7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.g6.f19785n7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        org.telegram.ui.Components.vu vuVar = this.f38826c;
        int i11 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(vuVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38826c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38826c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38826c, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.f19728k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38826c, 65568, null, null, null, null, org.telegram.ui.ActionBar.g6.f19745l6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19563b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19554ai));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19784n6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19988y6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.g6.f19852r0, eVar, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38825b, 0, new Class[]{org.telegram.ui.Cells.ca.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38826c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f38826c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.g6.H6));
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
        org.telegram.ui.Components.vu vuVar = this.f38826c;
        if (vuVar != null && vuVar.e) {
            if (z10) {
                vuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        p70 p70Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(2, true, true);
        this.N = i50Var;
        i50Var.f25498a = this;
        i50Var.f25499b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = com.google.android.gms.internal.play_billing.k3.h(longArray[i11], this.K, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.K.size(); i12++) {
            Long l4 = (Long) this.K.get(i12);
            if (getMessagesController().getUser(l4) == null) {
                arrayList.add(l4);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            p70Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.ey0(p70Var, arrayList2, arrayList, countDownLatch, 9));
            try {
                countDownLatch.await();
            } catch (Exception e) {
                FileLog.e(e);
            }
            if (arrayList.size() != arrayList2.size() || arrayList2.isEmpty()) {
                return false;
            }
            int size = arrayList2.size();
            while (i10 < size) {
                Object obj = arrayList2.get(i10);
                i10++;
                getMessagesController().putUser((TLRPC.User) obj, true);
            }
        } else {
            p70Var = this;
        }
        p70Var.W = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.N.d();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.vu vuVar = this.f38826c;
        if (vuVar != null) {
            vuVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.vu vuVar = this.f38826c;
        if (vuVar != null) {
            vuVar.r();
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
        org.telegram.ui.Components.vu vuVar = this.f38826c;
        if (vuVar != null) {
            vuVar.s();
        }
        n70 n70Var = this.f38824a;
        if (n70Var != null) {
            n70Var.l();
        }
        this.N.k();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.qu quVar = this.f38826c.f30318a;
            quVar.requestFocus();
            AndroidUtilities.showKeyboard(quVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.i50 i50Var = this.N;
        if (i50Var != null) {
            i50Var.f25501f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.vu vuVar = this.f38826c;
            if (vuVar != null) {
                vuVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.i50 i50Var = this.N;
        if (i50Var != null && (str = i50Var.f25501f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.vu vuVar = this.f38826c;
        if (vuVar != null) {
            String obj = vuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final void P() {
    }
}
