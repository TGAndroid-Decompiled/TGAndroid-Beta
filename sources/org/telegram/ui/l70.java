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
public final class l70 extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, org.telegram.ui.Components.t40 {
    public TLRPC.FileLocation E;
    public TLRPC.InputFile F;
    public TLRPC.InputFile G;
    public TLRPC.VideoSize H;
    public String I;
    public double J;
    public ArrayList K;
    public boolean L;
    public boolean M;
    public org.telegram.ui.Components.u40 N;
    public String O;
    public final int P;
    public final boolean Q;
    public org.telegram.ui.Components.xi0 R;
    public final boolean S;
    public String T;
    public final Location U;
    public int V;
    public int W;
    public org.telegram.ui.Components.pz X;
    public k70 Y;
    public j70 f38207a;
    public org.telegram.ui.Components.ll0 f38208b;
    public org.telegram.ui.Components.hu f38209c;
    public bi.i5 d;
    public di.r6 f38210e;
    public jd f38211f;
    public AnimatorSet h;
    public kd f38212n;
    public final org.telegram.ui.Components.i9 f38213r;
    public FrameLayout f38214s;
    public org.telegram.ui.Components.y10 v;
    public org.telegram.ui.ActionBar.n1 f38215w;
    public Drawable f38216x;
    public TLRPC.FileLocation f38217y;

    public l70(Bundle bundle) {
        super(bundle);
        this.P = bundle.getInt("chatType", 0);
        this.f38213r = new org.telegram.ui.Components.i9((org.telegram.ui.ActionBar.f6) null);
        this.T = bundle.getString("address");
        this.U = (Location) bundle.getParcelable("location");
        this.S = bundle.getBoolean("forImport", false);
        this.O = bundle.getString("title", null);
        this.Q = bundle.getBoolean("canToggleTopics", true);
    }

    public static void U(l70 l70Var, ArrayList arrayList, ArrayList arrayList2, CountDownLatch countDownLatch) {
        arrayList.addAll(MessagesStorage.getInstance(l70Var.currentAccount).getUsers(arrayList2));
        countDownLatch.countDown();
    }

    @Override
    public final void C(float f7) {
        kd kdVar = this.f38212n;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(f7);
    }

    @Override
    public final void L(boolean z10, boolean z11) {
        kd kdVar = this.f38212n;
        if (kdVar == null) {
            return;
        }
        kdVar.setProgress(0.0f);
    }

    @Override
    public final void Q(TLRPC.InputFile inputFile, TLRPC.InputFile inputFile2, double d, String str, TLRPC.PhotoSize photoSize, TLRPC.PhotoSize photoSize2, boolean z10, TLRPC.VideoSize videoSize) {
        AndroidUtilities.runOnUIThread(new gi.k(this, inputFile, inputFile2, videoSize, str, d, photoSize2, photoSize, 4));
    }

    public final String Y(int i10) {
        return getMessagesController().getUser((Long) this.K.get(i10)).first_name;
    }

