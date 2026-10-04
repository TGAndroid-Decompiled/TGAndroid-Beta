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
public final class k70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40 {
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.y40 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.kj0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.sz X;
    public j70 Y;
    public i70 f37845a;
    public org.telegram.ui.Components.zl0 f37846b;
    public org.telegram.ui.Components.mu f37847c;
    public ai.y5 d;
    public ci.r6 f37848e;
    public kd f37849f;
    public AnimatorSet h;
    public ld f37850n;
    public final org.telegram.ui.Components.h9 f37851r;
    public FrameLayout f37852s;
    public org.telegram.ui.Components.c20 v;
    public org.telegram.ui.ActionBar.n1 f37853w;
    public Drawable f37854x;
    public TLRPC.FileLocation f37855y;

    public k70(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.f37851r = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static void S(k70 k70Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(k70Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void B(float f7) {
        ld ldVar = this.f37850n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f7);
    }

    @Override
    public final void I(boolean z10, boolean z11) {
        ld ldVar = this.f37850n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override
    public final void O(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new fi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String X(int i10) {
        return getMessagesController().getUser((Long) this.K.get(i10)).first_name;
    }

    public final void Y(boolean z10, boolean z11) {
        if (this.f37849f == null) {
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
                this.f37850n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                kd kdVar = this.f37849f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f37850n, property, 1.0f));
            } else {
                this.f37849f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                kd kdVar2 = this.f37849f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f37850n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new g70(0, this, z10));
            this.h.start();
        } else if (z10) {
            this.f37849f.setAlpha(1.0f);
            this.f37849f.setVisibility(4);
            this.f37850n.setAlpha(1.0f);
            this.f37850n.setVisibility(0);
        } else {
            this.f37849f.setAlpha(1.0f);
            this.f37849f.setVisibility(0);
            this.f37850n.setAlpha(0.0f);
            this.f37850n.setVisibility(4);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.k70.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f37846b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    int childCount = this.f37846b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f37846b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidFailCreate) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.c20 c20Var = this.v;
            if (c20Var != null) {
                c20Var.f(false, true);
            }
            org.telegram.ui.Components.mu muVar = this.f37847c;
            if (muVar != null) {
                muVar.setEnabled(true);
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            j70 j70Var = this.Y;
            if (j70Var != null) {
                j70Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new yn(bundle), true);
            }
            if (this.F != null || this.G != null || this.H != null) {
                getMessagesController().changeChatAvatar(longValue, null, this.F, this.G, this.H, this.J, this.I, this.f37855y, this.E, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.N.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.N.f33050c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final yu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f37847c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20822d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.i6.f20766a7;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21104s8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21159v8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21123t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20913i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20970l7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f20989m7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.i6.f21009n7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20945k0, null, null, org.telegram.ui.ActionBar.i6.f20823d7));
        org.telegram.ui.Components.mu muVar = this.f37847c;
        int i11 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(muVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37847c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37847c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37847c, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.f20951k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37847c, 65568, null, null, null, null, org.telegram.ui.ActionBar.i6.f20969l6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20786b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20777ai));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21008n6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21209y6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.i6.f21076r0, eVar, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37846b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37847c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f37847c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.i6.H6));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.N.i(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.mu muVar = this.f37847c;
        if (muVar != null && muVar.f28713e) {
            if (z10) {
                muVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        k70 k70Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(2, true, true);
        this.N = y40Var;
        y40Var.f33048a = this;
        y40Var.f33049b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.K = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = com.google.android.gms.internal.vision.e2.g(longArray[i11], this.K, i11, 1);
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
            k70Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.bo0(k70Var, arrayList2, arrayList, countDownLatch, 11));
            try {
                countDownLatch.await();
            } catch (Exception e7) {
                FileLog.e(e7);
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
            k70Var = this;
        }
        k70Var.W = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.N.e();
        if (this.V != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.V, true);
        }
        org.telegram.ui.Components.mu muVar = this.f37847c;
        if (muVar != null) {
            muVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.mu muVar = this.f37847c;
        if (muVar != null) {
            muVar.r();
        }
        this.N.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.N.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.mu muVar = this.f37847c;
        if (muVar != null) {
            muVar.s();
        }
        i70 i70Var = this.f37845a;
        if (i70Var != null) {
            i70Var.l();
        }
        this.N.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.hu huVar = this.f37847c.f28710a;
            huVar.requestFocus();
            AndroidUtilities.showKeyboard(huVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.y40 y40Var = this.N;
        if (y40Var != null) {
            y40Var.f33052f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.mu muVar = this.f37847c;
            if (muVar != null) {
                muVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.y40 y40Var = this.N;
        if (y40Var != null && (str = y40Var.f33052f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.mu muVar = this.f37847c;
        if (muVar != null) {
            String obj = muVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean t() {
        return false;
    }

    @Override
    public final void N() {
    }
}
