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
public final class f70 extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.x40 {
    public TLRPC.FileLocation B;
    public TLRPC.InputFile C;
    public TLRPC.InputFile D;
    public TLRPC.VideoSize E;
    public String F;
    public double G;
    public ArrayList H;
    public boolean I;
    public boolean J;
    public org.telegram.ui.Components.y40 K;
    public String L;
    public final int M;
    public final boolean N;
    public org.telegram.ui.Components.hj0 O;
    public final boolean P;
    public String Q;
    public final Location R;
    public int S;
    public int T;
    public org.telegram.ui.Components.rz U;
    public e70 V;
    public d70 f36690a;
    public org.telegram.ui.Components.sl0 f36691b;
    public org.telegram.ui.Components.fu f36692c;
    public oh.a4 d;
    public fg.i0 f36693e;
    public kd f36694f;
    public AnimatorSet h;
    public ld f36695n;
    public final org.telegram.ui.Components.z8 f36696r;
    public FrameLayout f36697s;
    public org.telegram.ui.Components.a20 v;
    public org.telegram.ui.ActionBar.p1 f36698w;
    public Drawable f36699x;
    public TLRPC.FileLocation f36700y;

    public f70(Bundle bundle) {
        super(bundle);
        this.M = bundle.getInt("chatType", 0);
        this.f36696r = new org.telegram.ui.Components.z8((org.telegram.ui.ActionBar.g6) null);
        this.Q = bundle.getString("address");
        this.R = (Location) bundle.getParcelable("location");
        this.P = bundle.getBoolean("forImport", false);
        this.L = bundle.getString("title", null);
        this.N = bundle.getBoolean("canToggleTopics", true);
    }

    public static void U(f70 f70Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(f70Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void D(float f10) {
        ld ldVar = this.f36695n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(f10);
    }

    @Override
    public final void K(boolean z4, boolean z10) {
        ld ldVar = this.f36695n;
        if (ldVar == null) {
            return;
        }
        ldVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z4, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new cd(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 3));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.H.get(i10)).first_name;
    }