    public final void Z(boolean z10, boolean z11) {
        if (this.f38211f == null) {
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
                this.f38212n.setVisibility(0);
                AnimatorSet animatorSet2 = this.h;
                jd jdVar = this.f38211f;
                Property property = View.ALPHA;
                animatorSet2.playTogether(ObjectAnimator.ofFloat(jdVar, property, 0.0f), ObjectAnimator.ofFloat(this.f38212n, property, 1.0f));
            } else {
                this.f38211f.setVisibility(0);
                AnimatorSet animatorSet3 = this.h;
                jd jdVar2 = this.f38211f;
                Property property2 = View.ALPHA;
                animatorSet3.playTogether(ObjectAnimator.ofFloat(jdVar2, property2, 1.0f), ObjectAnimator.ofFloat(this.f38212n, property2, 0.0f));
            }
            this.h.setDuration(180L);
            this.h.addListener(new e50(1, this, z10));
            this.h.start();
        } else if (z10) {
            this.f38211f.setAlpha(1.0f);
            this.f38211f.setVisibility(4);
            this.f38212n.setAlpha(1.0f);
            this.f38212n.setVisibility(0);
        } else {
            this.f38211f.setAlpha(1.0f);
            this.f38211f.setVisibility(0);
            this.f38212n.setAlpha(0.0f);
            this.f38212n.setVisibility(4);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.l70.createView(android.content.Context):android.view.View");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.updateInterfaces) {
            if (this.f38208b != null) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0) {
                    int childCount = this.f38208b.getChildCount();
                    for (int i12 = 0; i12 < childCount; i12++) {
                        View childAt = this.f38208b.getChildAt(i12);
                        if (childAt instanceof org.telegram.ui.Cells.f4) {
                            ((org.telegram.ui.Cells.f4) childAt).f(intValue);
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.chatDidFailCreate) {
            this.V = 0;
            this.M = false;
            org.telegram.ui.Components.y10 y10Var = this.v;
            if (y10Var != null) {
                y10Var.f(false, true);
            }
            org.telegram.ui.Components.hu huVar = this.f38209c;
            if (huVar != null) {
                huVar.setEnabled(true);
            }
        } else if (i10 == NotificationCenter.chatDidCreated) {
            this.V = 0;
            long longValue = ((Long) objArr[0]).longValue();
            k70 k70Var = this.Y;
            if (k70Var != null) {
                k70Var.a(this, longValue);
            } else {
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChats, new Object[0]);
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", longValue);
                bundle.putBoolean("just_created_chat", true);
                presentFragment(new co(bundle), true);
            }
            if (this.F != null || this.G != null || this.H != null) {
                getMessagesController().changeChatAvatar(longValue, null, this.F, this.G, this.H, this.J, this.I, this.f38217y, this.E, null);
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
        if (dialog != this.N.f30801c && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean e() {
        return true;
    }

    @Override
    public final cv0 getCloseIntoObject() {
        return null;
    }

    @Override
    public final String getInitialSearchString() {
        return this.f38209c.getText().toString();
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        e eVar = new e(this, 17);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.fragmentView, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20663d6));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i10 = org.telegram.ui.ActionBar.j6.f20607a7;
        arrayList.add(new org.telegram.ui.ActionBar.l6(kVar, 1, null, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 32768, null, null, null, null, org.telegram.ui.ActionBar.j6.f20937s8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.j6.f20992v8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.j6.A8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.j6.f20956t8));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20810l7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20828m7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 33554432, null, null, null, null, org.telegram.ui.ActionBar.j6.f20847n7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        org.telegram.ui.Components.hu huVar = this.f38209c;
        int i11 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(huVar, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38209c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38209c, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38209c, 32, null, null, null, null, org.telegram.ui.ActionBar.j6.f20791k6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38209c, 65568, null, null, null, null, org.telegram.ui.ActionBar.j6.f20809l6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20627b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.L6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 4, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20618ai));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20846n6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 262148, new Class[]{org.telegram.ui.Cells.f4.class}, new String[]{"statusTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f21042y6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 0, new Class[]{org.telegram.ui.Cells.f4.class}, null, org.telegram.ui.ActionBar.j6.f20910r0, eVar, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38208b, 0, new Class[]{org.telegram.ui.Cells.ea.class}, new String[]{"textView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38209c, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f38209c, 8388608, null, null, null, null, org.telegram.ui.ActionBar.j6.H6));
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
        org.telegram.ui.Components.hu huVar = this.f38209c;
        if (huVar != null && huVar.f26850e) {
            if (z10) {
                huVar.k(true);
                return false;
            }
            return false;
        }
        return super.onBackPressed(z10);
    }

    @Override
    public final boolean onFragmentCreate() {
        l70 l70Var;
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.updateInterfaces);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidCreated);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.chatDidFailCreate);
        org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(2, true, true);
        this.N = u40Var;
        u40Var.f30799a = this;
        u40Var.f30800b = this;
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
            l70Var = this;
            MessagesStorage.getInstance(this.currentAccount).getStorageQueue().postRunnable(new org.telegram.ui.Components.in0(l70Var, arrayList2, arrayList, countDownLatch, 11));
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
            l70Var = this;
        }
        l70Var.W = getUserConfig().getGlobalTTl() * 60;
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
        org.telegram.ui.Components.hu huVar = this.f38209c;
        if (huVar != null) {
            huVar.o();
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onPause() {
        super.onPause();
        org.telegram.ui.Components.hu huVar = this.f38209c;
        if (huVar != null) {
            huVar.r();
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
        org.telegram.ui.Components.hu huVar = this.f38209c;
        if (huVar != null) {
            huVar.s();
        }
        j70 j70Var = this.f38207a;
        if (j70Var != null) {
            j70Var.l();
        }
        this.N.l();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z10, boolean z11) {
        if (z10) {
            org.telegram.ui.Components.cu cuVar = this.f38209c.f26847a;
            cuVar.requestFocus();
            AndroidUtilities.showKeyboard(cuVar);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        org.telegram.ui.Components.u40 u40Var = this.N;
        if (u40Var != null) {
            u40Var.f30803f = bundle.getString("path");
        }
        String string = bundle.getString("nameTextView");
        if (string != null) {
            org.telegram.ui.Components.hu huVar = this.f38209c;
            if (huVar != null) {
                huVar.setText(string);
            } else {
                this.O = string;
            }
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str;
        org.telegram.ui.Components.u40 u40Var = this.N;
        if (u40Var != null && (str = u40Var.f30803f) != null) {
            bundle.putString("path", str);
        }
        org.telegram.ui.Components.hu huVar = this.f38209c;
        if (huVar != null) {
            String obj = huVar.getText().toString();
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
    public final void P() {
    }
}