    public final void Z(boolean z4, boolean z10) {
        if (this.f36694f == null) {
            return;
        }
        AnimatorSet animatorSet = this.h;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.h = null;
        }
        if (z10) {
            this.h = new AnimatorSet();
            if (z4) {
                this.f36695n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                kd kdVar = this.f36694f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(kdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f36695n, property, 1.0f));
            } else {
                this.f36694f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                kd kdVar2 = this.f36694f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(kdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f36695n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new org.telegram.ui.Components.x20(20, this, z4));
            this.h.start();
        } else if (z4) {
            this.f36694f.setAlpha(1.0f);
            this.f36694f.setVisibility(4);
            this.f36695n.setAlpha(1.0f);
            this.f36695n.setVisibility(0);
        } else {
            this.f36694f.setAlpha(1.0f);
            this.f36694f.setVisibility(0);
            this.f36695n.setAlpha(0.0f);
            this.f36695n.setVisibility(4);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.f70.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f36691b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    int childCount = this.f36691b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f36691b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.g4) {
                            ((org.telegram.ui.Cells.g4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidFailCreate) {
            this.S = 0;
            this.J = false;
            org.telegram.ui.Components.a20 a20Var = this.v;
            if (a20Var != null) {
                a20Var.f(false, true);
            }
            org.telegram.ui.Components.fu fuVar = this.f36692c;
            if (fuVar != null) {
                fuVar.setEnabled(true);
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            this.S = 0;
            long longValue = ((Long) objArr[0]).longValue();
            e70 e70Var = this.V;
            if (e70Var != null) {
                e70Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new xn(bundle), true);
            }
            if (this.C != null || this.D != null || this.E != null) {
                getMessagesController().changeChatAvatar(longValue, null, this.C, this.D, this.E, this.G, this.F, this.f36700y, this.B, null);
            }
        }
    }

    @Override
    public final void dismissCurrentDialog() {
        if (this.K.g(this.visibleDialog)) {
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.K.f33311c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final qu0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f36692c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        f fVar = new f(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21661d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.k6.f21607a7;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21752i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21806l7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21824m7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.k6.f21842n7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21781k0, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        org.telegram.ui.Components.fu fuVar = this.f36692c;
        int i11 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(fuVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36692c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36692c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36692c, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.f21787k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36692c, 65568, null, null, null, null, org.telegram.ui.ActionBar.k6.f21805l6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21626b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 4, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.ai));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21841n6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 262148, new Class[]{org.telegram.ui.Cells.g4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f22038y6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 0, new Class[]{org.telegram.ui.Cells.g4.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, fVar, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36691b, 0, new Class[]{org.telegram.ui.Cells.aa.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36692c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f36692c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.k6.H6));
        return arrayList;
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        return false;
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, Intent intent) {
        this.K.i(i10, i11, intent);
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        org.telegram.ui.Components.fu fuVar = this.f36692c;
        if (fuVar != null && fuVar.f27000e) {
            if (z4) {
                fuVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z4);
    }

    @Override
    public final boolean onFragmentCreate() {
        f70 f70Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.y40 y40Var = new org.telegram.ui.Components.y40(2, true, true);
        this.K = y40Var;
        y40Var.f33309a = this;
        y40Var.f33310b = this;
        long[] longArray = getArguments().getLongArray("result");
        int i10 = 0;
        if (longArray != null) {
            this.H = new ArrayList(longArray.length);
            int i11 = 0;
            while (i11 < longArray.length) {
                i11 = android.support.v4.media.a.g(longArray[i11], this.H, i11, 1);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (int i12 = 0; i12 < this.H.size(); i12++) {
            Long l10 = (Long) this.H.get(i12);
            if (getMessagesController().getUser(l10) == null) {
                arrayList.add(l10);
            }
        }
        if (!arrayList.isEmpty()) {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            ArrayList arrayList2 = new ArrayList();
            f70Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new b30(f70Var, arrayList2, arrayList, countDownLatch, 2));
            try {
                countDownLatch.await();
            } catch (Exception e6) {
                FileLog.e(e6);
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
            f70Var = this;
        }
        f70Var.T = getUserConfig().getGlobalTTl() * 60;
        return super.onFragmentCreate();
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.chatDidFailCreate);
        this.K.e();
        if (this.S != 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.S, true);
        }
        org.telegram.ui.Components.fu fuVar = this.f36692c;
        if (fuVar != null) {
            fuVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.fu fuVar = this.f36692c;
        if (fuVar != null) {
            fuVar.r();
        }
        this.K.j();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        this.K.k(i10, strArr, iArr);
    }

    @Override
    public final void onResume() {
        super.onResume();
        org.telegram.ui.Components.fu fuVar = this.f36692c;
        if (fuVar != null) {
            fuVar.s();
        }
        d70 d70Var = this.f36690a;
        if (d70Var != null) {
            d70Var.l();
        }
        this.K.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z4, boolean z10) {
        if (z4) {
            org.telegram.ui.Components.au auVar = this.f36692c.f26997a;
            auVar.requestFocus();
            AndroidUtilities.showKeyboard(auVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.y40 y40Var = this.K;
        if (y40Var != null) {
            y40Var.f33313f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.fu fuVar = this.f36692c;
            if (fuVar != null) {
                fuVar.setText(string);
            } else {
                this.L = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.y40 y40Var = this.K;
        if (y40Var != null && (str = y40Var.f33313f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.fu fuVar = this.f36692c;
        if (fuVar != null) {
            String obj = fuVar.getText().toString();
            if (obj.length() != 0) {
                bundle.putString("nameTextView", obj);
            }
        }
    }

    @Override
    public final boolean u() {
        return false;
    }

    @Override
    public final void P() {
    }
}
